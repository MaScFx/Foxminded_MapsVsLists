package com.example.task4.presenter;

import com.example.task4.model.IDataKeeper;
import com.example.task4.model.OperationRunner;
import com.example.task4.model.constants.Operations;
import com.example.task4.model.operations.IOperation;
import com.example.task4.model.operations.fillingCollections.FillingMap;
import com.example.task4.model.operations.testsMap.AddingNewHashMap;
import com.example.task4.model.operations.testsMap.AddingNewTreeMap;
import com.example.task4.model.operations.testsMap.RemovingHashMap;
import com.example.task4.model.operations.testsMap.RemovingTreeMap;
import com.example.task4.model.operations.testsMap.SearchByKeyHashMap;
import com.example.task4.model.operations.testsMap.SearchByKeyTreeMap;

import java.util.ArrayList;
import java.util.List;

public class MapPresenter extends FragmentPresenter.Presenter {

    public MapPresenter(IDataKeeper model) {
        super(model);
    }

    @Override
    public void calculate(Integer count) {
        List<IOperation> fillingMap = new ArrayList<>();
        fillingMap.add(new FillingMap(count));
        model.runOperation(fillingMap, this);
    }

    private void createTests() {
        List<IOperation> tests = new ArrayList<>();
        tests.add(new AddingNewHashMap(OperationRunner.hashMap));
        tests.add(new AddingNewTreeMap(OperationRunner.treeMap));
        tests.add(new RemovingHashMap(OperationRunner.hashMap));
        tests.add(new RemovingTreeMap(OperationRunner.treeMap));
        tests.add(new SearchByKeyHashMap(OperationRunner.hashMap));
        tests.add(new SearchByKeyTreeMap(OperationRunner.treeMap));

        model.runOperation(tests, this);
    }

    @Override
    public void dataSetChanged(Integer testID, String result) {
        if (testID == Operations.FillingMapCompleted.ordinal()) {
            createTests();
        } else {
            view.dataSetChanged(testID, result);
        }
    }
}
