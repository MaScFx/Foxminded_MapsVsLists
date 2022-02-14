package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleLL;

import java.util.List;

public class AddingMiddleLL extends BaseListOperationClass {

    public AddingMiddleLL(List<Integer> list) {
        super(list, AddingMiddleLL.ordinal());
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.add(size / 2, size / 2);
    }
}
