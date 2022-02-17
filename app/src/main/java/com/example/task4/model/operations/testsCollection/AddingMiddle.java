package com.example.task4.model.operations.testsCollection;

import java.util.List;

public class AddingMiddle extends BaseListOperationClass {

    public AddingMiddle(List<Integer> list, Integer id) {
        super(list, id);
    }

    @Override
    protected void runTask() {
        int size = list.size();
        list.add(size / 2, size / 2);
    }
}
