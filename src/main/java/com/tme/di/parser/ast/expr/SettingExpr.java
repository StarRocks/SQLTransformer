package com.tme.di.parser.ast.expr;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import com.tme.di.parser.ast.Literal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SettingExpr extends INode {

    private Identifier name;

    private Literal value;

    public SettingExpr(Identifier name, Literal value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitSettingExpr(this);
    }
}
