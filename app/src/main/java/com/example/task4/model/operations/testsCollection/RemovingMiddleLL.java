package com.example.task4.model.operations.testsCollection;


import static com.example.task4.model.constants.Operations.RemovingMiddleLL;

import java.util.List;

public class RemovingMiddleLL extends BaseListOperationClass {

    public RemovingMiddleLL(List<Integer> list) {
        super(list,RemovingMiddleLL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.remove(size / 2);
        }
    }
}
