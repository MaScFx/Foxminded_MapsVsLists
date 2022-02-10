package com.example.task4.model.operations.testsMap;

import android.util.Pair;

import java.util.Map;

public abstract class AddingNewBase extends BaseMapOperationClass {

    public AddingNewBase(Map<String, Integer> map, Integer iDOperation) {
        super(map, iDOperation);
    }

    @Override
    public Pair<Integer, String> call() {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.put("key " + size, size);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
