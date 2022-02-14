package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingMiddleCoW;

import java.util.List;

public class RemovingMiddleCoW extends BaseListOperationClass {

    public RemovingMiddleCoW(List<Integer> list) {
        super(list, RemovingMiddleCoW.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size / 2);
        }
    }
}
