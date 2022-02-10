package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import java.util.List;

public abstract class RemovingEndBase extends BaseListOperationClass{

    public RemovingEndBase(List<Integer> list, Integer iDOperation) {
        super(list, iDOperation);
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;

        synchronized (list) {
            int size = list.size();
            long startTime = System.currentTimeMillis();
            list.remove(size - 1);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
