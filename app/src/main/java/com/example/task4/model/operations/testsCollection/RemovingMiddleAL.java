package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingMiddleAL;

import java.util.List;

public class RemovingMiddleAL extends BaseListOperationClass {

    public RemovingMiddleAL(List<Integer> list) {
        super(list,RemovingMiddleAL.ordinal());
    }
    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size / 2);
        }
    }
}
