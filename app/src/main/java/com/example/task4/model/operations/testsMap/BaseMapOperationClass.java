package com.example.task4.model.operations.testsMap;

import android.util.Pair;

import com.example.task4.model.operations.IOperation;

import java.util.Map;

public abstract class BaseMapOperationClass implements IOperation {
    private final Integer iDOperation;
    protected final Map<String, Integer> map;

    public BaseMapOperationClass(Map<String, Integer> map,Integer iDOperation) {
        this.iDOperation = iDOperation;
        this.map = map;
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
