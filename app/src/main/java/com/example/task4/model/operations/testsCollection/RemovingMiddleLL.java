package com.example.task4.model.operations.testsCollection;


import static com.example.task4.model.constants.Operations.RemovingMiddleLL;

import android.util.Pair;

import java.util.List;

public class RemovingMiddleLL extends BaseListOperationClass {

    public RemovingMiddleLL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingMiddleLL.ordinal();
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

        return new Pair<>(RemovingMiddleLL.ordinal(), String.valueOf(finalTime));
    }
}
