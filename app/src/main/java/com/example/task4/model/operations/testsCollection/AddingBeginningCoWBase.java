package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningCoW;

import java.util.List;

public class AddingBeginningCoWBase extends BaseListOperationClass {

    public AddingBeginningCoWBase(List<Integer> list) {
        super(list, AddingBeginningCoW.ordinal());
    }

    @Override
    protected void runTask() {
        list.add(0, 1);
    }
}
