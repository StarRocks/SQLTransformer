package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class LimitByClause extends INode {

    private LimitExpr limit;

    private List<ColumnExpr> exprs;

    public LimitByClause(LimitExpr limit, List<ColumnExpr> exprs) {
        this.limit = limit;
        this.exprs = exprs;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitLimitByClause(this);
    }

}
