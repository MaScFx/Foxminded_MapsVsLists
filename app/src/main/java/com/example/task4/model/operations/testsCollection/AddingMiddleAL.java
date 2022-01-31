package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleAL;

import android.util.Pair;

import java.util.List;

public class AddingMiddleAL extends BaseListOperationClass {

    public AddingMiddleAL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return AddingMiddleAL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = list.size();

        long startTime = System.currentTimeMillis();
        list.add(size / 2, size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingMiddleAL.ordinal(), String.valueOf(finalTime));
    }
}
