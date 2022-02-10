package com.example.task4.presenter;

import android.util.Log;

import com.example.task4.model.IDataKeeper;
import com.example.task4.model.OperationRunner;
import com.example.task4.model.operations.IOperation;
import com.example.task4.model.operations.fillingCollections.FillingList;
import com.example.task4.model.operations.testsCollection.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;

@Singleton
public class CollectionPresenter extends FragmentPresenter.Presenter {
    private static final String TAG = "TAG";

    @Inject
    public CollectionPresenter(IDataKeeper model) {
        super(model);
    }

    @Override
    public void calculate(Integer count) {
        List<IOperation> fillingList = new ArrayList<>();
        fillingList.add(new FillingList(count));
        model.runOperation(fillingList)
                .flatMap(integerStringPair -> model.runOperation(createTests()))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(intStrPair -> {
                    view.dataSetChanged(intStrPair.first, intStrPair.second);
                }, throwable -> {
                    Log.i(TAG, "createTests: " + throwable.toString());
                });
    }

    @Override
    public void viewCreated(Set<Integer> idOperations) {
        super.viewCreated(idOperations);
    }

    private List<IOperation> createTests() {
        List<IOperation> tests = new ArrayList<>();
        tests.add(new AddingBeginningALBase(OperationRunner.arrayList));
        tests.add(new AddingBeginningLLBase(OperationRunner.linkedList));
        tests.add(new AddingBeginningCoWBase(OperationRunner.arrayList));

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
        return tests;
    }
}
