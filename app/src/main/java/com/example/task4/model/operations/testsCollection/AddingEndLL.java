package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndLL;

import android.util.Pair;

import java.util.List;

public class AddingEndLL extends AddingEndBase {

    public AddingEndLL(List<Integer> list) {
        super(list,AddingEndLL.ordinal());
    }

//    @Override
//    public Pair<Integer, String> call() throws Exception {
//        long finalTime;
//
//        synchronized (list) {
//            int size = list.size();
//            long startTime = System.currentTimeMillis();
//            list.add(size - 1, size);
//            finalTime = System.currentTimeMillis() - startTime;
//        }
//
//        return new Pair<>(AddingEndLL.ordinal(), String.valueOf(finalTime));
//    }
}

