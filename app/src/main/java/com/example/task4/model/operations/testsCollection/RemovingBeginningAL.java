package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingBeginningAL;

import android.util.Pair;

import java.util.List;

public class RemovingBeginningAL extends BaseListOperationClass {

    public RemovingBeginningAL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingBeginningAL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;
        synchronized (list) {
            long startTime = System.currentTimeMillis();
            list.remove(0);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(RemovingBeginningAL.ordinal(), String.valueOf(finalTime));
    }
}
