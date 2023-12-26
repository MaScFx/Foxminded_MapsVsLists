package com.example.task4.model.operations.testsMap;

import static com.example.task4.model.constants.Operations.RemovingHM;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

public class RemovingMapTest {

    public RemovingMap removingMap;
    public HashMap<String, Integer> testMap;

    @Before
    public void setUp() throws Exception {
        testMap = new HashMap<>();
        testMap.put("key " + 1, 1);
        testMap.put("key " + 2, 2);
        testMap.put("key " + 3, 3);
        testMap.put("key " + 4, 4);
        removingMap = new RemovingMap(testMap, RemovingHM.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(RemovingHM.ordinal(), removingMap.getIDOperation().intValue());
    }

    @Test
    public void Should_Remove_ValueInTheMiddleOfMap() {
        removingMap.runTask();
        assertEquals(3, testMap.size());
        assertEquals(1, Objects.requireNonNull(testMap.get("key " + 1)).intValue());
        assertEquals(3, Objects.requireNonNull(testMap.get("key " + 3)).intValue());
        assertEquals(4, Objects.requireNonNull(testMap.get("key " + 4)).intValue());
    }
}