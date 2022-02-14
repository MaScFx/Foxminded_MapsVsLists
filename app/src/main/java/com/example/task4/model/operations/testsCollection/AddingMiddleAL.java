package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleAL;

import java.util.List;

public class AddingMiddleAL extends BaseListOperationClass {

    public AddingMiddleAL(List<Integer> list) {
        super(list, AddingMiddleAL.ordinal());
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.add(size / 2, size / 2);
    }
}
