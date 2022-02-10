package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.RemovingHM;

import java.util.Map;

public class RemovingHashMap extends RemovingBase {

    public RemovingHashMap(Map<String, Integer> map) {
        super(map, RemovingHM.ordinal());
    }
}
