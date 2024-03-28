package com.tme.di.parser.ast;


import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.TTLExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class TTLClause extends SimpleClause {

    private List<TTLExpr> ttlExprList;

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTTLClause(this);
    }
}
