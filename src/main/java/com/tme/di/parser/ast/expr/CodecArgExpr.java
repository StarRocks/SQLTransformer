package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class CodecArgExpr extends INode {

    private Identifier identifier;
    List<ColumnExpr> list;

    public CodecArgExpr(Identifier identifier, List<ColumnExpr> list) {
        this.identifier = identifier;
        this.list = list;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitCodecArgExpr(this);
    }
}
