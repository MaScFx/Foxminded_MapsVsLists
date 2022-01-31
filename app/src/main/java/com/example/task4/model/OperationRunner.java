package com.example.task4.model;

import android.util.Pair;

import com.example.task4.model.operations.IOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

@Singleton
public class OperationRunner implements IDataKeeper {
    public static ArrayList<Integer> arrayList;
    public static LinkedList<Integer> linkedList;
    public static CopyOnWriteArrayList<Integer> copyOnWrite;

    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static TreeMap<String, Integer> treeMap = new TreeMap<>();
    private final HashMap<Integer, String> results = new HashMap<>();

    @Inject
    public OperationRunner() {
    }

    @Override
    public @NonNull Observable<Pair<Integer, String>> runOperation(List<IOperation> testsList) {
        return Observable.fromIterable(testsList)
                .map(Callable::call)
                .doOnNext(intStrPair -> {
                    results.put(intStrPair.first, intStrPair.second);
                });
    }

    @Override
    public HashMap<Integer, String> getResults() {
        return results;
    }
}