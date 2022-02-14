package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.AddingNewTM;

import java.util.Map;

public class AddingNewTreeMap extends BaseMapOperationClass {

    public AddingNewTreeMap(Map<String, Integer> map) {
        super(map, AddingNewTM.ordinal());
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.put("key " + size, size);
    }
}
