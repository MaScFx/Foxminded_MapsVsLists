package com.example.task4.model.operations.fillingCollections;

import static com.example.task4.model.constants.Operations.FillingListCompleted;

import com.example.task4.model.OperationRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FillingList extends BaseFilling {

    public FillingList(Integer size) {
        super(size);
    }

    @Override
    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        CopyOnWriteArrayList<Integer> copyOnWrite = new CopyOnWriteArrayList<>(arrayList);

        OperationRunner.arrayList = arrayList;
        OperationRunner.linkedList = linkedList;
        OperationRunner.copyOnWrite = copyOnWrite;

        handler.sendMessage(handler.obtainMessage(FillingListCompleted.ordinal(), 0, 0));
    }
    @Override
    public Integer getIDOperation() {
        return FillingListCompleted.ordinal();
    }
}