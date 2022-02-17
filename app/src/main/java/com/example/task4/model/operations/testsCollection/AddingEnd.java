package com.example.task4.model.operations.testsCollection;

import java.util.List;

public class AddingEnd extends BaseListOperationClass {

    public AddingEnd(List<Integer> list, Integer id) {
        super(list, id);
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.add(size - 1, size);
        }
    }


}
