package com.example.task4.model.operations.testsMap;

import android.util.Pair;

import java.util.Map;

public abstract class RemovingBase extends BaseMapOperationClass{
    public RemovingBase(Map<String, Integer> map, Integer iDOperation) {
        super(map, iDOperation);
    }
    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.remove("key " + size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
