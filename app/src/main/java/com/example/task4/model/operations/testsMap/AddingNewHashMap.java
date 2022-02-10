package com.example.task4.model.operations.testsMap;


import static com.example.task4.model.constants.Operations.AddingNewHM;

import java.util.Map;

public class AddingNewHashMap extends AddingNewBase {

    public AddingNewHashMap(Map<String, Integer> map) {
        super(map, AddingNewHM.ordinal());
    }
}
