package com.tme.di.visitor;

import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import com.tme.di.parser.ast.expr.ColumnExpr;
import com.tme.di.parser.ast.expr.FunctionColumnExpr;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class PrestoSqlBuilder extends BaseSqlBuilder {
    public PrestoSqlBuilder() {

    }
    @Override
    public String visitFunctionColumnExpr(ColumnExpr expr) {
        FunctionColumnExpr functionColumnExpr = (FunctionColumnExpr) expr;
        String sql = rewriteClickhouseSql(functionColumnExpr);
        if (null != sql) {
            return sql;
        }
        sql = super.visitFunctionColumnExpr(expr);
        return sql;
    }

    public String rewriteClickhouseSql(FunctionColumnExpr functionExpr) {
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
            String fourthArg = null;
            List<String> allArgs = new ArrayList<>();
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
                } else if (i == 3) {
                    fourthArg = visit(argExpr);
                } else {
//                    log.debug("more than 4 args are found");
                }
            }
            String firstParam = null;
            String secondParam = null;
            int paramLength = 0;
            if (null != params) {
                paramLength = params.size();
            }
            for (int i = 0; i < paramLength; i++) {
                ColumnExpr paramExpr = params.get(i);
                if (i == 0) {
                    firstParam = visit(paramExpr);
                } else if (i == 1) {
                    secondParam = visit(paramExpr);
                } else if (i == 2) {
                    log.warn("more than 2 args are found");
                }
            }


            switch (functionName) {
                // 基础函数
                case "toDateTime":{
                    rewrittenFunction= String.format("CAST(%s AS TIMESTAMP)", firstArg);
                    break;
                }
                case "cast": {
                    String type = secondArg;
                    type = type.replace("'", "");
                    rewrittenFunction = String.format("CAST(%s AS %s)", firstArg, type);
                    break;
                }
            }
            return rewrittenFunction;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Clickhouse SQL转化成Presto SQL出错, " + e.getMessage());
            throw e;
        }

    }
    public String getPrestoSql(INode astNode){
        return visit(astNode);
    }
}
