package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndCoW;

import java.util.List;

public class AddingEndCoW extends BaseListOperationClass {

    public AddingEndCoW(List<Integer> list) {
        super(list, AddingEndCoW.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.add(size - 1, size);
        }
    }
}
