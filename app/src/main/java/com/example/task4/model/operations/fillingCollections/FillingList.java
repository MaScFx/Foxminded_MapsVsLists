package com.example.task4.model.operations.fillingCollections;

import static com.example.task4.model.constants.Operations.FillingListCompleted;

import android.util.Pair;

import com.example.task4.model.OperationRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FillingList extends BaseFilling {

    public FillingList(Integer size) {
        super(size, FillingListCompleted.ordinal());
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        CopyOnWriteArrayList<Integer> copyOnWrite = new CopyOnWriteArrayList<>(arrayList);

        OperationRunner.arrayList = arrayList;
        OperationRunner.linkedList = linkedList;
        OperationRunner.copyOnWrite = copyOnWrite;

        return new Pair<>(getIDOperation(), "");
    }
}
