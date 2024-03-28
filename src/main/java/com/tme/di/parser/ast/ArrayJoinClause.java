package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class ArrayJoinClause extends INode {

    private List<ColumnExpr> exprs;

    private final boolean left;

    public ArrayJoinClause(List<ColumnExpr> exprs, boolean left) {
        this.exprs = exprs;
        this.left = left;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitArrayJoinClause(this);
    }
}
