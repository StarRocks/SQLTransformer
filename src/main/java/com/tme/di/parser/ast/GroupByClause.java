package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class GroupByClause extends SimpleClause {

    private List<ColumnExpr> groupByExprs;
    private SelectStatement.ModifierType modifierType;

    public GroupByClause(List<ColumnExpr> groupByExprs) {
        this.groupByExprs = groupByExprs;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitGroupByClause(this);
    }
}
