package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingMiddleAL;

import android.util.Pair;

import java.util.List;

public class RemovingMiddleAL extends BaseListOperationClass {

    public RemovingMiddleAL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingMiddleAL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;

        synchronized (list) {
            int size = list.size();
            long startTime = System.currentTimeMillis();
            list.remove(size / 2);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(RemovingMiddleAL.ordinal(), String.valueOf(finalTime));
    }
}
