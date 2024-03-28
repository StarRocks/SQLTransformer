package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class PartitionByClause extends INode {

    private List<ColumnExpr> exprs;
    public PartitionByClause(List<ColumnExpr> exprs) {
        this.exprs = exprs;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitPartitionByClause(this);
    }
}
