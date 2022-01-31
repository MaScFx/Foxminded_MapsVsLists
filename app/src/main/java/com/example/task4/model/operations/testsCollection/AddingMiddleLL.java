package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleAL;
import static com.example.task4.model.constants.Operations.AddingMiddleLL;

import android.util.Pair;

import java.util.List;

public class AddingMiddleLL extends BaseListOperationClass {

    public AddingMiddleLL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return AddingMiddleLL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = list.size();

        long startTime = System.currentTimeMillis();
        list.add(size / 2, size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingMiddleLL.ordinal(), String.valueOf(finalTime));
    }
}
