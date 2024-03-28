package com.tme.di.parser;

import java.util.List;

public interface MetadataService {

    String getPartitionColName(String tableFullName);

    List<String> getTables();

    List<String> getColumns(String tableFullName);

}
