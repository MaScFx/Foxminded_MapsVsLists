package com.example.task4.model.operations.testsMap;

import java.util.Map;

public class RemovingMap extends BaseMapOperationClass {

    public RemovingMap(Map<String, Integer> map,Integer id) {
        super(map, id);
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.remove("key " + size / 2);
    }
}
