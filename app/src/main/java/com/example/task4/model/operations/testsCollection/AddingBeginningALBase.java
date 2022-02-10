package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.AddingBeginningAL;

import java.util.List;

public class AddingBeginningALBase extends AddingBeginingBase {

    public AddingBeginningALBase(List<Integer> list) {
        super(list,AddingBeginningAL.ordinal());
    }
}
