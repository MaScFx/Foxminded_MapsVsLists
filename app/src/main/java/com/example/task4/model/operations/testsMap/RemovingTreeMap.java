package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.RemovingTM;

import java.util.Map;

public class RemovingTreeMap extends RemovingBase {

    public RemovingTreeMap(Map<String, Integer> map) {
        super(map, RemovingTM.ordinal());
    }
}
