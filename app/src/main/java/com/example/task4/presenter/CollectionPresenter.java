package com.example.task4.presenter;

import com.example.task4.model.IDataKeeper;
import com.example.task4.model.OperationRunner;
import com.example.task4.model.constants.Operations;
import com.example.task4.model.operations.IOperation;
import com.example.task4.model.operations.fillingCollections.FillingList;
import com.example.task4.model.operations.testsCollection.AddingBeginningAL;
import com.example.task4.model.operations.testsCollection.AddingBeginningCoW;
import com.example.task4.model.operations.testsCollection.AddingBeginningLL;
import com.example.task4.model.operations.testsCollection.AddingEndAL;
import com.example.task4.model.operations.testsCollection.AddingEndCoW;
import com.example.task4.model.operations.testsCollection.AddingEndLL;
import com.example.task4.model.operations.testsCollection.AddingMiddleAL;
import com.example.task4.model.operations.testsCollection.AddingMiddleCoW;
import com.example.task4.model.operations.testsCollection.AddingMiddleLL;
import com.example.task4.model.operations.testsCollection.RemovingBeginningAL;
import com.example.task4.model.operations.testsCollection.RemovingBeginningCoW;
import com.example.task4.model.operations.testsCollection.RemovingBeginningLL;
import com.example.task4.model.operations.testsCollection.RemovingEndAL;
import com.example.task4.model.operations.testsCollection.RemovingEndCoW;
import com.example.task4.model.operations.testsCollection.RemovingEndLL;
import com.example.task4.model.operations.testsCollection.RemovingMiddleAL;
import com.example.task4.model.operations.testsCollection.RemovingMiddleCoW;
import com.example.task4.model.operations.testsCollection.RemovingMiddleLL;
import com.example.task4.model.operations.testsCollection.SearchAL;
import com.example.task4.model.operations.testsCollection.SearchCoW;
import com.example.task4.model.operations.testsCollection.SearchLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionPresenter extends FragmentPresenter.Presenter {
    public CollectionPresenter(IDataKeeper model) {
        super(model);
    }

    @Override
    public void calculate(Integer count) {
        List<IOperation> fillingList = new ArrayList<>();
        fillingList.add(new FillingList(count));
        model.runOperation(fillingList, this);
    }

    @Override
    public void dataSetChanged(Integer testID, String result) {
        if (testID == Operations.FillingListCompleted.ordinal()) {
            createTests();
        } else {
            view.dataSetChanged(testID, result);
        }
    }

    @Override
    public void viewCreated(Set<Integer> idOperations) {
        super.viewCreated(idOperations);
    }

    private void createTests() {
        List<IOperation> tests = new ArrayList<>();
        tests.add(new AddingBeginningAL(OperationRunner.arrayList));
        tests.add(new AddingBeginningLL(OperationRunner.linkedList));
        tests.add(new AddingBeginningCoW(OperationRunner.arrayList));

        tests.add(new AddingMiddleAL(OperationRunner.arrayList));
        tests.add(new AddingMiddleLL(OperationRunner.linkedList));
        tests.add(new AddingMiddleCoW(OperationRunner.arrayList));

        tests.add(new AddingEndAL(OperationRunner.arrayList));
        tests.add(new AddingEndLL(OperationRunner.linkedList));
        tests.add(new AddingEndCoW(OperationRunner.arrayList));

        tests.add(new SearchAL(OperationRunner.arrayList));
        tests.add(new SearchLL(OperationRunner.linkedList));
        tests.add(new SearchCoW(OperationRunner.arrayList));

        tests.add(new RemovingBeginningAL(OperationRunner.arrayList));
        tests.add(new RemovingBeginningLL(OperationRunner.linkedList));
        tests.add(new RemovingBeginningCoW(OperationRunner.arrayList));

        tests.add(new RemovingMiddleAL(OperationRunner.arrayList));
        tests.add(new RemovingMiddleLL(OperationRunner.linkedList));
        tests.add(new RemovingMiddleCoW(OperationRunner.arrayList));

        tests.add(new RemovingEndAL(OperationRunner.arrayList));
        tests.add(new RemovingEndLL(OperationRunner.linkedList));
        tests.add(new RemovingEndCoW(OperationRunner.arrayList));

        model.runOperation(tests, this);
    }
}
