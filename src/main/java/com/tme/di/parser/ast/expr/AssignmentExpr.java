package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AssignmentExpr extends INode  {

    private Identifier identifier;

    private ColumnExpr expr;

    public AssignmentExpr(Identifier identifier, ColumnExpr expr) {
        this.identifier = identifier;
        this.expr = expr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitAssignmentExpr(this);
    }
}
