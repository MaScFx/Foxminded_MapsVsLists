package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.SearchAL;

import java.util.List;

public class SearchAL extends BaseListOperationClass {

    public SearchAL(List<Integer> list) {
        super(list, SearchAL.ordinal());
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.indexOf(size / 2);
    }
}
