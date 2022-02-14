package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndLL;

import java.util.List;

public class RemovingEndLL extends BaseListOperationClass {

    public RemovingEndLL(List<Integer> list) {
        super(list, RemovingEndLL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size - 1);
        }
    }
}
