package com.example.task4.model.operations.testsCollection;

import java.util.List;

public class SearchAL extends BaseListOperationClass {

    public SearchAL(List<Integer> list, Integer id) {
        super(list, id);
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.indexOf(size / 2);
    }
}
