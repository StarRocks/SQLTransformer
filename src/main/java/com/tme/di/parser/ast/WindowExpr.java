package com.tme.di.parser.ast;

import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;

@Data
public class WindowExpr extends INode  {

    private PartitionByClause partitionByClause;
    private OrderByClause orderByClause;

    public WindowExpr(PartitionByClause partitionByClause, OrderByClause orderByClause) {
        this.partitionByClause = partitionByClause;
        this.orderByClause = orderByClause;
    }
}
