package com.tme.di.parser.ast.expr;

import com.tme.di.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class AliasColumnExpr extends ColumnExpr {

    private ColumnExpr expr;

    private Identifier alias;

    protected AliasColumnExpr(ColumnExpr expr, Identifier alias) {
        super(ExprType.ALIAS);
        this.expr = expr;
        this.alias = alias;
    }

    public ColumnExpr getExpr() {
        return expr;
    }

    public Identifier getAlias() {
        return alias;
    }


}
