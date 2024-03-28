package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class EngineExpr extends INode {

    private Identifier identifier;

    private List<ColumnExpr> args;

    public EngineExpr(Identifier identifier, List<ColumnExpr> args) {
        this.identifier = identifier;
        this.args = args;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        // TODO:
        return super.accept(astVisitor);
    }
}
