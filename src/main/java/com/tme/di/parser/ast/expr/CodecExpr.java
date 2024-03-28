package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class CodecExpr extends INode {

    private List<CodecArgExpr> codeArgExprList;

    public CodecExpr(List<CodecArgExpr> codeArgExprList) {
        this.codeArgExprList = codeArgExprList;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitCodecExpr(this);
    }
}
