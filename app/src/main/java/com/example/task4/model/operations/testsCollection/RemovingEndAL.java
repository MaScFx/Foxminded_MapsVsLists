package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndAL;

import android.util.Pair;

import java.util.List;

public class RemovingEndAL extends BaseListOperationClass {

    public RemovingEndAL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingEndAL.ordinal();
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

        return new Pair<>(RemovingEndAL.ordinal(), String.valueOf(finalTime));
    }
}
