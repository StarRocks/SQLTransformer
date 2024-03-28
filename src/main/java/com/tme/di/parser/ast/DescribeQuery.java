package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.TableExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class DescribeQuery extends Query {

    private TableExpr tableExpr;

    public DescribeQuery(TableExpr tableExpr){
        this.tableExpr = tableExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitDescribeQuery(this);
    }
}
