package com.tme.di.parser.ast;

import com.tme.di.parser.AstVisitor;
import com.tme.di.parser.ast.expr.SettingExpr;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class WindowClause extends INode {

    // WINDOW identifier AS LPAREN windowExpr RPAREN;
    private Identifier windowName;
    private WindowExpr windowExpr;

    public WindowClause(Identifier windowName,WindowExpr windowExpr) {
        this.windowName = windowName;
        this.windowExpr = windowExpr;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitWindowClause(this);
    }

}
