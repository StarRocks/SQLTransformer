package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.RatioExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SampleClause extends INode {

    private RatioExpr ratio;

    private RatioExpr offset;

    public SampleClause(RatioExpr ratio, RatioExpr offset) {
        this.ratio = ratio;
        this.offset = offset;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitSampleClause(this);
    }
}
