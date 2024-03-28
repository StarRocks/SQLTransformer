package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class ShowDatabaseQuery extends Query {


    public ShowDatabaseQuery(){
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitShowDatabaseQuery(this);
    }
}
