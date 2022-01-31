package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.RemovingTM;

import android.util.Pair;

import java.util.Map;

public class RemovingTreeMap extends BaseMapOperationClass {

    public RemovingTreeMap(Map<String, Integer> map) {
        super(map);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingTM.ordinal();
    }

    @Override
    public Pair<Integer, String> call() {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.remove("key " + size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(RemovingTM.ordinal(), String.valueOf(finalTime));

    }


}
