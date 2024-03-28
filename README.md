# ClickHouse SQL Rewriter
# Introduction
The ClickHouse SQL Rewriter provides the ability to convert ClickHouse SQL queries into StarRocks/Doris SQL queries. It offers several features to facilitate this conversion:

1. Function Rewrite:
   * The most commonly used ClickHouse functions are automatically rewritten to their syntactically equivalent counterparts in StarRocks.
   * Overload resolution: For overloaded functions in ClickHouse, the rewriter supports global field type reference for resolution. Users can also provide optional table-level field type information for better resolution. For example, the toDateTime function can parse either a Unix timestamp (e.g., `1711405674`) or a string with a datetime pattern (e.g., `2024-01-01 00:00:00`).
2. Scoped Calculated Column:
   * ClickHouse supports ad hoc calculated columns for reuse within the same level. The ClickHouse SQL Rewriter also supports this feature.
3. Ambiguous Column Resolution:
   * ClickHouse allows users to omit the subquery label of a column, even if it appears in both the left and right parts of a join. For example, `select c from (select c from a) t1 left join (select c from b) t2` is allowed in ClickHouse but would cause an error (`c is ambiguous`). The ClickHouse SQL Rewriter can rewrite `c` to `t1.c`, resolving the ambiguity.
4. Automatic Subquery Alias:
   * Similar to ambiguous columns, ClickHouse allows subqueries without aliases. The ClickHouse SQL Rewriter automatically assigns labels to subqueries without aliases.
5. Complex Syntax Rewrite:
   * Window clause: ClickHouse allows users to specify a window clause using the syntax window `<window_name> as (partition by <column>`).
   * Array Join Clause: ClickHouse supports specifying an array join clause.
   * Double Quote Strip: In ClickHouse, double quotes are used to quote identifiers, while in StarRocks and most other SQL dialects, they are used for strings. The ClickHouse SQL Rewriter handles the necessary conversions.
6. More:
   * The `BaseSqlBuilder` template allows easy conversion of ClickHouse SQL to any desired SQL dialect. Simply subclass `BaseSqlBuilder` and start using it.

# Quick Start
```java
String clickhouseSql = "SELECT toDateTime(date_time) FROM db.table";
StarRocksSqlBuilder sr = new StarRocksSqlBuilder();
String starRocksSql = sr.getStarRocksSql(clickhouseSql);
System.out.println(starRocksSql);
```


