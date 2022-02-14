package com.example.task4.model.operations.testsCollection;


import static com.example.task4.model.constants.Operations.RemovingBeginningCoW;

import java.util.List;

public class RemovingBeginningCoW extends BaseListOperationClass {

    public RemovingBeginningCoW(List<Integer> list) {
        super(list, RemovingBeginningCoW.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            list.remove(0);
        }
    }
}
