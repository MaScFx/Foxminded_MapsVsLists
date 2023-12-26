package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.AddingNewHM;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

public class AddingNewMapTest {
    public AddingNewMap addingNewMap;
    public HashMap<String, Integer> testMap;

    @Before
    public void setUp() throws Exception {
        testMap = new HashMap<>();
        testMap.put("key " + 1, 1);
        testMap.put("key " + 2, 2);
        testMap.put("key " + 3, 3);
        addingNewMap = new AddingNewMap(testMap, AddingNewHM.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(AddingNewHM.ordinal(), addingNewMap.getIDOperation().intValue());
    }

    @Test
    public void Should_Add_ValueInTheEndOfMap() {
        addingNewMap.runTask();
        assertEquals(4, testMap.size());
        assertEquals(4, Objects.requireNonNull(testMap.get("key " + 4)).intValue());
    }
}