package com.example.task4.model.operations.testsMap;


import java.util.Map;

public class AddingNewMap extends BaseMapOperationClass {

    public AddingNewMap(Map<String, Integer> map, Integer id) {
        super(map, id);
    }

    @Override
    protected void runTask() {
        int size = map.size();
        map.put("key " + (size+1), size+1);
    }
}
