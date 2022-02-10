package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import java.util.List;

public abstract class RemovingBeginningBase extends BaseListOperationClass{
    public RemovingBeginningBase(List<Integer> list, Integer iDOperation) {
        super(list, iDOperation);
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;
        synchronized (list) {
            long startTime = System.currentTimeMillis();
            list.remove(0);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
