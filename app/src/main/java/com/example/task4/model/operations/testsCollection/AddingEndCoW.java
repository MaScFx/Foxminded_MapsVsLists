package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndAL;
import static com.example.task4.model.constants.Operations.AddingEndCoW;

import android.util.Pair;

import java.util.List;

public class AddingEndCoW extends BaseListOperationClass {

    public AddingEndCoW(List<Integer> list) {
        super(list);
    }


    @Override
    public Integer getIDOperation() {
        return AddingEndCoW.ordinal();
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

        return new Pair<>(AddingEndCoW.ordinal(), String.valueOf(finalTime));
    }
}
