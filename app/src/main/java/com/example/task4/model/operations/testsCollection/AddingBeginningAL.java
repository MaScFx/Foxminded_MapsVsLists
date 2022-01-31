package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningAL;

import android.util.Pair;

import java.util.List;

public class AddingBeginningAL extends BaseListOperationClass {

    public AddingBeginningAL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return AddingBeginningAL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long startTime = System.currentTimeMillis();
        list.add(0, 1);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingBeginningAL.ordinal(), String.valueOf(finalTime));
    }
}
