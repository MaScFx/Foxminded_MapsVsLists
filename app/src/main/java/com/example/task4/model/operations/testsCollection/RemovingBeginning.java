package com.example.task4.model.operations.testsCollection;

import java.util.List;

public class RemovingBeginning extends BaseListOperationClass {

    public RemovingBeginning(List<Integer> list, Integer id) {
        super(list, id);
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            list.remove(0);
        }
    }
}
