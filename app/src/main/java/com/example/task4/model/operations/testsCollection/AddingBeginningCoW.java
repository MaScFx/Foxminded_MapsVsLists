package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningCoW;

import android.util.Pair;

import java.util.List;

public class AddingBeginningCoW extends BaseListOperationClass {

    public AddingBeginningCoW(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return AddingBeginningCoW.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long startTime = System.currentTimeMillis();
        list.add(0, 1);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(AddingBeginningCoW.ordinal(), String.valueOf(finalTime));
    }
}
