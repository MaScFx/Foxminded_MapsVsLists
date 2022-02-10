package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import java.util.List;

public abstract class AddingMiddleBase extends BaseListOperationClass {
    public AddingMiddleBase(List<Integer> list, Integer iDOperation) {
        super(list, iDOperation);
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = list.size();

        long startTime = System.currentTimeMillis();
        list.add(size / 2, size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
