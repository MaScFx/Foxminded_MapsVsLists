package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndCoW;

import android.util.Pair;

import java.util.List;

public class RemovingEndCoW extends RemovingEndBase {

    public RemovingEndCoW(List<Integer> list) {
        super(list,RemovingEndCoW.ordinal());
    }


//    @Override
//    public Integer getIDOperation() {
//        return RemovingEndCoW.ordinal();
//    }
//
//    @Override
//    public Pair<Integer, String> call() throws Exception {
//        long finalTime;
//
//        synchronized (list) {
//            int size = list.size();
//            long startTime = System.currentTimeMillis();
//            list.remove(size - 1);
//            finalTime = System.currentTimeMillis() - startTime;
//        }
//
//        return new Pair<>(RemovingEndCoW.ordinal(), String.valueOf(finalTime));
//    }
}

