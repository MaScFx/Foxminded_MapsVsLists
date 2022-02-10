package com.example.task4.model.operations.testsMap;

import com.example.task4.model.operations.IOperation;

import java.util.Map;

public abstract class BaseMapOperationClass implements IOperation {
    public BaseMapOperationClass(Map<String, Integer> map,Integer iDOperation) {
        this.iDOperation = iDOperation;
        this.map = map;
    }

    private final Integer iDOperation;

    protected final Map<String, Integer> map;

    public Integer getIDOperation() {
        return iDOperation;
    }
}
