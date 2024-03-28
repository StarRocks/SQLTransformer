package com.tme.di.parser.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class ColumnIdentifier extends Identifier {

    private TableIdentifier table;

    public ColumnIdentifier(TableIdentifier table, Identifier name) {
        super(name.getName());
        this.table = new TableIdentifier(table);
    }

    public TableIdentifier getTable() {
        return table;
    }

    public void setTable(TableIdentifier table) {
        this.table = table;
    }

    @Override
    public String getName() {
        String name = super.getName();
        if (name.startsWith("`") && name.endsWith("`")) {
            name = name.substring(1, name.length() - 1);
        }
        return name;
    }

    void makeCompound() {
        if (null != table) {
            name = table.getName() + "." + getName();
            if (null != table.getDatabase()) {
                table.makeCompound();
            }
        }
    }

    @Override
    public String getQualifiedName() {
        if (null != table && !table.getQualifiedName().isEmpty()) {
            return table.getQualifiedName() + "." + getName();
        } else {
            return getName();
        }
    }

}
