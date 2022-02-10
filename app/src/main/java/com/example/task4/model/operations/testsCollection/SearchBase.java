package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import java.util.List;

public abstract class SearchBase extends BaseListOperationClass{
    public SearchBase(List<Integer> list, Integer iDOperation) {
        super(list, iDOperation);
    }
    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = list.size();

        long startTime = System.currentTimeMillis();
        list.indexOf(size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
