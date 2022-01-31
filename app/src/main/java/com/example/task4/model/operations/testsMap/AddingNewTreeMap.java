package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.AddingNewTM;

import android.util.Pair;

import java.util.Map;

public class AddingNewTreeMap extends BaseMapOperationClass {

    public AddingNewTreeMap(Map<String, Integer> map) {
        super(map);
    }

    @Override
    public Integer getIDOperation() {
        return AddingNewTM.ordinal();
    }

    @Override
    public Pair<Integer, String> call() {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.put("key " + size, size);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingNewTM.ordinal(), String.valueOf(finalTime));
    }
}
