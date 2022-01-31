package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndLL;

import android.util.Pair;

import java.util.List;

public class RemovingEndLL extends BaseListOperationClass {

    public RemovingEndLL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingEndLL.ordinal();
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

        return new Pair<>(RemovingEndLL.ordinal(), String.valueOf(finalTime));
    }
}
