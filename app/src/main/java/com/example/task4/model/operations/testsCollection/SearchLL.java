package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.SearchLL;

import android.util.Pair;

import java.util.List;

public class SearchLL extends BaseListOperationClass {

    public SearchLL(List<Integer> list) {
        super(list, SearchLL.ordinal());
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.indexOf(size / 2);
    }
}
