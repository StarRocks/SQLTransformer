package com.tme.di.parser;

import com.tme.di.parser.ast.*;
import com.tme.di.parser.ast.expr.AsteriskColumnExpr;
import lombok.Data;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.*;

@Data
@NotThreadSafe
public class ReferredColumnsDetector extends AstVisitor<Object> {

    private List<String> tables = new ArrayList<>();

    private List<String> columns = new ArrayList<>();

    private MetadataService metadataService;

    public ReferredColumnsDetector(MetadataService metadataService) {
        this.metadataService = metadataService;
    }

    public List<String> searchColumns(String sql) {
        try {
            tables.clear();
            columns.clear();
            AstParser astParser = new AstParser(true);
            INode ast = (INode) astParser.parse(sql);
            return searchColumns(ast);
        } catch (Exception e) {
            return Collections.EMPTY_LIST;
        }
    }

    public List<String> searchColumns(INode node) {
        tables.clear();
        columns.clear();
        ReferredTablesDetector referredTablesDetector = new ReferredTablesDetector();
        this.tables = referredTablesDetector.searchTables(node);
        if (null == tables || tables.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        visit(node);
        return columns;
    }

    @Override
    public Object visitAsteriskColumnExpr(AsteriskColumnExpr expr) {
        TableIdentifier tableIdentifier = expr.getTable();
        if (null != tableIdentifier) {
            String tableFullName = tableIdentifier.getQualifiedName();
            if (null != tableFullName && !tableFullName.isEmpty()) {
                List<String> allColumnsOfTable = metadataService.getColumns(tableFullName);
                for (String column : allColumnsOfTable) {
                    if (!columns.contains(column)) {
                        columns.add(tableFullName + "." + column);
                    }
                }
            }
        }
        return super.visitAsteriskColumnExpr(expr);
    }

    @Override
    public Object visitIdentifier(Identifier identifier) {
        if (identifier instanceof ColumnIdentifier) {
            ColumnIdentifier columnIdentifier = (ColumnIdentifier) identifier;
            String columnName = columnIdentifier.getName();
            for (String table : tables) {
                List<String> tableAllColumns = metadataService.getColumns(table);
                if (null != tableAllColumns && tableAllColumns.contains(columnName)) {
                    if (!columns.contains(table + "." + columnName)) {
                        columns.add(table + "." + columnName);
                    }
                    break;
                }
            }
        }
        return super.visitIdentifier(identifier);
    }

}
