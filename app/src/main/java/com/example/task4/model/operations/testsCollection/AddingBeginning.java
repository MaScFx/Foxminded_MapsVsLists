package com.example.task4.model.operations.testsCollection;

import java.util.List;

public class AddingBeginning extends BaseListOperationClass {

    public AddingBeginning(List<Integer> list, Integer id) {
        super(list, id);
    }

    @Override
    protected void runTask() {
        list.add(0, 1);
    }
}
