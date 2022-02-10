package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingBeginningLL;

import android.util.Pair;

import java.util.List;

public class RemovingBeginningLL extends RemovingBeginningBase {

    public RemovingBeginningLL(List<Integer> list) {
        super(list,RemovingBeginningLL.ordinal());
    }

//    @Override
//    public Integer getIDOperation() {
//        return RemovingBeginningLL.ordinal();
//    }

//    @Override
//    public Pair<Integer, String> call() throws Exception {
//        long finalTime;
//
//        synchronized (list) {
//            long startTime = System.currentTimeMillis();
//            list.remove(0);
//            finalTime = System.currentTimeMillis() - startTime;
//        }
//
//        return new Pair<>(RemovingBeginningLL.ordinal(), String.valueOf(finalTime));
//    }
}

