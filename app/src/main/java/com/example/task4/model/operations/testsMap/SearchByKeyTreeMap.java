package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.SearchTM;

import java.util.Map;

public class SearchByKeyTreeMap extends BaseMapOperationClass {

    public SearchByKeyTreeMap(Map<String, Integer> map) {
        super(map, SearchTM.ordinal());
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.get("key " + size / 2);
    }
}
