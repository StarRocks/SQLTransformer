package com.tme.di.parser.ast.expr;

import com.tme.di.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class SimpleColumnTypeExpr extends ColumnTypeExpr {

    public SimpleColumnTypeExpr(Identifier name) {
        super(ExprType.SIMPLE, name);
    }

}
