package com.example.task4.model.operations.fillingCollections;

import static com.example.task4.model.constants.Operations.FillingListCompleted;
import static org.junit.Assert.assertEquals;

import com.example.task4.model.OperationRunner;

import org.junit.Before;
import org.junit.Test;


public class FillingListTest {

    public FillingList fillingList;
    public Integer testSize = 50;

    @Before
    public void setUp() throws Exception {
        fillingList = new FillingList(testSize);
    }

    @Test
    public void Should_Return_CorrectIDOperation() {
        assertEquals(FillingListCompleted.ordinal(), fillingList.getIDOperation().intValue());
    }

    @Test
    public void Should_return_CorrectSize() {
        assertEquals(testSize, fillingList.size);
    }

    @Test
    public void Should_Fill_OperationRunnerLists() {
        try {
            fillingList.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(testSize.intValue(), OperationRunner.arrayList.size());
        assertEquals(testSize.intValue(), OperationRunner.linkedList.size());
        assertEquals(testSize.intValue(), OperationRunner.copyOnWrite.size());
    }

}