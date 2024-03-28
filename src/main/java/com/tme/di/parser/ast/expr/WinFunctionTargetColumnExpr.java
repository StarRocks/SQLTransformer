package com.tme.di.parser.ast.expr;

import com.tme.di.parser.ast.Identifier;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
public class WinFunctionTargetColumnExpr extends ColumnExpr {


    private final Identifier windowFunction;
    private final List<ColumnExpr> columnExprs;
    private final Identifier windowName;

    protected WinFunctionTargetColumnExpr(Identifier windowFunction, List<ColumnExpr> columnExprs, Identifier windowName) {
         super(ExprType.WINFUNCTION);
        this.windowFunction = windowFunction;
        this.columnExprs = columnExprs;
        this.windowName = windowName;
    }

    public Identifier getWindowFunction() {
        return windowFunction;
    }

    public List<ColumnExpr> getColumnExprs() {
        return columnExprs;
    }

    public Identifier getWindowName() {
        return windowName;
    }
}
