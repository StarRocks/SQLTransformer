package com.tme.di.parser.ast;

import com.tme.di.parser.ast.expr.ColumnExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class SelectStatement extends INode  {

    private ModifierType modifierType;

    private boolean distinct;

    private boolean withTotals;

    private WithClause withClause;

    private FromClause fromClause;

    private ArrayJoinClause arrayJoinClause;

    private PrewhereClause prewhereClause;

    private WhereClause whereClause;

    private GroupByClause groupByClause;

    private HavingClause havingClause;

    private OrderByClause orderByClause;

    private LimitByClause limitByClause;

    private LimitClause limitClause;

    private SettingsClause settingsClause;

    private WindowClause windowClause;

    private List<ColumnExpr> exprs;

    public enum ModifierType
    {
        NONE,
        CUBE,
        ROLLUP,
    }

    public SelectStatement(boolean distinct, ModifierType modifierType, boolean withTotals) {
        this.distinct = distinct;
        this.modifierType = modifierType;
        this.withTotals = withTotals;
    }

}
