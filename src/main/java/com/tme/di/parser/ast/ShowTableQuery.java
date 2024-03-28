package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.TableExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class ShowTableQuery extends Query {


    public ShowTableQuery(){
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitShowTableQuery(this);
    }
}
