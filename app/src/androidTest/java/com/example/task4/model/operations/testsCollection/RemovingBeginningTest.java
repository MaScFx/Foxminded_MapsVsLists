package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.RemovingBeginningAL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RemovingBeginningTest {
    public RemovingBeginning removingBeginning;
    public ArrayList<Integer> testList;

    @Before
    public void setUp() throws Exception {
        testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        removingBeginning = new RemovingBeginning(testList, RemovingBeginningAL.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(RemovingBeginningAL.ordinal(), removingBeginning.getIDOperation().intValue());
    }

    @Test
    public void Should_Remove_FirstValueInList() {
        removingBeginning.runTask();
        assertEquals(1, testList.size());
        assertEquals(20, testList.get(0).intValue());
    }
}