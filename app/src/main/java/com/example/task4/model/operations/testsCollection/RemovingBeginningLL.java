package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingBeginningLL;

import java.util.List;

public class RemovingBeginningLL extends BaseListOperationClass {

    public RemovingBeginningLL(List<Integer> list) {
        super(list, RemovingBeginningLL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            list.remove(0);
        }
    }
}

