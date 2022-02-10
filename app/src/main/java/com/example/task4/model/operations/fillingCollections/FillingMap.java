package com.example.task4.model.operations.fillingCollections;

import static com.example.task4.model.constants.Operations.FillingMapCompleted;

import android.util.Pair;

import com.example.task4.model.OperationRunner;

import java.util.HashMap;
import java.util.TreeMap;

public class FillingMap extends BaseFilling {

    public FillingMap(Integer size) {
        super(size, FillingMapCompleted.ordinal());
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            hashMap.put("key " + i, i);
            treeMap.put("key " + i, i);
        }

        OperationRunner.hashMap = hashMap;
        OperationRunner.treeMap = treeMap;

        return new Pair<>(getIDOperation(), "");
    }
}
