package com.example.task4.model.operations.fillingCollections;

import static com.example.task4.model.constants.Operations.FillingMapCompleted;
import static org.junit.Assert.assertEquals;

import com.example.task4.model.OperationRunner;

import org.junit.Before;
import org.junit.Test;

public class FillingMapTest {
    public FillingMap fillingMap;
    public Integer testSize = 50;

    @Before
    public void setUp() throws Exception {
        fillingMap = new FillingMap(testSize);
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(FillingMapCompleted.ordinal(), fillingMap.getIDOperation().intValue());
    }

    @Test
    public void Should_return_CorrectSize() {
        assertEquals(testSize, fillingMap.size);
    }

    @Test
    public void Should_Fill_OperationRunnerMaps() {
        try {
            fillingMap.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(testSize.intValue(), OperationRunner.treeMap.size());
        assertEquals(testSize.intValue(), OperationRunner.hashMap.size());
    }
}
