package com.example.task4.model.operations.testsMap;


import static com.example.task4.model.constants.Operations.AddingNewHM;


import android.util.Pair;

import java.util.Map;

public class AddingNewHashMap extends BaseMapOperationClass {

    public AddingNewHashMap(Map<String, Integer> map) {
        super(map);
    }

    @Override
    public Integer getIDOperation() {
        return AddingNewHM.ordinal();
    }

    @Override
    public Pair<Integer, String> call() {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.put("key " + size, size);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingNewHM.ordinal(), String.valueOf(finalTime));
    }
}
