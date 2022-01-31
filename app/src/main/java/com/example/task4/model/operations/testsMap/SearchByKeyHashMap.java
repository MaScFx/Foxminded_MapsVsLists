package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.SearchHM;

import android.util.Pair;

import java.util.Map;

public class SearchByKeyHashMap extends BaseMapOperationClass {

    public SearchByKeyHashMap(Map<String, Integer> map) {
        super(map);
    }

    @Override
    public Integer getIDOperation() {
        return SearchHM.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.get("key " + size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(SearchHM.ordinal(), String.valueOf(finalTime));
    }
}
