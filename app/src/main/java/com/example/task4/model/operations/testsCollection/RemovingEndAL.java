package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndAL;

import java.util.List;

public class RemovingEndAL extends BaseListOperationClass {

    public RemovingEndAL(List<Integer> list) {
        super(list, RemovingEndAL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size - 1);
        }
    }
}
