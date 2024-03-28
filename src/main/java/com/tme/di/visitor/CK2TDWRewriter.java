package com.tme.di.visitor;

import com.tme.di.parser.ast.DatabaseIdentifier;
import com.tme.di.parser.ast.INode;
import com.tme.di.parser.ast.Identifier;
import com.tme.di.parser.ast.TableIdentifier;
import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CK2TDWRewriter extends BaseSqlBuilder {
    private Set<String> tdwDBs = new HashSet<>();
    private Map<String, String> tableMap = new HashMap<>();
    private String defaultDatabase;
    private boolean databaseLevelRewrite;
    private String tdwDefaultDatabase;

    public CK2TDWRewriter(Set<String>tdwDBs, Map<String, String> tableMap, String defaultDatabase, boolean databaseLevelRewrite){
        this.tdwDBs = tdwDBs;
        this.tableMap= tableMap;
        this.defaultDatabase = defaultDatabase;
        this.databaseLevelRewrite = databaseLevelRewrite;
        this.tdwDefaultDatabase = defaultDatabase;

    }

    public RewriteResult rewriteCKTable(INode astNode) throws FailedToRewriteCheckedException {
        RewriteResult rewriteResult = new RewriteResult();
        try{
            String sql = visit(astNode);
            rewriteResult.setSql(sql);
        }catch (FailedToRewriteException e){
            throw new FailedToRewriteCheckedException(e.getMessage());
        }
        return rewriteResult;
    }
    @Override
    public String visitTableIdentifier(TableIdentifier identifier) {
        TableIdentifier tableIdentifier = identifier;
        Identifier db = tableIdentifier.getDatabase();
        String dbName = defaultDatabase;
        String tableName = tableIdentifier.getName();
        if (null != db && !db.getQualifiedName().isEmpty()) {
            dbName = db.getQualifiedName();
        }
        String originalTableName =  dbName + "." + tableName;
        String rewrittenTableName = tableMap.get(originalTableName);
        if(rewrittenTableName == null){
            if(databaseLevelRewrite){
                if(tdwDBs.contains(dbName)){
                    return dbName + "." + tableName;
                }else{
                    throw new FailedToRewriteException(String.format("can't find tdw table to map to for:%s and can't find tdw database to map to for %s ",originalTableName, dbName));
                }
            }
            throw new FailedToRewriteException("rewrittenTableName is null for:" + originalTableName);
        }else{
            String tdwDB = rewrittenTableName.split("\\.")[0];
            tdwDefaultDatabase = tdwDB;
        }
        return rewrittenTableName;

    }

    public class FailedToRewriteException extends RuntimeException {
        public FailedToRewriteException(String message) {
            super(message);
        }
    }

    public class FailedToRewriteCheckedException extends Throwable {
        public FailedToRewriteCheckedException(String message) {
            super(message);
        }
    }

    @Data
    public static class RewriteResult {
        String sql;
        String defaultDatabase;
    }
}
