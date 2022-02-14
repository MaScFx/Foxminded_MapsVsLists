package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingBeginningAL;

import java.util.List;

public class RemovingBeginningAL extends BaseListOperationClass {

    public RemovingBeginningAL(List<Integer> list) {
        super(list, RemovingBeginningAL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            list.remove(0);
        }
    }
}
