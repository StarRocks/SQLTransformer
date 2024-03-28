package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class WithClause extends SimpleClause {

    private List<ColumnExpr> withExpr;

    public WithClause(List<ColumnExpr> withExpr) {
        this.withExpr = withExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitWithClause(this);
    }
}
