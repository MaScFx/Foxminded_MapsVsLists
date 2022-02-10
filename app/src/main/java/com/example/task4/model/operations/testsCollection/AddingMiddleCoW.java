package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleAL;
import static com.example.task4.model.constants.Operations.AddingMiddleCoW;

import android.util.Pair;

import java.util.List;

public class AddingMiddleCoW extends AddingMiddleBase {

    public AddingMiddleCoW(List<Integer> list) {
        super(list,AddingMiddleCoW.ordinal());
    }

//    @Override
//    public Integer getIDOperation() {
//        return AddingMiddleCoW.ordinal();
//    }

//    @Override
//    public Pair<Integer, String> call() throws Exception {
//        int size = list.size();
//        long startTime = System.currentTimeMillis();
//        list.add(size / 2, size / 2);
//        long finalTime = System.currentTimeMillis() - startTime;
//
//        return new Pair<>(AddingMiddleCoW.ordinal(), String.valueOf(finalTime));
//    }
}
