package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import lombok.Data;

@Data
public class LimitClause extends INode {

    private boolean withTies;

    private LimitExpr limitExpr;

    public LimitClause(boolean withTies, LimitExpr limitExpr) {
        this.withTies = withTies;
        this.limitExpr = limitExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitLimitClause(this);
    }

}
