package com.tme.di.visitor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Slf4j
public class StarRocksSqlBuilderTest {

    private static class TestCase{
        public String ckSql;
        public String expectedSRSql;
        public String desc;
        TestCase(String ckSql, String expectedSRSql, String desc) {
            this.ckSql = ckSql;
            this.expectedSRSql = expectedSRSql;
            this.desc = desc;
        }
    }
    private static final List<TestCase> testCases = new ArrayList<>();
    static {
        testCases.add(
                // 验证列名能自动加上子查询的别名消歧
                new TestCase("select t1.e as e from (select e from q) t1 join (select e from w) t2 on t1.e = t2.e ",
                        "select t1.e as e from (select e from q )  t1  inner join (select e from w )  t2  on (t1.e) = (t2.e)",
                        "验证JOIN后面的条件不会因为columnCache的导致错误"));
        testCases.add(
                // 验证列名能自动加上子查询的别名消歧
                new TestCase("select e from (select e from q) t1 join (select e from w) t2 on t1.e = t2.e ",
                "select t1.e from (select e from q )  t1  inner join (select e from w )  t2  on (t1.e) = (t2.e)",
                        "验证列名能自动加上子查询的别名消歧"));
        testCases.add(
                // 验证列名在函数内的时候也能自动加上子查询的别名消歧
                new TestCase("select count(e) from (select e from q) t1 join (select e from w) t2 on t1.w = t2.w ",
                        "select count(t1.e) from (select e from q )  t1  inner join (select e from w )  t2  on (t1.w) = (t2.w)",
                        "验证列名在函数内的时候也能自动加上子查询的别名消歧"));
        testCases.add(
                // 验证列名在嵌套函数内的时候也能自动加上子查询的别名消歧
                new TestCase("select count(toString(e)) from (select e from q) t1 join (select e from w) t2 on t1.w = t2.w ",
                        "select count(cast(t1.e as string)) from (select e from q )  t1  inner join (select e from w )  t2  on (t1.w) = (t2.w)",
                        "验证列名在嵌套函数内的时候也能自动加上子查询的别名消歧"));
        testCases.add(
                new TestCase("select a from (select a, e from q) t1 join (select e from w) t2 on t1.w = t2.w ",
                "select a from (select a,e from q )  t1  inner join (select e from w )  t2  on (t1.w) = (t2.w)",
                "验证列名如果没有歧义的话就无需处理"));
        testCases.add(
                //
                new TestCase("select a from (select e from q) t1 join (select e from w) t2 on t1.w = t2.w ",
                        "select a from (select e from q )  t1  inner join (select e from w )  t2  on (t1.w) = (t2.w)",
                        "验证列名能自动加上子查询的别名消歧"));
        testCases.add(
                //
                new TestCase("select t1.a from (select e from q) t1 join (select e from w) t2 on t1.w = t2.w   ",
                        "select t1.a from (select e from q )  t1  inner join (select e from w )  t2  on (t1.w) = (t2.w)",
                        "验证列名已经有指定别名的情况下不会改变"));
        testCases.add(
                new TestCase("select a from (select e from q) t1",
                        "select a from (select e from q )  t1",
                        "验证列名在没有join的情况下不会改变"));
        testCases.add(
                new TestCase("select a - b c, c + d e from t",
                "select (a) - (b) as c,((a) - (b)) + (d) as e from t",
                    "验证计算列在SELECT正常工作"));

        testCases.add(
                new TestCase(
                        "select c from (select count(*) as c) t group by c",
                        "select c from (select count(*) as c )  t  group by c",
                        "测试计算列正常工作, group by c没有被替换成count(*)"
                )
        );
        testCases.add(
                new TestCase("select count(distinct a) as \"count_distinct_a\" from t group by \"count_distinct_a\" order by \"count_distinct_a\"",
                        "select count(distinct(a)) as \"count_distinct_a\" from t group by count(distinct(a)) order by count(distinct(a)) asc",
                        "验证计算列在GROUP BY和ORDER BY正常工作")
        );
        testCases.add(
                new TestCase("select a as b from t1 union all select c as b from t2",
                        "select a as b from t1  union all select c as b from t2",
                        "验证计算列不会混淆不同的作用域1")
        );
        testCases.add(
                new TestCase("select a as b from t1 union all select b as c from t2",
                        "select a as b from t1  union all select b as c from t2",
                        "验证计算列不会混淆不同的作用域2")
        );
        testCases.add(
                new TestCase("select a.label2 from (select label2 from (select exp label2 from t1) j ) a left join (select label2 from (select exp label2 from t2) k ) b on a.label2 = b.label2",
                        "select a.label2 from (select label2 from (select exp as label2 from t1 )  j  )  a  left join (select label2 from (select exp as label2 from t2 )  k  )  b  on (a.label2) = (b.label2)",
                        "验证计算列不会混淆不同的作用域3")
        );
        testCases.add(
                new TestCase(
                        "select toDateTime(unix_time) unix_time",
                        "select from_unixtime(cast(unix_time as double)) as unix_time",
                        "验证原始列名被作为别名列名的情况下能够正常改写"
                ));
//
        testCases.add(
                new TestCase(
                        "select toDateTime(unix_time1) unix_time1 FROM (select toDateTime(unix_time) unix_time1 ) t",
                        "select cast(unix_time1 as datetime) as unix_time1 from (select from_unixtime(cast(unix_time as double)) as unix_time1 )  t",
                        "验证能够合理推算子查询的列是否是datetime类型并合理改写toDateTime函数1"
                ));
        testCases.add(
                new TestCase(
                        "select toDateTime(unix_time) unix_time FROM (select toDateTime(unix_time) unix_time) t",
                        "select cast(unix_time as datetime) as unix_time from (select from_unixtime(cast(unix_time as double)) as unix_time )  t",
                        "验证在名字反复重复的情况下依然能够合理推算子查询的列是否是datetime类型并合理改写toDateTime函数"
                ));
        testCases.add(
                new TestCase(
                        "select toDateTime(date)",
                        "select CAST(date AS DATETIME)",
                        ""
                ));
        testCases.add(
                new TestCase(
                        "select toDateTime(ftime)",
                        "select CAST(ftime AS DATETIME)",
                        ""
                ));
        testCases.add(
                new TestCase(
                        "select toDateTime(date)",
                        "select CAST(date AS DATETIME)",
                        ""
                ));
        testCases.add(
                new TestCase(
                        "select toDateTime(unix_time)",
                        "select FROM_UNIXTIME(CAST(unix_time AS DOUBLE))",
                        ""
                ));
        testCases.add(
                new TestCase(
                        "SELECT toUInt32(toDateTime(unix_time))",
                        "select UNIX_TIMESTAMP(FROM_UNIXTIME(CAST(unix_time AS DOUBLE)))",
                        ""
                ));
        testCases.add(
                new TestCase(
                        "SELECT toDateTime(date_time) FROM (SELECT toDateTime(a) as date_time from t) k",
                        "select cast(date_time as datetime) from (select cast(a as datetime) as date_time from t )  k",
                        ""
                ));
        testCases.add(
                new TestCase(
                        "select toTime(now())",
                        "select cast(concat('1970-01-02 ', split(cast(now() as string), ' '))[1] as datetime)",
                        "测试toTime函数"
                )
        );
        testCases.add(
                new TestCase(
                        "select toDateTimeOrZero(now())",
                        "select cast(now() as datetime)",
                        "测试toDateTimeOrZero函数"
                )
        );
        testCases.add(
                new TestCase(
                        "select timestamp_add(day, -1, '2024-02-14')",
                        "select date_add('2024-02-14', INTERVAL -1 DAY)",
                        "测试timestamp_add函数"
                )
        );
    }



    @Test
    public void testStarRocksSqlBuilder() throws SqlRewriteException {
        String sql = "SELECT toDateTime(date_time) FROM db.table";
        StarRocksSqlBuilder sr = new StarRocksSqlBuilder(true);
        String rewrittenSql = sr.getStarRocksSql(sql);
        System.out.println(rewrittenSql);
    }

    @Test
    public void testAllCases() throws SqlRewriteException {
        for(TestCase testCase: testCases){
            String ckSql = testCase.ckSql;
            String desc = testCase.desc;
            System.out.println("Testing " + desc);
            String expectedSRSql =  testCase.expectedSRSql.toLowerCase().trim();
            StarRocksSqlBuilder srb = new StarRocksSqlBuilder(
                    true,
                    false,
                    new HashMap<>(),
                    new HashSet<>(Arrays.asList("UNIX_TIME")),
                    new HashSet<>(Arrays.asList("DATE"))
            );
            String actualSrSql = srb.getStarRocksSql(ckSql).toLowerCase().trim();
            assertEquals(expectedSRSql, actualSrSql, desc);
        }
    }

}
