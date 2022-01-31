package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndAL;

import android.util.Pair;

import java.util.List;

public class AddingEndAL extends BaseListOperationClass {

    public AddingEndAL(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return AddingEndAL.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;

        synchronized (list) {
            int size = list.size();
            long startTime = System.currentTimeMillis();
            list.add(size - 1, size);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(AddingEndAL.ordinal(), String.valueOf(finalTime));
    }
}
