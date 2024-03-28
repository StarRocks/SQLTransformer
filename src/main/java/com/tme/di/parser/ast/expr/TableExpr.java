package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import com.tme.di.parser.ast.SelectUnionQuery;
import com.tme.di.parser.ast.TableIdentifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TableExpr extends INode {

    private TableExpr expr;
    private Identifier alias;
    private TableFunctionExpr function;
    private TableIdentifier identifier;
    private SelectUnionQuery subQuery;
    private ExprType exprType;

    enum ExprType
    {
        ALIAS,
        FUNCTION,
        IDENTIFIER,
        SUBQUERY,
    }

    public static TableExpr createAlias(TableExpr expr, Identifier alias) {
        TableExpr tableExpr = new TableExpr();
        tableExpr.setExpr(expr);
        tableExpr.setAlias(alias);
        return tableExpr;
    }

    public static TableExpr createFunction(TableFunctionExpr function) {
        TableExpr tableExpr = new TableExpr();
        tableExpr.setFunction(function);
        return tableExpr;
    }

    public static TableExpr createIdentifier(TableIdentifier identifier) {
        TableExpr tableExpr = new TableExpr();
        tableExpr.setIdentifier(identifier);
        return tableExpr;
    }

    public static TableExpr createSubquery(SelectUnionQuery subquery) {
        TableExpr tableExpr = new TableExpr();
        tableExpr.setSubQuery(subquery);
        return tableExpr;
    }

    public String dumpInfo() {
        switch (exprType) {
            case ALIAS:
                return "ALIAS";
            case FUNCTION:
                return "FUNCTION";
            case IDENTIFIER:
                return "IDENTIFIER";
            case SUBQUERY:
                return "SUBQUERY";
        }
        // this can't happen
        return "ERROR";
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTableExpr(this);
    }
}
