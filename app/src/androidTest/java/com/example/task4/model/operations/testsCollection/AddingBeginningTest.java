package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningAL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AddingBeginningTest {
    public AddingBeginning addingBeginning;
    public ArrayList<Integer> testList;

    @Before
    public void setUp() throws Exception {
        testList = new ArrayList<>();
        testList.add(99);
        addingBeginning = new AddingBeginning(testList, AddingBeginningAL.ordinal());
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(AddingBeginningAL.ordinal(), addingBeginning.getIDOperation().intValue());
    }

    @Test
    public void Should_Assign_FirstValueInList() {
        addingBeginning.runTask();
        assertEquals(1, testList.get(0).intValue());
    }
}