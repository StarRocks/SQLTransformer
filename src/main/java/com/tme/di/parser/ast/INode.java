package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import lombok.Data;

@Data
public class INode {

    public INode() {
    }

    public <T> T accept(AstVisitor<T> astVisitor) {
        // override this method in subclass
        return null;
    }

}
