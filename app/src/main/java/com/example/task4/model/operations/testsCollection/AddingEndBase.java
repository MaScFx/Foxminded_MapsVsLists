package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import java.util.List;

public abstract class AddingEndBase extends BaseListOperationClass{
    public AddingEndBase(List<Integer> list, Integer iDOperation) {
        super(list, iDOperation);
    }
    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;

        synchronized (list) {
            int size = list.size();
            long startTime = System.currentTimeMillis();
            list.add(size - 1, size);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
