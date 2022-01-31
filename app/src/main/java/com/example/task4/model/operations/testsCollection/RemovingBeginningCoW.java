package com.example.task4.model.operations.testsCollection;


import static com.example.task4.model.constants.Operations.RemovingBeginningCoW;


import android.util.Pair;

import java.util.List;

public class RemovingBeginningCoW extends BaseListOperationClass {

    public RemovingBeginningCoW(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return RemovingBeginningCoW.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        long finalTime;

        synchronized (list) {
            long startTime = System.currentTimeMillis();
            list.remove(0);
            finalTime = System.currentTimeMillis() - startTime;
        }

        return new Pair<>(RemovingBeginningCoW.ordinal(), String.valueOf(finalTime));
    }
}
