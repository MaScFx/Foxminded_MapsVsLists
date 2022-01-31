package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.RemovingHM;

import android.util.Pair;

import java.util.Map;

public class RemovingHashMap extends BaseMapOperationClass {

    public RemovingHashMap(Map<String, Integer> map) {
        super(map);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingHM.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.remove("key " + size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(RemovingHM.ordinal(), String.valueOf(finalTime));
    }
}
