package com.example.task4.model.operations.fillingCollections;

import com.example.task4.model.operations.IOperation;

public abstract class BaseFilling implements IOperation {
    private final Integer iDOperation;

    public BaseFilling(Integer size, Integer iDOperation) {
        this.iDOperation = iDOperation;
        this.size = size;
    }

    public Integer getIDOperation() {
        return iDOperation;
    }

    protected final Integer size;
}
