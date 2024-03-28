package com.tme.di.parser.ast;

import com.tme.di.parser.ast.expr.AssignmentExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class UpdateAlterTableClause extends AlterTableClause {

    private List<AssignmentExpr> list;

    private WhereClause where;

    public UpdateAlterTableClause(List<AssignmentExpr> list, WhereClause where) {
        this.clauseType = ClauseType.UPDATE;
        this.list = list;
        this.where = where;
    }
}
