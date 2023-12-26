package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingMiddleAL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RemovingMiddleTest {

    public RemovingMiddle removingMiddle;
    public ArrayList<Integer> testList;

    @Before
    public void setUp() throws Exception {
        testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        removingMiddle = new RemovingMiddle(testList, RemovingMiddleAL.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(RemovingMiddleAL.ordinal(), removingMiddle.getIDOperation().intValue());
    }

    @Test
    public void Should_Remove_MiddleValueInList() {
        removingMiddle.runTask();
        assertEquals(2, testList.size());
        assertEquals(10, testList.get(0).intValue());
        assertEquals(30, testList.get(1).intValue());
    }
}