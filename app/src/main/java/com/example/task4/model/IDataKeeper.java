package com.example.task4.model;

import android.util.Pair;

import com.example.task4.model.operations.IOperation;

import java.util.HashMap;
import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public interface IDataKeeper {
    HashMap<Integer, String> getResults();

    @NonNull Observable<Pair<Integer, String>> runOperation(List<IOperation> testsList);
}
