package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.SearchLL;

import android.util.Pair;

import java.util.List;

public class SearchLL extends SearchBase {

    public SearchLL(List<Integer> list) {
        super(list,SearchLL.ordinal());
    }

//    @Override
//    public Integer getIDOperation() {
//        return SearchLL.ordinal();
//    }

//    @Override
//    public Pair<Integer, String> call() throws Exception {
//        int size = list.size();
//
//        long startTime = System.currentTimeMillis();
//        list.indexOf(size / 2);
//        long finalTime = System.currentTimeMillis() - startTime;
//
//        return new Pair<>(SearchLL.ordinal(), String.valueOf(finalTime));
//    }
}
