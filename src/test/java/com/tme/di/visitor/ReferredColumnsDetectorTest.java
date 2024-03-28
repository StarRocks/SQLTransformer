package com.tme.di.visitor;

import com.tme.di.parser.MetadataService;
import com.tme.di.parser.ReferredColumnsDetector;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class ReferredColumnsDetectorTest {

    private MetadataService mockedMetadataService = new MetadataService() {
        @Override
        public String getPartitionColName(String tableFullName) {
            return null;
        }

        @Override
        public List<String> getTables() {
            return null;
        }

        @Override
        public List<String> getColumns(String tableFullName) {
            String[] columnsArray = {"date"};
            return Arrays.asList(columnsArray.clone());
        }
    };

    @Test
    public void testRewrite1() {
        String sql = "SELECT \n" +
                "    multiIf(length(adtag)=0,'直接进入',adtag) AS adtag\n" +
                "FROM \n" +
                "    database.table\n" +
                "WHERE \n" +
                "    date >= toDate('2022-04-26') AND date <= toDate('2022-04-26')\n" +
                "GROUP BY\n" +
                "    adtag \n" +
                "LIMIT \n" +
                "    10000";
        long start = System.currentTimeMillis();
        System.out.println("timestamp: " + start);

        ReferredColumnsDetector referredColumnsDetector = new ReferredColumnsDetector(mockedMetadataService);
        List<String> columns = referredColumnsDetector.searchColumns(sql);
        columns.forEach(column -> System.out.println(column));

        long end = System.currentTimeMillis();
        System.out.println("timestamp: " + end);
        System.out.println("It takes " + (end - start) + " ms totally. ");
    }

    @Test
    public void testRewrite2() {
        String sql = "SELECT pgv_pvid FROM (SELECT * FROM database.table LIMIT 10000) t";
        long start = System.currentTimeMillis();
        System.out.println("timestamp: " + start);

        ReferredColumnsDetector referredColumnsDetector = new ReferredColumnsDetector(mockedMetadataService);
        List<String> columns = referredColumnsDetector.searchColumns(sql);
        columns.forEach(column -> System.out.println(column));

        long end = System.currentTimeMillis();
        System.out.println("timestamp: " + end);
        System.out.println("It takes " + (end - start) + " ms totally. ");
    }


}
