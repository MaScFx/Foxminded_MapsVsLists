package com.example.task4.model.operations.testsCollection;

import android.util.Pair;

import com.example.task4.model.operations.IOperation;

import java.util.List;

public abstract class BaseListOperationClass implements IOperation {
    private final Integer iDOperation;
    protected final List<Integer> list;

    public BaseListOperationClass(List<Integer> list, Integer iDOperation) {
        this.iDOperation = iDOperation;
        this.list = list;
    }

    protected abstract void runTask();

    @Override
    public Pair<Integer, String> call() {
        long startTime = System.currentTimeMillis();
        runTask();
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }

    @Override
    public Integer getIDOperation() {
        return iDOperation;
    }
}
