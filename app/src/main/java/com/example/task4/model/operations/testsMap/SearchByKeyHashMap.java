package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.SearchHM;

import java.util.Map;

public class SearchByKeyHashMap extends SearchByKeyBase {

    public SearchByKeyHashMap(Map<String, Integer> map) {
        super(map, SearchHM.ordinal());
    }
}
