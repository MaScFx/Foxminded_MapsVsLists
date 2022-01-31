package com.example.task4.model.operations.fillingCollections;

import com.example.task4.model.operations.IOperation;

public abstract class BaseFilling implements IOperation {

    protected final Integer size;

    public BaseFilling(Integer size) {
        this.size = size;
    }
}
