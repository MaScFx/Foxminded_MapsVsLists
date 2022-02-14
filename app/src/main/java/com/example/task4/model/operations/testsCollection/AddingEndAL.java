package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndAL;

import java.util.List;

public class AddingEndAL extends BaseListOperationClass {

    public AddingEndAL(List<Integer> list) {
        super(list, AddingEndAL.ordinal());
    }

    @Override
    protected void runTask() {
        synchronized (list) {
            int size = list.size();
            list.add(size - 1, size);
        }
    }


}
