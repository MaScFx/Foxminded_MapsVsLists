package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.SearchTM;

import android.util.Pair;

import java.util.Map;

public class SearchByKeyTreeMap extends BaseMapOperationClass {

    public SearchByKeyTreeMap(Map<String, Integer> map) {
        super(map);
    }

    @Override
    public Integer getIDOperation() {
        return SearchTM.ordinal();
    }

    @Override
    public Pair<Integer, String> call() {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.get("key " + size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(SearchTM.ordinal(), String.valueOf(finalTime));
    }
}
