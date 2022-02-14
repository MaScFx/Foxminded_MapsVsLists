package com.example.task4.model.operations.testsMap;


import static com.example.task4.model.constants.Operations.AddingNewHM;

import java.util.Map;

public class AddingNewHashMap extends BaseMapOperationClass {

    public AddingNewHashMap(Map<String, Integer> map) {
        super(map, AddingNewHM.ordinal());
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.put("key " + size, size);
    }
}
