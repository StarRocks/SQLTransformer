package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class JoinConstraintClause extends SimpleClause {

    private ConstraintType type;

    private List<ColumnExpr> exprs;

    public enum ConstraintType
    {
        ON,
        USING,
    }

    public JoinConstraintClause(ConstraintType type, List<ColumnExpr> exprs) {
        this.type = type;
        this.exprs = exprs;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitJoinConstraintClause(this);
    }
}
