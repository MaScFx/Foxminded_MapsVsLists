package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingEndAL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RemovingEndTest {
    public RemovingEnd removingEnd;
    public ArrayList<Integer> testList;

    @Before
    public void setUp() throws Exception {
        testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        removingEnd = new RemovingEnd(testList, RemovingEndAL.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(RemovingEndAL.ordinal(), removingEnd.getIDOperation().intValue());
    }

    @Test
    public void Should_Remove_LastValueInList() {
        removingEnd.runTask();
        assertEquals(1, testList.size());
        assertEquals(10, testList.get(0).intValue());
    }
}