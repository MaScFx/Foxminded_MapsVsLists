package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndCoW;

import java.util.List;

public class RemovingEndCoW extends BaseListOperationClass {

    public RemovingEndCoW(List<Integer> list) {
        super(list, RemovingEndCoW.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size - 1);
        }
    }
}

