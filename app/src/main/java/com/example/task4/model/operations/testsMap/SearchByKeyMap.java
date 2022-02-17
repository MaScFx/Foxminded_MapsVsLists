package com.example.task4.model.operations.testsMap;

import java.util.Map;

public class SearchByKeyMap extends BaseMapOperationClass {

    public SearchByKeyMap(Map<String, Integer> map, Integer id) {
        super(map, id);
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.get("key " + size / 2);
    }
}
