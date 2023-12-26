package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingMiddleAL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AddingMiddleTest {
    public AddingMiddle addingMiddle;
    public ArrayList<Integer> testList;

    @Before
    public void setUp() throws Exception {
        testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        addingMiddle = new AddingMiddle(testList, AddingMiddleAL.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(AddingMiddleAL.ordinal(), addingMiddle.getIDOperation().intValue());
    }

    @Test
    public void Should_Assign_MiddleValueInList() {
        addingMiddle.runTask();
        assertEquals(1, testList.get(1).intValue());
    }
}