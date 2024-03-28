package com.tme.di.visitor;

import com.tme.di.parser.AstParser;
import com.tme.di.parser.ast.*;
import com.tme.di.parser.ast.expr.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class StarRocksSqlBuilder extends BaseSqlBuilder {
    private Map<String, Set<String>> tablename2UnixTimestampColumnNames = new HashMap<>();
    private Stack<String> subQueryTypeStack;
    private Stack<String> subQueryAliasStack;
    private final SqlScopeNode start = new SqlScopeNode(null, null, "start", null);
    private SqlScopeNode currentSqlScope;
    private boolean enableColumnDisambiguate = true;
    private boolean enableHandleNullable = false;
    private boolean isSubQueryInWhere = false;
    private boolean buildNodeGraph = true;

    public StarRocksSqlBuilder(boolean enableColumnDisambiguate) {
        super(".");
        this.enableColumnDisambiguate = enableColumnDisambiguate;

    }

    public StarRocksSqlBuilder(boolean enableColumnDisambiguate, boolean enableHandleNullable,
                               Map<String, Set<String>> tablename2UnixTimestampColumnNames,
                               Set<String> commonUnixTimestampColumnNamesInUpperCase,
                               Set<String> commonDateColumnNamesInUpperCase) {
        super(".");
        this.enableColumnDisambiguate = enableColumnDisambiguate;
        this.enableHandleNullable = enableHandleNullable;
        this.tablename2UnixTimestampColumnNames = tablename2UnixTimestampColumnNames;
        this.commonUnixTimestampColumnNamesInUpperCase = commonUnixTimestampColumnNamesInUpperCase;
        this.commonDateColumnNamesInUpperCase = commonDateColumnNamesInUpperCase;
    }

    public StarRocksSqlBuilder() {
        super(".");
    }

    private int currentAliasNum = 1;

    public String getRandomAlias() {
        return "_sr_t_" + currentAliasNum++;
    }

    public Identifier getRandomAliasIdentifier() {
        return new Identifier(getRandomAlias());
    }

    // 用来获取纯CK的语法下的SQL, 直接调用super.visit()会由于dynamic dispatch可能走到本子类的其他方法拿到被改写过的StarRocks SQL.
    private static final BaseSqlBuilder ckSqlBuilder = new BaseSqlBuilder();

    private static final Set<String> BUILT_IN_IDENTIFIER_IN_UPPER_CASE = new HashSet<>(Arrays.asList(
            "COLUMN", "FORCE", "ARRAY", "FROM"
    ));

    public String escapeReservedKeyword(String name) {
        // 处理用到了保留字的情况
        if (BUILT_IN_IDENTIFIER_IN_UPPER_CASE.contains(name.toUpperCase())) {
            return '`' + name + '`';
        }
        return name;
    }

    /**
     * 真的别名直接就返回不要走到下面的visitIdentifier的逻辑
     */
    public String visitAliasIdentifier(Identifier identifier) {
        String name = super.visitIdentifier(identifier);
        //        name = getCleanAliasIdentifierName(name);
        name = escapeReservedKeyword(name);
        return name;
    }

    @Override
    public String visitIdentifier(Identifier identifier) {
        String name = super.visitIdentifier(identifier);
        name = stripEnclosingDoubleQuotes(name);
        name = escapeReservedKeyword(name);
        // 实现Clickhouse的计算列功能
        String expr = tryGetExprFromAliasMap(name);
        if (expr != null) {
            if (!expr.equals(name)) {
                log.info(String.format("发现计算列:%s, 替换为%s", name, expr));
                return expr;
            }
        }
        return name;
    }

    private static String stripEnclosingDoubleQuotes(String name) {
        if (name.startsWith("\"") && name.endsWith("\"") && name.length() >= 3) {
            name = name.substring(1, name.length() - 1);
        }
        return name;
    }

    @Override
    public String visitWithClause(WithClause withClause) {
        super.visitWithClause(withClause);
        return "";
    }

    @Override
    public String visitJoinExpr(JoinExpr joinExpr) {
        StringBuilder buffer = new StringBuilder();
        if (null != joinExpr.getTableExpr()) {
            // 重置计算列相关数据保障计算列的准确性。
            if (!subQueryTypeStack.empty()) {
                if (!subQueryTypeStack.peek().equals("left") && !subQueryTypeStack.peek().equals("right")) {
                    subQueryTypeStack.push("subquery");
                }
            } else {
                subQueryTypeStack.push("subquery");
            }

            String expr = visitTableExpr(joinExpr.getTableExpr());
            if (joinExpr.getExprType().equals(JoinExpr.ExprType.TABLE)) {
                buffer.append("FROM ");
            }
            buffer.append(expr);
            if (!subQueryTypeStack.empty()) {
                if (!subQueryTypeStack.peek().equals("left") && !subQueryTypeStack.peek().equals("right")) {
                    subQueryTypeStack.pop();
                }
            }
        }
        if (null != joinExpr.getSampleClause()) {
            String expr = visitSampleClause(joinExpr.getSampleClause());
            buffer.append(expr);
        }

        if (null != joinExpr.getLeftExpr()) {
            subQueryTypeStack.push("left");
            String expr = visitJoinExpr(joinExpr.getLeftExpr());
            buffer.append(expr);
            subQueryTypeStack.pop();
        }
        if (null != joinExpr.getRightExpr()) {
            subQueryTypeStack.push("right");
            String expr = visitJoinExpr(joinExpr.getRightExpr());
            if (expr.startsWith("FROM ")) {
                expr = expr.substring("FROM ".length());
            }
            switch (joinExpr.getExprType()) {
                case TABLE:
                    buffer.append("FROM ");
                    break;
                case JOIN_OP:
                    buffer.append(visitJoinOperator(joinExpr.getOpType(), joinExpr.getOpMode()));
                    break;
                default:
            }
            buffer.append(expr);
            subQueryTypeStack.pop();
        }

        if (null != joinExpr.getJoinConstraintClause()) {
            String expr = visitJoinConstraintClause(joinExpr.getJoinConstraintClause());
            if (null != expr && !expr.isEmpty()) {
                buffer.append("ON ");
            }
            buffer.append(expr);
        }
        buffer.append(" ");
        return buffer.toString();
    }

    /**
     * 记录子查询用到的列(有别名的情况)是不是datetime类型。提高类型推断的准确率和时间处理函数改写的准确率。
     */
    public void recordDateTimeTypeColumn(ColumnExpr expr, Identifier aliasId) {
        if (isDateTimeFunctionExpr(expr)) {
            String alias = visitAliasIdentifier(aliasId);
            log.debug("发现datetime类型:" + alias);
            currentSqlScope.getDateTimeColumns().add(alias);
        }
    }

    @Override
    public String visitAliasColumnExpr(AliasColumnExpr expr) {
        StringBuilder buffer = new StringBuilder();
        String columnExpr = "";
        String alias = "";
        if (null != expr.getExpr()) {
            columnExpr = visitColumnExpr(expr.getExpr());
            buffer.append(columnExpr);
        }
        if (null != expr.getAlias()) {
            // 针对别名单独走一个visitAliasIdentifier函数不然可能会由于别名命中了一些计算列名被替换成表达式。
            Identifier aliasId = expr.getAlias();
            alias = visitAliasIdentifier(aliasId);
            if (null != alias) {
                buffer.append(" AS ").append(alias);
                recordDateTimeTypeColumn(expr.getExpr(), aliasId);
            }
            handleArrayJoinFunctionAlias(expr);

        }
        if (!columnExpr.isEmpty() && alias != null && !alias.isEmpty()) {
            updateAliasMap(alias, columnExpr);
        }

        return buffer.toString();
    }

    @Override
    public String visitSelectUnionQuery(SelectUnionQuery selectUnionQuery) {
        StringBuilder sqlBuffer = new StringBuilder();
        List<SelectStatement> selectStatements = selectUnionQuery.getStatements();
        // UNION ALL的数量, 每进一次UNION ALL都要更新scope.
        boolean isUnionAll = selectStatements.size() > 1;
        for (int i = 0; i < selectStatements.size(); i++) {
            if (i != 0) {
                sqlBuffer.append(" UNION ALL ");
            }
            SelectStatement selectStatement = selectStatements.get(i);
            boolean isLastOfUnionQuery = i == (selectStatements.size() - 1);
            enterScope(isUnionAll, selectStatement, i, isLastOfUnionQuery);
            addArrayJoinColumnIfExists(selectStatement);
            removeArrayJoinColumnIfExists(selectStatement);
            selectStatement.setModifierType(SelectStatement.ModifierType.NONE);
            String selectStat = visitSelectStatement(selectStatement);
            leaveScope();
            sqlBuffer.append(selectStat);
        }
        return sqlBuffer.toString();
    }

    private void removeArrayJoinColumnIfExists(SelectStatement selectStatement) {
        if (currentSqlScope.arrayJoinColumnToAdd != null) {
            List<ColumnExpr> exprs = selectStatement.getExprs();
            List<ColumnExpr> newExprs = new ArrayList<>();
            for (ColumnExpr expr : exprs) {
                if (expr instanceof AliasColumnExpr &&
                        ((AliasColumnExpr) expr).getExpr() instanceof FunctionColumnExpr) {
                    if (((FunctionColumnExpr) ((AliasColumnExpr) expr).getExpr()).getName().getName()
                            .equals("arrayJoin")) {
                        // 过滤掉arrayJoin函数列, 因为我们通过unnest实现了
                        continue;
                    }
                } else if (expr instanceof FunctionColumnExpr) {
                    if (((FunctionColumnExpr) expr).getName().getName().equals("arrayJoin")) {
                        // 过滤掉arrayJoin函数列, 因为我们通过unnest实现了
                        continue;
                    }
                }

                newExprs.add(expr);
            }
            selectStatement.setExprs(newExprs);
        }
    }

    private void addArrayJoinColumnIfExists(SelectStatement selectStatement) {
        if (currentSqlScope.arrayJoinColumnToAdd != null) {
            List<ColumnExpr> exprs = selectStatement.getExprs();
            List<ColumnExpr> newExprs = new ArrayList<>();
            newExprs.add(currentSqlScope.arrayJoinColumnToAdd);
            String alias = currentSqlScope.arrayJoinColumnToAdd.getAlias().getName();
            for (ColumnExpr expr : exprs) {
                if (expr instanceof IdentifierColumnExpr) {
                    if (visitIdentifierColumnExpr(expr).equals(alias)) {
                        continue;
                    }
                }
                newExprs.add(expr);
            }
            selectStatement.setExprs(newExprs);
        }

    }

    @Override
    public String visitTableExpr(TableExpr tableExpr) {
        generateAliasForSubQuery(tableExpr);
        if (tableExpr.getExpr() != null && tableExpr.getExpr().getSubQuery() != null) {
            String alias = visitIdentifier(tableExpr.getAlias());
            this.subQueryAliasStack.push(alias);
        }
        return super.visitTableExpr(tableExpr);
    }

    @Override
    public String visitSelectColumnExprList(List<ColumnExpr> exprs, boolean isDistinct) {
        return super.visitSelectColumnExprList(exprs, isDistinct);
    }

    /**
     * 帮当前的子查询生成一个别名(如果有就不用生成)
     */
    public void generateAliasForSubQuery(TableExpr tableExpr) {
        TableExpr subTableExpr = tableExpr.getExpr();
        SelectUnionQuery subQuery = tableExpr.getSubQuery();
        Identifier alias = tableExpr.getAlias();

        // 如果是子查询并且有设置别名的情况, 我们特地给子的subTableExpr设置一个别名,这样可以再进来的时候跳过下面的判断(否则会无限递归), 这样我们就可以实现对有设置别名的情况不生成别名
        if (subTableExpr != null && alias != null) {
            subTableExpr.setAlias(alias);
        }
        // 本身是子查询并且没有设置别名的情况, 我们给他做成一个有subTableExpr的结构, 这样解析的时候会生成别名
        else if (subTableExpr == null && subQuery != null && tableExpr.getAlias() == null) {
            TableExpr tableExpr1 = new TableExpr();
            Identifier alias1 = getRandomAliasIdentifier();
            tableExpr1.setAlias(alias1);
            tableExpr1.setSubQuery(subQuery);
            tableExpr.setExpr(tableExpr1);
            tableExpr.setSubQuery(null);
            tableExpr.setAlias(alias1);
        }

    }

    private static final String DEFAULT_NULL_VALUE_FOR_STRING_IN_CLICKHOUSE = "''";
    private static final String DEFAULT_NULL_VALUE_FOR_INT_IN_CLICKHOUSE = "0";
    private static final List<String> DEFAULT_NULLS = Arrays.asList(
            DEFAULT_NULL_VALUE_FOR_STRING_IN_CLICKHOUSE,
            DEFAULT_NULL_VALUE_FOR_INT_IN_CLICKHOUSE
    );

    /**
     * 处理Clickhouse SQL中判空是通过空字符串或者0的case, 加上IS NULL条件 todo,用户可能写>0来去掉非空的情况
     */
    public String handleNullCondition(FunctionColumnExpr functionColumnExpr) {
        try {
            String comparatorName = functionColumnExpr.getName().getName();
            boolean isEqualsOrNotEquals = comparatorName.equals("equals") || comparatorName.equals("notEquals");
            boolean isEquals = comparatorName.equals("equals");
            if (isEqualsOrNotEquals) {
                List<ColumnExpr> args = functionColumnExpr.getArgs();
                if (args.size() == 2 && args.get(0) instanceof IdentifierColumnExpr &&
                        args.get(1) instanceof LiteralColumnExpr) {
                    IdentifierColumnExpr firstArg = (IdentifierColumnExpr) args.get(0);
                    LiteralColumnExpr secondArg = (LiteralColumnExpr) args.get(1);
                    String firstArgStr = visit(firstArg);
                    String secondArgStr = visit(secondArg);
                    // 到这里的话 可以说明当前是在做一个 column=0 或者 column="" 的操作。在Clickhouse里我们没有用Nullable所以Null值
                    // 对Int来说是0, 对String来说是"". 而在SR里有NULL值, 所以我们这里改写成加上IS(NOT) NULL的判断。
                    if (DEFAULT_NULLS.contains(secondArgStr)) {
                        // 如果原始的operator是等于的话 那么应该生成 (key = 0 OR key IS NULL)
                        // 如果原始的operator是不等于的话 那么应该生成 (key != 0 AND key IS NOT NULL)
                        // todo 处理大于等于和小于等于的情况
                        String operator = isEquals ? " OR " : " AND ";
                        String comparator = isEquals ? " = " : " != ";
                        String comparatorForNull = isEquals ? " IS " : " IS NOT ";
                        String originalComparisonSql =
                                String.format("(%s) %s (%s)", firstArgStr, comparator, secondArgStr);
                        String sql = String.format("(%s) %s %s", firstArgStr, comparatorForNull, "NULL");
                        return " ( " + originalComparisonSql + operator + sql + " ) ";
                    }
                }
            }
        } catch (Exception e) {
            log.error("Handle Null Condition Errors: " + e.getMessage());
        }
        return null;
    }

    /**
     * 重写Clickhouse函数为StarRocks函数
     */
    public String rewriteClickhouseFunction(FunctionColumnExpr functionExpr) {
        try {
            Identifier id = functionExpr.getName();
            List<ColumnExpr> args = functionExpr.getArgs();
            List<ColumnExpr> params = functionExpr.getParams();
            String functionName = id.getName();
            String currentFunction = super.visitFunctionColumnExpr(functionExpr); // COST = 100%
            String rewrittenFunction = currentFunction;
            ColumnExpr firstArgColumnExpr = null;
            String firstArg = null;
            String secondArg = null;
            String thirdArg = null;
            int argLength = null == args ? 0 : args.size();
            for (int i = 0; i < argLength; i++) {
                ColumnExpr argExpr = args.get(i);
                if (i == 0) {
                    firstArg = visit(argExpr);
                    firstArgColumnExpr = argExpr;
                } else if (i == 1) {
                    secondArg = visit(argExpr);
                } else if (i == 2) {
                    thirdArg = visit(argExpr);
                }
            }
            String firstParam = null;
            int paramLength = 0;
            if (null != params) {
                paramLength = params.size();
            }
            for (int i = 0; i < paramLength; i++) {
                ColumnExpr paramExpr = params.get(i);
                if (i == 0) {
                    firstParam = visit(paramExpr);
                }
            }

            String spDateTimeColumn =
                    handleSupersetDateTimeColumn(functionName, firstArgColumnExpr, firstArg);
            if (null != spDateTimeColumn) {
                return spDateTimeColumn;
            }

            switch (functionName) {
                // 基础函数
                case "plus":
                case "minus": {
                    String plusOrMinus = functionName.equals("plus") ? "+" : "-";
                    String datetimeArithmetic = handleDateTimeArithmetic(plusOrMinus, args);
                    if (datetimeArithmetic != null) {
                        rewrittenFunction = datetimeArithmetic;
                    }
                    break;
                }
                case "cast": {
                    String type = secondArg;
                    if (secondArg == null) {
                        break;
                    }
                    type = type.replace("'", "");
                    rewrittenFunction = String.format("CAST(%s AS %s)", firstArg, type);
                    break;
                }
                case "notLike": {
                    rewrittenFunction = String.format("%s NOT LIKE %s", firstArg, secondArg);
                    break;
                }
                case "length": {
                    if (isArrayType(firstArgColumnExpr)) {
                        rewrittenFunction = String.format("ARRAY_LENGTH(%s)", firstArg);
                    } else {
                        rewrittenFunction = String.format("LENGTH(%s)", firstArg);
                    }
                    break;
                }
                // 日期时间相关函数
                case "addDays": {
                    rewrittenFunction = String.format("DATE_ADD(%s, INTERVAL %s DAY)", firstArg, secondArg);
                    break;
                }
                case "addMinutes": {
                    rewrittenFunction = String.format("DATE_ADD(%s, INTERVAL %s MINUTE)", firstArg, secondArg);
                    break;
                }
                case "dayOfWeek": {
                    rewrittenFunction = String.format("DAYOFWEEK_ISO(%s)", firstArg);
                    break;
                }
                case "DateDiff":
                case "dateDiff": {
                    String type = firstArg;
                    if (type == null) {
                        break;
                    }
                    if (!(type.startsWith("'") || type.startsWith("\""))) {
                        type = "'" + type + "'";
                    }
                    rewrittenFunction = String.format("DATE_DIFF(%s, %s, %s)", type, secondArg, thirdArg);
                    break;
                }
                case "formatDateTime": {
                    if (secondArg == null) {
                        break;
                    }
                    // https://docs.starrocks.io/docs/2.5/sql-reference/sql-functions/date-time-functions/date_format/
                    secondArg = secondArg.replace("%M", "%i"); // 分钟格式要转换一下
                    rewrittenFunction = String.format("DATE_FORMAT(%s, %s)", firstArg, secondArg);
                    break;

                }
                case "today": {
                    rewrittenFunction = "CURDATE()";
                    break;
                }
                case "fromUnixTimestamp": {
                    rewrittenFunction = String.format("FROM_UNIXTIME(%s)", firstArg);
                    break;
                }
                case "fromUnixTimestamp64Milli": {
                    rewrittenFunction = String.format("FROM_UNIXTIME(%s/1000)", firstArg);
                    break;
                }
                case "subtractDays": {
                    rewrittenFunction = String.format("DATE_ADD(%s, INTERVAL -%s DAY)", firstArg, secondArg);
                    break;
                }
                case "subtractMonths": {
                    rewrittenFunction = String.format("DATE_ADD(%s, INTERVAL %s MONTH)", firstArg, secondArg);
                    break;
                }
                case "subtractWeeks": {
                    rewrittenFunction = String.format("DATE_ADD(%s, INTERVAL -%s WEEK)", firstArg, secondArg);
                    break;
                }

                case "timestamp_add": {
                    if (firstArg == null) {
                        break;
                    }
                    String intervalName = firstArg.replace("toInterval", "");
                    rewrittenFunction =
                            String.format("DATE_ADD(%s, INTERVAL %s %s)", thirdArg, secondArg, intervalName);
                    break;
                }
                case "timestamp_sub": {
                    if (firstArg == null) {
                        break;
                    }
                    String intervalName = firstArg.replace("toInterval", "");
                    rewrittenFunction =
                            String.format("DATE_SUB(%s, INTERVAL %s %s)", thirdArg, secondArg, intervalName);
                    break;
                }
                case "toIntervalSecond":
                case "toIntervalMinute":
                case "toIntervalHour":
                case "toIntervalDay":
                case "toIntervalWeek":
                case "toIntervalMonth":
                case "toIntervalQuarter":
                case "toIntervalYear": {
                    String intervalName = functionName.replace("toInterval", "");
                    rewrittenFunction = String.format("INTERVAL %s %s", firstArg, intervalName);
                    break;
                }
                case "toDateTime":
                case "toDateTimeOrZero":
                case "toDateTimeOrNull":
                case "parseDateTimeBestEffortOrNull":
                case "parseDateTimeBestEffort": {
                    if (isDateTimeType(firstArgColumnExpr)) {
                        // 因为date一般是yyyy-MM-dd的格式
                        rewrittenFunction = String.format("CAST(%s AS DATETIME)", firstArg);
                    } else if (isUnixTimestampType(firstArgColumnExpr)) {
                        // 因为FROM_UNIXTIME不支持传入STRING但是Clickhouse的这4个输入函数都支持STRING。
                        rewrittenFunction = String.format("FROM_UNIXTIME(CAST(%s AS DOUBLE))", firstArg);
                    } else {
                        rewrittenFunction = String.format("CAST(%s AS DATETIME)", firstArg);
                    }
                    break;
                }
                case "toDate": {
                    rewrittenFunction = String.format("TO_DATE(%s)", firstArg);
                    break;
                }
                case "toHour": {
                    rewrittenFunction = String.format("HOUR(%s)", firstArg);
                    break;
                }
                case "toMonth": {
                    rewrittenFunction = String.format("MONTH(%s)", firstArg);
                    break;
                }
                case "toWeek": {
                    rewrittenFunction = String.format("WEEK(%s)", firstArg);
                    break;
                }
                case "toYear": {
                    rewrittenFunction = String.format("YEAR(%s)", firstArg);
                    break;
                }
                case "toMonday": {
                    rewrittenFunction =
                            String.format("DATE_SUB(%s, INTERVAL (DAYOFWEEK_ISO(%s) - 1 ) DAY)", firstArg, firstArg);
                    break;
                }
                case "toStartOfDay": {
                    rewrittenFunction = String.format("DATE_TRUNC('day', %s)", firstArg);
                    break;
                }
                case "toStartOfHour": {
                    rewrittenFunction = String.format("DATE_TRUNC('hour', %s)", firstArg);
                    break;
                }
                case "toStartOfFifteenMinutes": {
                    rewrittenFunction =
                            String.format("DATE_TRUNC('MINUTE', %s) - INTERVAL EXTRACT(MINUTE FROM %s) %% 15 MINUTE",
                                    firstArg, firstArg);
                    break;

                }
                case "toStartOfFiveMinute": {
                    rewrittenFunction =
                            String.format("DATE_TRUNC('MINUTE', %s) - INTERVAL EXTRACT(MINUTE FROM %s) %% 5 MINUTE",
                                    firstArg, firstArg);
                    break;

                }
                case "toStartOfMinute": {
                    rewrittenFunction = String.format("DATE_TRUNC('minute', %s)", firstArg);
                    break;
                }
                case "toStartOfMonth": {
                    rewrittenFunction = String.format("DATE_TRUNC('month', %s)", firstArg);
                    break;
                }
                case "toStartOfQuarter": {
                    rewrittenFunction = String.format("DATE_TRUNC('quarter', %s)", firstArg);
                    break;
                }
                case "toStartOfWeek": {
                    rewrittenFunction = String.format("DATE_TRUNC('week', %s)", firstArg);
                    break;
                }
                case "toStartOfYear": {
                    rewrittenFunction = String.format("DATE_TRUNC('year', %s)", firstArg);
                    break;
                }
                case "toTime": {
                    rewrittenFunction =
                            String.format("CAST(CONCAT('1970-01-02 ', SPLIT(CAST(%s AS STRING), ' '))[1] AS DATETIME)",
                                    firstArg);
                    break;
                }
                case "toYYYYMMDD": {
                    rewrittenFunction = String.format("DATE_FORMAT(%s, '%%Y%%m%%d')", firstArg);
                    break;
                }
                case "toYYYYMMDDhhmmss": {
                    rewrittenFunction = String.format("DATE_FORMAT(%s, '%%Y%%m%%d%%H%%i%%S')", firstArg);
                    break;
                }
                case "toUnixTimestamp": {
                    rewrittenFunction = String.format("UNIX_TIMESTAMP(%s)", firstArg);
                    break;
                }
                case "yesterday": {
                    rewrittenFunction = "curdate() - INTERVAL 1 day";
                    break;
                }
                // URL相关函数
                case "base64Decode":
                case "tryBase64Decode": {
                    rewrittenFunction = String.format("FROM_BASE64(%s)", firstArg);
                    break;
                }
                case "base64Encode":
                case "tryBase64Encode": {
                    rewrittenFunction = String.format("TO_BASE64(%s)", firstArg);
                    break;
                }
                case "decodeURLComponent": {
                    rewrittenFunction = String.format("URL_DECODE(%s)", firstArg);
                    break;
                }
                case "extractURLParameter": {
                    String queryParams = String.format("PARSE_URL(%s, 'QUERY')", firstArg);
                    String splitByAmpersand = String.format("SPLIT(%s, concat(%s, '+'))[2]", queryParams, secondArg);
                    rewrittenFunction = String.format("IF(%s LIKE '%%&%%', split(%s, '&')[1], %s)", splitByAmpersand,
                            splitByAmpersand, splitByAmpersand);
                    break;
                }
                case "domain": {
                    rewrittenFunction = String.format("PARSE_URL(%s, 'HOST')", firstArg);
                    break;
                }
                // math 数学函数
                case "floor": {
                    if (argLength == 2) {
                        rewrittenFunction =
                                String.format("round(%s * power(10, %s)) / power(10, %s)", firstArg, secondArg,
                                        secondArg);
                    }
                    break;
                }
                case "intDiv": {
                    rewrittenFunction = String.format("%s DIV %s", firstArg, secondArg);
                    break;
                }
                // 字符串相关函数
                case "extract": {
                    // 因为StarRocks/MySQL的正则表达式必须是\\d表示数字而不能是\d
                    String patternEscaped = fixBackSlash(secondArg);
                    rewrittenFunction = String.format("REGEXP_EXTRACT(%s, %s, 0)", firstArg, patternEscaped);
                    break;
                }
                case "extractAll": {
                    log.error("extractAll暂时没有对应的StarRocks方言函数");
                    break;
                }
                case "match": {
                    String patternEscaped = fixBackSlash(secondArg);
                    rewrittenFunction = String.format("REGEXP(%s, %s)", firstArg, patternEscaped);
                    break;
                }
                case "negate": {
                    rewrittenFunction = String.format("NEGATIVE(%s)", firstArg);
                    break;
                }
                case "notEmpty": {
                    rewrittenFunction = String.format("IF(length(%s) > 0, 1, 0)", firstArg);
                }
                case "regexpExtract": {
                    if (argLength != 3) {
                        log.warn(
                                "StarRocks只支持同时传入matchGroup的情况, 但是Clickhouse的matchGroup是可选参数并且本次没有传入。");
                        break;
                    }
                    String patternEscaped = fixBackSlash(secondArg);
                    rewrittenFunction = String.format("REGEXP_EXTRACT(%s, %s, %s)", firstArg, patternEscaped, thirdArg);
                    break;
                }
                case "replaceRegexpOne":
                case "replaceRegexpAll": {
                    String patternEscaped = fixBackSlash(secondArg);
                    rewrittenFunction = String.format("REGEXP_REPLACE(%s, %s, %s)", firstArg, patternEscaped, thirdArg);
                    break;
                }
                case "replaceOne":
                case "replaceAll": {
                    rewrittenFunction = String.format("REPLACE(%s, %s, %s)", firstArg, secondArg, thirdArg);
                    break;
                }
                case "splitByChar":
                case "splitByString":
                case "split": {
                    rewrittenFunction = String.format("SPLIT(%s, %s)", secondArg, firstArg);
                    break;
                }
                case "startsWith": {
                    rewrittenFunction = String.format("starts_with(%s, %s)", firstArg, secondArg);
                    break;
                }
                case "substr":
                case "substring": {
                    rewrittenFunction = String.format("SUBSTRING(%s, %s, %s)", firstArg, secondArg, thirdArg);
                    break;
                }
                case "toString": {
                    rewrittenFunction = String.format("CAST(%s AS STRING)", firstArg);
                    break;
                }
                case "trim": {
                    if (currentFunction.contains("BOTH")) {
                        rewrittenFunction = String.format("trim(%s, %s)", firstArg, firstParam);
                    } else if (currentFunction.contains("LEADING")) {
                        rewrittenFunction = String.format("ltrim(%s, %s)", firstArg, firstParam);
                    } else if (currentFunction.contains("TRAILING")) {
                        rewrittenFunction = String.format("rtrim(%s, %s)", firstArg, firstParam);
                    } else {
                        rewrittenFunction = String.format("trim(%s, %s)", firstArg, firstParam);
                    }
                    break;
                }
                case "visitParamHas": {
                    String jsonPath = String.format("concat('$', %s)", secondArg);
                    rewrittenFunction = String.format("JSON_EXISTS(%s, %s)", firstArg, jsonPath);
                    break;
                }
                case "visitParamExtractRaw": {
                    if (secondArg == null) {
                        break;
                    }
                    if (
                            (secondArg.startsWith("'") && secondArg.endsWith("'"))
                                    || (secondArg.startsWith("\"") && secondArg.endsWith("\""))
                    ) {
                        secondArg = secondArg.substring(1, secondArg.length() - 1);
                        secondArg = String.format("'$.%s'", secondArg);
                    }
                    rewrittenFunction = String.format("GET_JSON_OBJECT(%s,%s)", firstArg, secondArg);
                    break;
                }
                case "JSONExtractRaw": {
                    rewrittenFunction = String.format("GET_JSON_STRING(%s, %s)", firstArg, secondArg);
                    break;
                }
                case "JSONExtractInt":
                case "JSONExtractUInt":
                case "visitParamExtractUInt":
                case "visitParamExtractInt": {
                    rewrittenFunction = String.format("GET_JSON_INT(%s, %s)", firstArg, secondArg);
                    break;
                }
                case "JSONExtractString":
                case "visitParamExtractString": {
                    rewrittenFunction = String.format("GET_JSON_STRING(%s, %s)", firstArg, secondArg);
                    break;
                }
                // 其他函数
                case "caseWithExpression": {
                    StringBuilder caseWhen = new StringBuilder("CASE ");
                    if (args == null) {
                        break;
                    }
                    String columnToSwitch = visit(args.get(0));
                    caseWhen.append(columnToSwitch);
                    String defaultValue = visit(args.get(argLength - 1));
                    for (int i = 1; i < argLength - 1; i += 2) {
                        String condition = visit(args.get(i));
                        String value = visit(args.get(i + 1));
                        caseWhen.append(String.format(" WHEN %s THEN %s ", condition, value));
                    }
                    caseWhen.append(String.format(" ELSE %s ", defaultValue));
                    caseWhen.append(" END");
                    rewrittenFunction = caseWhen.toString();
                    break;
                }
                case "multiIf": {
                    if (args == null) {
                        break;
                    }
                    StringBuilder caseWhen = new StringBuilder("CASE ");
                    String defaultValue = visit(args.get(argLength - 1));
                    for (int i = 0; i < argLength - 1; i += 2) {
                        String condition = visit(args.get(i));
                        String value = visit(args.get(i + 1));
                        caseWhen.append(String.format(" WHEN %s THEN %s ", condition, value));
                    }
                    caseWhen.append(String.format(" ELSE %s ", defaultValue));
                    caseWhen.append(" END");
                    rewrittenFunction = caseWhen.toString();
                    break;
                }
                case "tuple": {
                    String elements = visitAllArgs(args);
                    rewrittenFunction = String.format("(%s)", elements);
                    break;
                }
                // 数组相关函数
                case "array": {
                    String elements = visitAllArgs(args);
                    rewrittenFunction = String.format("[%s]", elements);
                    break;
                }
                case "arrayElement": {
                    // 组合改写
                    //                    ColumnExpr firstArgColumnExpr = args.get(0);
                    if (firstArgColumnExpr instanceof FunctionColumnExpr) {
                        FunctionColumnExpr firstArgFunctionColumnExpr = (FunctionColumnExpr) firstArgColumnExpr;
                        if (firstArgFunctionColumnExpr.getName().getName().equals("extractAll")) {
                            String inputToExtract = super.visit(firstArgFunctionColumnExpr.getArgs().get(0));
                            String patternEscaped =
                                    fixBackSlash(super.visit(firstArgFunctionColumnExpr.getArgs().get(1)));
                            rewrittenFunction =
                                    String.format("REGEXP_EXTRACT(%s, %s, %s)", inputToExtract, patternEscaped,
                                            secondArg);
                            break;
                        }
                    }
                    rewrittenFunction = String.format("%s[%s]", firstArg, secondArg);
                    break;
                }
                case "arrayConcat": {
                    rewrittenFunction = replaceFunctionName("ARRAY_CONCAT", args);
                    break;
                }
                case "arrayFilter": {
                    rewrittenFunction = replaceFunctionName("ARRAY_FILTER", args);
                    break;
                }
                case "arrayMap": {
                    rewrittenFunction = replaceFunctionName("ARRAY_MAP", args);
                    break;
                }
                case "arrayJoin": {
                    handleArrayJoinFunction(args);
                    break;
                }
                case "arrayPopBack": {
                    rewrittenFunction = String.format("ARRAY_SLICE(%s, 1, ARRAY_LENGTH(%s) - 1)", firstArg, firstArg);
                    break;
                }
                case "arrayStringConcat": {
                    rewrittenFunction = String.format("ARRAY_JOIN(%s, %s)", firstArg, secondArg);
                    break;
                }
                case "arraySlice": {
                    rewrittenFunction = String.format("ARRAY_SLICE(%s, %s, %s)", firstArg, secondArg, thirdArg);
                    break;
                }
                case "groupUniqArray": {
                    rewrittenFunction = String.format("ARRAY_AGG(%s)", firstArg);
                    break;
                }
                case "range": {
                    rewrittenFunction = replaceFunctionName("ARRAY_GENERATE", args);
                    break;
                }
                // 聚合函数
                case "groupBitmap": {
                    rewrittenFunction = String.format("COUNT(DISTINCT %s)", firstArg);
                    break;
                }
                case "argMax": {
                    rewrittenFunction = String.format("MAX_BY(%s, %s)", firstArg, secondArg);
                    break;
                }
                case "argMin": {
                    rewrittenFunction = String.format("MIN_BY(%s, %s)", firstArg, secondArg);
                    break;
                }
                // comparison operator
                case "notIn": {
                    if (secondArg == null) {
                        break;
                    }
                    int len = secondArg.length();
                    // 因为形如 a not in (2) 这样的条件里 (2)被识别为Literal, 括号被省略了, 这里只能加回去否则生成的sql
                    // 是a not in 2。
                    if (len >= 2 && secondArg.charAt(0) != '(' && secondArg.charAt(len - 1) != ')') {
                        secondArg = '(' + secondArg + ')';
                    }
                    rewrittenFunction = String.format("%s not in %s", firstArg, secondArg);
                    break;
                }
                // 百分位相关
                case "quantileExact": {
                    if (firstParam == null) {
                        firstParam = "0.5";
                    }
                    rewrittenFunction = String.format("PERCENTILE_CONT(%s, %s)", firstArg, firstParam);
                    break;
                }
                // row number 相关
                case "rowNumberInAllBlocks": {
                    rewrittenFunction = "ROW_NUMBER() OVER ()";
                    break;
                }
                //                case "uniqState": {
                //                    throw new UnSupportedFunctionException("uniqState");
                //                }
                // 类型转换相关函数
                case "toDecimal32":
                case "toDecimal64":
                case "toDecimal128":
                case "toDecimal256":
                case "toDecimal32OrNull":
                case "toDecimal64OrNull":
                case "toDecimal128OrNull":
                case "toDecimal256OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS DECIMAL(38, %s))", firstArg, secondArg);
                    break;
                }
                case "toUInt256":
                case "toUInt256OrNull":
                case "toInt256":
                case "toInt256OrNull":
                case "toUInt128":
                case "toUInt128OrNull":
                case "toInt128":
                case "toInt128OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS LARGEINT)", firstArg);
                    break;
                }
                case "toUInt64":
                case "toUInt64OrNull":
                case "toInt64":
                case "toInt64OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS BIGINT)", firstArg);
                    break;
                }
                case "toUInt64OrZero":
                case "toUInt64OrDefault":
                case "toInt64OrZero":
                case "toInt64OrDefault": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS BIGINT) IS NOT NULL, CAST(%s AS BIGINT) , %s)", firstArg,
                                    firstArg, defaultValue);
                    break;
                }
                case "toUInt256OrZero":
                case "toUInt256OrDefault":
                case "toInt256OrZero":
                case "toInt256OrDefault":
                case "toUInt128OrZero":
                case "toUInt128OrDefault":
                case "toInt128OrZero":
                case "toInt128OrDefault": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS LARGEINT) IS NOT NULL, CAST(%s AS LARGEINT) , %s)", firstArg,
                                    firstArg, defaultValue);
                    break;
                }
                case "toUInt32":
                case "toUInt32OrNull":
                case "toInt32":
                case "toInt32OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS INT)", firstArg);
                    break;
                }
                case "toInt32OrZero":
                case "toInt32OrDefault":
                case "toUInt32OrZero":
                case "toUInt32OrDefault": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS INT) IS NOT NULL, CAST(%s AS INT) , %s)", firstArg, firstArg,
                                    defaultValue);
                    break;
                }
                case "toUInt16":
                case "toUInt16OrNull":
                case "toInt16":
                case "toInt16OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS SMALLINT)", firstArg);
                    break;
                }
                case "toInt16OrZero":
                case "toInt16OrDefault":
                case "toUInt16OrZero":
                case "toUInt16OrDefault": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS SMALLINT) IS NOT NULL, CAST(%s AS SMALLINT) , %s)", firstArg,
                                    firstArg, defaultValue);
                    break;
                }
                case "toUInt8":
                case "toUInt8OrNull":
                case "toInt8":
                case "toInt8OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS TINYINT)", firstArg);
                    break;
                }
                case "toInt8OrZero":
                case "toInt8OrDefault":
                case "toUInt8OrZero":
                case "toUInt8OrDefault": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS TINYINT) IS NOT NULL, CAST(%s AS TINYINT) , %s)", firstArg,
                                    firstArg, defaultValue);
                    break;
                }
                case "toFloat64":
                case "toFloat64OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS DOUBLE)", firstArg);
                    break;
                }
                case "toFloat64OrDefault":
                case "toFloat64OrZero": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS DOUBLE) IS NOT NULL, CAST(%s AS DOUBLE) , %s)", firstArg,
                                    firstArg, defaultValue);
                    break;
                }

                case "toFloat32":
                case "toFloat32OrNull": {
                    rewrittenFunction = String.format("CAST(%s AS FLOAT)", firstArg);
                    break;
                }
                case "toFloat32OrDefault":
                case "toFloat32OrZero": {
                    String defaultValue = secondArg;
                    if (null == defaultValue) {
                        defaultValue = "0";
                    }
                    rewrittenFunction =
                            String.format("IF(CAST(%s AS FLOAT) IS NOT NULL, CAST(%s AS FLOAT) , %s)", firstArg,
                                    firstArg, defaultValue);
                    break;
                }
                case "uniq":
                case "uniqCombined": {
                    rewrittenFunction = String.format("APPROX_COUNT_DISTINCT(%s)", firstArg);
                    break;
                }
                default: {
                    break;
                }
            }
            return rewrittenFunction;
        } catch (Exception e) {
            log.error("Clickhouse SQL转化成StarRocks SQL出错, " + e.getMessage());
            throw e;
        }

    }

    /**
     * select today() - 3  => select (CURDATE()) - INTERVAL 3 day
     */
    private String handleDateTimeArithmetic(String plusOrMinus, List<ColumnExpr> args) {
        Map<String, String> datetimes = new HashMap<>();
        datetimes.put("TODAY", "CURDATE()");
        datetimes.put("YESTERDAY", "CURDATE() - INTERVAL 1 day");

        if (args == null || args.size() != 2) {
            return null;
        } else {
            ColumnExpr possibleDateTime = args.get(0);
            if (possibleDateTime instanceof FunctionColumnExpr) {
                String possibleDateTimeFunctionName = ((FunctionColumnExpr) possibleDateTime).getName().getName();
                String possibleDateTimeFunctionNameUpperCase = possibleDateTimeFunctionName.toUpperCase();
                if (datetimes.containsKey(possibleDateTimeFunctionNameUpperCase)) {
                    String value = datetimes.get(possibleDateTimeFunctionNameUpperCase);
                    String intervalValue = ckSqlBuilder.visitColumnExpr(args.get(1));
                    return String.format("(%s) %s INTERVAL %s day", value, plusOrMinus, intervalValue);
                }
            }
        }
        return null;
    }

    private void handleArrayJoinFunctionAlias(AliasColumnExpr expr) {
        if (expr != null) {
            ColumnExpr columnExpr = expr.getExpr();
            Identifier alias = expr.getAlias();
            String aliasStr = visitIdentifier(alias);
            if (columnExpr != null && alias != null) {
                if (columnExpr instanceof FunctionColumnExpr) {
                    String functionName = visitIdentifier(((FunctionColumnExpr) columnExpr).getName());
                    if (functionName.equals("arrayJoin")) {
                        TableIdentifier table = new TableIdentifier(new Identifier(""), new Identifier(""));
                        ColumnIdentifier ci = new ColumnIdentifier(table, new Identifier("unnest"));
                        IdentifierColumnExpr cie = ColumnExpr.createIdentifier(ci);
                        currentSqlScope.arrayJoinColumnToAdd = ColumnExpr.createAlias(cie, new Identifier(aliasStr));
                    }
                }
            }
        }
    }

    /**
     * arrayJoin函数, 只记录相关信息到arrayJoinColumnToAdd
     */
    private void handleArrayJoinFunction(List<ColumnExpr> args) {
        if (args == null || args.size() > 1) {
            log.error("ARRAY JOIN改写只支持1列的情况");
        } else {
            ColumnExpr expr = args.get(0);
            currentSqlScope.arrayJoinExprToUnnestFromArrayJoinFunction = visitColumnExpr(expr);
        }
        // unnest as <打平后的列名>.
    }

    @Override
    public String visitFromClause(FromClause fromClause) {
        String fromStat = visitJoinExpr(fromClause.getExpr());
        if (currentSqlScope.arrayJoinExprToUnnestFromArrayJoinFunction != null) {
            // 处理arrayJoin函数的情况
            fromStat += " ,unnest(" + currentSqlScope.arrayJoinExprToUnnestFromArrayJoinFunction + ")";
        }
        return fromStat;
    }

    private String replaceFunctionName(String functionName, List<ColumnExpr> args) {
        String elements = visitAllArgs(args);
        return String.format("%s(%s)", functionName, elements);
    }

    private String visitAllArgs(List<ColumnExpr> args) {
        if (args != null) {
            return args.stream().map(
                    this::visit
            ).collect(Collectors.joining(","));
        }
        return "";
    }

    /**
     * ClickHouse里的正则表达式直接写\s即可, 但是在StarRocks里要改成\\s
     */
    public String fixBackSlash(String pattern) {
        pattern = pattern.replace("\\d", "\\\\d");
        pattern = pattern.replace("\\w", "\\\\w");
        pattern = pattern.replace("\\s", "\\\\s");
        pattern = pattern.replace("\\?", "\\\\?");
        return pattern;
    }

    private String handleSupersetDateTimeColumn(String functionName,
                                                ColumnExpr firstArgColumnExpr, String firstArg) {
        boolean isFirstArgDateTimeType = isDateTimeType(firstArgColumnExpr);
        boolean isFuncIntCastFunction = isIntCastFunction(functionName);
        if (isFuncIntCastFunction && isFirstArgDateTimeType) {
            return String.format("UNIX_TIMESTAMP(%s)", firstArg);
        } else {
            return null;
        }
    }

    private boolean isIntCastFunction(String functionName) {
        return functionName.startsWith("toInt") || functionName.startsWith("toUInt");
    }

    private static final Set<String> FUNCTION_THAT_RETURNS_DATE_TIME = new HashSet<>(Arrays.asList(
            "TODATETIME",
            "TODATETIMEORZERO",
            "TODATETIMEORNULL",
            "PARSEDATETIMEBESTEFFORTORNULL",
            "PARSEDATETIMEBESTEFFORT",
            "FROMUNIXTIMESTAMP",
            "FROMUNIXTIMESTAMP64MILLI",
            "ADDDAYS"
    )
    );

    private boolean isDateTimeFunctionExpr(ColumnExpr columnExpr) {
        if (columnExpr instanceof FunctionColumnExpr) {
            FunctionColumnExpr functionColumnExpr = (FunctionColumnExpr) columnExpr;
            String functionName = functionColumnExpr.getName().getName();
            if (FUNCTION_THAT_RETURNS_DATE_TIME.contains(functionName.toUpperCase())) {
                return true;
            } else {
                return functionName.startsWith("toStartOf");
            }
        }
        return false;
    }

    private boolean isArrayType(ColumnExpr columnExpr) {
        if (columnExpr != null) {
            String firstArgInCKSql = ckSqlBuilder.visit(columnExpr);
            return firstArgInCKSql.toUpperCase().startsWith("SPLIT");
        }
        return false;
    }

    // YYYY-MM-dd或者YYYYMMdd的日期
    private Set<String> commonDateColumnNamesInUpperCase = new HashSet<>();

    private boolean isDateTimeType(ColumnExpr columnExpr) {
        // 如果是TODATETIME这种函数 说明是DATETIME类型
        if (columnExpr == null) {
            return false;
        }
        // 要拿到原始的ckSQL
        String argInCKSql = ckSqlBuilder.visit(columnExpr);
        if (argInCKSql == null) {
            return false;
        }
        String argInCKSqlUpper = argInCKSql.toUpperCase();
        if (isDateTimeFunctionExpr(columnExpr)) {
            return true;
        }

        if (commonDateColumnNamesInUpperCase.contains(argInCKSqlUpper)) {
            return true;
        }

        // 看看是不是子查询里算出来的时间列
        return isDateTimeColumnsFromSubQuery(argInCKSql);
    }

    private boolean isDateTimeColumnsFromSubQuery(String columnName) {
        if (!buildNodeGraph && currentSqlScope != null && currentSqlScope.left != null) {
            Set<String> dateTimeColumns = currentSqlScope.left.dateTimeColumns;
            return null != dateTimeColumns && dateTimeColumns.contains(columnName);
        } else if (!buildNodeGraph && currentSqlScope != null && currentSqlScope.right != null) {
            Set<String> dateTimeColumns = currentSqlScope.right.dateTimeColumns;
            return null != dateTimeColumns && dateTimeColumns.contains(columnName);
        }
        return false;
    }

    // unix时间戳类型的字段
    private Set<String> commonUnixTimestampColumnNamesInUpperCase = new HashSet<>();

    private boolean isUnixTimestampType(ColumnExpr columnExpr) {
        if (null == columnExpr) {
            return false;
        }
        String argInCKSql = ckSqlBuilder.visit(columnExpr);
        if (null == argInCKSql) {
            return false;
        }
        String argInCKSqlUpper = argInCKSql.toUpperCase();
        if (commonUnixTimestampColumnNamesInUpperCase.contains(argInCKSqlUpper)) {
            return true;
        }

        for (String i : commonUnixTimestampColumnNamesInUpperCase) {
            if (argInCKSqlUpper.contains(i)) {
                return true;
            }
        }

        // A simple heuristic that if the argument it's a function that's wrangling with numbers then it's gotta be a
        // unix timestamp like string rather than a datetime string.
        if (columnExpr instanceof FunctionColumnExpr) {
            final Set<String> functionThatAppliesToNumbers =
                    new HashSet<>(Arrays.asList("MULTIPLY", "DIVIDE", "INTDIV"));
            FunctionColumnExpr functionColumnExpr = (FunctionColumnExpr) columnExpr;
            String functionName = functionColumnExpr.getName().getName().toUpperCase();
            if (functionThatAppliesToNumbers.contains(functionName)) {
                return true;
            } else if (functionName.startsWith("TOINT")) {
                return true;
            }
        }

        // Only rewrite on the second pass and for the innermost level where it's directly selecting from the table
        // rather than a subquery.
        if (!buildNodeGraph && currentSqlScope.isLeaf()) {
            if (currentSqlScope.statement != null && currentSqlScope.statement.getFromClause() != null) {
                JoinExpr joinExpr = currentSqlScope.statement.getFromClause().getExpr();
                String tableName = ckSqlBuilder.visitTableExpr(joinExpr.getTableExpr());
                if (tableName.contains(".")) {
                    tableName = tableName.split("\\.")[1];
                }
                return tablename2UnixTimestampColumnNames.getOrDefault(tableName.toLowerCase(), new HashSet<>())
                        .contains(argInCKSqlUpper.toLowerCase());
            }
        }
        return false;
    }

    @Override
    public String visitFunctionColumnExpr(ColumnExpr expr) {
        FunctionColumnExpr functionColumnExpr = (FunctionColumnExpr) expr;
        String sql;
        if (enableHandleNullable) {
            sql = handleNullCondition(functionColumnExpr);
            if (null != sql) {
                return sql;
            }
        }

        sql = rewriteClickhouseFunction(functionColumnExpr);
        if (null != sql) {
            return sql;
        }
        sql = super.visitFunctionColumnExpr(expr);
        return sql;
    }

    /**
     * 记录当前作用域下的别名和表达式的关系, 实现计算列的功能
     */
    public void updateAliasMap(String alias, String expr) {
        currentAlias2Expr.put(escapeReservedKeyword(stripEnclosingDoubleQuotes(alias)), expr);
    }

    public String tryGetExprFromAliasMap(String alias) {
        return currentAlias2Expr.get(escapeReservedKeyword(stripEnclosingDoubleQuotes(alias)));
    }

    @Override
    public String visitColumnExpr(ColumnExpr expr) {
        // 看看是不是计算列, 是的话就替换成实际的表达式
        if (expr instanceof IdentifierColumnExpr) {
            Identifier id = ((IdentifierColumnExpr) expr).getIdentifier();
            String name;
            if (id != null) {
                name = id.getQualifiedName();
                String actualExpr = tryGetExprFromAliasMap(name);
                if (actualExpr != null) {
                    return actualExpr;
                } else {
                    return super.visitIdentifierColumnExpr(expr);
                }
            }
        }

        String sql = this.currentColumnCache.get(expr);
        if (null != sql) {
            log.debug(String.format("命中column cache, %s -> %s", expr, sql));
            return sql;
        }

        sql = super.visitColumnExpr(expr);
        this.currentColumnCache.put(expr, sql);
        return sql;
    }

    @Override
    public String visitTableIdentifier(TableIdentifier tableIdentifier) {
        return super.visitTableIdentifier(tableIdentifier);
    }

    /**
     * @param arrayJoinClause 提取出ARRAY JOIN子句改成unnest方法
     */
    @Override
    public String visitArrayJoinClause(ArrayJoinClause arrayJoinClause) {
        if (null != arrayJoinClause.getExprs()) {
            List<ColumnExpr> exprs = arrayJoinClause.getExprs();
            if (exprs.size() > 1) {
                log.error("ARRAY JOIN改写只支持1列的情况");
                return null;
            }
            ColumnExpr expr = exprs.get(0);
            TableIdentifier table = new TableIdentifier(new Identifier(""), new Identifier(""));
            ColumnIdentifier ci = new ColumnIdentifier(table, new Identifier("unnest"));
            IdentifierColumnExpr cie = ColumnExpr.createIdentifier(ci);
            String arrayJoinAlias;
            if (expr instanceof AliasColumnExpr) {
                // array join <array_column> as <alias>
                arrayJoinAlias = visit(((AliasColumnExpr) expr).getExpr());
                AliasColumnExpr aliasExpr = (AliasColumnExpr) expr;
                currentSqlScope.arrayJoinColumnToAdd = ColumnExpr.createAlias(cie, aliasExpr.getAlias());
            } else if (expr instanceof IdentifierColumnExpr) {
                // array join <array_column>
                arrayJoinAlias = visit(expr);
                currentSqlScope.arrayJoinColumnToAdd = ColumnExpr.createAlias(cie, new Identifier(arrayJoinAlias));
            } else {
                log.error("ARRAY JOIN异常");
                arrayJoinAlias = "";
            }

            return " ,unnest(" + arrayJoinAlias + ")";
        }
        return null;
    }

    public String visitGroupByClause(GroupByClause groupByClause) {
        if (null != groupByClause.getGroupByExprs()) {
            String expr = visitColumnExprList(groupByClause.getGroupByExprs());
            if (null != expr && !expr.isEmpty()) {
                StringBuilder buffer = new StringBuilder("GROUP BY ");
                expr = expr.replace("{,}", ",");
                switch (groupByClause.getModifierType()) {
                    case CUBE:
                        buffer.append(" CUBE(").append(expr).append(") ");
                        break;
                    case ROLLUP:
                        buffer.append(" ROLLUP(").append(expr).append(") ");
                        break;
                    default:
                        buffer.append(expr).append(" ");
                        break;
                }
                return buffer.toString();
            }
        }
        return "";
    }

    public String getStarRocksSql(String clickHouseSql) throws SqlRewriteException {
        try{
            AstParser astParser = new AstParser();
            Object parsedResult = astParser.parse(clickHouseSql);
            // PASS两次是为了第一次PASS的时候能够生成SqlNode树(记录上下游的信息, 各种元信息等), 这样第二次PASS的时候才能实现帮当前SELECT的
            // 列补齐子查询的别名等功能
            resetSqlNodeStatus();
            visit((Query) parsedResult);
            traverseSqlScope(start);
            this.buildNodeGraph = false;
            resetSqlNodeStatus();
            return visit((Query) parsedResult);
        }catch (Exception e){
            throw new SqlRewriteException("Rewrite ClickHouse Sql to StarRocks Sql failed:" + e.getMessage());
        }
    }

    public void traverseSqlScope(SqlScopeNode node) {
        String nodeType = node.getNodeType();
        switch (nodeType) {
            case "leaf":
                break;
            case "union":
                traverseSqlScope(node.next);
                break;
            case "subquery":
                traverseSqlScope(node.getSubQuery());
                break;
            case "join":
                List<ColumnExpr> leftExprs = node.left.statement.getExprs();
                Set<String> leftIds = leftExprs.stream().map(
                        i -> {
                            if (i instanceof AliasColumnExpr) {
                                return ckSqlBuilder.visit(((AliasColumnExpr) i).getAlias());
                            } else {
                                return ckSqlBuilder.visit(i);
                            }
                        }

                ).collect(Collectors.toSet());

                List<ColumnExpr> rightExprs = node.right.statement.getExprs();
                Set<String> rightIds = rightExprs.stream().map(
                        i -> {
                            if (i instanceof AliasColumnExpr) {
                                return ckSqlBuilder.visit(((AliasColumnExpr) i).getAlias());
                            } else {
                                return ckSqlBuilder.visit(i);
                            }
                        }
                ).collect(Collectors.toSet());
                leftIds.retainAll(rightIds);
                leftIds.remove("*");

                SelectStatement statement = node.statement;
                List<ColumnExpr> ids = statement.getExprs();
                String alias = node.left.alias;
                TableIdentifier tableIdentifier = new TableIdentifier(null, new Identifier(alias));
                for (ColumnExpr id : ids) {
                    IdentifierColumnExpr identifierColumnExpr;
                    if (id instanceof IdentifierColumnExpr) {
                        identifierColumnExpr = (IdentifierColumnExpr) id;
                        addTableLabelToIdentifierColumnExpr(identifierColumnExpr, tableIdentifier, leftIds);
                    } else if (id instanceof AliasColumnExpr) {
                        log.debug("AliasColumnExpr ignored");
                    } else if (id instanceof FunctionColumnExpr) {
                        List<IdentifierColumnExpr> identifierColumnExprs =
                                findIdentifierColumnExprFromFunctionColumnExpr((FunctionColumnExpr) id);
                        for (IdentifierColumnExpr _id : identifierColumnExprs) {
                            addTableLabelToIdentifierColumnExpr(_id, tableIdentifier, leftIds);
                        }
                    } else {
                        log.debug(id.getClass().getName() + " ignored");
                    }
                }
                traverseSqlScope(node.left);
                traverseSqlScope(node.right);
                break;
            default:
                throw new RuntimeException("Unknown nodeType:" + nodeType);
        }
    }

    public void addTableLabelToIdentifierColumnExpr(IdentifierColumnExpr identifierColumnExpr,
                                                    TableIdentifier tableIdentifier, Set<String> leftIds) {
        String tableNameForColumn = identifierColumnExpr.getIdentifier().getTable().getName();
        if (!tableNameForColumn.isEmpty()) {
            return;
        }
        String columnName = ckSqlBuilder.visit(identifierColumnExpr.getIdentifier());
        if (leftIds.contains(columnName)) {
            identifierColumnExpr.getIdentifier().setTable(tableIdentifier);
        }
    }

    public List<IdentifierColumnExpr> findIdentifierColumnExprFromFunctionColumnExpr(
            FunctionColumnExpr functionColumnExpr) {
        List<ColumnExpr> columnExprsArgs = functionColumnExpr.getArgs();
        List<IdentifierColumnExpr> identifierColumnExprs = new ArrayList<>();
        if (null != columnExprsArgs) {
            for (ColumnExpr columnExpr : columnExprsArgs) {
                if (columnExpr instanceof IdentifierColumnExpr) {
                    identifierColumnExprs.add((IdentifierColumnExpr) columnExpr);
                } else if (columnExpr instanceof FunctionColumnExpr) {
                    List<IdentifierColumnExpr> identifierColumnExprs1 =
                            findIdentifierColumnExprFromFunctionColumnExpr((FunctionColumnExpr) columnExpr);
                    identifierColumnExprs.addAll(identifierColumnExprs1);
                }
            }
        }
        return identifierColumnExprs;
    }

    private final Stack<Map<String, String>> windowAlias2ExprStack = new Stack<>();

    private Map<String, String> currentWindowAlias2Expr = new HashMap<>();

    private final Stack<Map<String, String>> alias2ExprStack = new Stack<>();

    private Map<String, String> currentAlias2Expr = new HashMap<>();
    private final Stack<Map<ColumnExpr, String>> columnCacheStack = new Stack<>();
    private Map<ColumnExpr, String> currentColumnCache = new HashMap<>();

    public void enterScope(boolean isUnionAll, SelectStatement statement, int index, boolean isLastOfUnionQuery) {
        alias2ExprStack.push(this.currentAlias2Expr);
        this.currentAlias2Expr = new HashMap<>();

        windowAlias2ExprStack.push(this.currentWindowAlias2Expr);
        this.currentWindowAlias2Expr = new HashMap<>();

        columnCacheStack.push(this.currentColumnCache);
        this.currentColumnCache = new HashMap<>();

        if (!isSubQueryInWhere && enableColumnDisambiguate) {
            if (buildNodeGraph) {
                String subQueryType = subQueryTypeStack.peek();
                if (isUnionAll) {
                    String currentSubQueryAlias = subQueryAliasStack.peek();
                    if (isLastOfUnionQuery) {
                        subQueryAliasStack.pop();
                    }
                    if (index == 0) {
                        currentSqlScope = new SqlScopeNode(currentSqlScope, null, currentSubQueryAlias, statement);
                        currentSqlScope.parent.left = currentSqlScope;
                    } else {
                        String alias = currentSubQueryAlias + "_" + index;
                        SqlScopeNode rightMostSon = currentSqlScope.getRightMostSon();
                        currentSqlScope = new SqlScopeNode(currentSqlScope, rightMostSon, alias, statement);
                        rightMostSon.next = currentSqlScope;
                    }

                } else {
                    String currentSubQueryAlias = subQueryAliasStack.pop();
                    currentSqlScope = new SqlScopeNode(currentSqlScope, null, currentSubQueryAlias, statement);
                    switch (subQueryType) {
                        case "left":
                        case "subquery":
                            currentSqlScope.parent.left = currentSqlScope;
                            break;
                        case "right":
                            currentSqlScope.parent.right = currentSqlScope;
                            break;
                    }
                }

            } else {
                // 如果不是在build SqlNode的graph的话 我们就只要保证currentSqlNode随着当前sql的作用域指向正确的节点就好
                if (isUnionAll) {
                    if (index == 0) {
                        currentSqlScope = currentSqlScope.left;
                    } else {
                        currentSqlScope = currentSqlScope.getSonAtIndex(index);
                    }
                } else {
                    if (!subQueryTypeStack.empty()) {
                        String subQueryType = subQueryTypeStack.peek();
                        switch (subQueryType) {
                            case "left":
                            case "subquery":
                                currentSqlScope = currentSqlScope.left;
                                break;
                            case "right":
                                currentSqlScope = currentSqlScope.right;
                                break;
                        }
                    } else {
                        throw new RuntimeException("Empty QueryType");
                    }
                }
            }
        }

    }

    public void leaveScope() {
        this.currentAlias2Expr = alias2ExprStack.pop();
        this.currentWindowAlias2Expr = windowAlias2ExprStack.pop();
        this.currentColumnCache = columnCacheStack.pop();
        if (!isSubQueryInWhere && enableColumnDisambiguate) {
            currentSqlScope = currentSqlScope.parent;
        }
    }

    @Override
    public String visitSubqueryColumnExpr(ColumnExpr expr) {
        if (expr instanceof SubqueryColumnExpr) {
            SubqueryColumnExpr subqueryColumnExpr = (SubqueryColumnExpr) expr;
            if (null != subqueryColumnExpr.getQuery()) {
                isSubQueryInWhere = true;
                String sql = " (" + visitSelectUnionQuery(subqueryColumnExpr.getQuery()) + ") ";
                isSubQueryInWhere = false;
                return sql;
            }
        }
        return null;
    }

    @Override
    public String visitShowTableQuery(ShowTableQuery showTableQuery) {
        showTableQuery.setFormat(null);
        return super.visitShowTableQuery(showTableQuery);
    }

    @Override
    public String visitWindowClause(WindowClause windowClause) {
        String windowName = visitIdentifier(windowClause.getWindowName());
        String windowExpr = visitWindowExpr(windowClause.getWindowExpr());
        // // 记录窗口表达式用于第二次遍历AST的时候替换窗口名字。
        currentSqlScope.windowNameToExpr.put(windowName, windowExpr);
        return "";
    }

    @Override
    public String visitWinFunctionTargetColumnExpr(WinFunctionTargetColumnExpr expr) {
        // identifier (LPAREN columnExprList? RPAREN) OVER identifier
        StringBuilder buffer = new StringBuilder();
        if (null != expr.getWindowFunction()) {
            String windowFunction = visitIdentifier(expr.getWindowFunction());
            buffer.append(windowFunction);
            buffer.append("(");
        }
        if (null != expr.getColumnExprs()) {
            String columnExprs = visitColumnExprList(expr.getColumnExprs());
            buffer.append(columnExprs);
        }
        buffer.append(") ");
        buffer.append("OVER ");
        if (null != expr.getWindowName()) {
            // 实现窗口表达式替换
            String windowName = visitIdentifier(expr.getWindowName());
            String windowExpr = currentSqlScope.windowNameToExpr.get(windowName);
            if (windowExpr != null) {
                buffer.append("(").append(windowExpr).append(")");
            } else {
                buffer.append("()");
            }
        }
        return buffer.toString();
    }

    private void resetSqlNodeStatus() {
        currentSqlScope = start;
        subQueryTypeStack = new Stack<>();
        subQueryTypeStack.push("subquery");
        subQueryAliasStack = new Stack<>();
        subQueryAliasStack.push("root");
    }

    @Data
    public static class SqlScopeNode {
        SelectStatement statement;
        SqlScopeNode left;
        SqlScopeNode right;
        SqlScopeNode parent;
        SqlScopeNode next;
        SqlScopeNode prev;
        String alias;
        Set<String> dateTimeColumns = new HashSet<>();
        // 用来处理ARRAY JOIN子句的情况
        AliasColumnExpr arrayJoinColumnToAdd = null;

        // 用来记录window子句的情况
        Map<String, String> windowNameToExpr = new HashMap<>();

        // 用来处理arrayJoin函数记录arrayJoin的列和生成的列的别名
        String arrayJoinExprToUnnestFromArrayJoinFunction = null;
        String arrayJoinColumnAlias = null;

        public SqlScopeNode getSonAtIndex(int index) {
            SqlScopeNode nthSon = left;
            for (int i = 0; i < index; i++) {
                nthSon = nthSon.next;
            }
            return nthSon;
        }

        public SqlScopeNode getRightMostSon() {
            SqlScopeNode rightMostSon = left;
            while (rightMostSon.next != null) {
                rightMostSon = rightMostSon.next;
            }
            return rightMostSon;
        }

        public SqlScopeNode(SqlScopeNode parent, SqlScopeNode prev, String alias, SelectStatement statement) {
            this.parent = parent;
            this.prev = prev;
            this.alias = alias;
            this.statement = statement;
        }

        public String getNodeType() {
            if (left == null) {
                if (next == null) {
                    return "leaf";
                } else {
                    return "union";
                }
            } else {
                if (right == null) {
                    return "subquery";
                } else {
                    return "join";
                }
            }
        }

        public boolean isLeaf() {
            return left == null && next == null;
        }

        public SqlScopeNode getSubQuery() {
            return left;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Node(");
            if (alias != null) {
                sb.append(" name=").append(alias);
            }
            if (left != null) {
                sb.append(", Left: ").append(left.alias);
            }

            if (right != null) {
                sb.append(", Right: ").append(right.alias);
            }

            if (next != null) {
                sb.append(", Next: ").append(next.alias);
            }

            sb.append(" )");
            return sb.toString();
        }
    }
}
