package com.example.task4.model.operations.testsCollection;


import com.example.task4.model.operations.IOperation;

import java.util.List;

public abstract class BaseListOperationClass implements IOperation {
    private final Integer iDOperation;

    public BaseListOperationClass(List<Integer> list, Integer iDOperation) {
        this.iDOperation = iDOperation;
        this.list = list;
    }

//    public BaseListOperationClass(List<Integer> list) {
//        this.list = list;
//    }

    protected final List<Integer> list;

    @Override
    public Integer getIDOperation() {
        return iDOperation;
    }
}
