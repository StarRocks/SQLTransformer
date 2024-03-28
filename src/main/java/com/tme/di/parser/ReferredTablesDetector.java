package com.tme.di.parser;

import com.tme.di.parser.ast.*;
import com.tme.di.parser.ast.expr.ColumnExpr;
import com.tme.di.parser.ast.expr.SubqueryColumnExpr;
import lombok.Data;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NotThreadSafe
public class ReferredTablesDetector extends AstVisitor {

    private List<SelectUnionQuery> selectUnionQueryList = new ArrayList<>();

    private List<String> tables = new ArrayList<>();

    private Map<SelectStatement, List<String>> tablesInSelectStatements = new HashMap<>();

    private volatile SelectStatement currentSelectStatement;

    public List<String> searchTables(INode node) {
        if (tables.size() > 0) {
            return tables;
        }
        visit(node);
        return tables;
    }

    private List<SelectUnionQuery> searchSelectUnionQueryStatements(INode node) {
        visit(node);
        return selectUnionQueryList;
    }

    @Override
    public Object visitSelectUnionQuery(SelectUnionQuery selectUnionQuery) {
        if (null != selectUnionQuery) {
            selectUnionQueryList.add(selectUnionQuery);
        }
        for (SelectStatement selectStatement : selectUnionQuery.getStatements()) {
            currentSelectStatement = selectStatement;
            visitSelectStatement(selectStatement);
        }
        return null;
    }

    @Override
    public Object visitSubqueryColumnExpr(ColumnExpr expr) {
        if (expr instanceof SubqueryColumnExpr) {
            SubqueryColumnExpr subqueryColumnExpr = (SubqueryColumnExpr) expr;
            SelectUnionQuery selectUnionQuery = subqueryColumnExpr.getQuery();
            selectUnionQueryList.add(selectUnionQuery);
        }
        return super.visitSubqueryColumnExpr(expr);
    }

//    @Override
//    public Object visitDescribeQuery(DescribeQuery describeQuery) {
//
//    }
    @Override
    public Object visitTableIdentifier(TableIdentifier tableIdentifier) {
        tables.add(tableIdentifier.getQualifiedName());
        if (!tablesInSelectStatements.containsKey(currentSelectStatement)) {
            List<String> tablesInStmt = new ArrayList<>();
            tablesInSelectStatements.put(currentSelectStatement, tablesInStmt);
        }
        List<String> tablesInStmt = tablesInSelectStatements.get(currentSelectStatement);
        tablesInStmt.add(tableIdentifier.getQualifiedName());
        return super.visitTableIdentifier(tableIdentifier);
    }
}
