package com.tme.di.parser.ast.expr;

import com.tme.di.parser.ast.Identifier;
import com.tme.di.parser.ast.OrderByClause;
import com.tme.di.parser.ast.PartitionByClause;
import com.tme.di.parser.ast.WindowExpr;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class WinFunctionColumnExpr extends ColumnExpr {

    private Identifier windowFunction;
//    private PartitionByClause partitionByClause;
//    private OrderByClause orderByClause;
    private WindowExpr windowExpr;

     protected WinFunctionColumnExpr(Identifier windowFunction, WindowExpr windowExpr) {
         super(ExprType.WINFUNCTION);
         this.windowFunction = windowFunction;
         this.windowExpr = windowExpr;
     }

    public Identifier getWindowFunction() {
        return windowFunction;
    }

    public WindowExpr getWindowExpr(){
         return windowExpr;
    }
}
