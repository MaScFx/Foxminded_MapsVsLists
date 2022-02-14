package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndLL;

import java.util.List;

public class AddingEndLL extends BaseListOperationClass {

    public AddingEndLL(List<Integer> list) {
        super(list, AddingEndLL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.add(size - 1, size);
        }
    }
}

