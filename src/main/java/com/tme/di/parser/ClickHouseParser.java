// Generated from ClickHouseParser.g4 by ANTLR 4.9.2
package com.tme.di.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			ADD=1, AFTER=2, ALIAS=3, ALL=4, ALTER=5, AND=6, ANTI=7, ANY=8, ARRAY=9,
			AS=10, ASCENDING=11, ASOF=12, AST=13, ASYNC=14, ATTACH=15, BETWEEN=16,
			BOTH=17, BY=18, CASE=19, CAST=20, CHECK=21, CLEAR=22, CLUSTER=23, CODEC=24,
			COLLATE=25, COLUMN=26, COMMENT=27, CONSTRAINT=28, CREATE=29, CROSS=30,
			CUBE=31, CURRENT=32, DATABASE=33, DATABASES=34, DATE=35, DAY=36, DEDUPLICATE=37,
			DEFAULT=38, DELAY=39, DELETE=40, DESC=41, DESCENDING=42, DESCRIBE=43,
			DETACH=44, DICTIONARIES=45, DICTIONARY=46, DISK=47, DISTINCT=48, DISTRIBUTED=49,
			DROP=50, ELSE=51, END=52, ENGINE=53, EVENTS=54, EXISTS=55, EXPLAIN=56,
			EXPRESSION=57, EXTRACT=58, FETCHES=59, FINAL=60, FIRST=61, FLUSH=62, FOLLOWING=63,
			FOR=64, FORMAT=65, FREEZE=66, FROM=67, FULL=68, FUNCTION=69, GLOBAL=70,
			GRANULARITY=71, GROUP=72, HAVING=73, HIERARCHICAL=74, HOUR=75, ID=76,
			IF=77, ILIKE=78, IN=79, INDEX=80, INF=81, INJECTIVE=82, INNER=83, INSERT=84,
			INTERVAL=85, INTO=86, IS=87, IS_OBJECT_ID=88, JOIN=89, KEY=90, KILL=91,
			LAST=92, LAYOUT=93, LEADING=94, LEFT=95, LIFETIME=96, LIKE=97, LIMIT=98,
			LIVE=99, LOCAL=100, LOGS=101, MATERIALIZE=102, MATERIALIZED=103, MAX=104,
			MERGES=105, MIN=106, MINUTE=107, MODIFY=108, MONTH=109, MOVE=110, MUTATION=111,
			NAN_SQL=112, NO=113, NOT=114, NULL_SQL=115, NULLS=116, OFFSET=117, ON=118,
			OPTIMIZE=119, OR=120, ORDER=121, OUTER=122, OUTFILE=123, OVER=124, PARTITION=125,
			POPULATE=126, PRECEDING=127, PREWHERE=128, PRIMARY=129, PROJECTION=130,
			QUARTER=131, RANGE=132, RELOAD=133, REMOVE=134, RENAME=135, REPLACE=136,
			REPLICA=137, REPLICATED=138, RIGHT=139, ROLLUP=140, ROW=141, ROWS=142,
			SAMPLE=143, SECOND=144, SELECT=145, SEMI=146, SENDS=147, SET=148, SETTINGS=149,
			SHOW=150, SOURCE=151, START=152, STOP=153, SUBSTRING=154, SYNC=155, SYNTAX=156,
			SYSTEM=157, TABLE=158, TABLES=159, TEMPORARY=160, TEST=161, THEN=162,
			TIES=163, TIMEOUT=164, TIMESTAMP=165, TO=166, TOP=167, TOTALS=168, TRAILING=169,
			TRIM=170, TRUNCATE=171, TTL=172, TYPE=173, UNBOUNDED=174, UNION=175, UPDATE=176,
			USE=177, USING=178, UUID=179, VALUES=180, VIEW=181, VOLUME=182, WATCH=183,
			WEEK=184, WHEN=185, WHERE=186, WINDOW=187, WITH=188, YEAR=189, JSON_FALSE=190,
			JSON_TRUE=191, IDENTIFIER=192, FLOATING_LITERAL=193, OCTAL_LITERAL=194,
			DECIMAL_LITERAL=195, HEXADECIMAL_LITERAL=196, STRING_LITERAL=197, ARROW=198,
			ASTERISK=199, BACKQUOTE=200, BACKSLASH=201, COLON=202, COMMA=203, CONCAT=204,
			DASH=205, DOT=206, EQ_DOUBLE=207, EQ_SINGLE=208, GE=209, GT=210, LBRACE=211,
			LBRACKET=212, LE=213, LPAREN=214, LT=215, NOT_EQ=216, PERCENT=217, PLUS=218,
			QUERY=219, QUOTE_DOUBLE=220, QUOTE_SINGLE=221, RBRACE=222, RBRACKET=223,
			RPAREN=224, SEMICOLON=225, SLASH=226, UNDERSCORE=227, MULTI_LINE_COMMENT=228,
			SINGLE_LINE_COMMENT=229, WHITESPACE=230;
	public static final int
			RULE_queryStmt = 0, RULE_query = 1, RULE_ctes = 2, RULE_namedQuery = 3,
			RULE_columnAliases = 4, RULE_alterStmt = 5, RULE_alterTableClause = 6,
			RULE_assignmentExprList = 7, RULE_assignmentExpr = 8, RULE_tableColumnPropertyType = 9,
			RULE_partitionClause = 10, RULE_attachStmt = 11, RULE_checkStmt = 12,
			RULE_createStmt = 13, RULE_dictionarySchemaClause = 14, RULE_dictionaryAttrDfnt = 15,
			RULE_dictionaryEngineClause = 16, RULE_dictionaryPrimaryKeyClause = 17,
			RULE_dictionaryArgExpr = 18, RULE_sourceClause = 19, RULE_lifetimeClause = 20,
			RULE_layoutClause = 21, RULE_rangeClause = 22, RULE_dictionarySettingsClause = 23,
			RULE_clusterClause = 24, RULE_uuidClause = 25, RULE_destinationClause = 26,
			RULE_subqueryClause = 27, RULE_tableSchemaClause = 28, RULE_engineClause = 29,
			RULE_partitionByClause = 30, RULE_primaryKeyClause = 31, RULE_sampleByClause = 32,
			RULE_ttlClause = 33, RULE_engineExpr = 34, RULE_tableElementExpr = 35,
			RULE_tableColumnDfnt = 36, RULE_tableColumnPropertyExpr = 37, RULE_tableIndexDfnt = 38,
			RULE_tableProjectionDfnt = 39, RULE_codecExpr = 40, RULE_codecArgExpr = 41,
			RULE_ttlExpr = 42, RULE_describeStmt = 43, RULE_dropStmt = 44, RULE_existsStmt = 45,
			RULE_explainStmt = 46, RULE_insertStmt = 47, RULE_columnsClause = 48,
			RULE_dataClause = 49, RULE_killStmt = 50, RULE_optimizeStmt = 51, RULE_renameStmt = 52,
			RULE_projectionSelectStmt = 53, RULE_selectUnionStmt = 54, RULE_selectStmtWithParens = 55,
			RULE_selectStmt = 56, RULE_withClause = 57, RULE_topClause = 58, RULE_fromClause = 59,
			RULE_arrayJoinClause = 60, RULE_windowClause = 61, RULE_prewhereClause = 62,
			RULE_whereClause = 63, RULE_groupByClause = 64, RULE_havingClause = 65,
			RULE_orderByClause = 66, RULE_projectionOrderByClause = 67, RULE_limitByClause = 68,
			RULE_limitClause = 69, RULE_settingsClause = 70, RULE_joinExpr = 71, RULE_joinOp = 72,
			RULE_joinOpCross = 73, RULE_joinConstraintClause = 74, RULE_sampleClause = 75,
			RULE_limitExpr = 76, RULE_orderExprList = 77, RULE_orderExpr = 78, RULE_ratioExpr = 79,
			RULE_settingExprList = 80, RULE_settingExpr = 81, RULE_windowExpr = 82,
			RULE_winPartitionByClause = 83, RULE_winOrderByClause = 84, RULE_winFrameClause = 85,
			RULE_winFrameExtend = 86, RULE_winFrameBound = 87, RULE_setStmt = 88,
			RULE_showStmt = 89, RULE_systemStmt = 90, RULE_truncateStmt = 91, RULE_useStmt = 92,
			RULE_watchStmt = 93, RULE_columnTypeExpr = 94, RULE_columnExprList = 95,
			RULE_columnsExpr = 96, RULE_columnExpr = 97, RULE_columnArgList = 98,
			RULE_columnArgExpr = 99, RULE_columnLambdaExpr = 100, RULE_columnIdentifier = 101,
			RULE_nestedIdentifier = 102, RULE_tableExpr = 103, RULE_tableFunctionExpr = 104,
			RULE_tableIdentifier = 105, RULE_tableArgList = 106, RULE_tableArgExpr = 107,
			RULE_databaseIdentifier = 108, RULE_floatingLiteral = 109, RULE_numberLiteral = 110,
			RULE_literal = 111, RULE_interval = 112, RULE_keyword = 113, RULE_keywordForAlias = 114,
			RULE_alias = 115, RULE_identifier = 116, RULE_identifierOrNull = 117,
			RULE_enumValue = 118;
	private static String[] makeRuleNames() {
		return new String[] {
				"queryStmt", "query", "ctes", "namedQuery", "columnAliases", "alterStmt",
				"alterTableClause", "assignmentExprList", "assignmentExpr", "tableColumnPropertyType",
				"partitionClause", "attachStmt", "checkStmt", "createStmt", "dictionarySchemaClause",
				"dictionaryAttrDfnt", "dictionaryEngineClause", "dictionaryPrimaryKeyClause",
				"dictionaryArgExpr", "sourceClause", "lifetimeClause", "layoutClause",
				"rangeClause", "dictionarySettingsClause", "clusterClause", "uuidClause",
				"destinationClause", "subqueryClause", "tableSchemaClause", "engineClause",
				"partitionByClause", "primaryKeyClause", "sampleByClause", "ttlClause",
				"engineExpr", "tableElementExpr", "tableColumnDfnt", "tableColumnPropertyExpr",
				"tableIndexDfnt", "tableProjectionDfnt", "codecExpr", "codecArgExpr",
				"ttlExpr", "describeStmt", "dropStmt", "existsStmt", "explainStmt", "insertStmt",
				"columnsClause", "dataClause", "killStmt", "optimizeStmt", "renameStmt",
				"projectionSelectStmt", "selectUnionStmt", "selectStmtWithParens", "selectStmt",
				"withClause", "topClause", "fromClause", "arrayJoinClause", "windowClause",
				"prewhereClause", "whereClause", "groupByClause", "havingClause", "orderByClause",
				"projectionOrderByClause", "limitByClause", "limitClause", "settingsClause",
				"joinExpr", "joinOp", "joinOpCross", "joinConstraintClause", "sampleClause",
				"limitExpr", "orderExprList", "orderExpr", "ratioExpr", "settingExprList",
				"settingExpr", "windowExpr", "winPartitionByClause", "winOrderByClause",
				"winFrameClause", "winFrameExtend", "winFrameBound", "setStmt", "showStmt",
				"systemStmt", "truncateStmt", "useStmt", "watchStmt", "columnTypeExpr",
				"columnExprList", "columnsExpr", "columnExpr", "columnArgList", "columnArgExpr",
				"columnLambdaExpr", "columnIdentifier", "nestedIdentifier", "tableExpr",
				"tableFunctionExpr", "tableIdentifier", "tableArgList", "tableArgExpr",
				"databaseIdentifier", "floatingLiteral", "numberLiteral", "literal",
				"interval", "keyword", "keywordForAlias", "alias", "identifier", "identifierOrNull",
				"enumValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, "'false'",
				"'true'", null, null, null, null, null, null, "'->'", "'*'", "'`'", "'\\'",
				"':'", "','", "'||'", "'-'", "'.'", "'=='", "'='", "'>='", "'>'", "'{'",
				"'['", "'<='", "'('", "'<'", null, "'%'", "'+'", "'?'", "'\"'", "'''",
				"'}'", "']'", "')'", "';'", "'/'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY",
				"ARRAY", "AS", "ASCENDING", "ASOF", "AST", "ASYNC", "ATTACH", "BETWEEN",
				"BOTH", "BY", "CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE",
				"COLUMN", "COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "CURRENT",
				"DATABASE", "DATABASES", "DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY",
				"DELETE", "DESC", "DESCENDING", "DESCRIBE", "DETACH", "DICTIONARIES",
				"DICTIONARY", "DISK", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END",
				"ENGINE", "EVENTS", "EXISTS", "EXPLAIN", "EXPRESSION", "EXTRACT", "FETCHES",
				"FINAL", "FIRST", "FLUSH", "FOLLOWING", "FOR", "FORMAT", "FREEZE", "FROM",
				"FULL", "FUNCTION", "GLOBAL", "GRANULARITY", "GROUP", "HAVING", "HIERARCHICAL",
				"HOUR", "ID", "IF", "ILIKE", "IN", "INDEX", "INF", "INJECTIVE", "INNER",
				"INSERT", "INTERVAL", "INTO", "IS", "IS_OBJECT_ID", "JOIN", "KEY", "KILL",
				"LAST", "LAYOUT", "LEADING", "LEFT", "LIFETIME", "LIKE", "LIMIT", "LIVE",
				"LOCAL", "LOGS", "MATERIALIZE", "MATERIALIZED", "MAX", "MERGES", "MIN",
				"MINUTE", "MODIFY", "MONTH", "MOVE", "MUTATION", "NAN_SQL", "NO", "NOT",
				"NULL_SQL", "NULLS", "OFFSET", "ON", "OPTIMIZE", "OR", "ORDER", "OUTER",
				"OUTFILE", "OVER", "PARTITION", "POPULATE", "PRECEDING", "PREWHERE",
				"PRIMARY", "PROJECTION", "QUARTER", "RANGE", "RELOAD", "REMOVE", "RENAME",
				"REPLACE", "REPLICA", "REPLICATED", "RIGHT", "ROLLUP", "ROW", "ROWS",
				"SAMPLE", "SECOND", "SELECT", "SEMI", "SENDS", "SET", "SETTINGS", "SHOW",
				"SOURCE", "START", "STOP", "SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", "TABLE",
				"TABLES", "TEMPORARY", "TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP",
				"TO", "TOP", "TOTALS", "TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE",
				"UNBOUNDED", "UNION", "UPDATE", "USE", "USING", "UUID", "VALUES", "VIEW",
				"VOLUME", "WATCH", "WEEK", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR",
				"JSON_FALSE", "JSON_TRUE", "IDENTIFIER", "FLOATING_LITERAL", "OCTAL_LITERAL",
				"DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "STRING_LITERAL", "ARROW",
				"ASTERISK", "BACKQUOTE", "BACKSLASH", "COLON", "COMMA", "CONCAT", "DASH",
				"DOT", "EQ_DOUBLE", "EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", "LE",
				"LPAREN", "LT", "NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE",
				"QUOTE_SINGLE", "RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH",
				"UNDERSCORE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ClickHouseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClickHouseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryStmtContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public QueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQueryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStmtContext queryStmt() throws RecognitionException {
		QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStmt);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ALTER:
				case ATTACH:
				case CHECK:
				case CREATE:
				case DESC:
				case DESCRIBE:
				case DETACH:
				case DROP:
				case EXISTS:
				case EXPLAIN:
				case KILL:
				case OPTIMIZE:
				case RENAME:
				case REPLACE:
				case SELECT:
				case SET:
				case SHOW:
				case SYSTEM:
				case TRUNCATE:
				case USE:
				case WATCH:
				case WITH:
				case LPAREN:
					enterOuterAlt(_localctx, 1);
				{
					setState(238);
					query();
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTO) {
						{
							setState(239);
							match(INTO);
							setState(240);
							match(OUTFILE);
							setState(241);
							match(STRING_LITERAL);
						}
					}

					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FORMAT) {
						{
							setState(244);
							match(FORMAT);
							setState(245);
							identifierOrNull();
						}
					}

					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
							setState(248);
							match(SEMICOLON);
						}
					}

				}
				break;
				case INSERT:
					enterOuterAlt(_localctx, 2);
				{
					setState(251);
					insertStmt();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public AlterStmtContext alterStmt() {
			return getRuleContext(AlterStmtContext.class,0);
		}
		public AttachStmtContext attachStmt() {
			return getRuleContext(AttachStmtContext.class,0);
		}
		public CheckStmtContext checkStmt() {
			return getRuleContext(CheckStmtContext.class,0);
		}
		public CreateStmtContext createStmt() {
			return getRuleContext(CreateStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropStmtContext dropStmt() {
			return getRuleContext(DropStmtContext.class,0);
		}
		public ExistsStmtContext existsStmt() {
			return getRuleContext(ExistsStmtContext.class,0);
		}
		public ExplainStmtContext explainStmt() {
			return getRuleContext(ExplainStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public OptimizeStmtContext optimizeStmt() {
			return getRuleContext(OptimizeStmtContext.class,0);
		}
		public RenameStmtContext renameStmt() {
			return getRuleContext(RenameStmtContext.class,0);
		}
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public SystemStmtContext systemStmt() {
			return getRuleContext(SystemStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public WatchStmtContext watchStmt() {
			return getRuleContext(WatchStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(254);
					alterStmt();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(255);
					attachStmt();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(256);
					checkStmt();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(257);
					createStmt();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(258);
					describeStmt();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(259);
					dropStmt();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(260);
					existsStmt();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(261);
					explainStmt();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(262);
					killStmt();
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(263);
					optimizeStmt();
				}
				break;
				case 11:
					enterOuterAlt(_localctx, 11);
				{
					setState(264);
					renameStmt();
				}
				break;
				case 12:
					enterOuterAlt(_localctx, 12);
				{
					setState(265);
					selectUnionStmt();
				}
				break;
				case 13:
					enterOuterAlt(_localctx, 13);
				{
					setState(266);
					setStmt();
				}
				break;
				case 14:
					enterOuterAlt(_localctx, 14);
				{
					setState(267);
					showStmt();
				}
				break;
				case 15:
					enterOuterAlt(_localctx, 15);
				{
					setState(268);
					systemStmt();
				}
				break;
				case 16:
					enterOuterAlt(_localctx, 16);
				{
					setState(269);
					truncateStmt();
				}
				break;
				case 17:
					enterOuterAlt(_localctx, 17);
				{
					setState(270);
					useStmt();
				}
				break;
				case 18:
					enterOuterAlt(_localctx, 18);
				{
					setState(271);
					watchStmt();
				}
				break;
				case 19:
					enterOuterAlt(_localctx, 19);
				{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
						{
							setState(272);
							ctes();
						}
						break;
					}
					setState(275);
					selectStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(278);
				match(WITH);
				setState(279);
				namedQuery();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(280);
							match(COMMA);
							setState(281);
							namedQuery();
						}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(287);
				((NamedQueryContext)_localctx).name = identifier();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
						setState(288);
						columnAliases();
					}
				}

				setState(291);
				match(AS);
				setState(292);
				match(LPAREN);
				setState(293);
				query();
				setState(294);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(296);
				match(LPAREN);
				setState(297);
				identifier();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(298);
							match(COMMA);
							setState(299);
							identifier();
						}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStmtContext extends ParserRuleContext {
		public AlterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStmt; }

		public AlterStmtContext() { }
		public void copyFrom(AlterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableStmtContext extends AlterStmtContext {
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterTableClauseContext> alterTableClause() {
			return getRuleContexts(AlterTableClauseContext.class);
		}
		public AlterTableClauseContext alterTableClause(int i) {
			return getRuleContext(AlterTableClauseContext.class,i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AlterTableStmtContext(AlterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStmtContext alterStmt() throws RecognitionException {
		AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterStmt);
		int _la;
		try {
			_localctx = new AlterTableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(307);
				match(ALTER);
				setState(308);
				match(TABLE);
				setState(309);
				tableIdentifier();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
						setState(310);
						clusterClause();
					}
				}

				setState(313);
				alterTableClause();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(314);
							match(COMMA);
							setState(315);
							alterTableClause();
						}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableClauseContext extends ParserRuleContext {
		public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableClause; }

		public AlterTableClauseContext() { }
		public void copyFrom(AlterTableClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseReplace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public AssignmentExprListContext assignmentExprList() {
			return getRuleContext(AssignmentExprListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearProjectionContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClearProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TableColumnPropertyTypeContext tableColumnPropertyType() {
			return getRuleContext(TableColumnPropertyTypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDetachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDetach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropPartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMaterializeIndexContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMaterializeIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMaterializeProjectionContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMaterializeProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMovePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseRenameContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseFreezePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearColumnContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClearColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearIndexContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClearIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRemoveTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyCodec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseAttachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAttach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropProjectionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TtlClauseContext ttlClause() {
			return getRuleContext(TtlClauseContext.class,0);
		}
		public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddProjectionContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableClauseContext alterTableClause() throws RecognitionException {
		AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alterTableClause);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					_localctx = new AlterTableClauseAddColumnContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(321);
					match(ADD);
					setState(322);
					match(COLUMN);
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
						{
							setState(323);
							match(IF);
							setState(324);
							match(NOT);
							setState(325);
							match(EXISTS);
						}
						break;
					}
					setState(328);
					tableColumnDfnt();
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AFTER) {
						{
							setState(329);
							match(AFTER);
							setState(330);
							nestedIdentifier();
						}
					}

				}
				break;
				case 2:
					_localctx = new AlterTableClauseAddIndexContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(333);
					match(ADD);
					setState(334);
					match(INDEX);
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
						{
							setState(335);
							match(IF);
							setState(336);
							match(NOT);
							setState(337);
							match(EXISTS);
						}
						break;
					}
					setState(340);
					tableIndexDfnt();
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AFTER) {
						{
							setState(341);
							match(AFTER);
							setState(342);
							nestedIdentifier();
						}
					}

				}
				break;
				case 3:
					_localctx = new AlterTableClauseAddProjectionContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(345);
					match(ADD);
					setState(346);
					match(PROJECTION);
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
						{
							setState(347);
							match(IF);
							setState(348);
							match(NOT);
							setState(349);
							match(EXISTS);
						}
						break;
					}
					setState(352);
					tableProjectionDfnt();
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AFTER) {
						{
							setState(353);
							match(AFTER);
							setState(354);
							nestedIdentifier();
						}
					}

				}
				break;
				case 4:
					_localctx = new AlterTableClauseAttachContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(357);
					match(ATTACH);
					setState(358);
					partitionClause();
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
							setState(359);
							match(FROM);
							setState(360);
							tableIdentifier();
						}
					}

				}
				break;
				case 5:
					_localctx = new AlterTableClauseClearColumnContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(363);
					match(CLEAR);
					setState(364);
					match(COLUMN);
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
						{
							setState(365);
							match(IF);
							setState(366);
							match(EXISTS);
						}
						break;
					}
					setState(369);
					nestedIdentifier();
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN) {
						{
							setState(370);
							match(IN);
							setState(371);
							partitionClause();
						}
					}

				}
				break;
				case 6:
					_localctx = new AlterTableClauseClearIndexContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(374);
					match(CLEAR);
					setState(375);
					match(INDEX);
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
						{
							setState(376);
							match(IF);
							setState(377);
							match(EXISTS);
						}
						break;
					}
					setState(380);
					nestedIdentifier();
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN) {
						{
							setState(381);
							match(IN);
							setState(382);
							partitionClause();
						}
					}

				}
				break;
				case 7:
					_localctx = new AlterTableClauseClearProjectionContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(385);
					match(CLEAR);
					setState(386);
					match(PROJECTION);
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
						{
							setState(387);
							match(IF);
							setState(388);
							match(EXISTS);
						}
						break;
					}
					setState(391);
					nestedIdentifier();
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN) {
						{
							setState(392);
							match(IN);
							setState(393);
							partitionClause();
						}
					}

				}
				break;
				case 8:
					_localctx = new AlterTableClauseCommentContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(396);
					match(COMMENT);
					setState(397);
					match(COLUMN);
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
						{
							setState(398);
							match(IF);
							setState(399);
							match(EXISTS);
						}
						break;
					}
					setState(402);
					nestedIdentifier();
					setState(403);
					match(STRING_LITERAL);
				}
				break;
				case 9:
					_localctx = new AlterTableClauseDeleteContext(_localctx);
					enterOuterAlt(_localctx, 9);
				{
					setState(405);
					match(DELETE);
					setState(406);
					match(WHERE);
					setState(407);
					columnExpr(0);
				}
				break;
				case 10:
					_localctx = new AlterTableClauseDetachContext(_localctx);
					enterOuterAlt(_localctx, 10);
				{
					setState(408);
					match(DETACH);
					setState(409);
					partitionClause();
				}
				break;
				case 11:
					_localctx = new AlterTableClauseDropColumnContext(_localctx);
					enterOuterAlt(_localctx, 11);
				{
					setState(410);
					match(DROP);
					setState(411);
					match(COLUMN);
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
						{
							setState(412);
							match(IF);
							setState(413);
							match(EXISTS);
						}
						break;
					}
					setState(416);
					nestedIdentifier();
				}
				break;
				case 12:
					_localctx = new AlterTableClauseDropIndexContext(_localctx);
					enterOuterAlt(_localctx, 12);
				{
					setState(417);
					match(DROP);
					setState(418);
					match(INDEX);
					setState(421);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
						{
							setState(419);
							match(IF);
							setState(420);
							match(EXISTS);
						}
						break;
					}
					setState(423);
					nestedIdentifier();
				}
				break;
				case 13:
					_localctx = new AlterTableClauseDropProjectionContext(_localctx);
					enterOuterAlt(_localctx, 13);
				{
					setState(424);
					match(DROP);
					setState(425);
					match(PROJECTION);
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
						{
							setState(426);
							match(IF);
							setState(427);
							match(EXISTS);
						}
						break;
					}
					setState(430);
					nestedIdentifier();
				}
				break;
				case 14:
					_localctx = new AlterTableClauseDropPartitionContext(_localctx);
					enterOuterAlt(_localctx, 14);
				{
					setState(431);
					match(DROP);
					setState(432);
					partitionClause();
				}
				break;
				case 15:
					_localctx = new AlterTableClauseFreezePartitionContext(_localctx);
					enterOuterAlt(_localctx, 15);
				{
					setState(433);
					match(FREEZE);
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION) {
						{
							setState(434);
							partitionClause();
						}
					}

				}
				break;
				case 16:
					_localctx = new AlterTableClauseMaterializeIndexContext(_localctx);
					enterOuterAlt(_localctx, 16);
				{
					setState(437);
					match(MATERIALIZE);
					setState(438);
					match(INDEX);
					setState(441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
						{
							setState(439);
							match(IF);
							setState(440);
							match(EXISTS);
						}
						break;
					}
					setState(443);
					nestedIdentifier();
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN) {
						{
							setState(444);
							match(IN);
							setState(445);
							partitionClause();
						}
					}

				}
				break;
				case 17:
					_localctx = new AlterTableClauseMaterializeProjectionContext(_localctx);
					enterOuterAlt(_localctx, 17);
				{
					setState(448);
					match(MATERIALIZE);
					setState(449);
					match(PROJECTION);
					setState(452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
						{
							setState(450);
							match(IF);
							setState(451);
							match(EXISTS);
						}
						break;
					}
					setState(454);
					nestedIdentifier();
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN) {
						{
							setState(455);
							match(IN);
							setState(456);
							partitionClause();
						}
					}

				}
				break;
				case 18:
					_localctx = new AlterTableClauseModifyCodecContext(_localctx);
					enterOuterAlt(_localctx, 18);
				{
					setState(459);
					match(MODIFY);
					setState(460);
					match(COLUMN);
					setState(463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
						{
							setState(461);
							match(IF);
							setState(462);
							match(EXISTS);
						}
						break;
					}
					setState(465);
					nestedIdentifier();
					setState(466);
					codecExpr();
				}
				break;
				case 19:
					_localctx = new AlterTableClauseModifyCommentContext(_localctx);
					enterOuterAlt(_localctx, 19);
				{
					setState(468);
					match(MODIFY);
					setState(469);
					match(COLUMN);
					setState(472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
						{
							setState(470);
							match(IF);
							setState(471);
							match(EXISTS);
						}
						break;
					}
					setState(474);
					nestedIdentifier();
					setState(475);
					match(COMMENT);
					setState(476);
					match(STRING_LITERAL);
				}
				break;
				case 20:
					_localctx = new AlterTableClauseModifyRemoveContext(_localctx);
					enterOuterAlt(_localctx, 20);
				{
					setState(478);
					match(MODIFY);
					setState(479);
					match(COLUMN);
					setState(482);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
						{
							setState(480);
							match(IF);
							setState(481);
							match(EXISTS);
						}
						break;
					}
					setState(484);
					nestedIdentifier();
					setState(485);
					match(REMOVE);
					setState(486);
					tableColumnPropertyType();
				}
				break;
				case 21:
					_localctx = new AlterTableClauseModifyContext(_localctx);
					enterOuterAlt(_localctx, 21);
				{
					setState(488);
					match(MODIFY);
					setState(489);
					match(COLUMN);
					setState(492);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
						{
							setState(490);
							match(IF);
							setState(491);
							match(EXISTS);
						}
						break;
					}
					setState(494);
					tableColumnDfnt();
				}
				break;
				case 22:
					_localctx = new AlterTableClauseModifyOrderByContext(_localctx);
					enterOuterAlt(_localctx, 22);
				{
					setState(495);
					match(MODIFY);
					setState(496);
					match(ORDER);
					setState(497);
					match(BY);
					setState(498);
					columnExpr(0);
				}
				break;
				case 23:
					_localctx = new AlterTableClauseModifyTTLContext(_localctx);
					enterOuterAlt(_localctx, 23);
				{
					setState(499);
					match(MODIFY);
					setState(500);
					ttlClause();
				}
				break;
				case 24:
					_localctx = new AlterTableClauseMovePartitionContext(_localctx);
					enterOuterAlt(_localctx, 24);
				{
					setState(501);
					match(MOVE);
					setState(502);
					partitionClause();
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
						{
							setState(503);
							match(TO);
							setState(504);
							match(DISK);
							setState(505);
							match(STRING_LITERAL);
						}
						break;
						case 2:
						{
							setState(506);
							match(TO);
							setState(507);
							match(VOLUME);
							setState(508);
							match(STRING_LITERAL);
						}
						break;
						case 3:
						{
							setState(509);
							match(TO);
							setState(510);
							match(TABLE);
							setState(511);
							tableIdentifier();
						}
						break;
					}
				}
				break;
				case 25:
					_localctx = new AlterTableClauseRemoveTTLContext(_localctx);
					enterOuterAlt(_localctx, 25);
				{
					setState(514);
					match(REMOVE);
					setState(515);
					match(TTL);
				}
				break;
				case 26:
					_localctx = new AlterTableClauseRenameContext(_localctx);
					enterOuterAlt(_localctx, 26);
				{
					setState(516);
					match(RENAME);
					setState(517);
					match(COLUMN);
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
						{
							setState(518);
							match(IF);
							setState(519);
							match(EXISTS);
						}
						break;
					}
					setState(522);
					nestedIdentifier();
					setState(523);
					match(TO);
					setState(524);
					nestedIdentifier();
				}
				break;
				case 27:
					_localctx = new AlterTableClauseReplaceContext(_localctx);
					enterOuterAlt(_localctx, 27);
				{
					setState(526);
					match(REPLACE);
					setState(527);
					partitionClause();
					setState(528);
					match(FROM);
					setState(529);
					tableIdentifier();
				}
				break;
				case 28:
					_localctx = new AlterTableClauseUpdateContext(_localctx);
					enterOuterAlt(_localctx, 28);
				{
					setState(531);
					match(UPDATE);
					setState(532);
					assignmentExprList();
					setState(533);
					whereClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprListContext extends ParserRuleContext {
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
		AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(537);
				assignmentExpr();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(538);
							match(COMMA);
							setState(539);
							assignmentExpr();
						}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(545);
				nestedIdentifier();
				setState(546);
				match(EQ_SINGLE);
				setState(547);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnPropertyTypeContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
		TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableColumnPropertyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(549);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la==MATERIALIZED || _la==TTL) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_partitionClause);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(551);
					match(PARTITION);
					setState(552);
					columnExpr(0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(553);
					match(PARTITION);
					setState(554);
					match(ID);
					setState(555);
					match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttachStmtContext extends ParserRuleContext {
		public AttachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachStmt; }

		public AttachStmtContext() { }
		public void copyFrom(AttachStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttachDictionaryStmtContext extends AttachStmtContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public AttachDictionaryStmtContext(AttachStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAttachDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachStmtContext attachStmt() throws RecognitionException {
		AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attachStmt);
		int _la;
		try {
			_localctx = new AttachDictionaryStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(558);
				match(ATTACH);
				setState(559);
				match(DICTIONARY);
				setState(560);
				tableIdentifier();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
						setState(561);
						clusterClause();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckStmtContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public CheckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCheckStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStmtContext checkStmt() throws RecognitionException {
		CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(564);
				match(CHECK);
				setState(565);
				match(TABLE);
				setState(566);
				tableIdentifier();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
						setState(567);
						partitionClause();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStmtContext extends ParserRuleContext {
		public CreateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStmt; }

		public CreateStmtContext() { }
		public void copyFrom(CreateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateViewStmtContext extends CreateStmtContext {
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public CreateViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDictionaryStmtContext extends CreateStmtContext {
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DictionarySchemaClauseContext dictionarySchemaClause() {
			return getRuleContext(DictionarySchemaClauseContext.class,0);
		}
		public DictionaryEngineClauseContext dictionaryEngineClause() {
			return getRuleContext(DictionaryEngineClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public CreateDictionaryStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseStmtContext extends CreateStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public CreateDatabaseStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateLiveViewStmtContext extends CreateStmtContext {
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public CreateLiveViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateLiveViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public CreateMaterializedViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateMaterializedViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableStmtContext extends CreateStmtContext {
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public CreateTableStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStmtContext createStmt() throws RecognitionException {
		CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createStmt);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					_localctx = new CreateDatabaseStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(570);
					_la = _input.LA(1);
					if ( !(_la==ATTACH || _la==CREATE) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(571);
					match(DATABASE);
					setState(575);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
						{
							setState(572);
							match(IF);
							setState(573);
							match(NOT);
							setState(574);
							match(EXISTS);
						}
						break;
					}
					setState(577);
					databaseIdentifier();
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(578);
							clusterClause();
						}
					}

					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ENGINE) {
						{
							setState(581);
							engineExpr();
						}
					}

				}
				break;
				case 2:
					_localctx = new CreateDictionaryStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(591);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case ATTACH:
						{
							setState(584);
							match(ATTACH);
						}
						break;
						case CREATE:
						{
							setState(585);
							match(CREATE);
							setState(588);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OR) {
								{
									setState(586);
									match(OR);
									setState(587);
									match(REPLACE);
								}
							}

						}
						break;
						case REPLACE:
						{
							setState(590);
							match(REPLACE);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(593);
					match(DICTIONARY);
					setState(597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
						{
							setState(594);
							match(IF);
							setState(595);
							match(NOT);
							setState(596);
							match(EXISTS);
						}
						break;
					}
					setState(599);
					tableIdentifier();
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UUID) {
						{
							setState(600);
							uuidClause();
						}
					}

					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(603);
							clusterClause();
						}
					}

					setState(606);
					dictionarySchemaClause();
					setState(607);
					dictionaryEngineClause();
				}
				break;
				case 3:
					_localctx = new CreateLiveViewStmtContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(609);
					_la = _input.LA(1);
					if ( !(_la==ATTACH || _la==CREATE) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(610);
					match(LIVE);
					setState(611);
					match(VIEW);
					setState(615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
						{
							setState(612);
							match(IF);
							setState(613);
							match(NOT);
							setState(614);
							match(EXISTS);
						}
						break;
					}
					setState(617);
					tableIdentifier();
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UUID) {
						{
							setState(618);
							uuidClause();
						}
					}

					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(621);
							clusterClause();
						}
					}

					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
							setState(624);
							match(WITH);
							setState(625);
							match(TIMEOUT);
							setState(627);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DECIMAL_LITERAL) {
								{
									setState(626);
									match(DECIMAL_LITERAL);
								}
							}

						}
					}

					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TO) {
						{
							setState(631);
							destinationClause();
						}
					}

					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
						{
							setState(634);
							tableSchemaClause();
						}
						break;
					}
					setState(637);
					subqueryClause();
				}
				break;
				case 4:
					_localctx = new CreateMaterializedViewStmtContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(639);
					_la = _input.LA(1);
					if ( !(_la==ATTACH || _la==CREATE) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(640);
					match(MATERIALIZED);
					setState(641);
					match(VIEW);
					setState(645);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
						{
							setState(642);
							match(IF);
							setState(643);
							match(NOT);
							setState(644);
							match(EXISTS);
						}
						break;
					}
					setState(647);
					tableIdentifier();
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UUID) {
						{
							setState(648);
							uuidClause();
						}
					}

					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(651);
							clusterClause();
						}
					}

					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS || _la==LPAREN) {
						{
							setState(654);
							tableSchemaClause();
						}
					}

					setState(662);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case TO:
						{
							setState(657);
							destinationClause();
						}
						break;
						case ENGINE:
						{
							setState(658);
							engineClause();
							setState(660);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==POPULATE) {
								{
									setState(659);
									match(POPULATE);
								}
							}

						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(664);
					subqueryClause();
				}
				break;
				case 5:
					_localctx = new CreateTableStmtContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(673);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case ATTACH:
						{
							setState(666);
							match(ATTACH);
						}
						break;
						case CREATE:
						{
							setState(667);
							match(CREATE);
							setState(670);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OR) {
								{
									setState(668);
									match(OR);
									setState(669);
									match(REPLACE);
								}
							}

						}
						break;
						case REPLACE:
						{
							setState(672);
							match(REPLACE);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
							setState(675);
							match(TEMPORARY);
						}
					}

					setState(678);
					match(TABLE);
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
						{
							setState(679);
							match(IF);
							setState(680);
							match(NOT);
							setState(681);
							match(EXISTS);
						}
						break;
					}
					setState(684);
					tableIdentifier();
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UUID) {
						{
							setState(685);
							uuidClause();
						}
					}

					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(688);
							clusterClause();
						}
					}

					setState(692);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
						{
							setState(691);
							tableSchemaClause();
						}
						break;
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ENGINE) {
						{
							setState(694);
							engineClause();
						}
					}

					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
							setState(697);
							subqueryClause();
						}
					}

				}
				break;
				case 6:
					_localctx = new CreateViewStmtContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(700);
					_la = _input.LA(1);
					if ( !(_la==ATTACH || _la==CREATE) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OR) {
						{
							setState(701);
							match(OR);
							setState(702);
							match(REPLACE);
						}
					}

					setState(705);
					match(VIEW);
					setState(709);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
						{
							setState(706);
							match(IF);
							setState(707);
							match(NOT);
							setState(708);
							match(EXISTS);
						}
						break;
					}
					setState(711);
					tableIdentifier();
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UUID) {
						{
							setState(712);
							uuidClause();
						}
					}

					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(715);
							clusterClause();
						}
					}

					setState(719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
						{
							setState(718);
							tableSchemaClause();
						}
						break;
					}
					setState(721);
					subqueryClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionarySchemaClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
			return getRuleContexts(DictionaryAttrDfntContext.class);
		}
		public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
			return getRuleContext(DictionaryAttrDfntContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySchemaClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySchemaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
		DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionarySchemaClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(725);
				match(LPAREN);
				setState(726);
				dictionaryAttrDfnt();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(727);
							match(COMMA);
							setState(728);
							dictionaryAttrDfnt();
						}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(734);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryAttrDfntContext extends ParserRuleContext {
		public Set<String> attrs = new HashSet<>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(ClickHouseParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(ClickHouseParser.DEFAULT, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(ClickHouseParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(ClickHouseParser.EXPRESSION, i);
		}
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> HIERARCHICAL() { return getTokens(ClickHouseParser.HIERARCHICAL); }
		public TerminalNode HIERARCHICAL(int i) {
			return getToken(ClickHouseParser.HIERARCHICAL, i);
		}
		public List<TerminalNode> INJECTIVE() { return getTokens(ClickHouseParser.INJECTIVE); }
		public TerminalNode INJECTIVE(int i) {
			return getToken(ClickHouseParser.INJECTIVE, i);
		}
		public List<TerminalNode> IS_OBJECT_ID() { return getTokens(ClickHouseParser.IS_OBJECT_ID); }
		public TerminalNode IS_OBJECT_ID(int i) {
			return getToken(ClickHouseParser.IS_OBJECT_ID, i);
		}
		public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttrDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryAttrDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
		DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictionaryAttrDfnt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(736);
				identifier();
				setState(737);
				columnTypeExpr();
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							setState(757);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
								case 1:
								{
									setState(738);
									if (!(!_localctx.attrs.contains("default"))) throw new FailedPredicateException(this, "!$attrs.count(\"default\")");
									setState(739);
									match(DEFAULT);
									setState(740);
									literal();
									_localctx.attrs.add("default");
								}
								break;
								case 2:
								{
									setState(743);
									if (!(!_localctx.attrs.contains("expression"))) throw new FailedPredicateException(this, "!$attrs.count(\"expression\")");
									setState(744);
									match(EXPRESSION);
									setState(745);
									columnExpr(0);
									_localctx.attrs.add("expression");
								}
								break;
								case 3:
								{
									setState(748);
									if (!(!_localctx.attrs.contains("hierarchical"))) throw new FailedPredicateException(this, "!$attrs.count(\"hierarchical\")");
									setState(749);
									match(HIERARCHICAL);
									_localctx.attrs.add("hierarchical");
								}
								break;
								case 4:
								{
									setState(751);
									if (!(!_localctx.attrs.contains("injective"))) throw new FailedPredicateException(this, "!$attrs.count(\"injective\")");
									setState(752);
									match(INJECTIVE);
									_localctx.attrs.add("injective");
								}
								break;
								case 5:
								{
									setState(754);
									if (!(!_localctx.attrs.contains("is_object_id"))) throw new FailedPredicateException(this, "!$attrs.count(\"is_object_id\")");
									setState(755);
									match(IS_OBJECT_ID);
									_localctx.attrs.add("is_object_id");
								}
								break;
							}
						}
					}
					setState(761);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryEngineClauseContext extends ParserRuleContext {
		public Set<String> clauses = new HashSet<>();
		public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
			return getRuleContext(DictionaryPrimaryKeyClauseContext.class,0);
		}
		public List<SourceClauseContext> sourceClause() {
			return getRuleContexts(SourceClauseContext.class);
		}
		public SourceClauseContext sourceClause(int i) {
			return getRuleContext(SourceClauseContext.class,i);
		}
		public List<LifetimeClauseContext> lifetimeClause() {
			return getRuleContexts(LifetimeClauseContext.class);
		}
		public LifetimeClauseContext lifetimeClause(int i) {
			return getRuleContext(LifetimeClauseContext.class,i);
		}
		public List<LayoutClauseContext> layoutClause() {
			return getRuleContexts(LayoutClauseContext.class);
		}
		public LayoutClauseContext layoutClause(int i) {
			return getRuleContext(LayoutClauseContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
			return getRuleContexts(DictionarySettingsClauseContext.class);
		}
		public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
			return getRuleContext(DictionarySettingsClauseContext.class,i);
		}
		public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryEngineClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
		DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dictionaryEngineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
					{
						setState(762);
						dictionaryPrimaryKeyClause();
					}
					break;
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							setState(785);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
								case 1:
								{
									setState(765);
									if (!(!_localctx.clauses.contains("source"))) throw new FailedPredicateException(this, "!$clauses.count(\"source\")");
									setState(766);
									sourceClause();
									_localctx.clauses.add("source");
								}
								break;
								case 2:
								{
									setState(769);
									if (!(!_localctx.clauses.contains("lifetime"))) throw new FailedPredicateException(this, "!$clauses.count(\"lifetime\")");
									setState(770);
									lifetimeClause();
									_localctx.clauses.add("lifetime");
								}
								break;
								case 3:
								{
									setState(773);
									if (!(!_localctx.clauses.contains("layout"))) throw new FailedPredicateException(this, "!$clauses.count(\"layout\")");
									setState(774);
									layoutClause();
									_localctx.clauses.add("layout");
								}
								break;
								case 4:
								{
									setState(777);
									if (!(!_localctx.clauses.contains("range"))) throw new FailedPredicateException(this, "!$clauses.count(\"range\")");
									setState(778);
									rangeClause();
									_localctx.clauses.add("range");
								}
								break;
								case 5:
								{
									setState(781);
									if (!(!_localctx.clauses.contains("settings"))) throw new FailedPredicateException(this, "!$clauses.count(\"settings\")");
									setState(782);
									dictionarySettingsClause();
									_localctx.clauses.add("settings");
								}
								break;
							}
						}
					}
					setState(789);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPrimaryKeyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
		DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dictionaryPrimaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(790);
				match(PRIMARY);
				setState(791);
				match(KEY);
				setState(792);
				columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryArgExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
		DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dictionaryArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(794);
				identifier();
				setState(801);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case AFTER:
					case ALIAS:
					case ALL:
					case ALTER:
					case AND:
					case ANTI:
					case ANY:
					case ARRAY:
					case AS:
					case ASCENDING:
					case ASOF:
					case AST:
					case ASYNC:
					case ATTACH:
					case BETWEEN:
					case BOTH:
					case BY:
					case CASE:
					case CAST:
					case CHECK:
					case CLEAR:
					case CLUSTER:
					case CODEC:
					case COLLATE:
					case COLUMN:
					case COMMENT:
					case CONSTRAINT:
					case CREATE:
					case CROSS:
					case CUBE:
					case CURRENT:
					case DATABASE:
					case DATABASES:
					case DATE:
					case DAY:
					case DEDUPLICATE:
					case DEFAULT:
					case DELAY:
					case DELETE:
					case DESC:
					case DESCENDING:
					case DESCRIBE:
					case DETACH:
					case DICTIONARIES:
					case DICTIONARY:
					case DISK:
					case DISTINCT:
					case DISTRIBUTED:
					case DROP:
					case ELSE:
					case END:
					case ENGINE:
					case EVENTS:
					case EXISTS:
					case EXPLAIN:
					case EXPRESSION:
					case EXTRACT:
					case FETCHES:
					case FINAL:
					case FIRST:
					case FLUSH:
					case FOLLOWING:
					case FOR:
					case FORMAT:
					case FREEZE:
					case FROM:
					case FULL:
					case FUNCTION:
					case GLOBAL:
					case GRANULARITY:
					case GROUP:
					case HAVING:
					case HIERARCHICAL:
					case HOUR:
					case ID:
					case IF:
					case ILIKE:
					case IN:
					case INDEX:
					case INJECTIVE:
					case INNER:
					case INSERT:
					case INTERVAL:
					case INTO:
					case IS:
					case IS_OBJECT_ID:
					case JOIN:
					case KEY:
					case KILL:
					case LAST:
					case LAYOUT:
					case LEADING:
					case LEFT:
					case LIFETIME:
					case LIKE:
					case LIMIT:
					case LIVE:
					case LOCAL:
					case LOGS:
					case MATERIALIZE:
					case MATERIALIZED:
					case MAX:
					case MERGES:
					case MIN:
					case MINUTE:
					case MODIFY:
					case MONTH:
					case MOVE:
					case MUTATION:
					case NO:
					case NOT:
					case NULLS:
					case OFFSET:
					case ON:
					case OPTIMIZE:
					case OR:
					case ORDER:
					case OUTER:
					case OUTFILE:
					case OVER:
					case PARTITION:
					case POPULATE:
					case PRECEDING:
					case PREWHERE:
					case PRIMARY:
					case QUARTER:
					case RANGE:
					case RELOAD:
					case REMOVE:
					case RENAME:
					case REPLACE:
					case REPLICA:
					case REPLICATED:
					case RIGHT:
					case ROLLUP:
					case ROW:
					case ROWS:
					case SAMPLE:
					case SECOND:
					case SELECT:
					case SEMI:
					case SENDS:
					case SET:
					case SETTINGS:
					case SHOW:
					case SOURCE:
					case START:
					case STOP:
					case SUBSTRING:
					case SYNC:
					case SYNTAX:
					case SYSTEM:
					case TABLE:
					case TABLES:
					case TEMPORARY:
					case TEST:
					case THEN:
					case TIES:
					case TIMEOUT:
					case TIMESTAMP:
					case TO:
					case TOP:
					case TOTALS:
					case TRAILING:
					case TRIM:
					case TRUNCATE:
					case TTL:
					case TYPE:
					case UNBOUNDED:
					case UNION:
					case UPDATE:
					case USE:
					case USING:
					case UUID:
					case VALUES:
					case VIEW:
					case VOLUME:
					case WATCH:
					case WEEK:
					case WHEN:
					case WHERE:
					case WINDOW:
					case WITH:
					case YEAR:
					case JSON_FALSE:
					case JSON_TRUE:
					case IDENTIFIER:
					{
						setState(795);
						identifier();
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
								setState(796);
								match(LPAREN);
								setState(797);
								match(RPAREN);
							}
						}

					}
					break;
					case INF:
					case NAN_SQL:
					case NULL_SQL:
					case FLOATING_LITERAL:
					case OCTAL_LITERAL:
					case DECIMAL_LITERAL:
					case HEXADECIMAL_LITERAL:
					case STRING_LITERAL:
					case DASH:
					case DOT:
					case PLUS:
					{
						setState(800);
						literal();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceClauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(803);
				match(SOURCE);
				setState(804);
				match(LPAREN);
				setState(805);
				identifier();
				setState(806);
				match(LPAREN);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
						{
							setState(807);
							dictionaryArgExpr();
						}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				match(RPAREN);
				setState(814);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LifetimeClauseContext extends ParserRuleContext {
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLifetimeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
		LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lifetimeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(816);
				match(LIFETIME);
				setState(817);
				match(LPAREN);
				setState(827);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case DECIMAL_LITERAL:
					{
						setState(818);
						match(DECIMAL_LITERAL);
					}
					break;
					case MIN:
					{
						setState(819);
						match(MIN);
						setState(820);
						match(DECIMAL_LITERAL);
						setState(821);
						match(MAX);
						setState(822);
						match(DECIMAL_LITERAL);
					}
					break;
					case MAX:
					{
						setState(823);
						match(MAX);
						setState(824);
						match(DECIMAL_LITERAL);
						setState(825);
						match(MIN);
						setState(826);
						match(DECIMAL_LITERAL);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(829);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayoutClauseContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLayoutClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutClauseContext layoutClause() throws RecognitionException {
		LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_layoutClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(831);
				match(LAYOUT);
				setState(832);
				match(LPAREN);
				setState(833);
				identifier();
				setState(834);
				match(LPAREN);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
						{
							setState(835);
							dictionaryArgExpr();
						}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
				match(RPAREN);
				setState(842);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(844);
				match(RANGE);
				setState(845);
				match(LPAREN);
				setState(856);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case MIN:
					{
						setState(846);
						match(MIN);
						setState(847);
						identifier();
						setState(848);
						match(MAX);
						setState(849);
						identifier();
					}
					break;
					case MAX:
					{
						setState(851);
						match(MAX);
						setState(852);
						identifier();
						setState(853);
						match(MIN);
						setState(854);
						identifier();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(858);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionarySettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySettingsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
		DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dictionarySettingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(860);
				match(SETTINGS);
				setState(861);
				match(LPAREN);
				setState(862);
				settingExprList();
				setState(863);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusterClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterClauseContext clusterClause() throws RecognitionException {
		ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_clusterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(865);
				match(ON);
				setState(866);
				match(CLUSTER);
				setState(869);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case AFTER:
					case ALIAS:
					case ALL:
					case ALTER:
					case AND:
					case ANTI:
					case ANY:
					case ARRAY:
					case AS:
					case ASCENDING:
					case ASOF:
					case AST:
					case ASYNC:
					case ATTACH:
					case BETWEEN:
					case BOTH:
					case BY:
					case CASE:
					case CAST:
					case CHECK:
					case CLEAR:
					case CLUSTER:
					case CODEC:
					case COLLATE:
					case COLUMN:
					case COMMENT:
					case CONSTRAINT:
					case CREATE:
					case CROSS:
					case CUBE:
					case CURRENT:
					case DATABASE:
					case DATABASES:
					case DATE:
					case DAY:
					case DEDUPLICATE:
					case DEFAULT:
					case DELAY:
					case DELETE:
					case DESC:
					case DESCENDING:
					case DESCRIBE:
					case DETACH:
					case DICTIONARIES:
					case DICTIONARY:
					case DISK:
					case DISTINCT:
					case DISTRIBUTED:
					case DROP:
					case ELSE:
					case END:
					case ENGINE:
					case EVENTS:
					case EXISTS:
					case EXPLAIN:
					case EXPRESSION:
					case EXTRACT:
					case FETCHES:
					case FINAL:
					case FIRST:
					case FLUSH:
					case FOLLOWING:
					case FOR:
					case FORMAT:
					case FREEZE:
					case FROM:
					case FULL:
					case FUNCTION:
					case GLOBAL:
					case GRANULARITY:
					case GROUP:
					case HAVING:
					case HIERARCHICAL:
					case HOUR:
					case ID:
					case IF:
					case ILIKE:
					case IN:
					case INDEX:
					case INJECTIVE:
					case INNER:
					case INSERT:
					case INTERVAL:
					case INTO:
					case IS:
					case IS_OBJECT_ID:
					case JOIN:
					case KEY:
					case KILL:
					case LAST:
					case LAYOUT:
					case LEADING:
					case LEFT:
					case LIFETIME:
					case LIKE:
					case LIMIT:
					case LIVE:
					case LOCAL:
					case LOGS:
					case MATERIALIZE:
					case MATERIALIZED:
					case MAX:
					case MERGES:
					case MIN:
					case MINUTE:
					case MODIFY:
					case MONTH:
					case MOVE:
					case MUTATION:
					case NO:
					case NOT:
					case NULLS:
					case OFFSET:
					case ON:
					case OPTIMIZE:
					case OR:
					case ORDER:
					case OUTER:
					case OUTFILE:
					case OVER:
					case PARTITION:
					case POPULATE:
					case PRECEDING:
					case PREWHERE:
					case PRIMARY:
					case QUARTER:
					case RANGE:
					case RELOAD:
					case REMOVE:
					case RENAME:
					case REPLACE:
					case REPLICA:
					case REPLICATED:
					case RIGHT:
					case ROLLUP:
					case ROW:
					case ROWS:
					case SAMPLE:
					case SECOND:
					case SELECT:
					case SEMI:
					case SENDS:
					case SET:
					case SETTINGS:
					case SHOW:
					case SOURCE:
					case START:
					case STOP:
					case SUBSTRING:
					case SYNC:
					case SYNTAX:
					case SYSTEM:
					case TABLE:
					case TABLES:
					case TEMPORARY:
					case TEST:
					case THEN:
					case TIES:
					case TIMEOUT:
					case TIMESTAMP:
					case TO:
					case TOP:
					case TOTALS:
					case TRAILING:
					case TRIM:
					case TRUNCATE:
					case TTL:
					case TYPE:
					case UNBOUNDED:
					case UNION:
					case UPDATE:
					case USE:
					case USING:
					case UUID:
					case VALUES:
					case VIEW:
					case VOLUME:
					case WATCH:
					case WEEK:
					case WHEN:
					case WHERE:
					case WINDOW:
					case WITH:
					case YEAR:
					case JSON_FALSE:
					case JSON_TRUE:
					case IDENTIFIER:
					{
						setState(867);
						identifier();
					}
					break;
					case STRING_LITERAL:
					{
						setState(868);
						match(STRING_LITERAL);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UuidClauseContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public UuidClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuidClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUuidClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UuidClauseContext uuidClause() throws RecognitionException {
		UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_uuidClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(871);
				match(UUID);
				setState(872);
				match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDestinationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationClauseContext destinationClause() throws RecognitionException {
		DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_destinationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(874);
				match(TO);
				setState(875);
				tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSubqueryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_subqueryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(877);
				match(AS);
				setState(878);
				selectUnionStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSchemaClauseContext extends ParserRuleContext {
		public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSchemaClause; }

		public TableSchemaClauseContext() { }
		public void copyFrom(TableSchemaClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsTableClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<TableElementExprContext> tableElementExpr() {
			return getRuleContexts(TableElementExprContext.class);
		}
		public TableElementExprContext tableElementExpr(int i) {
			return getRuleContext(TableElementExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaDescriptionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
		TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableSchemaClause);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					_localctx = new SchemaDescriptionClauseContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(880);
					match(LPAREN);
					setState(881);
					tableElementExpr();
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
							{
								setState(882);
								match(COMMA);
								setState(883);
								tableElementExpr();
							}
						}
						setState(888);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(889);
					match(RPAREN);
				}
				break;
				case 2:
					_localctx = new SchemaAsTableClauseContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(891);
					match(AS);
					setState(892);
					tableIdentifier();
				}
				break;
				case 3:
					_localctx = new SchemaAsFunctionClauseContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(893);
					match(AS);
					setState(894);
					tableFunctionExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineClauseContext extends ParserRuleContext {
		public Set<String> clauses = new HashSet<>();
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public List<PartitionByClauseContext> partitionByClause() {
			return getRuleContexts(PartitionByClauseContext.class);
		}
		public PartitionByClauseContext partitionByClause(int i) {
			return getRuleContext(PartitionByClauseContext.class,i);
		}
		public List<PrimaryKeyClauseContext> primaryKeyClause() {
			return getRuleContexts(PrimaryKeyClauseContext.class);
		}
		public PrimaryKeyClauseContext primaryKeyClause(int i) {
			return getRuleContext(PrimaryKeyClauseContext.class,i);
		}
		public List<SampleByClauseContext> sampleByClause() {
			return getRuleContexts(SampleByClauseContext.class);
		}
		public SampleByClauseContext sampleByClause(int i) {
			return getRuleContext(SampleByClauseContext.class,i);
		}
		public List<TtlClauseContext> ttlClause() {
			return getRuleContexts(TtlClauseContext.class);
		}
		public TtlClauseContext ttlClause(int i) {
			return getRuleContext(TtlClauseContext.class,i);
		}
		public List<SettingsClauseContext> settingsClause() {
			return getRuleContexts(SettingsClauseContext.class);
		}
		public SettingsClauseContext settingsClause(int i) {
			return getRuleContext(SettingsClauseContext.class,i);
		}
		public EngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineClauseContext engineClause() throws RecognitionException {
		EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_engineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(897);
				engineExpr();
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							setState(922);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
								case 1:
								{
									setState(898);
									if (!(!_localctx.clauses.contains("orderByClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"orderByClause\")");
									setState(899);
									orderByClause();
									_localctx.clauses.add("orderByClause");
								}
								break;
								case 2:
								{
									setState(902);
									if (!(!_localctx.clauses.contains("partitionByClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"partitionByClause\")");
									setState(903);
									partitionByClause();
									_localctx.clauses.add("partitionByClause");
								}
								break;
								case 3:
								{
									setState(906);
									if (!(!_localctx.clauses.contains("primaryKeyClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"primaryKeyClause\")");
									setState(907);
									primaryKeyClause();
									_localctx.clauses.add("primaryKeyClause");
								}
								break;
								case 4:
								{
									setState(910);
									if (!(!_localctx.clauses.contains("sampleByClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"sampleByClause\")");
									setState(911);
									sampleByClause();
									_localctx.clauses.add("sampleByClause");
								}
								break;
								case 5:
								{
									setState(914);
									if (!(!_localctx.clauses.contains("ttlClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"ttlClause\")");
									setState(915);
									ttlClause();
									_localctx.clauses.add("ttlClause");
								}
								break;
								case 6:
								{
									setState(918);
									if (!(!_localctx.clauses.contains("settingsClause"))) throw new FailedPredicateException(this, "!$clauses.count(\"settingsClause\")");
									setState(919);
									settingsClause();
									_localctx.clauses.add("settingsClause");
								}
								break;
							}
						}
					}
					setState(926);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(927);
				match(PARTITION);
				setState(928);
				match(BY);
				setState(929);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
		PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(931);
				match(PRIMARY);
				setState(932);
				match(KEY);
				setState(933);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleByClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleByClauseContext sampleByClause() throws RecognitionException {
		SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sampleByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(935);
				match(SAMPLE);
				setState(936);
				match(BY);
				setState(937);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlClauseContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public List<TtlExprContext> ttlExpr() {
			return getRuleContexts(TtlExprContext.class);
		}
		public TtlExprContext ttlExpr(int i) {
			return getRuleContext(TtlExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TtlClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlClauseContext ttlClause() throws RecognitionException {
		TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ttlClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(939);
				match(TTL);
				setState(940);
				ttlExpr();
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(941);
								match(COMMA);
								setState(942);
								ttlExpr();
							}
						}
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineExprContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public EngineExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineExprContext engineExpr() throws RecognitionException {
		EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_engineExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(948);
				match(ENGINE);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_SINGLE) {
					{
						setState(949);
						match(EQ_SINGLE);
					}
				}

				setState(952);
				identifierOrNull();
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
					{
						setState(953);
						match(LPAREN);
						setState(955);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
							{
								setState(954);
								columnExprList();
							}
						}

						setState(957);
						match(RPAREN);
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementExprContext extends ParserRuleContext {
		public TableElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementExpr; }

		public TableElementExprContext() { }
		public void copyFrom(TableElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableElementExprProjectionContext extends TableElementExprContext {
		public TerminalNode PROJECTION() { return getToken(ClickHouseParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TableElementExprProjectionContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprConstraintContext extends TableElementExprContext {
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableElementExprConstraintContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprColumnContext extends TableElementExprContext {
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TableElementExprColumnContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprIndexContext extends TableElementExprContext {
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TableElementExprIndexContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementExprContext tableElementExpr() throws RecognitionException {
		TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableElementExpr);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					_localctx = new TableElementExprColumnContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(960);
					tableColumnDfnt();
				}
				break;
				case 2:
					_localctx = new TableElementExprConstraintContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(961);
					match(CONSTRAINT);
					setState(962);
					identifier();
					setState(963);
					match(CHECK);
					setState(964);
					columnExpr(0);
				}
				break;
				case 3:
					_localctx = new TableElementExprIndexContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(966);
					match(INDEX);
					setState(967);
					tableIndexDfnt();
				}
				break;
				case 4:
					_localctx = new TableElementExprProjectionContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(968);
					match(PROJECTION);
					setState(969);
					tableProjectionDfnt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TableColumnPropertyExprContext tableColumnPropertyExpr() {
			return getRuleContext(TableColumnPropertyExprContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
		TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableColumnDfnt);
		int _la;
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(972);
					nestedIdentifier();
					setState(973);
					columnTypeExpr();
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) {
						{
							setState(974);
							tableColumnPropertyExpr();
						}
					}

					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
							setState(977);
							match(COMMENT);
							setState(978);
							match(STRING_LITERAL);
						}
					}

					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CODEC) {
						{
							setState(981);
							codecExpr();
						}
					}

					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
							setState(984);
							match(TTL);
							setState(985);
							columnExpr(0);
						}
					}

				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(988);
					nestedIdentifier();
					setState(990);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
						case 1:
						{
							setState(989);
							columnTypeExpr();
						}
						break;
					}
					setState(992);
					tableColumnPropertyExpr();
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
							setState(993);
							match(COMMENT);
							setState(994);
							match(STRING_LITERAL);
						}
					}

					setState(998);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CODEC) {
						{
							setState(997);
							codecExpr();
						}
					}

					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
							setState(1000);
							match(TTL);
							setState(1001);
							columnExpr(0);
						}
					}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnPropertyExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
		TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tableColumnPropertyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1006);
				_la = _input.LA(1);
				if ( !(_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1007);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIndexDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIndexDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
		TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tableIndexDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1009);
				nestedIdentifier();
				setState(1010);
				columnExpr(0);
				setState(1011);
				match(TYPE);
				setState(1012);
				columnTypeExpr();
				setState(1013);
				match(GRANULARITY);
				setState(1014);
				match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProjectionDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ProjectionSelectStmtContext projectionSelectStmt() {
			return getRuleContext(ProjectionSelectStmtContext.class,0);
		}
		public TableProjectionDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProjectionDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableProjectionDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProjectionDfntContext tableProjectionDfnt() throws RecognitionException {
		TableProjectionDfntContext _localctx = new TableProjectionDfntContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableProjectionDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1016);
				nestedIdentifier();
				setState(1017);
				projectionSelectStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodecExprContext extends ParserRuleContext {
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<CodecArgExprContext> codecArgExpr() {
			return getRuleContexts(CodecArgExprContext.class);
		}
		public CodecArgExprContext codecArgExpr(int i) {
			return getRuleContext(CodecArgExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public CodecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecExprContext codecExpr() throws RecognitionException {
		CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_codecExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1019);
				match(CODEC);
				setState(1020);
				match(LPAREN);
				setState(1021);
				codecArgExpr();
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1022);
							match(COMMA);
							setState(1023);
							codecArgExpr();
						}
					}
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1029);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodecArgExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecArgExprContext codecArgExpr() throws RecognitionException {
		CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codecArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1031);
				identifier();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
						setState(1032);
						match(LPAREN);
						setState(1034);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
							{
								setState(1033);
								columnExprList();
							}
						}

						setState(1036);
						match(RPAREN);
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlExprContext ttlExpr() throws RecognitionException {
		TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ttlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1039);
				columnExpr(0);
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
					{
						setState(1040);
						match(DELETE);
					}
					break;
					case 2:
					{
						setState(1041);
						match(TO);
						setState(1042);
						match(DISK);
						setState(1043);
						match(STRING_LITERAL);
					}
					break;
					case 3:
					{
						setState(1044);
						match(TO);
						setState(1045);
						match(VOLUME);
						setState(1046);
						match(STRING_LITERAL);
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeStmtContext extends ParserRuleContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDescribeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1049);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
					{
						setState(1050);
						match(TABLE);
					}
					break;
				}
				setState(1053);
				tableExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropStmtContext extends ParserRuleContext {
		public DropStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStmt; }

		public DropStmtContext() { }
		public void copyFrom(DropStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseStmtContext extends DropStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public DropDatabaseStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableStmtContext extends DropStmtContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DropTableStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStmtContext dropStmt() throws RecognitionException {
		DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dropStmt);
		int _la;
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					_localctx = new DropDatabaseStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1055);
					_la = _input.LA(1);
					if ( !(_la==DETACH || _la==DROP) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1056);
					match(DATABASE);
					setState(1059);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
						case 1:
						{
							setState(1057);
							match(IF);
							setState(1058);
							match(EXISTS);
						}
						break;
					}
					setState(1061);
					databaseIdentifier();
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(1062);
							clusterClause();
						}
					}

				}
				break;
				case 2:
					_localctx = new DropTableStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1065);
					_la = _input.LA(1);
					if ( !(_la==DETACH || _la==DROP) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1072);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case DICTIONARY:
						{
							setState(1066);
							match(DICTIONARY);
						}
						break;
						case TABLE:
						case TEMPORARY:
						{
							setState(1068);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==TEMPORARY) {
								{
									setState(1067);
									match(TEMPORARY);
								}
							}

							setState(1070);
							match(TABLE);
						}
						break;
						case VIEW:
						{
							setState(1071);
							match(VIEW);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(1076);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
						case 1:
						{
							setState(1074);
							match(IF);
							setState(1075);
							match(EXISTS);
						}
						break;
					}
					setState(1078);
					tableIdentifier();
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
							setState(1079);
							clusterClause();
						}
					}

					setState(1084);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
							setState(1082);
							match(NO);
							setState(1083);
							match(DELAY);
						}
					}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsStmtContext extends ParserRuleContext {
		public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStmt; }

		public ExistsStmtContext() { }
		public void copyFrom(ExistsStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistsTableStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public ExistsTableStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ExistsDatabaseStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsStmtContext existsStmt() throws RecognitionException {
		ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_existsStmt);
		int _la;
		try {
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					_localctx = new ExistsDatabaseStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1088);
					match(EXISTS);
					setState(1089);
					match(DATABASE);
					setState(1090);
					databaseIdentifier();
				}
				break;
				case 2:
					_localctx = new ExistsTableStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1091);
					match(EXISTS);
					setState(1098);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
						{
							setState(1092);
							match(DICTIONARY);
						}
						break;
						case 2:
						{
							setState(1094);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==TEMPORARY) {
								{
									setState(1093);
									match(TEMPORARY);
								}
							}

							setState(1096);
							match(TABLE);
						}
						break;
						case 3:
						{
							setState(1097);
							match(VIEW);
						}
						break;
					}
					setState(1100);
					tableIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainStmtContext extends ParserRuleContext {
		public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStmt; }

		public ExplainStmtContext() { }
		public void copyFrom(ExplainStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainSyntaxStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainSyntaxStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExplainSyntaxStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainASTStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode AST() { return getToken(ClickHouseParser.AST, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainASTStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExplainASTStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainStmtContext explainStmt() throws RecognitionException {
		ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_explainStmt);
		try {
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					_localctx = new ExplainASTStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1103);
					match(EXPLAIN);
					setState(1104);
					match(AST);
					setState(1105);
					query();
				}
				break;
				case 2:
					_localctx = new ExplainSyntaxStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1106);
					match(EXPLAIN);
					setState(1107);
					match(SYNTAX);
					setState(1108);
					query();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public DataClauseContext dataClause() {
			return getRuleContext(DataClauseContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1111);
				match(INSERT);
				setState(1112);
				match(INTO);
				setState(1114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
					{
						setState(1113);
						match(TABLE);
					}
					break;
				}
				setState(1119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
					{
						setState(1116);
						tableIdentifier();
					}
					break;
					case 2:
					{
						setState(1117);
						match(FUNCTION);
						setState(1118);
						tableFunctionExpr();
					}
					break;
				}
				setState(1122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
					{
						setState(1121);
						columnsClause();
					}
					break;
				}
				setState(1124);
				dataClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1126);
				match(LPAREN);
				setState(1127);
				nestedIdentifier();
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1128);
							match(COMMA);
							setState(1129);
							nestedIdentifier();
						}
					}
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1135);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataClauseContext extends ParserRuleContext {
		public DataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataClause; }

		public DataClauseContext() { }
		public void copyFrom(DataClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataClauseValuesContext extends DataClauseContext {
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public DataClauseValuesContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseFormatContext extends DataClauseContext {
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataClauseFormatContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseSelectContext extends DataClauseContext {
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClickHouseParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public DataClauseSelectContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataClauseContext dataClause() throws RecognitionException {
		DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dataClause);
		int _la;
		try {
			setState(1146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case FORMAT:
					_localctx = new DataClauseFormatContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1137);
					match(FORMAT);
					setState(1138);
					identifier();
				}
				break;
				case VALUES:
					_localctx = new DataClauseValuesContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1139);
					match(VALUES);
				}
				break;
				case SELECT:
				case WITH:
				case LPAREN:
					_localctx = new DataClauseSelectContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(1140);
					selectUnionStmt();
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
							setState(1141);
							match(SEMICOLON);
						}
					}

					setState(1144);
					match(EOF);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillStmtContext extends ParserRuleContext {
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }

		public KillStmtContext() { }
		public void copyFrom(KillStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KillMutationStmtContext extends KillStmtContext {
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public KillMutationStmtContext(KillStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKillMutationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_killStmt);
		int _la;
		try {
			_localctx = new KillMutationStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(1148);
				match(KILL);
				setState(1149);
				match(MUTATION);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
						setState(1150);
						clusterClause();
					}
				}

				setState(1153);
				whereClause();
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC || _la==SYNC || _la==TEST) {
					{
						setState(1154);
						_la = _input.LA(1);
						if ( !(_la==ASYNC || _la==SYNC || _la==TEST) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimizeStmtContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOptimizeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
		OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_optimizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1157);
				match(OPTIMIZE);
				setState(1158);
				match(TABLE);
				setState(1159);
				tableIdentifier();
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
						setState(1160);
						clusterClause();
					}
				}

				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
						setState(1163);
						partitionClause();
					}
				}

				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
						setState(1166);
						match(FINAL);
					}
				}

				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDUPLICATE) {
					{
						setState(1169);
						match(DEDUPLICATE);
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameStmtContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(ClickHouseParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ClickHouseParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public RenameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRenameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameStmtContext renameStmt() throws RecognitionException {
		RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_renameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1172);
				match(RENAME);
				setState(1173);
				match(TABLE);
				setState(1174);
				tableIdentifier();
				setState(1175);
				match(TO);
				setState(1176);
				tableIdentifier();
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1177);
							match(COMMA);
							setState(1178);
							tableIdentifier();
							setState(1179);
							match(TO);
							setState(1180);
							tableIdentifier();
						}
					}
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
						setState(1187);
						clusterClause();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionSelectStmtContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public ProjectionOrderByClauseContext projectionOrderByClause() {
			return getRuleContext(ProjectionOrderByClauseContext.class,0);
		}
		public ProjectionSelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionSelectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitProjectionSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionSelectStmtContext projectionSelectStmt() throws RecognitionException {
		ProjectionSelectStmtContext _localctx = new ProjectionSelectStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_projectionSelectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1190);
				match(LPAREN);
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
						setState(1191);
						withClause();
					}
				}

				setState(1194);
				match(SELECT);
				setState(1195);
				columnExprList();
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
						setState(1196);
						groupByClause();
					}
				}

				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
						setState(1199);
						projectionOrderByClause();
					}
				}

				setState(1202);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectUnionStmtContext extends ParserRuleContext {
		public List<SelectStmtWithParensContext> selectStmtWithParens() {
			return getRuleContexts(SelectStmtWithParensContext.class);
		}
		public SelectStmtWithParensContext selectStmtWithParens(int i) {
			return getRuleContext(SelectStmtWithParensContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(ClickHouseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ClickHouseParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(ClickHouseParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(ClickHouseParser.ALL, i);
		}
		public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectUnionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
		SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selectUnionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1204);
				selectStmtWithParens();
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNION) {
					{
						{
							setState(1205);
							match(UNION);
							setState(1206);
							match(ALL);
							setState(1207);
							selectStmtWithParens();
						}
					}
					setState(1212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtWithParensContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmtWithParens; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmtWithParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
		SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selectStmtWithParens);
		try {
			setState(1218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SELECT:
				case WITH:
					enterOuterAlt(_localctx, 1);
				{
					setState(1213);
					selectStmt();
				}
				break;
				case LPAREN:
					enterOuterAlt(_localctx, 2);
				{
					setState(1214);
					match(LPAREN);
					setState(1215);
					selectUnionStmt();
					setState(1216);
					match(RPAREN);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TopClauseContext topClause() {
			return getRuleContext(TopClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ArrayJoinClauseContext arrayJoinClause() {
			return getRuleContext(ArrayJoinClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public PrewhereClauseContext prewhereClause() {
			return getRuleContext(PrewhereClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(ClickHouseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ClickHouseParser.WITH, i);
		}
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitByClauseContext limitByClause() {
			return getRuleContext(LimitByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SettingsClauseContext settingsClause() {
			return getRuleContext(SettingsClauseContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
						setState(1220);
						withClause();
					}
				}

				setState(1223);
				match(SELECT);
				setState(1225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
					{
						setState(1224);
						match(DISTINCT);
					}
					break;
				}
				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
					{
						setState(1227);
						topClause();
					}
					break;
				}
				setState(1230);
				columnExprList();
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
						setState(1231);
						fromClause();
					}
				}

				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY || _la==INNER || _la==LEFT) {
					{
						setState(1234);
						arrayJoinClause();
					}
				}

				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WINDOW) {
					{
						setState(1237);
						windowClause();
					}
				}

				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREWHERE) {
					{
						setState(1240);
						prewhereClause();
					}
				}

				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
						setState(1243);
						whereClause();
					}
				}

				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
						setState(1246);
						groupByClause();
					}
				}

				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
					{
						setState(1249);
						match(WITH);
						setState(1250);
						_la = _input.LA(1);
						if ( !(_la==CUBE || _la==ROLLUP) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
						setState(1253);
						match(WITH);
						setState(1254);
						match(TOTALS);
					}
				}

				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
						setState(1257);
						havingClause();
					}
				}

				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
						setState(1260);
						orderByClause();
					}
				}

				setState(1264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
					{
						setState(1263);
						limitByClause();
					}
					break;
				}
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
						setState(1266);
						limitClause();
					}
				}

				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SETTINGS) {
					{
						setState(1269);
						settingsClause();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1272);
				match(WITH);
				setState(1273);
				columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopClauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TopClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTopClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopClauseContext topClause() throws RecognitionException {
		TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_topClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1275);
				match(TOP);
				setState(1276);
				match(DECIMAL_LITERAL);
				setState(1279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
					{
						setState(1277);
						match(WITH);
						setState(1278);
						match(TIES);
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1281);
				match(FROM);
				setState(1282);
				joinExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayJoinClauseContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJoinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitArrayJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
		ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayJoinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==LEFT) {
					{
						setState(1284);
						_la = _input.LA(1);
						if ( !(_la==INNER || _la==LEFT) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
				}

				setState(1287);
				match(ARRAY);
				setState(1288);
				match(JOIN);
				setState(1289);
				columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(ClickHouseParser.WINDOW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public WindowExprContext windowExpr() {
			return getRuleContext(WindowExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_windowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1291);
				match(WINDOW);
				setState(1292);
				identifier();
				setState(1293);
				match(AS);
				setState(1294);
				match(LPAREN);
				setState(1295);
				windowExpr();
				setState(1296);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrewhereClauseContext extends ParserRuleContext {
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prewhereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrewhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrewhereClauseContext prewhereClause() throws RecognitionException {
		PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_prewhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1298);
				match(PREWHERE);
				setState(1299);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1301);
				match(WHERE);
				setState(1302);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1304);
				match(GROUP);
				setState(1305);
				match(BY);
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
					{
						setState(1306);
						_la = _input.LA(1);
						if ( !(_la==CUBE || _la==ROLLUP) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1307);
						match(LPAREN);
						setState(1308);
						columnExprList();
						setState(1309);
						match(RPAREN);
					}
					break;
					case 2:
					{
						setState(1311);
						columnExprList();
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1314);
				match(HAVING);
				setState(1315);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1317);
				match(ORDER);
				setState(1318);
				match(BY);
				setState(1319);
				orderExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ProjectionOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionOrderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitProjectionOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionOrderByClauseContext projectionOrderByClause() throws RecognitionException {
		ProjectionOrderByClauseContext _localctx = new ProjectionOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_projectionOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1321);
				match(ORDER);
				setState(1322);
				match(BY);
				setState(1323);
				columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitByClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitByClauseContext limitByClause() throws RecognitionException {
		LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_limitByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1325);
				match(LIMIT);
				setState(1326);
				limitExpr();
				setState(1327);
				match(BY);
				setState(1328);
				columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1330);
				match(LIMIT);
				setState(1331);
				limitExpr();
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
						setState(1332);
						match(WITH);
						setState(1333);
						match(TIES);
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsClauseContext settingsClause() throws RecognitionException {
		SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_settingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1336);
				match(SETTINGS);
				setState(1337);
				settingExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinExprContext extends ParserRuleContext {
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }

		public JoinExprContext() { }
		public void copyFrom(JoinExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinExprOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public JoinConstraintClauseContext joinConstraintClause() {
			return getRuleContext(JoinConstraintClauseContext.class,0);
		}
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public JoinExprOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprTableContext extends JoinExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public JoinExprTableContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprParensContext extends JoinExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinExprParensContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprCrossOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public JoinOpCrossContext joinOpCross() {
			return getRuleContext(JoinOpCrossContext.class,0);
		}
		public JoinExprCrossOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprCrossOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		return joinExpr(0);
	}

	private JoinExprContext joinExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
		JoinExprContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_joinExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
					{
						_localctx = new JoinExprTableContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(1340);
						tableExpr(0);
						setState(1342);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
							case 1:
							{
								setState(1341);
								match(FINAL);
							}
							break;
						}
						setState(1345);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
							case 1:
							{
								setState(1344);
								sampleClause();
							}
							break;
						}
					}
					break;
					case 2:
					{
						_localctx = new JoinExprParensContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1347);
						match(LPAREN);
						setState(1348);
						joinExpr(0);
						setState(1349);
						match(RPAREN);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(1370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1368);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
								case 1:
								{
									_localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
									setState(1353);
									if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(1354);
									joinOpCross();
									setState(1355);
									joinExpr(4);
								}
								break;
								case 2:
								{
									_localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
									setState(1357);
									if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(1359);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==GLOBAL || _la==LOCAL) {
										{
											setState(1358);
											_la = _input.LA(1);
											if ( !(_la==GLOBAL || _la==LOCAL) ) {
												_errHandler.recoverInline(this);
											}
											else {
												if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
												_errHandler.reportMatch(this);
												consume();
											}
										}
									}

									setState(1362);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (LEFT - 68)))) != 0) || _la==RIGHT || _la==SEMI) {
										{
											setState(1361);
											joinOp();
										}
									}

									setState(1364);
									match(JOIN);
									setState(1365);
									joinExpr(0);
									setState(1366);
									joinConstraintClause();
								}
								break;
							}
						}
					}
					setState(1372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinOpContext extends ParserRuleContext {
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }

		public JoinOpContext() { }
		public void copyFrom(JoinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinOpFullContext extends JoinOpContext {
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public JoinOpFullContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpFull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpInnerContext extends JoinOpContext {
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpInnerContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpInner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpLeftRightContext extends JoinOpContext {
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpLeftRightContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpLeftRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_joinOp);
		int _la;
		try {
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					_localctx = new JoinOpInnerContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
						{
							setState(1374);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
								{
									setState(1373);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}

							setState(1376);
							match(INNER);
						}
						break;
						case 2:
						{
							setState(1377);
							match(INNER);
							setState(1379);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
								{
									setState(1378);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}

						}
						break;
						case 3:
						{
							setState(1381);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
						break;
					}
				}
				break;
				case 2:
					_localctx = new JoinOpLeftRightContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
						case 1:
						{
							setState(1385);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
								{
									setState(1384);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}

							setState(1387);
							_la = _input.LA(1);
							if ( !(_la==LEFT || _la==RIGHT) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1389);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OUTER) {
								{
									setState(1388);
									match(OUTER);
								}
							}

						}
						break;
						case 2:
						{
							setState(1391);
							_la = _input.LA(1);
							if ( !(_la==LEFT || _la==RIGHT) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1393);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OUTER) {
								{
									setState(1392);
									match(OUTER);
								}
							}

							setState(1396);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
								{
									setState(1395);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}

						}
						break;
					}
				}
				break;
				case 3:
					_localctx = new JoinOpFullContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(1414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
						case 1:
						{
							setState(1401);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==ALL || _la==ANY) {
								{
									setState(1400);
									_la = _input.LA(1);
									if ( !(_la==ALL || _la==ANY) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}

							setState(1403);
							match(FULL);
							setState(1405);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OUTER) {
								{
									setState(1404);
									match(OUTER);
								}
							}

						}
						break;
						case 2:
						{
							setState(1407);
							match(FULL);
							setState(1409);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OUTER) {
								{
									setState(1408);
									match(OUTER);
								}
							}

							setState(1412);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==ALL || _la==ANY) {
								{
									setState(1411);
									_la = _input.LA(1);
									if ( !(_la==ALL || _la==ANY) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}

						}
						break;
					}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinOpCrossContext extends ParserRuleContext {
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOpCross; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpCross(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpCrossContext joinOpCross() throws RecognitionException {
		JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_joinOpCross);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case CROSS:
				case GLOBAL:
				case LOCAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL || _la==LOCAL) {
						{
							setState(1418);
							_la = _input.LA(1);
							if ( !(_la==GLOBAL || _la==LOCAL) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
					}

					setState(1421);
					match(CROSS);
					setState(1422);
					match(JOIN);
				}
				break;
				case COMMA:
					enterOuterAlt(_localctx, 2);
				{
					setState(1423);
					match(COMMA);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
		JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_joinConstraintClause);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1426);
					match(ON);
					setState(1427);
					columnExprList();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1428);
					match(USING);
					setState(1429);
					match(LPAREN);
					setState(1430);
					columnExprList();
					setState(1431);
					match(RPAREN);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1433);
					match(USING);
					setState(1434);
					columnExprList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public List<RatioExprContext> ratioExpr() {
			return getRuleContexts(RatioExprContext.class);
		}
		public RatioExprContext ratioExpr(int i) {
			return getRuleContext(RatioExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1437);
				match(SAMPLE);
				setState(1438);
				ratioExpr();
				setState(1441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
					case 1:
					{
						setState(1439);
						match(OFFSET);
						setState(1440);
						ratioExpr();
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitExprContext extends ParserRuleContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_limitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1443);
				columnExpr(0);
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET || _la==COMMA) {
					{
						setState(1444);
						_la = _input.LA(1);
						if ( !(_la==OFFSET || _la==COMMA) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1445);
						columnExpr(0);
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprListContext extends ParserRuleContext {
		public List<OrderExprContext> orderExpr() {
			return getRuleContexts(OrderExprContext.class);
		}
		public OrderExprContext orderExpr(int i) {
			return getRuleContext(OrderExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public OrderExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprListContext orderExprList() throws RecognitionException {
		OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1448);
				orderExpr();
				setState(1453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1449);
								match(COMMA);
								setState(1450);
								orderExpr();
							}
						}
					}
					setState(1455);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1456);
				columnExpr(0);
				setState(1458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
					{
						setState(1457);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
				}
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
					{
						setState(1460);
						match(NULLS);
						setState(1461);
						_la = _input.LA(1);
						if ( !(_la==FIRST || _la==LAST) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
				}
				setState(1466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
					{
						setState(1464);
						match(COLLATE);
						setState(1465);
						match(STRING_LITERAL);
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatioExprContext extends ParserRuleContext {
		public List<NumberLiteralContext> numberLiteral() {
			return getRuleContexts(NumberLiteralContext.class);
		}
		public NumberLiteralContext numberLiteral(int i) {
			return getRuleContext(NumberLiteralContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public RatioExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRatioExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioExprContext ratioExpr() throws RecognitionException {
		RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ratioExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1468);
				numberLiteral();
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
					case 1:
					{
						setState(1469);
						match(SLASH);
						setState(1470);
						numberLiteral();
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingExprListContext extends ParserRuleContext {
		public List<SettingExprContext> settingExpr() {
			return getRuleContexts(SettingExprContext.class);
		}
		public SettingExprContext settingExpr(int i) {
			return getRuleContext(SettingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SettingExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprListContext settingExprList() throws RecognitionException {
		SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_settingExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1473);
				settingExpr();
				setState(1478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1474);
								match(COMMA);
								setState(1475);
								settingExpr();
							}
						}
					}
					setState(1480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SettingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprContext settingExpr() throws RecognitionException {
		SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_settingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1481);
				identifier();
				setState(1482);
				match(EQ_SINGLE);
				setState(1483);
				literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowExprContext extends ParserRuleContext {
		public WinPartitionByClauseContext winPartitionByClause() {
			return getRuleContext(WinPartitionByClauseContext.class,0);
		}
		public WinOrderByClauseContext winOrderByClause() {
			return getRuleContext(WinOrderByClauseContext.class,0);
		}
		public WinFrameClauseContext winFrameClause() {
			return getRuleContext(WinFrameClauseContext.class,0);
		}
		public WindowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWindowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowExprContext windowExpr() throws RecognitionException {
		WindowExprContext _localctx = new WindowExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_windowExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
						setState(1485);
						winPartitionByClause();
					}
				}

				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
						setState(1488);
						winOrderByClause();
					}
				}

				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
						setState(1491);
						winFrameClause();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WinPartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WinPartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winPartitionByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinPartitionByClauseContext winPartitionByClause() throws RecognitionException {
		WinPartitionByClauseContext _localctx = new WinPartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_winPartitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1494);
				match(PARTITION);
				setState(1495);
				match(BY);
				setState(1496);
				columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WinOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public WinOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winOrderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinOrderByClauseContext winOrderByClause() throws RecognitionException {
		WinOrderByClauseContext _localctx = new WinOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_winOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1498);
				match(ORDER);
				setState(1499);
				match(BY);
				setState(1500);
				orderExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WinFrameClauseContext extends ParserRuleContext {
		public WinFrameExtendContext winFrameExtend() {
			return getRuleContext(WinFrameExtendContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(ClickHouseParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public WinFrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinFrameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameClauseContext winFrameClause() throws RecognitionException {
		WinFrameClauseContext _localctx = new WinFrameClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_winFrameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1502);
				_la = _input.LA(1);
				if ( !(_la==RANGE || _la==ROWS) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1503);
				winFrameExtend();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WinFrameExtendContext extends ParserRuleContext {
		public WinFrameExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameExtend; }

		public WinFrameExtendContext() { }
		public void copyFrom(WinFrameExtendContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FrameStartContext extends WinFrameExtendContext {
		public WinFrameBoundContext winFrameBound() {
			return getRuleContext(WinFrameBoundContext.class,0);
		}
		public FrameStartContext(WinFrameExtendContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFrameStart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameBetweenContext extends WinFrameExtendContext {
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public List<WinFrameBoundContext> winFrameBound() {
			return getRuleContexts(WinFrameBoundContext.class);
		}
		public WinFrameBoundContext winFrameBound(int i) {
			return getRuleContext(WinFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public FrameBetweenContext(WinFrameExtendContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFrameBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameExtendContext winFrameExtend() throws RecognitionException {
		WinFrameExtendContext _localctx = new WinFrameExtendContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_winFrameExtend);
		try {
			setState(1511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case CURRENT:
				case INF:
				case NAN_SQL:
				case UNBOUNDED:
				case FLOATING_LITERAL:
				case OCTAL_LITERAL:
				case DECIMAL_LITERAL:
				case HEXADECIMAL_LITERAL:
				case DASH:
				case DOT:
				case PLUS:
					_localctx = new FrameStartContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1505);
					winFrameBound();
				}
				break;
				case BETWEEN:
					_localctx = new FrameBetweenContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1506);
					match(BETWEEN);
					setState(1507);
					winFrameBound();
					setState(1508);
					match(AND);
					setState(1509);
					winFrameBound();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WinFrameBoundContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(ClickHouseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(ClickHouseParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ClickHouseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(ClickHouseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(ClickHouseParser.FOLLOWING, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public WinFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWinFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameBoundContext winFrameBound() throws RecognitionException {
		WinFrameBoundContext _localctx = new WinFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_winFrameBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
					{
						setState(1513);
						match(CURRENT);
						setState(1514);
						match(ROW);
					}
					break;
					case 2:
					{
						setState(1515);
						match(UNBOUNDED);
						setState(1516);
						match(PRECEDING);
					}
					break;
					case 3:
					{
						setState(1517);
						match(UNBOUNDED);
						setState(1518);
						match(FOLLOWING);
					}
					break;
					case 4:
					{
						setState(1519);
						numberLiteral();
						setState(1520);
						match(PRECEDING);
					}
					break;
					case 5:
					{
						setState(1522);
						numberLiteral();
						setState(1523);
						match(FOLLOWING);
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1527);
				match(SET);
				setState(1528);
				settingExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowStmtContext extends ParserRuleContext {
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }

		public ShowStmtContext() { }
		public void copyFrom(ShowStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public ShowDatabasesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDatabasesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ShowCreateTableStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public ShowTablesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDictionariesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowDictionariesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDictionariesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_showStmt);
		int _la;
		try {
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					_localctx = new ShowCreateDatabaseStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1530);
					match(SHOW);
					setState(1531);
					match(CREATE);
					setState(1532);
					match(DATABASE);
					setState(1533);
					databaseIdentifier();
				}
				break;
				case 2:
					_localctx = new ShowCreateDictionaryStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1534);
					match(SHOW);
					setState(1535);
					match(CREATE);
					setState(1536);
					match(DICTIONARY);
					setState(1537);
					tableIdentifier();
				}
				break;
				case 3:
					_localctx = new ShowCreateTableStmtContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(1538);
					match(SHOW);
					setState(1539);
					match(CREATE);
					setState(1541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
						case 1:
						{
							setState(1540);
							match(TEMPORARY);
						}
						break;
					}
					setState(1544);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
						{
							setState(1543);
							match(TABLE);
						}
						break;
					}
					setState(1546);
					tableIdentifier();
				}
				break;
				case 4:
					_localctx = new ShowDatabasesStmtContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(1547);
					match(SHOW);
					setState(1548);
					match(DATABASES);
				}
				break;
				case 5:
					_localctx = new ShowDictionariesStmtContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(1549);
					match(SHOW);
					setState(1550);
					match(DICTIONARIES);
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
							setState(1551);
							match(FROM);
							setState(1552);
							databaseIdentifier();
						}
					}

				}
				break;
				case 6:
					_localctx = new ShowTablesStmtContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(1555);
					match(SHOW);
					setState(1557);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
							setState(1556);
							match(TEMPORARY);
						}
					}

					setState(1559);
					match(TABLES);
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM || _la==IN) {
						{
							setState(1560);
							_la = _input.LA(1);
							if ( !(_la==FROM || _la==IN) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1561);
							databaseIdentifier();
						}
					}

					setState(1567);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case LIKE:
						{
							setState(1564);
							match(LIKE);
							setState(1565);
							match(STRING_LITERAL);
						}
						break;
						case WHERE:
						{
							setState(1566);
							whereClause();
						}
						break;
						case EOF:
						case FORMAT:
						case INTO:
						case LIMIT:
						case RPAREN:
						case SEMICOLON:
							break;
						default:
							break;
					}
					setState(1570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIMIT) {
						{
							setState(1569);
							limitClause();
						}
					}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public SystemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSystemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStmtContext systemStmt() throws RecognitionException {
		SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_systemStmt);
		int _la;
		try {
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1574);
					match(SYSTEM);
					setState(1575);
					match(FLUSH);
					setState(1576);
					match(DISTRIBUTED);
					setState(1577);
					tableIdentifier();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1578);
					match(SYSTEM);
					setState(1579);
					match(FLUSH);
					setState(1580);
					match(LOGS);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1581);
					match(SYSTEM);
					setState(1582);
					match(RELOAD);
					setState(1583);
					match(DICTIONARIES);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1584);
					match(SYSTEM);
					setState(1585);
					match(RELOAD);
					setState(1586);
					match(DICTIONARY);
					setState(1587);
					tableIdentifier();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1588);
					match(SYSTEM);
					setState(1589);
					_la = _input.LA(1);
					if ( !(_la==START || _la==STOP) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1597);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case DISTRIBUTED:
						{
							setState(1590);
							match(DISTRIBUTED);
							setState(1591);
							match(SENDS);
						}
						break;
						case FETCHES:
						{
							setState(1592);
							match(FETCHES);
						}
						break;
						case MERGES:
						case TTL:
						{
							setState(1594);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==TTL) {
								{
									setState(1593);
									match(TTL);
								}
							}

							setState(1596);
							match(MERGES);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(1599);
					tableIdentifier();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1600);
					match(SYSTEM);
					setState(1601);
					_la = _input.LA(1);
					if ( !(_la==START || _la==STOP) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1602);
					match(REPLICATED);
					setState(1603);
					match(SENDS);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1604);
					match(SYSTEM);
					setState(1605);
					match(SYNC);
					setState(1606);
					match(REPLICA);
					setState(1607);
					tableIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_truncateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1610);
				match(TRUNCATE);
				setState(1612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
					{
						setState(1611);
						match(TEMPORARY);
					}
					break;
				}
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
					{
						setState(1614);
						match(TABLE);
					}
					break;
				}
				setState(1619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
					case 1:
					{
						setState(1617);
						match(IF);
						setState(1618);
						match(EXISTS);
					}
					break;
				}
				setState(1621);
				tableIdentifier();
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
						setState(1622);
						clusterClause();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1625);
				match(USE);
				setState(1626);
				databaseIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WatchStmtContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public WatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WatchStmtContext watchStmt() throws RecognitionException {
		WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_watchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1628);
				match(WATCH);
				setState(1629);
				tableIdentifier();
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EVENTS) {
					{
						setState(1630);
						match(EVENTS);
					}
				}

				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
						setState(1633);
						match(LIMIT);
						setState(1634);
						match(DECIMAL_LITERAL);
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnTypeExprContext extends ParserRuleContext {
		public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnTypeExpr; }

		public ColumnTypeExprContext() { }
		public void copyFrom(ColumnTypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
		ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_columnTypeExpr);
		int _la;
		try {
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					_localctx = new ColumnTypeExprSimpleContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1637);
					identifier();
				}
				break;
				case 2:
					_localctx = new ColumnTypeExprNestedContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1638);
					identifier();
					setState(1639);
					match(LPAREN);
					setState(1640);
					identifier();
					setState(1641);
					columnTypeExpr();
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
							{
								setState(1642);
								match(COMMA);
								setState(1643);
								identifier();
								setState(1644);
								columnTypeExpr();
							}
						}
						setState(1650);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1651);
					match(RPAREN);
				}
				break;
				case 3:
					_localctx = new ColumnTypeExprEnumContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(1653);
					identifier();
					setState(1654);
					match(LPAREN);
					setState(1655);
					enumValue();
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
							{
								setState(1656);
								match(COMMA);
								setState(1657);
								enumValue();
							}
						}
						setState(1662);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1663);
					match(RPAREN);
				}
				break;
				case 4:
					_localctx = new ColumnTypeExprComplexContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(1665);
					identifier();
					setState(1666);
					match(LPAREN);
					setState(1667);
					columnTypeExpr();
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
							{
								setState(1668);
								match(COMMA);
								setState(1669);
								columnTypeExpr();
							}
						}
						setState(1674);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1675);
					match(RPAREN);
				}
				break;
				case 5:
					_localctx = new ColumnTypeExprParamContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(1677);
					identifier();
					setState(1678);
					match(LPAREN);
					setState(1680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
						{
							setState(1679);
							columnExprList();
						}
					}

					setState(1682);
					match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExprListContext extends ParserRuleContext {
		public List<ColumnsExprContext> columnsExpr() {
			return getRuleContexts(ColumnsExprContext.class);
		}
		public ColumnsExprContext columnsExpr(int i) {
			return getRuleContext(ColumnsExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprListContext columnExprList() throws RecognitionException {
		ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_columnExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1686);
				columnsExpr();
				setState(1691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1687);
								match(COMMA);
								setState(1688);
								columnsExpr();
							}
						}
					}
					setState(1693);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsExprContext extends ParserRuleContext {
		public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsExpr; }

		public ColumnsExprContext() { }
		public void copyFrom(ColumnsExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnsExprColumnContext extends ColumnsExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnsExprColumnContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnsExprAsteriskContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnsExprSubqueryContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsExprContext columnsExpr() throws RecognitionException {
		ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_columnsExpr);
		int _la;
		try {
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					_localctx = new ColumnsExprAsteriskContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(1697);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
						{
							setState(1694);
							tableIdentifier();
							setState(1695);
							match(DOT);
						}
					}

					setState(1699);
					match(ASTERISK);
				}
				break;
				case 2:
					_localctx = new ColumnsExprSubqueryContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(1700);
					match(LPAREN);
					setState(1701);
					selectUnionStmt();
					setState(1702);
					match(RPAREN);
				}
				break;
				case 3:
					_localctx = new ColumnsExprColumnContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(1704);
					columnExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExprContext extends ParserRuleContext {
		public ColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpr; }

		public ColumnExprContext() { }
		public void copyFrom(ColumnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnExprTernaryOpContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode QUERY() { return getToken(ClickHouseParser.QUERY, 0); }
		public TerminalNode COLON() { return getToken(ClickHouseParser.COLON, 0); }
		public ColumnExprTernaryOpContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAliasContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnExprAliasContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprExtractContext extends ColumnExprContext {
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprExtractContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNegateContext extends ColumnExprContext {
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNegateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubqueryContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprSubqueryContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprLiteralContext extends ColumnExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnExprLiteralContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayContext extends ColumnExprContext {
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprArrayContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubstringContext extends ColumnExprContext {
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public ColumnExprSubstringContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCastContext extends ColumnExprContext {
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprCastContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprOrContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public ColumnExprOrContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence1Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ClickHouseParser.PERCENT, 0); }
		public ColumnExprPrecedence1Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence2Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public TerminalNode CONCAT() { return getToken(ClickHouseParser.CONCAT, 0); }
		public ColumnExprPrecedence2Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence3Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode EQ_DOUBLE() { return getToken(ClickHouseParser.EQ_DOUBLE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode NOT_EQ() { return getToken(ClickHouseParser.NOT_EQ, 0); }
		public TerminalNode LE() { return getToken(ClickHouseParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClickHouseParser.GE, 0); }
		public TerminalNode LT() { return getToken(ClickHouseParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClickHouseParser.GT, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprPrecedence3Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIntervalContext extends ColumnExprContext {
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColumnExprIntervalContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIsNullContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprIsNullContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprWinFunctionTargetContext extends ColumnExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OVER() { return getToken(ClickHouseParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprWinFunctionTargetContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprWinFunctionTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTrimContext extends ColumnExprContext {
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public ColumnExprTrimContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprTupleContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayAccessContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprArrayAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprBetweenContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprBetweenContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprParensContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprParensContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTimestampContext extends ColumnExprContext {
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprTimestampContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAndContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public ColumnExprAndContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleAccessContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public ColumnExprTupleAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTupleAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCaseContext extends ColumnExprContext {
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(ClickHouseParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(ClickHouseParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ClickHouseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ClickHouseParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public ColumnExprCaseContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprDateContext extends ColumnExprContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprDateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNotContext extends ColumnExprContext {
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNotContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprWinFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OVER() { return getToken(ClickHouseParser.OVER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public WindowExprContext windowExpr() {
			return getRuleContext(WindowExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprWinFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprWinFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIdentifierContext extends ColumnExprContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public ColumnExprIdentifierContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public ColumnArgListContext columnArgList() {
			return getRuleContext(ColumnArgListContext.class,0);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAsteriskContext extends ColumnExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnExprAsteriskContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprContext columnExpr() throws RecognitionException {
		return columnExpr(0);
	}

	private ColumnExprContext columnExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
		ColumnExprContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_columnExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
					case 1:
					{
						_localctx = new ColumnExprCaseContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(1708);
						match(CASE);
						setState(1710);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
							case 1:
							{
								setState(1709);
								columnExpr(0);
							}
							break;
						}
						setState(1717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(1712);
									match(WHEN);
									setState(1713);
									columnExpr(0);
									setState(1714);
									match(THEN);
									setState(1715);
									columnExpr(0);
								}
							}
							setState(1719);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WHEN );
						setState(1723);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ELSE) {
							{
								setState(1721);
								match(ELSE);
								setState(1722);
								columnExpr(0);
							}
						}

						setState(1725);
						match(END);
					}
					break;
					case 2:
					{
						_localctx = new ColumnExprCastContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1727);
						match(CAST);
						setState(1728);
						match(LPAREN);
						setState(1729);
						columnExpr(0);
						setState(1730);
						match(AS);
						setState(1731);
						columnTypeExpr();
						setState(1732);
						match(RPAREN);
					}
					break;
					case 3:
					{
						_localctx = new ColumnExprDateContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1734);
						match(DATE);
						setState(1735);
						match(STRING_LITERAL);
					}
					break;
					case 4:
					{
						_localctx = new ColumnExprExtractContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1736);
						match(EXTRACT);
						setState(1737);
						match(LPAREN);
						setState(1738);
						interval();
						setState(1739);
						match(FROM);
						setState(1740);
						columnExpr(0);
						setState(1741);
						match(RPAREN);
					}
					break;
					case 5:
					{
						_localctx = new ColumnExprIntervalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1743);
						match(INTERVAL);
						setState(1744);
						columnExpr(0);
						setState(1745);
						interval();
					}
					break;
					case 6:
					{
						_localctx = new ColumnExprSubstringContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1747);
						match(SUBSTRING);
						setState(1748);
						match(LPAREN);
						setState(1749);
						columnExpr(0);
						setState(1750);
						match(FROM);
						setState(1751);
						columnExpr(0);
						setState(1754);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==FOR) {
							{
								setState(1752);
								match(FOR);
								setState(1753);
								columnExpr(0);
							}
						}

						setState(1756);
						match(RPAREN);
					}
					break;
					case 7:
					{
						_localctx = new ColumnExprTimestampContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1758);
						match(TIMESTAMP);
						setState(1759);
						match(STRING_LITERAL);
					}
					break;
					case 8:
					{
						_localctx = new ColumnExprTrimContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1760);
						match(TRIM);
						setState(1761);
						match(LPAREN);
						setState(1762);
						_la = _input.LA(1);
						if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1763);
						match(STRING_LITERAL);
						setState(1764);
						match(FROM);
						setState(1765);
						columnExpr(0);
						setState(1766);
						match(RPAREN);
					}
					break;
					case 9:
					{
						_localctx = new ColumnExprWinFunctionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1768);
						identifier();
						{
							setState(1769);
							match(LPAREN);
							setState(1771);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
								{
									setState(1770);
									columnExprList();
								}
							}

							setState(1773);
							match(RPAREN);
						}
						setState(1775);
						match(OVER);
						setState(1776);
						match(LPAREN);
						setState(1777);
						windowExpr();
						setState(1778);
						match(RPAREN);
					}
					break;
					case 10:
					{
						_localctx = new ColumnExprWinFunctionTargetContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1780);
						identifier();
						{
							setState(1781);
							match(LPAREN);
							setState(1783);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
								{
									setState(1782);
									columnExprList();
								}
							}

							setState(1785);
							match(RPAREN);
						}
						setState(1787);
						match(OVER);
						setState(1788);
						identifier();
					}
					break;
					case 11:
					{
						_localctx = new ColumnExprFunctionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1790);
						identifier();
						setState(1796);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
							case 1:
							{
								setState(1791);
								match(LPAREN);
								setState(1793);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
									{
										setState(1792);
										columnExprList();
									}
								}

								setState(1795);
								match(RPAREN);
							}
							break;
						}
						setState(1798);
						match(LPAREN);
						setState(1800);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
							case 1:
							{
								setState(1799);
								match(DISTINCT);
							}
							break;
						}
						setState(1803);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
							{
								setState(1802);
								columnArgList();
							}
						}

						setState(1805);
						match(RPAREN);
					}
					break;
					case 12:
					{
						_localctx = new ColumnExprLiteralContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1807);
						literal();
					}
					break;
					case 13:
					{
						_localctx = new ColumnExprNegateContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1808);
						match(DASH);
						setState(1809);
						columnExpr(17);
					}
					break;
					case 14:
					{
						_localctx = new ColumnExprNotContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1810);
						match(NOT);
						setState(1811);
						columnExpr(12);
					}
					break;
					case 15:
					{
						_localctx = new ColumnExprAsteriskContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1815);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
							{
								setState(1812);
								tableIdentifier();
								setState(1813);
								match(DOT);
							}
						}

						setState(1817);
						match(ASTERISK);
					}
					break;
					case 16:
					{
						_localctx = new ColumnExprSubqueryContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1818);
						match(LPAREN);
						setState(1819);
						selectUnionStmt();
						setState(1820);
						match(RPAREN);
					}
					break;
					case 17:
					{
						_localctx = new ColumnExprParensContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1822);
						match(LPAREN);
						setState(1823);
						columnExpr(0);
						setState(1824);
						match(RPAREN);
					}
					break;
					case 18:
					{
						_localctx = new ColumnExprTupleContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1826);
						match(LPAREN);
						setState(1827);
						columnExprList();
						setState(1828);
						match(RPAREN);
					}
					break;
					case 19:
					{
						_localctx = new ColumnExprArrayContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1830);
						match(LBRACKET);
						setState(1832);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
							{
								setState(1831);
								columnExprList();
							}
						}

						setState(1834);
						match(RBRACKET);
					}
					break;
					case 20:
					{
						_localctx = new ColumnExprIdentifierContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1835);
						columnIdentifier();
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(1909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1907);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
								case 1:
								{
									_localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1838);
									if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
									setState(1839);
									_la = _input.LA(1);
									if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (ASTERISK - 199)) | (1L << (PERCENT - 199)) | (1L << (SLASH - 199)))) != 0)) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(1840);
									columnExpr(17);
								}
								break;
								case 2:
								{
									_localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1841);
									if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
									setState(1842);
									_la = _input.LA(1);
									if ( !(((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (CONCAT - 204)) | (1L << (DASH - 204)) | (1L << (PLUS - 204)))) != 0)) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(1843);
									columnExpr(16);
								}
								break;
								case 3:
								{
									_localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1844);
									if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
									setState(1863);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
										case 1:
										{
											setState(1845);
											match(EQ_DOUBLE);
										}
										break;
										case 2:
										{
											setState(1846);
											match(EQ_SINGLE);
										}
										break;
										case 3:
										{
											setState(1847);
											match(NOT_EQ);
										}
										break;
										case 4:
										{
											setState(1848);
											match(LE);
										}
										break;
										case 5:
										{
											setState(1849);
											match(GE);
										}
										break;
										case 6:
										{
											setState(1850);
											match(LT);
										}
										break;
										case 7:
										{
											setState(1851);
											match(GT);
										}
										break;
										case 8:
										{
											setState(1853);
											_errHandler.sync(this);
											_la = _input.LA(1);
											if (_la==GLOBAL) {
												{
													setState(1852);
													match(GLOBAL);
												}
											}

											setState(1856);
											_errHandler.sync(this);
											_la = _input.LA(1);
											if (_la==NOT) {
												{
													setState(1855);
													match(NOT);
												}
											}

											setState(1858);
											match(IN);
										}
										break;
										case 9:
										{
											setState(1860);
											_errHandler.sync(this);
											_la = _input.LA(1);
											if (_la==NOT) {
												{
													setState(1859);
													match(NOT);
												}
											}

											setState(1862);
											_la = _input.LA(1);
											if ( !(_la==ILIKE || _la==LIKE) ) {
												_errHandler.recoverInline(this);
											}
											else {
												if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
												_errHandler.reportMatch(this);
												consume();
											}
										}
										break;
									}
									setState(1865);
									columnExpr(15);
								}
								break;
								case 4:
								{
									_localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1866);
									if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(1867);
									match(AND);
									setState(1868);
									columnExpr(12);
								}
								break;
								case 5:
								{
									_localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1869);
									if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(1870);
									match(OR);
									setState(1871);
									columnExpr(11);
								}
								break;
								case 6:
								{
									_localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1872);
									if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
									setState(1874);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NOT) {
										{
											setState(1873);
											match(NOT);
										}
									}

									setState(1876);
									match(BETWEEN);
									setState(1877);
									columnExpr(0);
									setState(1878);
									match(AND);
									setState(1879);
									columnExpr(10);
								}
								break;
								case 7:
								{
									_localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1881);
									if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(1882);
									match(QUERY);
									setState(1883);
									columnExpr(0);
									setState(1884);
									match(COLON);
									setState(1885);
									columnExpr(8);
								}
								break;
								case 8:
								{
									_localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1887);
									if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
									setState(1888);
									match(LBRACKET);
									setState(1889);
									columnExpr(0);
									setState(1890);
									match(RBRACKET);
								}
								break;
								case 9:
								{
									_localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1892);
									if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
									setState(1893);
									match(DOT);
									setState(1894);
									match(DECIMAL_LITERAL);
								}
								break;
								case 10:
								{
									_localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1895);
									if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
									setState(1896);
									match(IS);
									setState(1898);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NOT) {
										{
											setState(1897);
											match(NOT);
										}
									}

									setState(1900);
									match(NULL_SQL);
								}
								break;
								case 11:
								{
									_localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
									setState(1901);
									if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(1905);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
										case DATE:
										case FIRST:
										case ID:
										case KEY:
										case IDENTIFIER:
										{
											setState(1902);
											alias();
										}
										break;
										case AS:
										{
											setState(1903);
											match(AS);
											setState(1904);
											identifier();
										}
										break;
										default:
											throw new NoViableAltException(this);
									}
								}
								break;
							}
						}
					}
					setState(1911);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ColumnArgListContext extends ParserRuleContext {
		public List<ColumnArgExprContext> columnArgExpr() {
			return getRuleContexts(ColumnArgExprContext.class);
		}
		public ColumnArgExprContext columnArgExpr(int i) {
			return getRuleContext(ColumnArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgListContext columnArgList() throws RecognitionException {
		ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_columnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1912);
				columnArgExpr();
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1913);
							match(COMMA);
							setState(1914);
							columnArgExpr();
						}
					}
					setState(1919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnArgExprContext extends ParserRuleContext {
		public ColumnLambdaExprContext columnLambdaExpr() {
			return getRuleContext(ColumnLambdaExprContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
		ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_columnArgExpr);
		try {
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1920);
					columnLambdaExpr();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1921);
					columnExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnLambdaExprContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ClickHouseParser.ARROW, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLambdaExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
		ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_columnLambdaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1943);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LPAREN:
					{
						setState(1924);
						match(LPAREN);
						setState(1925);
						identifier();
						setState(1930);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
								{
									setState(1926);
									match(COMMA);
									setState(1927);
									identifier();
								}
							}
							setState(1932);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1933);
						match(RPAREN);
					}
					break;
					case AFTER:
					case ALIAS:
					case ALL:
					case ALTER:
					case AND:
					case ANTI:
					case ANY:
					case ARRAY:
					case AS:
					case ASCENDING:
					case ASOF:
					case AST:
					case ASYNC:
					case ATTACH:
					case BETWEEN:
					case BOTH:
					case BY:
					case CASE:
					case CAST:
					case CHECK:
					case CLEAR:
					case CLUSTER:
					case CODEC:
					case COLLATE:
					case COLUMN:
					case COMMENT:
					case CONSTRAINT:
					case CREATE:
					case CROSS:
					case CUBE:
					case CURRENT:
					case DATABASE:
					case DATABASES:
					case DATE:
					case DAY:
					case DEDUPLICATE:
					case DEFAULT:
					case DELAY:
					case DELETE:
					case DESC:
					case DESCENDING:
					case DESCRIBE:
					case DETACH:
					case DICTIONARIES:
					case DICTIONARY:
					case DISK:
					case DISTINCT:
					case DISTRIBUTED:
					case DROP:
					case ELSE:
					case END:
					case ENGINE:
					case EVENTS:
					case EXISTS:
					case EXPLAIN:
					case EXPRESSION:
					case EXTRACT:
					case FETCHES:
					case FINAL:
					case FIRST:
					case FLUSH:
					case FOLLOWING:
					case FOR:
					case FORMAT:
					case FREEZE:
					case FROM:
					case FULL:
					case FUNCTION:
					case GLOBAL:
					case GRANULARITY:
					case GROUP:
					case HAVING:
					case HIERARCHICAL:
					case HOUR:
					case ID:
					case IF:
					case ILIKE:
					case IN:
					case INDEX:
					case INJECTIVE:
					case INNER:
					case INSERT:
					case INTERVAL:
					case INTO:
					case IS:
					case IS_OBJECT_ID:
					case JOIN:
					case KEY:
					case KILL:
					case LAST:
					case LAYOUT:
					case LEADING:
					case LEFT:
					case LIFETIME:
					case LIKE:
					case LIMIT:
					case LIVE:
					case LOCAL:
					case LOGS:
					case MATERIALIZE:
					case MATERIALIZED:
					case MAX:
					case MERGES:
					case MIN:
					case MINUTE:
					case MODIFY:
					case MONTH:
					case MOVE:
					case MUTATION:
					case NO:
					case NOT:
					case NULLS:
					case OFFSET:
					case ON:
					case OPTIMIZE:
					case OR:
					case ORDER:
					case OUTER:
					case OUTFILE:
					case OVER:
					case PARTITION:
					case POPULATE:
					case PRECEDING:
					case PREWHERE:
					case PRIMARY:
					case QUARTER:
					case RANGE:
					case RELOAD:
					case REMOVE:
					case RENAME:
					case REPLACE:
					case REPLICA:
					case REPLICATED:
					case RIGHT:
					case ROLLUP:
					case ROW:
					case ROWS:
					case SAMPLE:
					case SECOND:
					case SELECT:
					case SEMI:
					case SENDS:
					case SET:
					case SETTINGS:
					case SHOW:
					case SOURCE:
					case START:
					case STOP:
					case SUBSTRING:
					case SYNC:
					case SYNTAX:
					case SYSTEM:
					case TABLE:
					case TABLES:
					case TEMPORARY:
					case TEST:
					case THEN:
					case TIES:
					case TIMEOUT:
					case TIMESTAMP:
					case TO:
					case TOP:
					case TOTALS:
					case TRAILING:
					case TRIM:
					case TRUNCATE:
					case TTL:
					case TYPE:
					case UNBOUNDED:
					case UNION:
					case UPDATE:
					case USE:
					case USING:
					case UUID:
					case VALUES:
					case VIEW:
					case VOLUME:
					case WATCH:
					case WEEK:
					case WHEN:
					case WHERE:
					case WINDOW:
					case WITH:
					case YEAR:
					case JSON_FALSE:
					case JSON_TRUE:
					case IDENTIFIER:
					{
						setState(1935);
						identifier();
						setState(1940);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
								{
									setState(1936);
									match(COMMA);
									setState(1937);
									identifier();
								}
							}
							setState(1942);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(1945);
				match(ARROW);
				setState(1946);
				columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnIdentifierContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
					case 1:
					{
						setState(1948);
						tableIdentifier();
						setState(1949);
						match(DOT);
					}
					break;
				}
				setState(1953);
				nestedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNestedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nestedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1955);
				identifier();
				setState(1958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
					case 1:
					{
						setState(1956);
						match(DOT);
						setState(1957);
						identifier();
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }

		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableExprIdentifierContext extends TableExprContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableExprIdentifierContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprSubqueryContext extends TableExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableExprSubqueryContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprAliasContext extends TableExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableExprAliasContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprFunctionContext extends TableExprContext {
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TableExprFunctionContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		return tableExpr(0);
	}

	private TableExprContext tableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
		TableExprContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_tableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
					{
						_localctx = new TableExprIdentifierContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(1961);
						tableIdentifier();
					}
					break;
					case 2:
					{
						_localctx = new TableExprFunctionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1962);
						tableFunctionExpr();
					}
					break;
					case 3:
					{
						_localctx = new TableExprSubqueryContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(1963);
						match(LPAREN);
						setState(1964);
						selectUnionStmt();
						setState(1965);
						match(RPAREN);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(1977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
								setState(1969);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(1973);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
									case DATE:
									case FIRST:
									case ID:
									case KEY:
									case IDENTIFIER:
									{
										setState(1970);
										alias();
									}
									break;
									case AS:
									{
										setState(1971);
										match(AS);
										setState(1972);
										identifier();
									}
									break;
									default:
										throw new NoViableAltException(this);
								}
							}
						}
					}
					setState(1979);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TableFunctionExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableArgListContext tableArgList() {
			return getRuleContext(TableArgListContext.class,0);
		}
		public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
		TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_tableFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1980);
				identifier();
				setState(1981);
				match(LPAREN);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
						setState(1982);
						tableArgList();
					}
				}

				setState(1985);
				match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
					case 1:
					{
						setState(1987);
						databaseIdentifier();
						setState(1988);
						match(DOT);
					}
					break;
				}
				setState(1992);
				identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableArgListContext extends ParserRuleContext {
		public List<TableArgExprContext> tableArgExpr() {
			return getRuleContexts(TableArgExprContext.class);
		}
		public TableArgExprContext tableArgExpr(int i) {
			return getRuleContext(TableArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TableArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgListContext tableArgList() throws RecognitionException {
		TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tableArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1994);
				tableArgExpr();
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1995);
							match(COMMA);
							setState(1996);
							tableArgExpr();
						}
					}
					setState(2001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableArgExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TableArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgExprContext tableArgExpr() throws RecognitionException {
		TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tableArgExpr);
		try {
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2002);
					nestedIdentifier();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2003);
					tableFunctionExpr();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2004);
					literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDatabaseIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
		DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_databaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2007);
				identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingLiteralContext extends ParserRuleContext {
		public TerminalNode FLOATING_LITERAL() { return getToken(ClickHouseParser.FLOATING_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFloatingLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
		FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_floatingLiteral);
		int _la;
		try {
			setState(2017);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case FLOATING_LITERAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(2009);
					match(FLOATING_LITERAL);
				}
				break;
				case DOT:
					enterOuterAlt(_localctx, 2);
				{
					setState(2010);
					match(DOT);
					setState(2011);
					_la = _input.LA(1);
					if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
				}
				break;
				case DECIMAL_LITERAL:
					enterOuterAlt(_localctx, 3);
				{
					setState(2012);
					match(DECIMAL_LITERAL);
					setState(2013);
					match(DOT);
					setState(2015);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
						case 1:
						{
							setState(2014);
							_la = _input.LA(1);
							if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
						break;
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public FloatingLiteralContext floatingLiteral() {
			return getRuleContext(FloatingLiteralContext.class,0);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(ClickHouseParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode INF() { return getToken(ClickHouseParser.INF, 0); }
		public TerminalNode NAN_SQL() { return getToken(ClickHouseParser.NAN_SQL, 0); }
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH || _la==PLUS) {
					{
						setState(2019);
						_la = _input.LA(1);
						if ( !(_la==DASH || _la==PLUS) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
				}

				setState(2028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
					case 1:
					{
						setState(2022);
						floatingLiteral();
					}
					break;
					case 2:
					{
						setState(2023);
						match(OCTAL_LITERAL);
					}
					break;
					case 3:
					{
						setState(2024);
						match(DECIMAL_LITERAL);
					}
					break;
					case 4:
					{
						setState(2025);
						match(HEXADECIMAL_LITERAL);
					}
					break;
					case 5:
					{
						setState(2026);
						match(INF);
					}
					break;
					case 6:
					{
						setState(2027);
						match(NAN_SQL);
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_literal);
		try {
			setState(2033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case INF:
				case NAN_SQL:
				case FLOATING_LITERAL:
				case OCTAL_LITERAL:
				case DECIMAL_LITERAL:
				case HEXADECIMAL_LITERAL:
				case DASH:
				case DOT:
				case PLUS:
					enterOuterAlt(_localctx, 1);
				{
					setState(2030);
					numberLiteral();
				}
				break;
				case STRING_LITERAL:
					enterOuterAlt(_localctx, 2);
				{
					setState(2031);
					match(STRING_LITERAL);
				}
				break;
				case NULL_SQL:
					enterOuterAlt(_localctx, 3);
				{
					setState(2032);
					match(NULL_SQL);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(ClickHouseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(ClickHouseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(ClickHouseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(ClickHouseParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(ClickHouseParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(ClickHouseParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(ClickHouseParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(ClickHouseParser.YEAR, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2035);
				_la = _input.LA(1);
				if ( !(_la==DAY || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (HOUR - 75)) | (1L << (MINUTE - 75)) | (1L << (MONTH - 75)) | (1L << (QUARTER - 75)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SECOND - 144)) | (1L << (WEEK - 144)) | (1L << (YEAR - 144)))) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public TerminalNode AST() { return getToken(ClickHouseParser.AST, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(ClickHouseParser.CURRENT, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode EXPRESSION() { return getToken(ClickHouseParser.EXPRESSION, 0); }
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public TerminalNode FOLLOWING() { return getToken(ClickHouseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(ClickHouseParser.HIERARCHICAL, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TerminalNode INJECTIVE() { return getToken(ClickHouseParser.INJECTIVE, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode IS_OBJECT_ID() { return getToken(ClickHouseParser.IS_OBJECT_ID, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode JSON_FALSE() { return getToken(ClickHouseParser.JSON_FALSE, 0); }
		public TerminalNode JSON_TRUE() { return getToken(ClickHouseParser.JSON_TRUE, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseParser.MATERIALIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode OVER() { return getToken(ClickHouseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public TerminalNode PRECEDING() { return getToken(ClickHouseParser.PRECEDING, 0); }
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(ClickHouseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(ClickHouseParser.ROWS, 0); }
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public TerminalNode THEN() { return getToken(ClickHouseParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ClickHouseParser.UNBOUNDED, 0); }
		public TerminalNode UNION() { return getToken(ClickHouseParser.UNION, 0); }
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TerminalNode WHEN() { return getToken(ClickHouseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(ClickHouseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2037);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordForAliasContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordForAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeywordForAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
		KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_keywordForAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2039);
				_la = _input.LA(1);
				if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (DATE - 35)) | (1L << (FIRST - 35)) | (1L << (ID - 35)) | (1L << (KEY - 35)))) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public KeywordForAliasContext keywordForAlias() {
			return getRuleContext(KeywordForAliasContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_alias);
		try {
			setState(2043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(2041);
					match(IDENTIFIER);
				}
				break;
				case DATE:
				case FIRST:
				case ID:
				case KEY:
					enterOuterAlt(_localctx, 2);
				{
					setState(2042);
					keywordForAlias();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_identifier);
		try {
			setState(2048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(2045);
					match(IDENTIFIER);
				}
				break;
				case DAY:
				case HOUR:
				case MINUTE:
				case MONTH:
				case QUARTER:
				case SECOND:
				case WEEK:
				case YEAR:
					enterOuterAlt(_localctx, 2);
				{
					setState(2046);
					interval();
				}
				break;
				case AFTER:
				case ALIAS:
				case ALL:
				case ALTER:
				case AND:
				case ANTI:
				case ANY:
				case ARRAY:
				case AS:
				case ASCENDING:
				case ASOF:
				case AST:
				case ASYNC:
				case ATTACH:
				case BETWEEN:
				case BOTH:
				case BY:
				case CASE:
				case CAST:
				case CHECK:
				case CLEAR:
				case CLUSTER:
				case CODEC:
				case COLLATE:
				case COLUMN:
				case COMMENT:
				case CONSTRAINT:
				case CREATE:
				case CROSS:
				case CUBE:
				case CURRENT:
				case DATABASE:
				case DATABASES:
				case DATE:
				case DEDUPLICATE:
				case DEFAULT:
				case DELAY:
				case DELETE:
				case DESC:
				case DESCENDING:
				case DESCRIBE:
				case DETACH:
				case DICTIONARIES:
				case DICTIONARY:
				case DISK:
				case DISTINCT:
				case DISTRIBUTED:
				case DROP:
				case ELSE:
				case END:
				case ENGINE:
				case EVENTS:
				case EXISTS:
				case EXPLAIN:
				case EXPRESSION:
				case EXTRACT:
				case FETCHES:
				case FINAL:
				case FIRST:
				case FLUSH:
				case FOLLOWING:
				case FOR:
				case FORMAT:
				case FREEZE:
				case FROM:
				case FULL:
				case FUNCTION:
				case GLOBAL:
				case GRANULARITY:
				case GROUP:
				case HAVING:
				case HIERARCHICAL:
				case ID:
				case IF:
				case ILIKE:
				case IN:
				case INDEX:
				case INJECTIVE:
				case INNER:
				case INSERT:
				case INTERVAL:
				case INTO:
				case IS:
				case IS_OBJECT_ID:
				case JOIN:
				case KEY:
				case KILL:
				case LAST:
				case LAYOUT:
				case LEADING:
				case LEFT:
				case LIFETIME:
				case LIKE:
				case LIMIT:
				case LIVE:
				case LOCAL:
				case LOGS:
				case MATERIALIZE:
				case MATERIALIZED:
				case MAX:
				case MERGES:
				case MIN:
				case MODIFY:
				case MOVE:
				case MUTATION:
				case NO:
				case NOT:
				case NULLS:
				case OFFSET:
				case ON:
				case OPTIMIZE:
				case OR:
				case ORDER:
				case OUTER:
				case OUTFILE:
				case OVER:
				case PARTITION:
				case POPULATE:
				case PRECEDING:
				case PREWHERE:
				case PRIMARY:
				case RANGE:
				case RELOAD:
				case REMOVE:
				case RENAME:
				case REPLACE:
				case REPLICA:
				case REPLICATED:
				case RIGHT:
				case ROLLUP:
				case ROW:
				case ROWS:
				case SAMPLE:
				case SELECT:
				case SEMI:
				case SENDS:
				case SET:
				case SETTINGS:
				case SHOW:
				case SOURCE:
				case START:
				case STOP:
				case SUBSTRING:
				case SYNC:
				case SYNTAX:
				case SYSTEM:
				case TABLE:
				case TABLES:
				case TEMPORARY:
				case TEST:
				case THEN:
				case TIES:
				case TIMEOUT:
				case TIMESTAMP:
				case TO:
				case TOP:
				case TOTALS:
				case TRAILING:
				case TRIM:
				case TRUNCATE:
				case TTL:
				case TYPE:
				case UNBOUNDED:
				case UNION:
				case UPDATE:
				case USE:
				case USING:
				case UUID:
				case VALUES:
				case VIEW:
				case VOLUME:
				case WATCH:
				case WHEN:
				case WHERE:
				case WINDOW:
				case WITH:
				case JSON_FALSE:
				case JSON_TRUE:
					enterOuterAlt(_localctx, 3);
				{
					setState(2047);
					keyword();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrNullContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrNull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifierOrNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
		IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_identifierOrNull);
		try {
			setState(2052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AFTER:
				case ALIAS:
				case ALL:
				case ALTER:
				case AND:
				case ANTI:
				case ANY:
				case ARRAY:
				case AS:
				case ASCENDING:
				case ASOF:
				case AST:
				case ASYNC:
				case ATTACH:
				case BETWEEN:
				case BOTH:
				case BY:
				case CASE:
				case CAST:
				case CHECK:
				case CLEAR:
				case CLUSTER:
				case CODEC:
				case COLLATE:
				case COLUMN:
				case COMMENT:
				case CONSTRAINT:
				case CREATE:
				case CROSS:
				case CUBE:
				case CURRENT:
				case DATABASE:
				case DATABASES:
				case DATE:
				case DAY:
				case DEDUPLICATE:
				case DEFAULT:
				case DELAY:
				case DELETE:
				case DESC:
				case DESCENDING:
				case DESCRIBE:
				case DETACH:
				case DICTIONARIES:
				case DICTIONARY:
				case DISK:
				case DISTINCT:
				case DISTRIBUTED:
				case DROP:
				case ELSE:
				case END:
				case ENGINE:
				case EVENTS:
				case EXISTS:
				case EXPLAIN:
				case EXPRESSION:
				case EXTRACT:
				case FETCHES:
				case FINAL:
				case FIRST:
				case FLUSH:
				case FOLLOWING:
				case FOR:
				case FORMAT:
				case FREEZE:
				case FROM:
				case FULL:
				case FUNCTION:
				case GLOBAL:
				case GRANULARITY:
				case GROUP:
				case HAVING:
				case HIERARCHICAL:
				case HOUR:
				case ID:
				case IF:
				case ILIKE:
				case IN:
				case INDEX:
				case INJECTIVE:
				case INNER:
				case INSERT:
				case INTERVAL:
				case INTO:
				case IS:
				case IS_OBJECT_ID:
				case JOIN:
				case KEY:
				case KILL:
				case LAST:
				case LAYOUT:
				case LEADING:
				case LEFT:
				case LIFETIME:
				case LIKE:
				case LIMIT:
				case LIVE:
				case LOCAL:
				case LOGS:
				case MATERIALIZE:
				case MATERIALIZED:
				case MAX:
				case MERGES:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MOVE:
				case MUTATION:
				case NO:
				case NOT:
				case NULLS:
				case OFFSET:
				case ON:
				case OPTIMIZE:
				case OR:
				case ORDER:
				case OUTER:
				case OUTFILE:
				case OVER:
				case PARTITION:
				case POPULATE:
				case PRECEDING:
				case PREWHERE:
				case PRIMARY:
				case QUARTER:
				case RANGE:
				case RELOAD:
				case REMOVE:
				case RENAME:
				case REPLACE:
				case REPLICA:
				case REPLICATED:
				case RIGHT:
				case ROLLUP:
				case ROW:
				case ROWS:
				case SAMPLE:
				case SECOND:
				case SELECT:
				case SEMI:
				case SENDS:
				case SET:
				case SETTINGS:
				case SHOW:
				case SOURCE:
				case START:
				case STOP:
				case SUBSTRING:
				case SYNC:
				case SYNTAX:
				case SYSTEM:
				case TABLE:
				case TABLES:
				case TEMPORARY:
				case TEST:
				case THEN:
				case TIES:
				case TIMEOUT:
				case TIMESTAMP:
				case TO:
				case TOP:
				case TOTALS:
				case TRAILING:
				case TRIM:
				case TRUNCATE:
				case TTL:
				case TYPE:
				case UNBOUNDED:
				case UNION:
				case UPDATE:
				case USE:
				case USING:
				case UUID:
				case VALUES:
				case VIEW:
				case VOLUME:
				case WATCH:
				case WEEK:
				case WHEN:
				case WHERE:
				case WINDOW:
				case WITH:
				case YEAR:
				case JSON_FALSE:
				case JSON_TRUE:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(2050);
					identifier();
				}
				break;
				case NULL_SQL:
					enterOuterAlt(_localctx, 2);
				{
					setState(2051);
					match(NULL_SQL);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2054);
				match(STRING_LITERAL);
				setState(2055);
				match(EQ_SINGLE);
				setState(2056);
				numberLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 15:
				return dictionaryAttrDfnt_sempred((DictionaryAttrDfntContext)_localctx, predIndex);
			case 16:
				return dictionaryEngineClause_sempred((DictionaryEngineClauseContext)_localctx, predIndex);
			case 29:
				return engineClause_sempred((EngineClauseContext)_localctx, predIndex);
			case 71:
				return joinExpr_sempred((JoinExprContext)_localctx, predIndex);
			case 97:
				return columnExpr_sempred((ColumnExprContext)_localctx, predIndex);
			case 103:
				return tableExpr_sempred((TableExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dictionaryAttrDfnt_sempred(DictionaryAttrDfntContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return !_localctx.attrs.contains("default");
			case 1:
				return !_localctx.attrs.contains("expression");
			case 2:
				return !_localctx.attrs.contains("hierarchical");
			case 3:
				return !_localctx.attrs.contains("injective");
			case 4:
				return !_localctx.attrs.contains("is_object_id");
		}
		return true;
	}
	private boolean dictionaryEngineClause_sempred(DictionaryEngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
			case 5:
				return !_localctx.clauses.contains("source");
			case 6:
				return !_localctx.clauses.contains("lifetime");
			case 7:
				return !_localctx.clauses.contains("layout");
			case 8:
				return !_localctx.clauses.contains("range");
			case 9:
				return !_localctx.clauses.contains("settings");
		}
		return true;
	}
	private boolean engineClause_sempred(EngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
			case 10:
				return !_localctx.clauses.contains("orderByClause");
			case 11:
				return !_localctx.clauses.contains("partitionByClause");
			case 12:
				return !_localctx.clauses.contains("primaryKeyClause");
			case 13:
				return !_localctx.clauses.contains("sampleByClause");
			case 14:
				return !_localctx.clauses.contains("ttlClause");
			case 15:
				return !_localctx.clauses.contains("settingsClause");
		}
		return true;
	}
	private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 16:
				return precpred(_ctx, 3);
			case 17:
				return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 18:
				return precpred(_ctx, 16);
			case 19:
				return precpred(_ctx, 15);
			case 20:
				return precpred(_ctx, 14);
			case 21:
				return precpred(_ctx, 11);
			case 22:
				return precpred(_ctx, 10);
			case 23:
				return precpred(_ctx, 9);
			case 24:
				return precpred(_ctx, 8);
			case 25:
				return precpred(_ctx, 19);
			case 26:
				return precpred(_ctx, 18);
			case 27:
				return precpred(_ctx, 13);
			case 28:
				return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 29:
				return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e8\u080d\4\2\t"+
					"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
					"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
					"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
					"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
					"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
					"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
					"w\tw\4x\tx\3\2\3\2\3\2\3\2\5\2\u00f5\n\2\3\2\3\2\5\2\u00f9\n\2\3\2\5\2"+
					"\u00fc\n\2\3\2\5\2\u00ff\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
					"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0114\n\3\3\3\5\3\u0117\n\3\3\4"+
					"\3\4\3\4\3\4\7\4\u011d\n\4\f\4\16\4\u0120\13\4\3\5\3\5\5\5\u0124\n\5\3"+
					"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u012f\n\6\f\6\16\6\u0132\13\6\3"+
					"\6\3\6\3\7\3\7\3\7\3\7\5\7\u013a\n\7\3\7\3\7\3\7\7\7\u013f\n\7\f\7\16"+
					"\7\u0142\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u0149\n\b\3\b\3\b\3\b\5\b\u014e"+
					"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0155\n\b\3\b\3\b\3\b\5\b\u015a\n\b\3\b\3"+
					"\b\3\b\3\b\3\b\5\b\u0161\n\b\3\b\3\b\3\b\5\b\u0166\n\b\3\b\3\b\3\b\3\b"+
					"\5\b\u016c\n\b\3\b\3\b\3\b\3\b\5\b\u0172\n\b\3\b\3\b\3\b\5\b\u0177\n\b"+
					"\3\b\3\b\3\b\3\b\5\b\u017d\n\b\3\b\3\b\3\b\5\b\u0182\n\b\3\b\3\b\3\b\3"+
					"\b\5\b\u0188\n\b\3\b\3\b\3\b\5\b\u018d\n\b\3\b\3\b\3\b\3\b\5\b\u0193\n"+
					"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01a1\n\b\3\b\3"+
					"\b\3\b\3\b\3\b\5\b\u01a8\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01af\n\b\3\b\3\b"+
					"\3\b\3\b\3\b\5\b\u01b6\n\b\3\b\3\b\3\b\3\b\5\b\u01bc\n\b\3\b\3\b\3\b\5"+
					"\b\u01c1\n\b\3\b\3\b\3\b\3\b\5\b\u01c7\n\b\3\b\3\b\3\b\5\b\u01cc\n\b\3"+
					"\b\3\b\3\b\3\b\5\b\u01d2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01db\n\b"+
					"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e5\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
					"\3\b\3\b\5\b\u01ef\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
					"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0203\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u020b"+
					"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u021a\n\b"+
					"\3\t\3\t\3\t\7\t\u021f\n\t\f\t\16\t\u0222\13\t\3\n\3\n\3\n\3\n\3\13\3"+
					"\13\3\f\3\f\3\f\3\f\3\f\5\f\u022f\n\f\3\r\3\r\3\r\3\r\5\r\u0235\n\r\3"+
					"\16\3\16\3\16\3\16\5\16\u023b\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0242"+
					"\n\17\3\17\3\17\5\17\u0246\n\17\3\17\5\17\u0249\n\17\3\17\3\17\3\17\3"+
					"\17\5\17\u024f\n\17\3\17\5\17\u0252\n\17\3\17\3\17\3\17\3\17\5\17\u0258"+
					"\n\17\3\17\3\17\5\17\u025c\n\17\3\17\5\17\u025f\n\17\3\17\3\17\3\17\3"+
					"\17\3\17\3\17\3\17\3\17\3\17\5\17\u026a\n\17\3\17\3\17\5\17\u026e\n\17"+
					"\3\17\5\17\u0271\n\17\3\17\3\17\3\17\5\17\u0276\n\17\5\17\u0278\n\17\3"+
					"\17\5\17\u027b\n\17\3\17\5\17\u027e\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
					"\3\17\3\17\5\17\u0288\n\17\3\17\3\17\5\17\u028c\n\17\3\17\5\17\u028f\n"+
					"\17\3\17\5\17\u0292\n\17\3\17\3\17\3\17\5\17\u0297\n\17\5\17\u0299\n\17"+
					"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02a1\n\17\3\17\5\17\u02a4\n\17\3"+
					"\17\5\17\u02a7\n\17\3\17\3\17\3\17\3\17\5\17\u02ad\n\17\3\17\3\17\5\17"+
					"\u02b1\n\17\3\17\5\17\u02b4\n\17\3\17\5\17\u02b7\n\17\3\17\5\17\u02ba"+
					"\n\17\3\17\5\17\u02bd\n\17\3\17\3\17\3\17\5\17\u02c2\n\17\3\17\3\17\3"+
					"\17\3\17\5\17\u02c8\n\17\3\17\3\17\5\17\u02cc\n\17\3\17\5\17\u02cf\n\17"+
					"\3\17\5\17\u02d2\n\17\3\17\3\17\5\17\u02d6\n\17\3\20\3\20\3\20\3\20\7"+
					"\20\u02dc\n\20\f\20\16\20\u02df\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
					"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
					"\21\3\21\3\21\7\21\u02f8\n\21\f\21\16\21\u02fb\13\21\3\22\5\22\u02fe\n"+
					"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
					"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0314\n\22\f\22\16\22\u0317\13"+
					"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0321\n\24\3\24\5\24"+
					"\u0324\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u032b\n\25\f\25\16\25\u032e"+
					"\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
					"\3\26\5\26\u033e\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0347\n"+
					"\27\f\27\16\27\u034a\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
					"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u035b\n\30\3\30\3\30\3\31\3\31\3\31"+
					"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0368\n\32\3\33\3\33\3\33\3\34\3\34"+
					"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0377\n\36\f\36\16\36\u037a"+
					"\13\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0382\n\36\3\37\3\37\3\37\3"+
					"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
					"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u039d\n\37\f\37\16\37\u03a0"+
					"\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u03b2\n"+
					"#\f#\16#\u03b5\13#\3$\3$\5$\u03b9\n$\3$\3$\3$\5$\u03be\n$\3$\5$\u03c1"+
					"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03cd\n%\3&\3&\3&\5&\u03d2\n&\3&"+
					"\3&\5&\u03d6\n&\3&\5&\u03d9\n&\3&\3&\5&\u03dd\n&\3&\3&\5&\u03e1\n&\3&"+
					"\3&\3&\5&\u03e6\n&\3&\5&\u03e9\n&\3&\3&\5&\u03ed\n&\5&\u03ef\n&\3\'\3"+
					"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\7*\u0403\n*\f*\16"+
					"*\u0406\13*\3*\3*\3+\3+\3+\5+\u040d\n+\3+\5+\u0410\n+\3,\3,\3,\3,\3,\3"+
					",\3,\3,\5,\u041a\n,\3-\3-\5-\u041e\n-\3-\3-\3.\3.\3.\3.\5.\u0426\n.\3"+
					".\3.\5.\u042a\n.\3.\3.\3.\5.\u042f\n.\3.\3.\5.\u0433\n.\3.\3.\5.\u0437"+
					"\n.\3.\3.\5.\u043b\n.\3.\3.\5.\u043f\n.\5.\u0441\n.\3/\3/\3/\3/\3/\3/"+
					"\5/\u0449\n/\3/\3/\5/\u044d\n/\3/\5/\u0450\n/\3\60\3\60\3\60\3\60\3\60"+
					"\3\60\5\60\u0458\n\60\3\61\3\61\3\61\5\61\u045d\n\61\3\61\3\61\3\61\5"+
					"\61\u0462\n\61\3\61\5\61\u0465\n\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62"+
					"\u046d\n\62\f\62\16\62\u0470\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
					"\5\63\u0479\n\63\3\63\3\63\5\63\u047d\n\63\3\64\3\64\3\64\5\64\u0482\n"+
					"\64\3\64\3\64\5\64\u0486\n\64\3\65\3\65\3\65\3\65\5\65\u048c\n\65\3\65"+
					"\5\65\u048f\n\65\3\65\5\65\u0492\n\65\3\65\5\65\u0495\n\65\3\66\3\66\3"+
					"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u04a1\n\66\f\66\16\66\u04a4"+
					"\13\66\3\66\5\66\u04a7\n\66\3\67\3\67\5\67\u04ab\n\67\3\67\3\67\3\67\5"+
					"\67\u04b0\n\67\3\67\5\67\u04b3\n\67\3\67\3\67\38\38\38\38\78\u04bb\n8"+
					"\f8\168\u04be\138\39\39\39\39\39\59\u04c5\n9\3:\5:\u04c8\n:\3:\3:\5:\u04cc"+
					"\n:\3:\5:\u04cf\n:\3:\3:\5:\u04d3\n:\3:\5:\u04d6\n:\3:\5:\u04d9\n:\3:"+
					"\5:\u04dc\n:\3:\5:\u04df\n:\3:\5:\u04e2\n:\3:\3:\5:\u04e6\n:\3:\3:\5:"+
					"\u04ea\n:\3:\5:\u04ed\n:\3:\5:\u04f0\n:\3:\5:\u04f3\n:\3:\5:\u04f6\n:"+
					"\3:\5:\u04f9\n:\3;\3;\3;\3<\3<\3<\3<\5<\u0502\n<\3=\3=\3=\3>\5>\u0508"+
					"\n>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B"+
					"\3B\3B\3B\5B\u0523\nB\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F"+
					"\3G\3G\3G\3G\5G\u0539\nG\3H\3H\3H\3I\3I\3I\5I\u0541\nI\3I\5I\u0544\nI"+
					"\3I\3I\3I\3I\5I\u054a\nI\3I\3I\3I\3I\3I\3I\5I\u0552\nI\3I\5I\u0555\nI"+
					"\3I\3I\3I\3I\7I\u055b\nI\fI\16I\u055e\13I\3J\5J\u0561\nJ\3J\3J\3J\5J\u0566"+
					"\nJ\3J\5J\u0569\nJ\3J\5J\u056c\nJ\3J\3J\5J\u0570\nJ\3J\3J\5J\u0574\nJ"+
					"\3J\5J\u0577\nJ\5J\u0579\nJ\3J\5J\u057c\nJ\3J\3J\5J\u0580\nJ\3J\3J\5J"+
					"\u0584\nJ\3J\5J\u0587\nJ\5J\u0589\nJ\5J\u058b\nJ\3K\5K\u058e\nK\3K\3K"+
					"\3K\5K\u0593\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u059e\nL\3M\3M\3M\3M\5M"+
					"\u05a4\nM\3N\3N\3N\5N\u05a9\nN\3O\3O\3O\7O\u05ae\nO\fO\16O\u05b1\13O\3"+
					"P\3P\5P\u05b5\nP\3P\3P\5P\u05b9\nP\3P\3P\5P\u05bd\nP\3Q\3Q\3Q\5Q\u05c2"+
					"\nQ\3R\3R\3R\7R\u05c7\nR\fR\16R\u05ca\13R\3S\3S\3S\3S\3T\5T\u05d1\nT\3"+
					"T\5T\u05d4\nT\3T\5T\u05d7\nT\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3X\3X\3"+
					"X\3X\3X\3X\5X\u05ea\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05f8\n"+
					"Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0608\n[\3[\5[\u060b\n"+
					"[\3[\3[\3[\3[\3[\3[\3[\5[\u0614\n[\3[\3[\5[\u0618\n[\3[\3[\3[\5[\u061d"+
					"\n[\3[\3[\3[\5[\u0622\n[\3[\5[\u0625\n[\5[\u0627\n[\3\\\3\\\3\\\3\\\3"+
					"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u063d"+
					"\n\\\3\\\5\\\u0640\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u064b\n"+
					"\\\3]\3]\5]\u064f\n]\3]\5]\u0652\n]\3]\3]\5]\u0656\n]\3]\3]\5]\u065a\n"+
					"]\3^\3^\3^\3_\3_\3_\5_\u0662\n_\3_\3_\5_\u0666\n_\3`\3`\3`\3`\3`\3`\3"+
					"`\3`\3`\7`\u0671\n`\f`\16`\u0674\13`\3`\3`\3`\3`\3`\3`\3`\7`\u067d\n`"+
					"\f`\16`\u0680\13`\3`\3`\3`\3`\3`\3`\3`\7`\u0689\n`\f`\16`\u068c\13`\3"+
					"`\3`\3`\3`\3`\5`\u0693\n`\3`\3`\5`\u0697\n`\3a\3a\3a\7a\u069c\na\fa\16"+
					"a\u069f\13a\3b\3b\3b\5b\u06a4\nb\3b\3b\3b\3b\3b\3b\5b\u06ac\nb\3c\3c\3"+
					"c\5c\u06b1\nc\3c\3c\3c\3c\3c\6c\u06b8\nc\rc\16c\u06b9\3c\3c\5c\u06be\n"+
					"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
					"c\3c\3c\3c\3c\3c\3c\5c\u06dd\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
					"c\3c\3c\5c\u06ee\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06fa\nc\3c\3c\3"+
					"c\3c\3c\3c\3c\3c\5c\u0704\nc\3c\5c\u0707\nc\3c\3c\5c\u070b\nc\3c\5c\u070e"+
					"\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u071a\nc\3c\3c\3c\3c\3c\3c\3c\3c"+
					"\3c\3c\3c\3c\3c\3c\3c\5c\u072b\nc\3c\3c\5c\u072f\nc\3c\3c\3c\3c\3c\3c"+
					"\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0740\nc\3c\5c\u0743\nc\3c\3c\5c\u0747"+
					"\nc\3c\5c\u074a\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0755\nc\3c\3c\3c\3c"+
					"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u076d\nc\3c"+
					"\3c\3c\3c\3c\5c\u0774\nc\7c\u0776\nc\fc\16c\u0779\13c\3d\3d\3d\7d\u077e"+
					"\nd\fd\16d\u0781\13d\3e\3e\5e\u0785\ne\3f\3f\3f\3f\7f\u078b\nf\ff\16f"+
					"\u078e\13f\3f\3f\3f\3f\3f\7f\u0795\nf\ff\16f\u0798\13f\5f\u079a\nf\3f"+
					"\3f\3f\3g\3g\3g\5g\u07a2\ng\3g\3g\3h\3h\3h\5h\u07a9\nh\3i\3i\3i\3i\3i"+
					"\3i\3i\5i\u07b2\ni\3i\3i\3i\3i\5i\u07b8\ni\7i\u07ba\ni\fi\16i\u07bd\13"+
					"i\3j\3j\3j\5j\u07c2\nj\3j\3j\3k\3k\3k\5k\u07c9\nk\3k\3k\3l\3l\3l\7l\u07d0"+
					"\nl\fl\16l\u07d3\13l\3m\3m\3m\5m\u07d8\nm\3n\3n\3o\3o\3o\3o\3o\3o\5o\u07e2"+
					"\no\5o\u07e4\no\3p\5p\u07e7\np\3p\3p\3p\3p\3p\3p\5p\u07ef\np\3q\3q\3q"+
					"\5q\u07f4\nq\3r\3r\3s\3s\3t\3t\3u\3u\5u\u07fe\nu\3v\3v\3v\5v\u0803\nv"+
					"\3w\3w\5w\u0807\nw\3x\3x\3x\3x\3x\2\5\u0090\u00c4\u00d0y\2\4\6\b\n\f\16"+
					"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
					"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
					"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
					"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
					"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
					"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\2\36\b\2"+
					"\5\5\32\32\35\35((ii\u00ae\u00ae\4\2\21\21\37\37\5\2\5\5((ii\4\2++--\4"+
					"\2..\64\64\5\2\20\20\u009d\u009d\u00a3\u00a3\4\2!!\u008e\u008e\4\2UUa"+
					"a\4\2HHff\5\2\6\6\n\n\16\16\6\2\6\6\t\n\16\16\u0094\u0094\4\2aa\u008d"+
					"\u008d\4\2\6\6\n\n\4\2ww\u00cd\u00cd\4\2\r\r+,\4\2??^^\4\2\u0086\u0086"+
					"\u0090\u0090\4\2EEQQ\3\2\u009a\u009b\5\2\23\23``\u00ab\u00ab\5\2\u00c9"+
					"\u00c9\u00db\u00db\u00e4\u00e4\4\2\u00ce\u00cf\u00dc\u00dc\4\2PPcc\3\2"+
					"\u00c4\u00c5\4\2\u00cf\u00cf\u00dc\u00dc\n\2&&MMmmoo\u0085\u0085\u0092"+
					"\u0092\u00ba\u00ba\u00bf\u00bf\16\2\4%\'LNRTlnnpqstv\u0083\u0086\u0091"+
					"\u0093\u00b9\u00bb\u00be\u00c0\u00c1\6\2%%??NN\\\\\2\u092c\2\u00fe\3\2"+
					"\2\2\4\u0116\3\2\2\2\6\u0118\3\2\2\2\b\u0121\3\2\2\2\n\u012a\3\2\2\2\f"+
					"\u0135\3\2\2\2\16\u0219\3\2\2\2\20\u021b\3\2\2\2\22\u0223\3\2\2\2\24\u0227"+
					"\3\2\2\2\26\u022e\3\2\2\2\30\u0230\3\2\2\2\32\u0236\3\2\2\2\34\u02d5\3"+
					"\2\2\2\36\u02d7\3\2\2\2 \u02e2\3\2\2\2\"\u02fd\3\2\2\2$\u0318\3\2\2\2"+
					"&\u031c\3\2\2\2(\u0325\3\2\2\2*\u0332\3\2\2\2,\u0341\3\2\2\2.\u034e\3"+
					"\2\2\2\60\u035e\3\2\2\2\62\u0363\3\2\2\2\64\u0369\3\2\2\2\66\u036c\3\2"+
					"\2\28\u036f\3\2\2\2:\u0381\3\2\2\2<\u0383\3\2\2\2>\u03a1\3\2\2\2@\u03a5"+
					"\3\2\2\2B\u03a9\3\2\2\2D\u03ad\3\2\2\2F\u03b6\3\2\2\2H\u03cc\3\2\2\2J"+
					"\u03ee\3\2\2\2L\u03f0\3\2\2\2N\u03f3\3\2\2\2P\u03fa\3\2\2\2R\u03fd\3\2"+
					"\2\2T\u0409\3\2\2\2V\u0411\3\2\2\2X\u041b\3\2\2\2Z\u0440\3\2\2\2\\\u044f"+
					"\3\2\2\2^\u0457\3\2\2\2`\u0459\3\2\2\2b\u0468\3\2\2\2d\u047c\3\2\2\2f"+
					"\u047e\3\2\2\2h\u0487\3\2\2\2j\u0496\3\2\2\2l\u04a8\3\2\2\2n\u04b6\3\2"+
					"\2\2p\u04c4\3\2\2\2r\u04c7\3\2\2\2t\u04fa\3\2\2\2v\u04fd\3\2\2\2x\u0503"+
					"\3\2\2\2z\u0507\3\2\2\2|\u050d\3\2\2\2~\u0514\3\2\2\2\u0080\u0517\3\2"+
					"\2\2\u0082\u051a\3\2\2\2\u0084\u0524\3\2\2\2\u0086\u0527\3\2\2\2\u0088"+
					"\u052b\3\2\2\2\u008a\u052f\3\2\2\2\u008c\u0534\3\2\2\2\u008e\u053a\3\2"+
					"\2\2\u0090\u0549\3\2\2\2\u0092\u058a\3\2\2\2\u0094\u0592\3\2\2\2\u0096"+
					"\u059d\3\2\2\2\u0098\u059f\3\2\2\2\u009a\u05a5\3\2\2\2\u009c\u05aa\3\2"+
					"\2\2\u009e\u05b2\3\2\2\2\u00a0\u05be\3\2\2\2\u00a2\u05c3\3\2\2\2\u00a4"+
					"\u05cb\3\2\2\2\u00a6\u05d0\3\2\2\2\u00a8\u05d8\3\2\2\2\u00aa\u05dc\3\2"+
					"\2\2\u00ac\u05e0\3\2\2\2\u00ae\u05e9\3\2\2\2\u00b0\u05f7\3\2\2\2\u00b2"+
					"\u05f9\3\2\2\2\u00b4\u0626\3\2\2\2\u00b6\u064a\3\2\2\2\u00b8\u064c\3\2"+
					"\2\2\u00ba\u065b\3\2\2\2\u00bc\u065e\3\2\2\2\u00be\u0696\3\2\2\2\u00c0"+
					"\u0698\3\2\2\2\u00c2\u06ab\3\2\2\2\u00c4\u072e\3\2\2\2\u00c6\u077a\3\2"+
					"\2\2\u00c8\u0784\3\2\2\2\u00ca\u0799\3\2\2\2\u00cc\u07a1\3\2\2\2\u00ce"+
					"\u07a5\3\2\2\2\u00d0\u07b1\3\2\2\2\u00d2\u07be\3\2\2\2\u00d4\u07c8\3\2"+
					"\2\2\u00d6\u07cc\3\2\2\2\u00d8\u07d7\3\2\2\2\u00da\u07d9\3\2\2\2\u00dc"+
					"\u07e3\3\2\2\2\u00de\u07e6\3\2\2\2\u00e0\u07f3\3\2\2\2\u00e2\u07f5\3\2"+
					"\2\2\u00e4\u07f7\3\2\2\2\u00e6\u07f9\3\2\2\2\u00e8\u07fd\3\2\2\2\u00ea"+
					"\u0802\3\2\2\2\u00ec\u0806\3\2\2\2\u00ee\u0808\3\2\2\2\u00f0\u00f4\5\4"+
					"\3\2\u00f1\u00f2\7X\2\2\u00f2\u00f3\7}\2\2\u00f3\u00f5\7\u00c7\2\2\u00f4"+
					"\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\7C"+
					"\2\2\u00f7\u00f9\5\u00ecw\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
					"\u00fb\3\2\2\2\u00fa\u00fc\7\u00e3\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc"+
					"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\5`\61\2\u00fe\u00f0\3\2\2\2\u00fe"+
					"\u00fd\3\2\2\2\u00ff\3\3\2\2\2\u0100\u0117\5\f\7\2\u0101\u0117\5\30\r"+
					"\2\u0102\u0117\5\32\16\2\u0103\u0117\5\34\17\2\u0104\u0117\5X-\2\u0105"+
					"\u0117\5Z.\2\u0106\u0117\5\\/\2\u0107\u0117\5^\60\2\u0108\u0117\5f\64"+
					"\2\u0109\u0117\5h\65\2\u010a\u0117\5j\66\2\u010b\u0117\5n8\2\u010c\u0117"+
					"\5\u00b2Z\2\u010d\u0117\5\u00b4[\2\u010e\u0117\5\u00b6\\\2\u010f\u0117"+
					"\5\u00b8]\2\u0110\u0117\5\u00ba^\2\u0111\u0117\5\u00bc_\2\u0112\u0114"+
					"\5\6\4\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
					"\u0117\5r:\2\u0116\u0100\3\2\2\2\u0116\u0101\3\2\2\2\u0116\u0102\3\2\2"+
					"\2\u0116\u0103\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u0105\3\2\2\2\u0116\u0106"+
					"\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u0109\3\2\2\2\u0116"+
					"\u010a\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010c\3\2\2\2\u0116\u010d\3\2"+
					"\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116"+
					"\u0111\3\2\2\2\u0116\u0113\3\2\2\2\u0117\5\3\2\2\2\u0118\u0119\7\u00be"+
					"\2\2\u0119\u011e\5\b\5\2\u011a\u011b\7\u00cd\2\2\u011b\u011d\5\b\5\2\u011c"+
					"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
					"\2\2\u011f\7\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5\u00eav\2\u0122"+
					"\u0124\5\n\6\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
					"\2\2\u0125\u0126\7\f\2\2\u0126\u0127\7\u00d8\2\2\u0127\u0128\5\4\3\2\u0128"+
					"\u0129\7\u00e2\2\2\u0129\t\3\2\2\2\u012a\u012b\7\u00d8\2\2\u012b\u0130"+
					"\5\u00eav\2\u012c\u012d\7\u00cd\2\2\u012d\u012f\5\u00eav\2\u012e\u012c"+
					"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
					"\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\u00e2\2\2\u0134\13\3"+
					"\2\2\2\u0135\u0136\7\7\2\2\u0136\u0137\7\u00a0\2\2\u0137\u0139\5\u00d4"+
					"k\2\u0138\u013a\5\62\32\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
					"\u013b\3\2\2\2\u013b\u0140\5\16\b\2\u013c\u013d\7\u00cd\2\2\u013d\u013f"+
					"\5\16\b\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2"+
					"\u0140\u0141\3\2\2\2\u0141\r\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7"+
					"\3\2\2\u0144\u0148\7\34\2\2\u0145\u0146\7O\2\2\u0146\u0147\7t\2\2\u0147"+
					"\u0149\79\2\2\u0148\u0145\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
					"\2\2\u014a\u014d\5J&\2\u014b\u014c\7\4\2\2\u014c\u014e\5\u00ceh\2\u014d"+
					"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u021a\3\2\2\2\u014f\u0150\7\3"+
					"\2\2\u0150\u0154\7R\2\2\u0151\u0152\7O\2\2\u0152\u0153\7t\2\2\u0153\u0155"+
					"\79\2\2\u0154\u0151\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
					"\u0159\5N(\2\u0157\u0158\7\4\2\2\u0158\u015a\5\u00ceh\2\u0159\u0157\3"+
					"\2\2\2\u0159\u015a\3\2\2\2\u015a\u021a\3\2\2\2\u015b\u015c\7\3\2\2\u015c"+
					"\u0160\7\u0084\2\2\u015d\u015e\7O\2\2\u015e\u015f\7t\2\2\u015f\u0161\7"+
					"9\2\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
					"\u0165\5P)\2\u0163\u0164\7\4\2\2\u0164\u0166\5\u00ceh\2\u0165\u0163\3"+
					"\2\2\2\u0165\u0166\3\2\2\2\u0166\u021a\3\2\2\2\u0167\u0168\7\21\2\2\u0168"+
					"\u016b\5\26\f\2\u0169\u016a\7E\2\2\u016a\u016c\5\u00d4k\2\u016b\u0169"+
					"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u021a\3\2\2\2\u016d\u016e\7\30\2\2"+
					"\u016e\u0171\7\34\2\2\u016f\u0170\7O\2\2\u0170\u0172\79\2\2\u0171\u016f"+
					"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\5\u00ceh"+
					"\2\u0174\u0175\7Q\2\2\u0175\u0177\5\26\f\2\u0176\u0174\3\2\2\2\u0176\u0177"+
					"\3\2\2\2\u0177\u021a\3\2\2\2\u0178\u0179\7\30\2\2\u0179\u017c\7R\2\2\u017a"+
					"\u017b\7O\2\2\u017b\u017d\79\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2"+
					"\2\u017d\u017e\3\2\2\2\u017e\u0181\5\u00ceh\2\u017f\u0180\7Q\2\2\u0180"+
					"\u0182\5\26\f\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u021a\3"+
					"\2\2\2\u0183\u0184\7\30\2\2\u0184\u0187\7\u0084\2\2\u0185\u0186\7O\2\2"+
					"\u0186\u0188\79\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
					"\3\2\2\2\u0189\u018c\5\u00ceh\2\u018a\u018b\7Q\2\2\u018b\u018d\5\26\f"+
					"\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u021a\3\2\2\2\u018e\u018f"+
					"\7\35\2\2\u018f\u0192\7\34\2\2\u0190\u0191\7O\2\2\u0191\u0193\79\2\2\u0192"+
					"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5\u00ce"+
					"h\2\u0195\u0196\7\u00c7\2\2\u0196\u021a\3\2\2\2\u0197\u0198\7*\2\2\u0198"+
					"\u0199\7\u00bc\2\2\u0199\u021a\5\u00c4c\2\u019a\u019b\7.\2\2\u019b\u021a"+
					"\5\26\f\2\u019c\u019d\7\64\2\2\u019d\u01a0\7\34\2\2\u019e\u019f\7O\2\2"+
					"\u019f\u01a1\79\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
					"\3\2\2\2\u01a2\u021a\5\u00ceh\2\u01a3\u01a4\7\64\2\2\u01a4\u01a7\7R\2"+
					"\2\u01a5\u01a6\7O\2\2\u01a6\u01a8\79\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
					"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u021a\5\u00ceh\2\u01aa\u01ab\7\64\2"+
					"\2\u01ab\u01ae\7\u0084\2\2\u01ac\u01ad\7O\2\2\u01ad\u01af\79\2\2\u01ae"+
					"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u021a\5\u00ce"+
					"h\2\u01b1\u01b2\7\64\2\2\u01b2\u021a\5\26\f\2\u01b3\u01b5\7D\2\2\u01b4"+
					"\u01b6\5\26\f\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u021a\3"+
					"\2\2\2\u01b7\u01b8\7h\2\2\u01b8\u01bb\7R\2\2\u01b9\u01ba\7O\2\2\u01ba"+
					"\u01bc\79\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2"+
					"\2\2\u01bd\u01c0\5\u00ceh\2\u01be\u01bf\7Q\2\2\u01bf\u01c1\5\26\f\2\u01c0"+
					"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u021a\3\2\2\2\u01c2\u01c3\7h"+
					"\2\2\u01c3\u01c6\7\u0084\2\2\u01c4\u01c5\7O\2\2\u01c5\u01c7\79\2\2\u01c6"+
					"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\5\u00ce"+
					"h\2\u01c9\u01ca\7Q\2\2\u01ca\u01cc\5\26\f\2\u01cb\u01c9\3\2\2\2\u01cb"+
					"\u01cc\3\2\2\2\u01cc\u021a\3\2\2\2\u01cd\u01ce\7n\2\2\u01ce\u01d1\7\34"+
					"\2\2\u01cf\u01d0\7O\2\2\u01d0\u01d2\79\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2"+
					"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5\u00ceh\2\u01d4\u01d5\5R*\2"+
					"\u01d5\u021a\3\2\2\2\u01d6\u01d7\7n\2\2\u01d7\u01da\7\34\2\2\u01d8\u01d9"+
					"\7O\2\2\u01d9\u01db\79\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
					"\u01dc\3\2\2\2\u01dc\u01dd\5\u00ceh\2\u01dd\u01de\7\35\2\2\u01de\u01df"+
					"\7\u00c7\2\2\u01df\u021a\3\2\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e4\7\34\2"+
					"\2\u01e2\u01e3\7O\2\2\u01e3\u01e5\79\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
					"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5\u00ceh\2\u01e7\u01e8\7\u0088"+
					"\2\2\u01e8\u01e9\5\24\13\2\u01e9\u021a\3\2\2\2\u01ea\u01eb\7n\2\2\u01eb"+
					"\u01ee\7\34\2\2\u01ec\u01ed\7O\2\2\u01ed\u01ef\79\2\2\u01ee\u01ec\3\2"+
					"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u021a\5J&\2\u01f1\u01f2"+
					"\7n\2\2\u01f2\u01f3\7{\2\2\u01f3\u01f4\7\24\2\2\u01f4\u021a\5\u00c4c\2"+
					"\u01f5\u01f6\7n\2\2\u01f6\u021a\5D#\2\u01f7\u01f8\7p\2\2\u01f8\u0202\5"+
					"\26\f\2\u01f9\u01fa\7\u00a8\2\2\u01fa\u01fb\7\61\2\2\u01fb\u0203\7\u00c7"+
					"\2\2\u01fc\u01fd\7\u00a8\2\2\u01fd\u01fe\7\u00b8\2\2\u01fe\u0203\7\u00c7"+
					"\2\2\u01ff\u0200\7\u00a8\2\2\u0200\u0201\7\u00a0\2\2\u0201\u0203\5\u00d4"+
					"k\2\u0202\u01f9\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01ff\3\2\2\2\u0203"+
					"\u021a\3\2\2\2\u0204\u0205\7\u0088\2\2\u0205\u021a\7\u00ae\2\2\u0206\u0207"+
					"\7\u0089\2\2\u0207\u020a\7\34\2\2\u0208\u0209\7O\2\2\u0209\u020b\79\2"+
					"\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d"+
					"\5\u00ceh\2\u020d\u020e\7\u00a8\2\2\u020e\u020f\5\u00ceh\2\u020f\u021a"+
					"\3\2\2\2\u0210\u0211\7\u008a\2\2\u0211\u0212\5\26\f\2\u0212\u0213\7E\2"+
					"\2\u0213\u0214\5\u00d4k\2\u0214\u021a\3\2\2\2\u0215\u0216\7\u00b2\2\2"+
					"\u0216\u0217\5\20\t\2\u0217\u0218\5\u0080A\2\u0218\u021a\3\2\2\2\u0219"+
					"\u0143\3\2\2\2\u0219\u014f\3\2\2\2\u0219\u015b\3\2\2\2\u0219\u0167\3\2"+
					"\2\2\u0219\u016d\3\2\2\2\u0219\u0178\3\2\2\2\u0219\u0183\3\2\2\2\u0219"+
					"\u018e\3\2\2\2\u0219\u0197\3\2\2\2\u0219\u019a\3\2\2\2\u0219\u019c\3\2"+
					"\2\2\u0219\u01a3\3\2\2\2\u0219\u01aa\3\2\2\2\u0219\u01b1\3\2\2\2\u0219"+
					"\u01b3\3\2\2\2\u0219\u01b7\3\2\2\2\u0219\u01c2\3\2\2\2\u0219\u01cd\3\2"+
					"\2\2\u0219\u01d6\3\2\2\2\u0219\u01e0\3\2\2\2\u0219\u01ea\3\2\2\2\u0219"+
					"\u01f1\3\2\2\2\u0219\u01f5\3\2\2\2\u0219\u01f7\3\2\2\2\u0219\u0204\3\2"+
					"\2\2\u0219\u0206\3\2\2\2\u0219\u0210\3\2\2\2\u0219\u0215\3\2\2\2\u021a"+
					"\17\3\2\2\2\u021b\u0220\5\22\n\2\u021c\u021d\7\u00cd\2\2\u021d\u021f\5"+
					"\22\n\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
					"\u0221\3\2\2\2\u0221\21\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\5\u00ce"+
					"h\2\u0224\u0225\7\u00d2\2\2\u0225\u0226\5\u00c4c\2\u0226\23\3\2\2\2\u0227"+
					"\u0228\t\2\2\2\u0228\25\3\2\2\2\u0229\u022a\7\177\2\2\u022a\u022f\5\u00c4"+
					"c\2\u022b\u022c\7\177\2\2\u022c\u022d\7N\2\2\u022d\u022f\7\u00c7\2\2\u022e"+
					"\u0229\3\2\2\2\u022e\u022b\3\2\2\2\u022f\27\3\2\2\2\u0230\u0231\7\21\2"+
					"\2\u0231\u0232\7\60\2\2\u0232\u0234\5\u00d4k\2\u0233\u0235\5\62\32\2\u0234"+
					"\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\31\3\2\2\2\u0236\u0237\7\27\2"+
					"\2\u0237\u0238\7\u00a0\2\2\u0238\u023a\5\u00d4k\2\u0239\u023b\5\26\f\2"+
					"\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\33\3\2\2\2\u023c\u023d"+
					"\t\3\2\2\u023d\u0241\7#\2\2\u023e\u023f\7O\2\2\u023f\u0240\7t\2\2\u0240"+
					"\u0242\79\2\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2"+
					"\2\2\u0243\u0245\5\u00dan\2\u0244\u0246\5\62\32\2\u0245\u0244\3\2\2\2"+
					"\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0249\5F$\2\u0248\u0247"+
					"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u02d6\3\2\2\2\u024a\u0252\7\21\2\2"+
					"\u024b\u024e\7\37\2\2\u024c\u024d\7z\2\2\u024d\u024f\7\u008a\2\2\u024e"+
					"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u0252\7\u008a"+
					"\2\2\u0251\u024a\3\2\2\2\u0251\u024b\3\2\2\2\u0251\u0250\3\2\2\2\u0252"+
					"\u0253\3\2\2\2\u0253\u0257\7\60\2\2\u0254\u0255\7O\2\2\u0255\u0256\7t"+
					"\2\2\u0256\u0258\79\2\2\u0257\u0254\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
					"\u0259\3\2\2\2\u0259\u025b\5\u00d4k\2\u025a\u025c\5\64\33\2\u025b\u025a"+
					"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025f\5\62\32\2"+
					"\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261"+
					"\5\36\20\2\u0261\u0262\5\"\22\2\u0262\u02d6\3\2\2\2\u0263\u0264\t\3\2"+
					"\2\u0264\u0265\7e\2\2\u0265\u0269\7\u00b7\2\2\u0266\u0267\7O\2\2\u0267"+
					"\u0268\7t\2\2\u0268\u026a\79\2\2\u0269\u0266\3\2\2\2\u0269\u026a\3\2\2"+
					"\2\u026a\u026b\3\2\2\2\u026b\u026d\5\u00d4k\2\u026c\u026e\5\64\33\2\u026d"+
					"\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0271\5\62"+
					"\32\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0277\3\2\2\2\u0272"+
					"\u0273\7\u00be\2\2\u0273\u0275\7\u00a6\2\2\u0274\u0276\7\u00c5\2\2\u0275"+
					"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0272\3\2"+
					"\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\5\66\34\2\u027a"+
					"\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027e\5:"+
					"\36\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
					"\u0280\58\35\2\u0280\u02d6\3\2\2\2\u0281\u0282\t\3\2\2\u0282\u0283\7i"+
					"\2\2\u0283\u0287\7\u00b7\2\2\u0284\u0285\7O\2\2\u0285\u0286\7t\2\2\u0286"+
					"\u0288\79\2\2\u0287\u0284\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2"+
					"\2\2\u0289\u028b\5\u00d4k\2\u028a\u028c\5\64\33\2\u028b\u028a\3\2\2\2"+
					"\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028f\5\62\32\2\u028e\u028d"+
					"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0292\5:\36\2\u0291"+
					"\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0298\3\2\2\2\u0293\u0299\5\66"+
					"\34\2\u0294\u0296\5<\37\2\u0295\u0297\7\u0080\2\2\u0296\u0295\3\2\2\2"+
					"\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0293\3\2\2\2\u0298\u0294"+
					"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\58\35\2\u029b\u02d6\3\2\2\2\u029c"+
					"\u02a4\7\21\2\2\u029d\u02a0\7\37\2\2\u029e\u029f\7z\2\2\u029f\u02a1\7"+
					"\u008a\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a4\3\2\2\2"+
					"\u02a2\u02a4\7\u008a\2\2\u02a3\u029c\3\2\2\2\u02a3\u029d\3\2\2\2\u02a3"+
					"\u02a2\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\7\u00a2\2\2\u02a6\u02a5"+
					"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ac\7\u00a0\2"+
					"\2\u02a9\u02aa\7O\2\2\u02aa\u02ab\7t\2\2\u02ab\u02ad\79\2\2\u02ac\u02a9"+
					"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\5\u00d4k"+
					"\2\u02af\u02b1\5\64\33\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
					"\u02b3\3\2\2\2\u02b2\u02b4\5\62\32\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3"+
					"\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b7\5:\36\2\u02b6\u02b5\3\2\2\2\u02b6"+
					"\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02ba\5<\37\2\u02b9\u02b8\3\2"+
					"\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02bd\58\35\2\u02bc"+
					"\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02d6\3\2\2\2\u02be\u02c1\t\3"+
					"\2\2\u02bf\u02c0\7z\2\2\u02c0\u02c2\7\u008a\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
					"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c7\7\u00b7\2\2\u02c4\u02c5"+
					"\7O\2\2\u02c5\u02c6\7t\2\2\u02c6\u02c8\79\2\2\u02c7\u02c4\3\2\2\2\u02c7"+
					"\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\5\u00d4k\2\u02ca\u02cc"+
					"\5\64\33\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2"+
					"\u02cd\u02cf\5\62\32\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1"+
					"\3\2\2\2\u02d0\u02d2\5:\36\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
					"\u02d3\3\2\2\2\u02d3\u02d4\58\35\2\u02d4\u02d6\3\2\2\2\u02d5\u023c\3\2"+
					"\2\2\u02d5\u0251\3\2\2\2\u02d5\u0263\3\2\2\2\u02d5\u0281\3\2\2\2\u02d5"+
					"\u02a3\3\2\2\2\u02d5\u02be\3\2\2\2\u02d6\35\3\2\2\2\u02d7\u02d8\7\u00d8"+
					"\2\2\u02d8\u02dd\5 \21\2\u02d9\u02da\7\u00cd\2\2\u02da\u02dc\5 \21\2\u02db"+
					"\u02d9\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2"+
					"\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\7\u00e2\2\2\u02e1"+
					"\37\3\2\2\2\u02e2\u02e3\5\u00eav\2\u02e3\u02f9\5\u00be`\2\u02e4\u02e5"+
					"\6\21\2\3\u02e5\u02e6\7(\2\2\u02e6\u02e7\5\u00e0q\2\u02e7\u02e8\b\21\1"+
					"\2\u02e8\u02f8\3\2\2\2\u02e9\u02ea\6\21\3\3\u02ea\u02eb\7;\2\2\u02eb\u02ec"+
					"\5\u00c4c\2\u02ec\u02ed\b\21\1\2\u02ed\u02f8\3\2\2\2\u02ee\u02ef\6\21"+
					"\4\3\u02ef\u02f0\7L\2\2\u02f0\u02f8\b\21\1\2\u02f1\u02f2\6\21\5\3\u02f2"+
					"\u02f3\7T\2\2\u02f3\u02f8\b\21\1\2\u02f4\u02f5\6\21\6\3\u02f5\u02f6\7"+
					"Z\2\2\u02f6\u02f8\b\21\1\2\u02f7\u02e4\3\2\2\2\u02f7\u02e9\3\2\2\2\u02f7"+
					"\u02ee\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f7\u02f4\3\2\2\2\u02f8\u02fb\3\2"+
					"\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa!\3\2\2\2\u02fb\u02f9"+
					"\3\2\2\2\u02fc\u02fe\5$\23\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
					"\u0315\3\2\2\2\u02ff\u0300\6\22\7\3\u0300\u0301\5(\25\2\u0301\u0302\b"+
					"\22\1\2\u0302\u0314\3\2\2\2\u0303\u0304\6\22\b\3\u0304\u0305\5*\26\2\u0305"+
					"\u0306\b\22\1\2\u0306\u0314\3\2\2\2\u0307\u0308\6\22\t\3\u0308\u0309\5"+
					",\27\2\u0309\u030a\b\22\1\2\u030a\u0314\3\2\2\2\u030b\u030c\6\22\n\3\u030c"+
					"\u030d\5.\30\2\u030d\u030e\b\22\1\2\u030e\u0314\3\2\2\2\u030f\u0310\6"+
					"\22\13\3\u0310\u0311\5\60\31\2\u0311\u0312\b\22\1\2\u0312\u0314\3\2\2"+
					"\2\u0313\u02ff\3\2\2\2\u0313\u0303\3\2\2\2\u0313\u0307\3\2\2\2\u0313\u030b"+
					"\3\2\2\2\u0313\u030f\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315"+
					"\u0316\3\2\2\2\u0316#\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\7\u0083"+
					"\2\2\u0319\u031a\7\\\2\2\u031a\u031b\5\u00c0a\2\u031b%\3\2\2\2\u031c\u0323"+
					"\5\u00eav\2\u031d\u0320\5\u00eav\2\u031e\u031f\7\u00d8\2\2\u031f\u0321"+
					"\7\u00e2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0324\3\2\2"+
					"\2\u0322\u0324\5\u00e0q\2\u0323\u031d\3\2\2\2\u0323\u0322\3\2\2\2\u0324"+
					"\'\3\2\2\2\u0325\u0326\7\u0099\2\2\u0326\u0327\7\u00d8\2\2\u0327\u0328"+
					"\5\u00eav\2\u0328\u032c\7\u00d8\2\2\u0329\u032b\5&\24\2\u032a\u0329\3"+
					"\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
					"\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\7\u00e2\2\2\u0330\u0331"+
					"\7\u00e2\2\2\u0331)\3\2\2\2\u0332\u0333\7b\2\2\u0333\u033d\7\u00d8\2\2"+
					"\u0334\u033e\7\u00c5\2\2\u0335\u0336\7l\2\2\u0336\u0337\7\u00c5\2\2\u0337"+
					"\u0338\7j\2\2\u0338\u033e\7\u00c5\2\2\u0339\u033a\7j\2\2\u033a\u033b\7"+
					"\u00c5\2\2\u033b\u033c\7l\2\2\u033c\u033e\7\u00c5\2\2\u033d\u0334\3\2"+
					"\2\2\u033d\u0335\3\2\2\2\u033d\u0339\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
					"\u0340\7\u00e2\2\2\u0340+\3\2\2\2\u0341\u0342\7_\2\2\u0342\u0343\7\u00d8"+
					"\2\2\u0343\u0344\5\u00eav\2\u0344\u0348\7\u00d8\2\2\u0345\u0347\5&\24"+
					"\2\u0346\u0345\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349"+
					"\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034c\7\u00e2\2"+
					"\2\u034c\u034d\7\u00e2\2\2\u034d-\3\2\2\2\u034e\u034f\7\u0086\2\2\u034f"+
					"\u035a\7\u00d8\2\2\u0350\u0351\7l\2\2\u0351\u0352\5\u00eav\2\u0352\u0353"+
					"\7j\2\2\u0353\u0354\5\u00eav\2\u0354\u035b\3\2\2\2\u0355\u0356\7j\2\2"+
					"\u0356\u0357\5\u00eav\2\u0357\u0358\7l\2\2\u0358\u0359\5\u00eav\2\u0359"+
					"\u035b\3\2\2\2\u035a\u0350\3\2\2\2\u035a\u0355\3\2\2\2\u035b\u035c\3\2"+
					"\2\2\u035c\u035d\7\u00e2\2\2\u035d/\3\2\2\2\u035e\u035f\7\u0097\2\2\u035f"+
					"\u0360\7\u00d8\2\2\u0360\u0361\5\u00a2R\2\u0361\u0362\7\u00e2\2\2\u0362"+
					"\61\3\2\2\2\u0363\u0364\7x\2\2\u0364\u0367\7\31\2\2\u0365\u0368\5\u00ea"+
					"v\2\u0366\u0368\7\u00c7\2\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368"+
					"\63\3\2\2\2\u0369\u036a\7\u00b5\2\2\u036a\u036b\7\u00c7\2\2\u036b\65\3"+
					"\2\2\2\u036c\u036d\7\u00a8\2\2\u036d\u036e\5\u00d4k\2\u036e\67\3\2\2\2"+
					"\u036f\u0370\7\f\2\2\u0370\u0371\5n8\2\u03719\3\2\2\2\u0372\u0373\7\u00d8"+
					"\2\2\u0373\u0378\5H%\2\u0374\u0375\7\u00cd\2\2\u0375\u0377\5H%\2\u0376"+
					"\u0374\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2"+
					"\2\2\u0379\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\7\u00e2\2\2\u037c"+
					"\u0382\3\2\2\2\u037d\u037e\7\f\2\2\u037e\u0382\5\u00d4k\2\u037f\u0380"+
					"\7\f\2\2\u0380\u0382\5\u00d2j\2\u0381\u0372\3\2\2\2\u0381\u037d\3\2\2"+
					"\2\u0381\u037f\3\2\2\2\u0382;\3\2\2\2\u0383\u039e\5F$\2\u0384\u0385\6"+
					"\37\f\3\u0385\u0386\5\u0086D\2\u0386\u0387\b\37\1\2\u0387\u039d\3\2\2"+
					"\2\u0388\u0389\6\37\r\3\u0389\u038a\5> \2\u038a\u038b\b\37\1\2\u038b\u039d"+
					"\3\2\2\2\u038c\u038d\6\37\16\3\u038d\u038e\5@!\2\u038e\u038f\b\37\1\2"+
					"\u038f\u039d\3\2\2\2\u0390\u0391\6\37\17\3\u0391\u0392\5B\"\2\u0392\u0393"+
					"\b\37\1\2\u0393\u039d\3\2\2\2\u0394\u0395\6\37\20\3\u0395\u0396\5D#\2"+
					"\u0396\u0397\b\37\1\2\u0397\u039d\3\2\2\2\u0398\u0399\6\37\21\3\u0399"+
					"\u039a\5\u008eH\2\u039a\u039b\b\37\1\2\u039b\u039d\3\2\2\2\u039c\u0384"+
					"\3\2\2\2\u039c\u0388\3\2\2\2\u039c\u038c\3\2\2\2\u039c\u0390\3\2\2\2\u039c"+
					"\u0394\3\2\2\2\u039c\u0398\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2"+
					"\2\2\u039e\u039f\3\2\2\2\u039f=\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a2"+
					"\7\177\2\2\u03a2\u03a3\7\24\2\2\u03a3\u03a4\5\u00c4c\2\u03a4?\3\2\2\2"+
					"\u03a5\u03a6\7\u0083\2\2\u03a6\u03a7\7\\\2\2\u03a7\u03a8\5\u00c4c\2\u03a8"+
					"A\3\2\2\2\u03a9\u03aa\7\u0091\2\2\u03aa\u03ab\7\24\2\2\u03ab\u03ac\5\u00c4"+
					"c\2\u03acC\3\2\2\2\u03ad\u03ae\7\u00ae\2\2\u03ae\u03b3\5V,\2\u03af\u03b0"+
					"\7\u00cd\2\2\u03b0\u03b2\5V,\2\u03b1\u03af\3\2\2\2\u03b2\u03b5\3\2\2\2"+
					"\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4E\3\2\2\2\u03b5\u03b3\3"+
					"\2\2\2\u03b6\u03b8\7\67\2\2\u03b7\u03b9\7\u00d2\2\2\u03b8\u03b7\3\2\2"+
					"\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c0\5\u00ecw\2\u03bb"+
					"\u03bd\7\u00d8\2\2\u03bc\u03be\5\u00c0a\2\u03bd\u03bc\3\2\2\2\u03bd\u03be"+
					"\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\7\u00e2\2\2\u03c0\u03bb\3\2\2"+
					"\2\u03c0\u03c1\3\2\2\2\u03c1G\3\2\2\2\u03c2\u03cd\5J&\2\u03c3\u03c4\7"+
					"\36\2\2\u03c4\u03c5\5\u00eav\2\u03c5\u03c6\7\27\2\2\u03c6\u03c7\5\u00c4"+
					"c\2\u03c7\u03cd\3\2\2\2\u03c8\u03c9\7R\2\2\u03c9\u03cd\5N(\2\u03ca\u03cb"+
					"\7\u0084\2\2\u03cb\u03cd\5P)\2\u03cc\u03c2\3\2\2\2\u03cc\u03c3\3\2\2\2"+
					"\u03cc\u03c8\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cdI\3\2\2\2\u03ce\u03cf\5"+
					"\u00ceh\2\u03cf\u03d1\5\u00be`\2\u03d0\u03d2\5L\'\2\u03d1\u03d0\3\2\2"+
					"\2\u03d1\u03d2\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d4\7\35\2\2\u03d4"+
					"\u03d6\7\u00c7\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8"+
					"\3\2\2\2\u03d7\u03d9\5R*\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
					"\u03dc\3\2\2\2\u03da\u03db\7\u00ae\2\2\u03db\u03dd\5\u00c4c\2\u03dc\u03da"+
					"\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03ef\3\2\2\2\u03de\u03e0\5\u00ceh"+
					"\2\u03df\u03e1\5\u00be`\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
					"\u03e2\3\2\2\2\u03e2\u03e5\5L\'\2\u03e3\u03e4\7\35\2\2\u03e4\u03e6\7\u00c7"+
					"\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7"+
					"\u03e9\5R*\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ec\3\2\2"+
					"\2\u03ea\u03eb\7\u00ae\2\2\u03eb\u03ed\5\u00c4c\2\u03ec\u03ea\3\2\2\2"+
					"\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03ce\3\2\2\2\u03ee\u03de"+
					"\3\2\2\2\u03efK\3\2\2\2\u03f0\u03f1\t\4\2\2\u03f1\u03f2\5\u00c4c\2\u03f2"+
					"M\3\2\2\2\u03f3\u03f4\5\u00ceh\2\u03f4\u03f5\5\u00c4c\2\u03f5\u03f6\7"+
					"\u00af\2\2\u03f6\u03f7\5\u00be`\2\u03f7\u03f8\7I\2\2\u03f8\u03f9\7\u00c5"+
					"\2\2\u03f9O\3\2\2\2\u03fa\u03fb\5\u00ceh\2\u03fb\u03fc\5l\67\2\u03fcQ"+
					"\3\2\2\2\u03fd\u03fe\7\32\2\2\u03fe\u03ff\7\u00d8\2\2\u03ff\u0404\5T+"+
					"\2\u0400\u0401\7\u00cd\2\2\u0401\u0403\5T+\2\u0402\u0400\3\2\2\2\u0403"+
					"\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2"+
					"\2\2\u0406\u0404\3\2\2\2\u0407\u0408\7\u00e2\2\2\u0408S\3\2\2\2\u0409"+
					"\u040f\5\u00eav\2\u040a\u040c\7\u00d8\2\2\u040b\u040d\5\u00c0a\2\u040c"+
					"\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\7\u00e2"+
					"\2\2\u040f\u040a\3\2\2\2\u040f\u0410\3\2\2\2\u0410U\3\2\2\2\u0411\u0419"+
					"\5\u00c4c\2\u0412\u041a\7*\2\2\u0413\u0414\7\u00a8\2\2\u0414\u0415\7\61"+
					"\2\2\u0415\u041a\7\u00c7\2\2\u0416\u0417\7\u00a8\2\2\u0417\u0418\7\u00b8"+
					"\2\2\u0418\u041a\7\u00c7\2\2\u0419\u0412\3\2\2\2\u0419\u0413\3\2\2\2\u0419"+
					"\u0416\3\2\2\2\u0419\u041a\3\2\2\2\u041aW\3\2\2\2\u041b\u041d\t\5\2\2"+
					"\u041c\u041e\7\u00a0\2\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
					"\u041f\3\2\2\2\u041f\u0420\5\u00d0i\2\u0420Y\3\2\2\2\u0421\u0422\t\6\2"+
					"\2\u0422\u0425\7#\2\2\u0423\u0424\7O\2\2\u0424\u0426\79\2\2\u0425\u0423"+
					"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\5\u00dan"+
					"\2\u0428\u042a\5\62\32\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
					"\u0441\3\2\2\2\u042b\u0432\t\6\2\2\u042c\u0433\7\60\2\2\u042d\u042f\7"+
					"\u00a2\2\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2"+
					"\u0430\u0433\7\u00a0\2\2\u0431\u0433\7\u00b7\2\2\u0432\u042c\3\2\2\2\u0432"+
					"\u042e\3\2\2\2\u0432\u0431\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0435\7O"+
					"\2\2\u0435\u0437\79\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
					"\u0438\3\2\2\2\u0438\u043a\5\u00d4k\2\u0439\u043b\5\62\32\2\u043a\u0439"+
					"\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043d\7s\2\2\u043d"+
					"\u043f\7)\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2"+
					"\2\2\u0440\u0421\3\2\2\2\u0440\u042b\3\2\2\2\u0441[\3\2\2\2\u0442\u0443"+
					"\79\2\2\u0443\u0444\7#\2\2\u0444\u0450\5\u00dan\2\u0445\u044c\79\2\2\u0446"+
					"\u044d\7\60\2\2\u0447\u0449\7\u00a2\2\2\u0448\u0447\3\2\2\2\u0448\u0449"+
					"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044d\7\u00a0\2\2\u044b\u044d\7\u00b7"+
					"\2\2\u044c\u0446\3\2\2\2\u044c\u0448\3\2\2\2\u044c\u044b\3\2\2\2\u044c"+
					"\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\5\u00d4k\2\u044f\u0442"+
					"\3\2\2\2\u044f\u0445\3\2\2\2\u0450]\3\2\2\2\u0451\u0452\7:\2\2\u0452\u0453"+
					"\7\17\2\2\u0453\u0458\5\4\3\2\u0454\u0455\7:\2\2\u0455\u0456\7\u009e\2"+
					"\2\u0456\u0458\5\4\3\2\u0457\u0451\3\2\2\2\u0457\u0454\3\2\2\2\u0458_"+
					"\3\2\2\2\u0459\u045a\7V\2\2\u045a\u045c\7X\2\2\u045b\u045d\7\u00a0\2\2"+
					"\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0461\3\2\2\2\u045e\u0462"+
					"\5\u00d4k\2\u045f\u0460\7G\2\2\u0460\u0462\5\u00d2j\2\u0461\u045e\3\2"+
					"\2\2\u0461\u045f\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0465\5b\62\2\u0464"+
					"\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\5d"+
					"\63\2\u0467a\3\2\2\2\u0468\u0469\7\u00d8\2\2\u0469\u046e\5\u00ceh\2\u046a"+
					"\u046b\7\u00cd\2\2\u046b\u046d\5\u00ceh\2\u046c\u046a\3\2\2\2\u046d\u0470"+
					"\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470"+
					"\u046e\3\2\2\2\u0471\u0472\7\u00e2\2\2\u0472c\3\2\2\2\u0473\u0474\7C\2"+
					"\2\u0474\u047d\5\u00eav\2\u0475\u047d\7\u00b6\2\2\u0476\u0478\5n8\2\u0477"+
					"\u0479\7\u00e3\2\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a"+
					"\3\2\2\2\u047a\u047b\7\2\2\3\u047b\u047d\3\2\2\2\u047c\u0473\3\2\2\2\u047c"+
					"\u0475\3\2\2\2\u047c\u0476\3\2\2\2\u047de\3\2\2\2\u047e\u047f\7]\2\2\u047f"+
					"\u0481\7q\2\2\u0480\u0482\5\62\32\2\u0481\u0480\3\2\2\2\u0481\u0482\3"+
					"\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485\5\u0080A\2\u0484\u0486\t\7\2\2"+
					"\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486g\3\2\2\2\u0487\u0488\7"+
					"y\2\2\u0488\u0489\7\u00a0\2\2\u0489\u048b\5\u00d4k\2\u048a\u048c\5\62"+
					"\32\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3\2\2\2\u048d"+
					"\u048f\5\26\f\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3"+
					"\2\2\2\u0490\u0492\7>\2\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
					"\u0494\3\2\2\2\u0493\u0495\7\'\2\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2"+
					"\2\2\u0495i\3\2\2\2\u0496\u0497\7\u0089\2\2\u0497\u0498\7\u00a0\2\2\u0498"+
					"\u0499\5\u00d4k\2\u0499\u049a\7\u00a8\2\2\u049a\u04a2\5\u00d4k\2\u049b"+
					"\u049c\7\u00cd\2\2\u049c\u049d\5\u00d4k\2\u049d\u049e\7\u00a8\2\2\u049e"+
					"\u049f\5\u00d4k\2\u049f\u04a1\3\2\2\2\u04a0\u049b\3\2\2\2\u04a1\u04a4"+
					"\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4"+
					"\u04a2\3\2\2\2\u04a5\u04a7\5\62\32\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3"+
					"\2\2\2\u04a7k\3\2\2\2\u04a8\u04aa\7\u00d8\2\2\u04a9\u04ab\5t;\2\u04aa"+
					"\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\7\u0093"+
					"\2\2\u04ad\u04af\5\u00c0a\2\u04ae\u04b0\5\u0082B\2\u04af\u04ae\3\2\2\2"+
					"\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04b3\5\u0088E\2\u04b2"+
					"\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7\u00e2"+
					"\2\2\u04b5m\3\2\2\2\u04b6\u04bc\5p9\2\u04b7\u04b8\7\u00b1\2\2\u04b8\u04b9"+
					"\7\6\2\2\u04b9\u04bb\5p9\2\u04ba\u04b7\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc"+
					"\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bdo\3\2\2\2\u04be\u04bc\3\2\2\2"+
					"\u04bf\u04c5\5r:\2\u04c0\u04c1\7\u00d8\2\2\u04c1\u04c2\5n8\2\u04c2\u04c3"+
					"\7\u00e2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04bf\3\2\2\2\u04c4\u04c0\3\2\2"+
					"\2\u04c5q\3\2\2\2\u04c6\u04c8\5t;\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3"+
					"\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\7\u0093\2\2\u04ca\u04cc\7\62\2"+
					"\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04cf"+
					"\5v<\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
					"\u04d2\5\u00c0a\2\u04d1\u04d3\5x=\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3"+
					"\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04d6\5z>\2\u04d5\u04d4\3\2\2\2\u04d5"+
					"\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5|?\2\u04d8\u04d7\3\2\2"+
					"\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04dc\5~@\2\u04db\u04da"+
					"\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04df\5\u0080A"+
					"\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0\u04e2"+
					"\5\u0082B\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e5\3\2\2"+
					"\2\u04e3\u04e4\7\u00be\2\2\u04e4\u04e6\t\b\2\2\u04e5\u04e3\3\2\2\2\u04e5"+
					"\u04e6\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e8\7\u00be\2\2\u04e8\u04ea"+
					"\7\u00aa\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2"+
					"\2\u04eb\u04ed\5\u0084C\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
					"\u04ef\3\2\2\2\u04ee\u04f0\5\u0086D\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0"+
					"\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04f3\5\u008aF\2\u04f2\u04f1\3\2\2"+
					"\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f6\5\u008cG\2\u04f5"+
					"\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f9\5\u008e"+
					"H\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9s\3\2\2\2\u04fa\u04fb"+
					"\7\u00be\2\2\u04fb\u04fc\5\u00c0a\2\u04fcu\3\2\2\2\u04fd\u04fe\7\u00a9"+
					"\2\2\u04fe\u0501\7\u00c5\2\2\u04ff\u0500\7\u00be\2\2\u0500\u0502\7\u00a5"+
					"\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502w\3\2\2\2\u0503\u0504"+
					"\7E\2\2\u0504\u0505\5\u0090I\2\u0505y\3\2\2\2\u0506\u0508\t\t\2\2\u0507"+
					"\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\7\13"+
					"\2\2\u050a\u050b\7[\2\2\u050b\u050c\5\u00c0a\2\u050c{\3\2\2\2\u050d\u050e"+
					"\7\u00bd\2\2\u050e\u050f\5\u00eav\2\u050f\u0510\7\f\2\2\u0510\u0511\7"+
					"\u00d8\2\2\u0511\u0512\5\u00a6T\2\u0512\u0513\7\u00e2\2\2\u0513}\3\2\2"+
					"\2\u0514\u0515\7\u0082\2\2\u0515\u0516\5\u00c4c\2\u0516\177\3\2\2\2\u0517"+
					"\u0518\7\u00bc\2\2\u0518\u0519\5\u00c4c\2\u0519\u0081\3\2\2\2\u051a\u051b"+
					"\7J\2\2\u051b\u0522\7\24\2\2\u051c\u051d\t\b\2\2\u051d\u051e\7\u00d8\2"+
					"\2\u051e\u051f\5\u00c0a\2\u051f\u0520\7\u00e2\2\2\u0520\u0523\3\2\2\2"+
					"\u0521\u0523\5\u00c0a\2\u0522\u051c\3\2\2\2\u0522\u0521\3\2\2\2\u0523"+
					"\u0083\3\2\2\2\u0524\u0525\7K\2\2\u0525\u0526\5\u00c4c\2\u0526\u0085\3"+
					"\2\2\2\u0527\u0528\7{\2\2\u0528\u0529\7\24\2\2\u0529\u052a\5\u009cO\2"+
					"\u052a\u0087\3\2\2\2\u052b\u052c\7{\2\2\u052c\u052d\7\24\2\2\u052d\u052e"+
					"\5\u00c0a\2\u052e\u0089\3\2\2\2\u052f\u0530\7d\2\2\u0530\u0531\5\u009a"+
					"N\2\u0531\u0532\7\24\2\2\u0532\u0533\5\u00c0a\2\u0533\u008b\3\2\2\2\u0534"+
					"\u0535\7d\2\2\u0535\u0538\5\u009aN\2\u0536\u0537\7\u00be\2\2\u0537\u0539"+
					"\7\u00a5\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u008d\3\2\2"+
					"\2\u053a\u053b\7\u0097\2\2\u053b\u053c\5\u00a2R\2\u053c\u008f\3\2\2\2"+
					"\u053d\u053e\bI\1\2\u053e\u0540\5\u00d0i\2\u053f\u0541\7>\2\2\u0540\u053f"+
					"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0544\5\u0098M"+
					"\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u054a\3\2\2\2\u0545\u0546"+
					"\7\u00d8\2\2\u0546\u0547\5\u0090I\2\u0547\u0548\7\u00e2\2\2\u0548\u054a"+
					"\3\2\2\2\u0549\u053d\3\2\2\2\u0549\u0545\3\2\2\2\u054a\u055c\3\2\2\2\u054b"+
					"\u054c\f\5\2\2\u054c\u054d\5\u0094K\2\u054d\u054e\5\u0090I\6\u054e\u055b"+
					"\3\2\2\2\u054f\u0551\f\6\2\2\u0550\u0552\t\n\2\2\u0551\u0550\3\2\2\2\u0551"+
					"\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553\u0555\5\u0092J\2\u0554\u0553"+
					"\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\7[\2\2\u0557"+
					"\u0558\5\u0090I\2\u0558\u0559\5\u0096L\2\u0559\u055b\3\2\2\2\u055a\u054b"+
					"\3\2\2\2\u055a\u054f\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055c"+
					"\u055d\3\2\2\2\u055d\u0091\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0561\t\13"+
					"\2\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
					"\u0569\7U\2\2\u0563\u0565\7U\2\2\u0564\u0566\t\13\2\2\u0565\u0564\3\2"+
					"\2\2\u0565\u0566\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0569\t\13\2\2\u0568"+
					"\u0560\3\2\2\2\u0568\u0563\3\2\2\2\u0568\u0567\3\2\2\2\u0569\u058b\3\2"+
					"\2\2\u056a\u056c\t\f\2\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
					"\u056d\3\2\2\2\u056d\u056f\t\r\2\2\u056e\u0570\7|\2\2\u056f\u056e\3\2"+
					"\2\2\u056f\u0570\3\2\2\2\u0570\u0579\3\2\2\2\u0571\u0573\t\r\2\2\u0572"+
					"\u0574\7|\2\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2"+
					"\2\2\u0575\u0577\t\f\2\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
					"\u0579\3\2\2\2\u0578\u056b\3\2\2\2\u0578\u0571\3\2\2\2\u0579\u058b\3\2"+
					"\2\2\u057a\u057c\t\16\2\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
					"\u057d\3\2\2\2\u057d\u057f\7F\2\2\u057e\u0580\7|\2\2\u057f\u057e\3\2\2"+
					"\2\u057f\u0580\3\2\2\2\u0580\u0589\3\2\2\2\u0581\u0583\7F\2\2\u0582\u0584"+
					"\7|\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585"+
					"\u0587\t\16\2\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3"+
					"\2\2\2\u0588\u057b\3\2\2\2\u0588\u0581\3\2\2\2\u0589\u058b\3\2\2\2\u058a"+
					"\u0568\3\2\2\2\u058a\u0578\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u0093\3\2"+
					"\2\2\u058c\u058e\t\n\2\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
					"\u058f\3\2\2\2\u058f\u0590\7 \2\2\u0590\u0593\7[\2\2\u0591\u0593\7\u00cd"+
					"\2\2\u0592\u058d\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u0095\3\2\2\2\u0594"+
					"\u0595\7x\2\2\u0595\u059e\5\u00c0a\2\u0596\u0597\7\u00b4\2\2\u0597\u0598"+
					"\7\u00d8\2\2\u0598\u0599\5\u00c0a\2\u0599\u059a\7\u00e2\2\2\u059a\u059e"+
					"\3\2\2\2\u059b\u059c\7\u00b4\2\2\u059c\u059e\5\u00c0a\2\u059d\u0594\3"+
					"\2\2\2\u059d\u0596\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u0097\3\2\2\2\u059f"+
					"\u05a0\7\u0091\2\2\u05a0\u05a3\5\u00a0Q\2\u05a1\u05a2\7w\2\2\u05a2\u05a4"+
					"\5\u00a0Q\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u0099\3\2\2"+
					"\2\u05a5\u05a8\5\u00c4c\2\u05a6\u05a7\t\17\2\2\u05a7\u05a9\5\u00c4c\2"+
					"\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u009b\3\2\2\2\u05aa\u05af"+
					"\5\u009eP\2\u05ab\u05ac\7\u00cd\2\2\u05ac\u05ae\5\u009eP\2\u05ad\u05ab"+
					"\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
					"\u009d\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u05b4\5\u00c4c\2\u05b3\u05b5"+
					"\t\20\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b8\3\2\2\2"+
					"\u05b6\u05b7\7v\2\2\u05b7\u05b9\t\21\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9"+
					"\3\2\2\2\u05b9\u05bc\3\2\2\2\u05ba\u05bb\7\33\2\2\u05bb\u05bd\7\u00c7"+
					"\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u009f\3\2\2\2\u05be"+
					"\u05c1\5\u00dep\2\u05bf\u05c0\7\u00e4\2\2\u05c0\u05c2\5\u00dep\2\u05c1"+
					"\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u00a1\3\2\2\2\u05c3\u05c8\5\u00a4"+
					"S\2\u05c4\u05c5\7\u00cd\2\2\u05c5\u05c7\5\u00a4S\2\u05c6\u05c4\3\2\2\2"+
					"\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00a3"+
					"\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb\u05cc\5\u00eav\2\u05cc\u05cd\7\u00d2"+
					"\2\2\u05cd\u05ce\5\u00e0q\2\u05ce\u00a5\3\2\2\2\u05cf\u05d1\5\u00a8U\2"+
					"\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d4"+
					"\5\u00aaV\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2"+
					"\2\u05d5\u05d7\5\u00acW\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
					"\u00a7\3\2\2\2\u05d8\u05d9\7\177\2\2\u05d9\u05da\7\24\2\2\u05da\u05db"+
					"\5\u00c0a\2\u05db\u00a9\3\2\2\2\u05dc\u05dd\7{\2\2\u05dd\u05de\7\24\2"+
					"\2\u05de\u05df\5\u009cO\2\u05df\u00ab\3\2\2\2\u05e0\u05e1\t\22\2\2\u05e1"+
					"\u05e2\5\u00aeX\2\u05e2\u00ad\3\2\2\2\u05e3\u05ea\5\u00b0Y\2\u05e4\u05e5"+
					"\7\22\2\2\u05e5\u05e6\5\u00b0Y\2\u05e6\u05e7\7\b\2\2\u05e7\u05e8\5\u00b0"+
					"Y\2\u05e8\u05ea\3\2\2\2\u05e9\u05e3\3\2\2\2\u05e9\u05e4\3\2\2\2\u05ea"+
					"\u00af\3\2\2\2\u05eb\u05ec\7\"\2\2\u05ec\u05f8\7\u008f\2\2\u05ed\u05ee"+
					"\7\u00b0\2\2\u05ee\u05f8\7\u0081\2\2\u05ef\u05f0\7\u00b0\2\2\u05f0\u05f8"+
					"\7A\2\2\u05f1\u05f2\5\u00dep\2\u05f2\u05f3\7\u0081\2\2\u05f3\u05f8\3\2"+
					"\2\2\u05f4\u05f5\5\u00dep\2\u05f5\u05f6\7A\2\2\u05f6\u05f8\3\2\2\2\u05f7"+
					"\u05eb\3\2\2\2\u05f7\u05ed\3\2\2\2\u05f7\u05ef\3\2\2\2\u05f7\u05f1\3\2"+
					"\2\2\u05f7\u05f4\3\2\2\2\u05f8\u00b1\3\2\2\2\u05f9\u05fa\7\u0096\2\2\u05fa"+
					"\u05fb\5\u00a2R\2\u05fb\u00b3\3\2\2\2\u05fc\u05fd\7\u0098\2\2\u05fd\u05fe"+
					"\7\37\2\2\u05fe\u05ff\7#\2\2\u05ff\u0627\5\u00dan\2\u0600\u0601\7\u0098"+
					"\2\2\u0601\u0602\7\37\2\2\u0602\u0603\7\60\2\2\u0603\u0627\5\u00d4k\2"+
					"\u0604\u0605\7\u0098\2\2\u0605\u0607\7\37\2\2\u0606\u0608\7\u00a2\2\2"+
					"\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609\u060b"+
					"\7\u00a0\2\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2"+
					"\2\u060c\u0627\5\u00d4k\2\u060d\u060e\7\u0098\2\2\u060e\u0627\7$\2\2\u060f"+
					"\u0610\7\u0098\2\2\u0610\u0613\7/\2\2\u0611\u0612\7E\2\2\u0612\u0614\5"+
					"\u00dan\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0627\3\2\2\2"+
					"\u0615\u0617\7\u0098\2\2\u0616\u0618\7\u00a2\2\2\u0617\u0616\3\2\2\2\u0617"+
					"\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061c\7\u00a1\2\2\u061a\u061b"+
					"\t\23\2\2\u061b\u061d\5\u00dan\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2"+
					"\2\u061d\u0621\3\2\2\2\u061e\u061f\7c\2\2\u061f\u0622\7\u00c7\2\2\u0620"+
					"\u0622\5\u0080A\2\u0621\u061e\3\2\2\2\u0621\u0620\3\2\2\2\u0621\u0622"+
					"\3\2\2\2\u0622\u0624\3\2\2\2\u0623\u0625\5\u008cG\2\u0624\u0623\3\2\2"+
					"\2\u0624\u0625\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u05fc\3\2\2\2\u0626\u0600"+
					"\3\2\2\2\u0626\u0604\3\2\2\2\u0626\u060d\3\2\2\2\u0626\u060f\3\2\2\2\u0626"+
					"\u0615\3\2\2\2\u0627\u00b5\3\2\2\2\u0628\u0629\7\u009f\2\2\u0629\u062a"+
					"\7@\2\2\u062a\u062b\7\63\2\2\u062b\u064b\5\u00d4k\2\u062c\u062d\7\u009f"+
					"\2\2\u062d\u062e\7@\2\2\u062e\u064b\7g\2\2\u062f\u0630\7\u009f\2\2\u0630"+
					"\u0631\7\u0087\2\2\u0631\u064b\7/\2\2\u0632\u0633\7\u009f\2\2\u0633\u0634"+
					"\7\u0087\2\2\u0634\u0635\7\60\2\2\u0635\u064b\5\u00d4k\2\u0636\u0637\7"+
					"\u009f\2\2\u0637\u063f\t\24\2\2\u0638\u0639\7\63\2\2\u0639\u0640\7\u0095"+
					"\2\2\u063a\u0640\7=\2\2\u063b\u063d\7\u00ae\2\2\u063c\u063b\3\2\2\2\u063c"+
					"\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\7k\2\2\u063f\u0638\3\2"+
					"\2\2\u063f\u063a\3\2\2\2\u063f\u063c\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
					"\u064b\5\u00d4k\2\u0642\u0643\7\u009f\2\2\u0643\u0644\t\24\2\2\u0644\u0645"+
					"\7\u008c\2\2\u0645\u064b\7\u0095\2\2\u0646\u0647\7\u009f\2\2\u0647\u0648"+
					"\7\u009d\2\2\u0648\u0649\7\u008b\2\2\u0649\u064b\5\u00d4k\2\u064a\u0628"+
					"\3\2\2\2\u064a\u062c\3\2\2\2\u064a\u062f\3\2\2\2\u064a\u0632\3\2\2\2\u064a"+
					"\u0636\3\2\2\2\u064a\u0642\3\2\2\2\u064a\u0646\3\2\2\2\u064b\u00b7\3\2"+
					"\2\2\u064c\u064e\7\u00ad\2\2\u064d\u064f\7\u00a2\2\2\u064e\u064d\3\2\2"+
					"\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u0652\7\u00a0\2\2\u0651"+
					"\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0655\3\2\2\2\u0653\u0654\7O"+
					"\2\2\u0654\u0656\79\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656"+
					"\u0657\3\2\2\2\u0657\u0659\5\u00d4k\2\u0658\u065a\5\62\32\2\u0659\u0658"+
					"\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u00b9\3\2\2\2\u065b\u065c\7\u00b3\2"+
					"\2\u065c\u065d\5\u00dan\2\u065d\u00bb\3\2\2\2\u065e\u065f\7\u00b9\2\2"+
					"\u065f\u0661\5\u00d4k\2\u0660\u0662\78\2\2\u0661\u0660\3\2\2\2\u0661\u0662"+
					"\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0664\7d\2\2\u0664\u0666\7\u00c5\2"+
					"\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u00bd\3\2\2\2\u0667\u0697"+
					"\5\u00eav\2\u0668\u0669\5\u00eav\2\u0669\u066a\7\u00d8\2\2\u066a\u066b"+
					"\5\u00eav\2\u066b\u0672\5\u00be`\2\u066c\u066d\7\u00cd\2\2\u066d\u066e"+
					"\5\u00eav\2\u066e\u066f\5\u00be`\2\u066f\u0671\3\2\2\2\u0670\u066c\3\2"+
					"\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
					"\u0675\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0676\7\u00e2\2\2\u0676\u0697"+
					"\3\2\2\2\u0677\u0678\5\u00eav\2\u0678\u0679\7\u00d8\2\2\u0679\u067e\5"+
					"\u00eex\2\u067a\u067b\7\u00cd\2\2\u067b\u067d\5\u00eex\2\u067c\u067a\3"+
					"\2\2\2\u067d\u0680\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f"+
					"\u0681\3\2\2\2\u0680\u067e\3\2\2\2\u0681\u0682\7\u00e2\2\2\u0682\u0697"+
					"\3\2\2\2\u0683\u0684\5\u00eav\2\u0684\u0685\7\u00d8\2\2\u0685\u068a\5"+
					"\u00be`\2\u0686\u0687\7\u00cd\2\2\u0687\u0689\5\u00be`\2\u0688\u0686\3"+
					"\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
					"\u068d\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u068e\7\u00e2\2\2\u068e\u0697"+
					"\3\2\2\2\u068f\u0690\5\u00eav\2\u0690\u0692\7\u00d8\2\2\u0691\u0693\5"+
					"\u00c0a\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2"+
					"\u0694\u0695\7\u00e2\2\2\u0695\u0697\3\2\2\2\u0696\u0667\3\2\2\2\u0696"+
					"\u0668\3\2\2\2\u0696\u0677\3\2\2\2\u0696\u0683\3\2\2\2\u0696\u068f\3\2"+
					"\2\2\u0697\u00bf\3\2\2\2\u0698\u069d\5\u00c2b\2\u0699\u069a\7\u00cd\2"+
					"\2\u069a\u069c\5\u00c2b\2\u069b\u0699\3\2\2\2\u069c\u069f\3\2\2\2\u069d"+
					"\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u00c1\3\2\2\2\u069f\u069d\3\2"+
					"\2\2\u06a0\u06a1\5\u00d4k\2\u06a1\u06a2\7\u00d0\2\2\u06a2\u06a4\3\2\2"+
					"\2\u06a3\u06a0\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06ac"+
					"\7\u00c9\2\2\u06a6\u06a7\7\u00d8\2\2\u06a7\u06a8\5n8\2\u06a8\u06a9\7\u00e2"+
					"\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06ac\5\u00c4c\2\u06ab\u06a3\3\2\2\2\u06ab"+
					"\u06a6\3\2\2\2\u06ab\u06aa\3\2\2\2\u06ac\u00c3\3\2\2\2\u06ad\u06ae\bc"+
					"\1\2\u06ae\u06b0\7\25\2\2\u06af\u06b1\5\u00c4c\2\u06b0\u06af\3\2\2\2\u06b0"+
					"\u06b1\3\2\2\2\u06b1\u06b7\3\2\2\2\u06b2\u06b3\7\u00bb\2\2\u06b3\u06b4"+
					"\5\u00c4c\2\u06b4\u06b5\7\u00a4\2\2\u06b5\u06b6\5\u00c4c\2\u06b6\u06b8"+
					"\3\2\2\2\u06b7\u06b2\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9"+
					"\u06ba\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06bc\7\65\2\2\u06bc\u06be\5"+
					"\u00c4c\2\u06bd\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2\2"+
					"\u06bf\u06c0\7\66\2\2\u06c0\u072f\3\2\2\2\u06c1\u06c2\7\26\2\2\u06c2\u06c3"+
					"\7\u00d8\2\2\u06c3\u06c4\5\u00c4c\2\u06c4\u06c5\7\f\2\2\u06c5\u06c6\5"+
					"\u00be`\2\u06c6\u06c7\7\u00e2\2\2\u06c7\u072f\3\2\2\2\u06c8\u06c9\7%\2"+
					"\2\u06c9\u072f\7\u00c7\2\2\u06ca\u06cb\7<\2\2\u06cb\u06cc\7\u00d8\2\2"+
					"\u06cc\u06cd\5\u00e2r\2\u06cd\u06ce\7E\2\2\u06ce\u06cf\5\u00c4c\2\u06cf"+
					"\u06d0\7\u00e2\2\2\u06d0\u072f\3\2\2\2\u06d1\u06d2\7W\2\2\u06d2\u06d3"+
					"\5\u00c4c\2\u06d3\u06d4\5\u00e2r\2\u06d4\u072f\3\2\2\2\u06d5\u06d6\7\u009c"+
					"\2\2\u06d6\u06d7\7\u00d8\2\2\u06d7\u06d8\5\u00c4c\2\u06d8\u06d9\7E\2\2"+
					"\u06d9\u06dc\5\u00c4c\2\u06da\u06db\7B\2\2\u06db\u06dd\5\u00c4c\2\u06dc"+
					"\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\7\u00e2"+
					"\2\2\u06df\u072f\3\2\2\2\u06e0\u06e1\7\u00a7\2\2\u06e1\u072f\7\u00c7\2"+
					"\2\u06e2\u06e3\7\u00ac\2\2\u06e3\u06e4\7\u00d8\2\2\u06e4\u06e5\t\25\2"+
					"\2\u06e5\u06e6\7\u00c7\2\2\u06e6\u06e7\7E\2\2\u06e7\u06e8\5\u00c4c\2\u06e8"+
					"\u06e9\7\u00e2\2\2\u06e9\u072f\3\2\2\2\u06ea\u06eb\5\u00eav\2\u06eb\u06ed"+
					"\7\u00d8\2\2\u06ec\u06ee\5\u00c0a\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3"+
					"\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\7\u00e2\2\2\u06f0\u06f1\3\2\2\2"+
					"\u06f1\u06f2\7~\2\2\u06f2\u06f3\7\u00d8\2\2\u06f3\u06f4\5\u00a6T\2\u06f4"+
					"\u06f5\7\u00e2\2\2\u06f5\u072f\3\2\2\2\u06f6\u06f7\5\u00eav\2\u06f7\u06f9"+
					"\7\u00d8\2\2\u06f8\u06fa\5\u00c0a\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3"+
					"\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\7\u00e2\2\2\u06fc\u06fd\3\2\2\2"+
					"\u06fd\u06fe\7~\2\2\u06fe\u06ff\5\u00eav\2\u06ff\u072f\3\2\2\2\u0700\u0706"+
					"\5\u00eav\2\u0701\u0703\7\u00d8\2\2\u0702\u0704\5\u00c0a\2\u0703\u0702"+
					"\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0707\7\u00e2\2"+
					"\2\u0706\u0701\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a"+
					"\7\u00d8\2\2\u0709\u070b\7\62\2\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2"+
					"\2\2\u070b\u070d\3\2\2\2\u070c\u070e\5\u00c6d\2\u070d\u070c\3\2\2\2\u070d"+
					"\u070e\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\7\u00e2\2\2\u0710\u072f"+
					"\3\2\2\2\u0711\u072f\5\u00e0q\2\u0712\u0713\7\u00cf\2\2\u0713\u072f\5"+
					"\u00c4c\23\u0714\u0715\7t\2\2\u0715\u072f\5\u00c4c\16\u0716\u0717\5\u00d4"+
					"k\2\u0717\u0718\7\u00d0\2\2\u0718\u071a\3\2\2\2\u0719\u0716\3\2\2\2\u0719"+
					"\u071a\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u072f\7\u00c9\2\2\u071c\u071d"+
					"\7\u00d8\2\2\u071d\u071e\5n8\2\u071e\u071f\7\u00e2\2\2\u071f\u072f\3\2"+
					"\2\2\u0720\u0721\7\u00d8\2\2\u0721\u0722\5\u00c4c\2\u0722\u0723\7\u00e2"+
					"\2\2\u0723\u072f\3\2\2\2\u0724\u0725\7\u00d8\2\2\u0725\u0726\5\u00c0a"+
					"\2\u0726\u0727\7\u00e2\2\2\u0727\u072f\3\2\2\2\u0728\u072a\7\u00d6\2\2"+
					"\u0729\u072b\5\u00c0a\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
					"\u072c\3\2\2\2\u072c\u072f\7\u00e1\2\2\u072d\u072f\5\u00ccg\2\u072e\u06ad"+
					"\3\2\2\2\u072e\u06c1\3\2\2\2\u072e\u06c8\3\2\2\2\u072e\u06ca\3\2\2\2\u072e"+
					"\u06d1\3\2\2\2\u072e\u06d5\3\2\2\2\u072e\u06e0\3\2\2\2\u072e\u06e2\3\2"+
					"\2\2\u072e\u06ea\3\2\2\2\u072e\u06f6\3\2\2\2\u072e\u0700\3\2\2\2\u072e"+
					"\u0711\3\2\2\2\u072e\u0712\3\2\2\2\u072e\u0714\3\2\2\2\u072e\u0719\3\2"+
					"\2\2\u072e\u071c\3\2\2\2\u072e\u0720\3\2\2\2\u072e\u0724\3\2\2\2\u072e"+
					"\u0728\3\2\2\2\u072e\u072d\3\2\2\2\u072f\u0777\3\2\2\2\u0730\u0731\f\22"+
					"\2\2\u0731\u0732\t\26\2\2\u0732\u0776\5\u00c4c\23\u0733\u0734\f\21\2\2"+
					"\u0734\u0735\t\27\2\2\u0735\u0776\5\u00c4c\22\u0736\u0749\f\20\2\2\u0737"+
					"\u074a\7\u00d1\2\2\u0738\u074a\7\u00d2\2\2\u0739\u074a\7\u00da\2\2\u073a"+
					"\u074a\7\u00d7\2\2\u073b\u074a\7\u00d3\2\2\u073c\u074a\7\u00d9\2\2\u073d"+
					"\u074a\7\u00d4\2\2\u073e\u0740\7H\2\2\u073f\u073e\3\2\2\2\u073f\u0740"+
					"\3\2\2\2\u0740\u0742\3\2\2\2\u0741\u0743\7t\2\2\u0742\u0741\3\2\2\2\u0742"+
					"\u0743\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u074a\7Q\2\2\u0745\u0747\7t\2"+
					"\2\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a"+
					"\t\30\2\2\u0749\u0737\3\2\2\2\u0749\u0738\3\2\2\2\u0749\u0739\3\2\2\2"+
					"\u0749\u073a\3\2\2\2\u0749\u073b\3\2\2\2\u0749\u073c\3\2\2\2\u0749\u073d"+
					"\3\2\2\2\u0749\u073f\3\2\2\2\u0749\u0746\3\2\2\2\u074a\u074b\3\2\2\2\u074b"+
					"\u0776\5\u00c4c\21\u074c\u074d\f\r\2\2\u074d\u074e\7\b\2\2\u074e\u0776"+
					"\5\u00c4c\16\u074f\u0750\f\f\2\2\u0750\u0751\7z\2\2\u0751\u0776\5\u00c4"+
					"c\r\u0752\u0754\f\13\2\2\u0753\u0755\7t\2\2\u0754\u0753\3\2\2\2\u0754"+
					"\u0755\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0757\7\22\2\2\u0757\u0758\5"+
					"\u00c4c\2\u0758\u0759\7\b\2\2\u0759\u075a\5\u00c4c\f\u075a\u0776\3\2\2"+
					"\2\u075b\u075c\f\n\2\2\u075c\u075d\7\u00dd\2\2\u075d\u075e\5\u00c4c\2"+
					"\u075e\u075f\7\u00cc\2\2\u075f\u0760\5\u00c4c\n\u0760\u0776\3\2\2\2\u0761"+
					"\u0762\f\25\2\2\u0762\u0763\7\u00d6\2\2\u0763\u0764\5\u00c4c\2\u0764\u0765"+
					"\7\u00e1\2\2\u0765\u0776\3\2\2\2\u0766\u0767\f\24\2\2\u0767\u0768\7\u00d0"+
					"\2\2\u0768\u0776\7\u00c5\2\2\u0769\u076a\f\17\2\2\u076a\u076c\7Y\2\2\u076b"+
					"\u076d\7t\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e\3\2"+
					"\2\2\u076e\u0776\7u\2\2\u076f\u0773\f\t\2\2\u0770\u0774\5\u00e8u\2\u0771"+
					"\u0772\7\f\2\2\u0772\u0774\5\u00eav\2\u0773\u0770\3\2\2\2\u0773\u0771"+
					"\3\2\2\2\u0774\u0776\3\2\2\2\u0775\u0730\3\2\2\2\u0775\u0733\3\2\2\2\u0775"+
					"\u0736\3\2\2\2\u0775\u074c\3\2\2\2\u0775\u074f\3\2\2\2\u0775\u0752\3\2"+
					"\2\2\u0775\u075b\3\2\2\2\u0775\u0761\3\2\2\2\u0775\u0766\3\2\2\2\u0775"+
					"\u0769\3\2\2\2\u0775\u076f\3\2\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2"+
					"\2\2\u0777\u0778\3\2\2\2\u0778\u00c5\3\2\2\2\u0779\u0777\3\2\2\2\u077a"+
					"\u077f\5\u00c8e\2\u077b\u077c\7\u00cd\2\2\u077c\u077e\5\u00c8e\2\u077d"+
					"\u077b\3\2\2\2\u077e\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780\3\2"+
					"\2\2\u0780\u00c7\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0785\5\u00caf\2\u0783"+
					"\u0785\5\u00c4c\2\u0784\u0782\3\2\2\2\u0784\u0783\3\2\2\2\u0785\u00c9"+
					"\3\2\2\2\u0786\u0787\7\u00d8\2\2\u0787\u078c\5\u00eav\2\u0788\u0789\7"+
					"\u00cd\2\2\u0789\u078b\5\u00eav\2\u078a\u0788\3\2\2\2\u078b\u078e\3\2"+
					"\2\2\u078c\u078a\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078f\3\2\2\2\u078e"+
					"\u078c\3\2\2\2\u078f\u0790\7\u00e2\2\2\u0790\u079a\3\2\2\2\u0791\u0796"+
					"\5\u00eav\2\u0792\u0793\7\u00cd\2\2\u0793\u0795\5\u00eav\2\u0794\u0792"+
					"\3\2\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797"+
					"\u079a\3\2\2\2\u0798\u0796\3\2\2\2\u0799\u0786\3\2\2\2\u0799\u0791\3\2"+
					"\2\2\u079a\u079b\3\2\2\2\u079b\u079c\7\u00c8\2\2\u079c\u079d\5\u00c4c"+
					"\2\u079d\u00cb\3\2\2\2\u079e\u079f\5\u00d4k\2\u079f\u07a0\7\u00d0\2\2"+
					"\u07a0\u07a2\3\2\2\2\u07a1\u079e\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3"+
					"\3\2\2\2\u07a3\u07a4\5\u00ceh\2\u07a4\u00cd\3\2\2\2\u07a5\u07a8\5\u00ea"+
					"v\2\u07a6\u07a7\7\u00d0\2\2\u07a7\u07a9\5\u00eav\2\u07a8\u07a6\3\2\2\2"+
					"\u07a8\u07a9\3\2\2\2\u07a9\u00cf\3\2\2\2\u07aa\u07ab\bi\1\2\u07ab\u07b2"+
					"\5\u00d4k\2\u07ac\u07b2\5\u00d2j\2\u07ad\u07ae\7\u00d8\2\2\u07ae\u07af"+
					"\5n8\2\u07af\u07b0\7\u00e2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07aa\3\2\2\2"+
					"\u07b1\u07ac\3\2\2\2\u07b1\u07ad\3\2\2\2\u07b2\u07bb\3\2\2\2\u07b3\u07b7"+
					"\f\3\2\2\u07b4\u07b8\5\u00e8u\2\u07b5\u07b6\7\f\2\2\u07b6\u07b8\5\u00ea"+
					"v\2\u07b7\u07b4\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07ba\3\2\2\2\u07b9"+
					"\u07b3\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc\3\2"+
					"\2\2\u07bc\u00d1\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07bf\5\u00eav\2\u07bf"+
					"\u07c1\7\u00d8\2\2\u07c0\u07c2\5\u00d6l\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2"+
					"\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\7\u00e2\2\2\u07c4\u00d3\3\2\2"+
					"\2\u07c5\u07c6\5\u00dan\2\u07c6\u07c7\7\u00d0\2\2\u07c7\u07c9\3\2\2\2"+
					"\u07c8\u07c5\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb"+
					"\5\u00eav\2\u07cb\u00d5\3\2\2\2\u07cc\u07d1\5\u00d8m\2\u07cd\u07ce\7\u00cd"+
					"\2\2\u07ce\u07d0\5\u00d8m\2\u07cf\u07cd\3\2\2\2\u07d0\u07d3\3\2\2\2\u07d1"+
					"\u07cf\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u00d7\3\2\2\2\u07d3\u07d1\3\2"+
					"\2\2\u07d4\u07d8\5\u00ceh\2\u07d5\u07d8\5\u00d2j\2\u07d6\u07d8\5\u00e0"+
					"q\2\u07d7\u07d4\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d6\3\2\2\2\u07d8"+
					"\u00d9\3\2\2\2\u07d9\u07da\5\u00eav\2\u07da\u00db\3\2\2\2\u07db\u07e4"+
					"\7\u00c3\2\2\u07dc\u07dd\7\u00d0\2\2\u07dd\u07e4\t\31\2\2\u07de\u07df"+
					"\7\u00c5\2\2\u07df\u07e1\7\u00d0\2\2\u07e0\u07e2\t\31\2\2\u07e1\u07e0"+
					"\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4\3\2\2\2\u07e3\u07db\3\2\2\2\u07e3"+
					"\u07dc\3\2\2\2\u07e3\u07de\3\2\2\2\u07e4\u00dd\3\2\2\2\u07e5\u07e7\t\32"+
					"\2\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07ee\3\2\2\2\u07e8"+
					"\u07ef\5\u00dco\2\u07e9\u07ef\7\u00c4\2\2\u07ea\u07ef\7\u00c5\2\2\u07eb"+
					"\u07ef\7\u00c6\2\2\u07ec\u07ef\7S\2\2\u07ed\u07ef\7r\2\2\u07ee\u07e8\3"+
					"\2\2\2\u07ee\u07e9\3\2\2\2\u07ee\u07ea\3\2\2\2\u07ee\u07eb\3\2\2\2\u07ee"+
					"\u07ec\3\2\2\2\u07ee\u07ed\3\2\2\2\u07ef\u00df\3\2\2\2\u07f0\u07f4\5\u00de"+
					"p\2\u07f1\u07f4\7\u00c7\2\2\u07f2\u07f4\7u\2\2\u07f3\u07f0\3\2\2\2\u07f3"+
					"\u07f1\3\2\2\2\u07f3\u07f2\3\2\2\2\u07f4\u00e1\3\2\2\2\u07f5\u07f6\t\33"+
					"\2\2\u07f6\u00e3\3\2\2\2\u07f7\u07f8\t\34\2\2\u07f8\u00e5\3\2\2\2\u07f9"+
					"\u07fa\t\35\2\2\u07fa\u00e7\3\2\2\2\u07fb\u07fe\7\u00c2\2\2\u07fc\u07fe"+
					"\5\u00e6t\2\u07fd\u07fb\3\2\2\2\u07fd\u07fc\3\2\2\2\u07fe\u00e9\3\2\2"+
					"\2\u07ff\u0803\7\u00c2\2\2\u0800\u0803\5\u00e2r\2\u0801\u0803\5\u00e4"+
					"s\2\u0802\u07ff\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0801\3\2\2\2\u0803"+
					"\u00eb\3\2\2\2\u0804\u0807\5\u00eav\2\u0805\u0807\7u\2\2\u0806\u0804\3"+
					"\2\2\2\u0806\u0805\3\2\2\2\u0807\u00ed\3\2\2\2\u0808\u0809\7\u00c7\2\2"+
					"\u0809\u080a\7\u00d2\2\2\u080a\u080b\5\u00dep\2\u080b\u00ef\3\2\2\2\u0113"+
					"\u00f4\u00f8\u00fb\u00fe\u0113\u0116\u011e\u0123\u0130\u0139\u0140\u0148"+
					"\u014d\u0154\u0159\u0160\u0165\u016b\u0171\u0176\u017c\u0181\u0187\u018c"+
					"\u0192\u01a0\u01a7\u01ae\u01b5\u01bb\u01c0\u01c6\u01cb\u01d1\u01da\u01e4"+
					"\u01ee\u0202\u020a\u0219\u0220\u022e\u0234\u023a\u0241\u0245\u0248\u024e"+
					"\u0251\u0257\u025b\u025e\u0269\u026d\u0270\u0275\u0277\u027a\u027d\u0287"+
					"\u028b\u028e\u0291\u0296\u0298\u02a0\u02a3\u02a6\u02ac\u02b0\u02b3\u02b6"+
					"\u02b9\u02bc\u02c1\u02c7\u02cb\u02ce\u02d1\u02d5\u02dd\u02f7\u02f9\u02fd"+
					"\u0313\u0315\u0320\u0323\u032c\u033d\u0348\u035a\u0367\u0378\u0381\u039c"+
					"\u039e\u03b3\u03b8\u03bd\u03c0\u03cc\u03d1\u03d5\u03d8\u03dc\u03e0\u03e5"+
					"\u03e8\u03ec\u03ee\u0404\u040c\u040f\u0419\u041d\u0425\u0429\u042e\u0432"+
					"\u0436\u043a\u043e\u0440\u0448\u044c\u044f\u0457\u045c\u0461\u0464\u046e"+
					"\u0478\u047c\u0481\u0485\u048b\u048e\u0491\u0494\u04a2\u04a6\u04aa\u04af"+
					"\u04b2\u04bc\u04c4\u04c7\u04cb\u04ce\u04d2\u04d5\u04d8\u04db\u04de\u04e1"+
					"\u04e5\u04e9\u04ec\u04ef\u04f2\u04f5\u04f8\u0501\u0507\u0522\u0538\u0540"+
					"\u0543\u0549\u0551\u0554\u055a\u055c\u0560\u0565\u0568\u056b\u056f\u0573"+
					"\u0576\u0578\u057b\u057f\u0583\u0586\u0588\u058a\u058d\u0592\u059d\u05a3"+
					"\u05a8\u05af\u05b4\u05b8\u05bc\u05c1\u05c8\u05d0\u05d3\u05d6\u05e9\u05f7"+
					"\u0607\u060a\u0613\u0617\u061c\u0621\u0624\u0626\u063c\u063f\u064a\u064e"+
					"\u0651\u0655\u0659\u0661\u0665\u0672\u067e\u068a\u0692\u0696\u069d\u06a3"+
					"\u06ab\u06b0\u06b9\u06bd\u06dc\u06ed\u06f9\u0703\u0706\u070a\u070d\u0719"+
					"\u072a\u072e\u073f\u0742\u0746\u0749\u0754\u076c\u0773\u0775\u0777\u077f"+
					"\u0784\u078c\u0796\u0799\u07a1\u07a8\u07b1\u07b7\u07bb\u07c1\u07c8\u07d1"+
					"\u07d7\u07e1\u07e3\u07e6\u07ee\u07f3\u07fd\u0802\u0806";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}