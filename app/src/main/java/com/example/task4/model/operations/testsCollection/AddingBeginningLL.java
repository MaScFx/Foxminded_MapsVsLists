package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningLL;

import android.util.Pair;

import java.util.List;

public class AddingBeginningLL extends BaseListOperationClass {

    public AddingBeginningLL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return AddingBeginningLL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long startTime = System.currentTimeMillis();
        list.add(0, 1);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingBeginningLL.ordinal(), String.valueOf(finalTime));
    }
}
