package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningLL;

import java.util.List;

public class AddingBeginningLLBase extends BaseListOperationClass {

    public AddingBeginningLLBase(List<Integer> list) {
        super(list, AddingBeginningLL.ordinal());
    }

    @Override
    protected void runTask() {
        list.add(0, 1);
    }
}
