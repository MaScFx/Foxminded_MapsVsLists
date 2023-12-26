package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingEndAL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AddingEndTest {
    public AddingEnd addingEnd;
    public ArrayList<Integer> testList;

    @Before
    public void setUp() throws Exception {
        testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        addingEnd = new AddingEnd(testList, AddingEndAL.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(AddingEndAL.ordinal(), addingEnd.getIDOperation().intValue());
    }

    @Test
    public void Should_Assign_LastValueInList() {
        addingEnd.runTask();
        assertEquals(3, testList.get(2).intValue());
    }
}