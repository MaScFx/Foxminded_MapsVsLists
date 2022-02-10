package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.AddingNewTM;

import java.util.Map;

public class AddingNewTreeMap extends AddingNewBase {

    public AddingNewTreeMap(Map<String, Integer> map) {
        super(map, AddingNewTM.ordinal());
    }
}
