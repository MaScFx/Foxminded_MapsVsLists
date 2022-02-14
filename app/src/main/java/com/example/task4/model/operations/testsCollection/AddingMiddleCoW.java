package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleCoW;

import java.util.List;

public class AddingMiddleCoW extends BaseListOperationClass {

    public AddingMiddleCoW(List<Integer> list) {
        super(list, AddingMiddleCoW.ordinal());
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.add(size / 2, size / 2);
    }
}
