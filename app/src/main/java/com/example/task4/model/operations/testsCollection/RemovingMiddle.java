package com.example.task4.model.operations.testsCollection;

import java.util.List;

public class RemovingMiddle extends BaseListOperationClass {

    public RemovingMiddle(List<Integer> list, Integer id) {
        super(list,id);
    }
    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size / 2);
        }
    }
}
