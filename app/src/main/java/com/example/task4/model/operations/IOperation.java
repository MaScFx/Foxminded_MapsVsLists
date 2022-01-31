package com.example.task4.model.operations;

import android.util.Pair;

import java.util.concurrent.Callable;

public interface IOperation extends Callable<Pair<Integer,String>> {
    Integer getIDOperation();
}
