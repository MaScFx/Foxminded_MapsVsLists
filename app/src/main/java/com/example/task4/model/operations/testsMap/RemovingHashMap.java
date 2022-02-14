package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.RemovingHM;

import java.util.Map;

public class RemovingHashMap extends BaseMapOperationClass {

    public RemovingHashMap(Map<String, Integer> map) {
        super(map, RemovingHM.ordinal());
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.remove("key " + size / 2);
    }
}
