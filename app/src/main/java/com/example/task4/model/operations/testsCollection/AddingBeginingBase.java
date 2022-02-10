package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import java.util.List;

public abstract class AddingBeginingBase extends BaseListOperationClass{
    public AddingBeginingBase(List<Integer> list, Integer iDOperation) {
        super(list, iDOperation);
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long startTime = System.currentTimeMillis();
        list.add(0, 1);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
