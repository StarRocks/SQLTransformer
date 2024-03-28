package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.tree.TerminalNode;

@EqualsAndHashCode(callSuper=true)
public class StringLiteral extends Literal {

    public StringLiteral(TerminalNode literal) {
        super(LiteralType.STRING, literal.getSymbol().getText());
    }

    public StringLiteral(String literal) {
        super(LiteralType.STRING, literal);
    }

    <T> T as() {
        // TODO:
        asString();
        return null;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitStringLiteral(this);
    }
}
