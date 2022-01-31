package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingMiddleCoW;

import android.util.Pair;

import java.util.List;

public class RemovingMiddleCoW extends BaseListOperationClass {

    public RemovingMiddleCoW(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingMiddleCoW.ordinal();
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

        return new Pair<>(RemovingMiddleCoW.ordinal(), String.valueOf(finalTime));
    }
}
