package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.NumberLiteral;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class RatioExpr extends INode {

    private NumberLiteral numerator;

    private NumberLiteral denominator;

    public RatioExpr(NumberLiteral numerator, NumberLiteral denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitRatioExpr(this);
    }
}
