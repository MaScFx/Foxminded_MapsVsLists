package com.example.task4.model.operations.testsCollection;


import com.example.task4.model.operations.IOperation;

import java.util.List;

public abstract class BaseListOperationClass implements IOperation {

    public BaseListOperationClass(List<Integer> list) {
        this.list = list;
    }

    protected final List<Integer> list;

}
