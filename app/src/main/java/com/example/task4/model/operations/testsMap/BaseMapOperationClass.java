package com.example.task4.model.operations.testsMap;

import com.example.task4.model.operations.IOperation;

import java.util.Map;

public abstract class BaseMapOperationClass implements IOperation {

    public BaseMapOperationClass(Map<String, Integer> map) {
        this.map = map;
    }

    protected final Map<String, Integer> map;
}
