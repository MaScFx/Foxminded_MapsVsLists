package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.SearchCoW;

import java.util.List;

public class SearchCoW extends BaseListOperationClass {

    public SearchCoW(List<Integer> list) {
        super(list, SearchCoW.ordinal());
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.indexOf(size / 2);
    }
}
