package com.example.task4.model;

import com.example.task4.fragments.IResultObserver;
import com.example.task4.model.operations.IOperation;

import java.util.HashMap;
import java.util.List;

public interface IDataKeeper {
    HashMap<Integer, String> getResults();

    void runOperation(List<IOperation> testsList, IResultObserver observer);
}
