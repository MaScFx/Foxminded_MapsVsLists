package com.example.task4.presenter;

import static com.example.task4.model.constants.Operations.*;

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
        tests.add(new AddingBeginning(OperationRunner.arrayList, AddingBeginningAL.ordinal()));
        tests.add(new AddingBeginning(OperationRunner.linkedList, AddingBeginningLL.ordinal()));
        tests.add(new AddingBeginning(OperationRunner.arrayList, AddingBeginningCoW.ordinal()));

        tests.add(new AddingMiddle(OperationRunner.arrayList, AddingMiddleAL.ordinal()));
        tests.add(new AddingMiddle(OperationRunner.linkedList, AddingMiddleLL.ordinal()));
        tests.add(new AddingMiddle(OperationRunner.arrayList, AddingMiddleCoW.ordinal()));

        tests.add(new AddingEnd(OperationRunner.arrayList, AddingEndAL.ordinal()));
        tests.add(new AddingEnd(OperationRunner.linkedList, AddingEndLL.ordinal()));
        tests.add(new AddingEnd(OperationRunner.arrayList, AddingEndCoW.ordinal()));

        tests.add(new SearchAL(OperationRunner.arrayList, SearchAL.ordinal()));
        tests.add(new SearchAL(OperationRunner.linkedList, SearchLL.ordinal()));
        tests.add(new SearchAL(OperationRunner.arrayList, SearchCoW.ordinal()));

        tests.add(new RemovingBeginning(OperationRunner.arrayList, RemovingBeginningAL.ordinal()));
        tests.add(new RemovingBeginning(OperationRunner.linkedList, RemovingBeginningLL.ordinal()));
        tests.add(new RemovingBeginning(OperationRunner.arrayList, RemovingBeginningCoW.ordinal()));

        tests.add(new RemovingMiddle(OperationRunner.arrayList, RemovingMiddleAL.ordinal()));
        tests.add(new RemovingMiddle(OperationRunner.linkedList, RemovingMiddleLL.ordinal()));
        tests.add(new RemovingMiddle(OperationRunner.arrayList, RemovingMiddleCoW.ordinal()));

        tests.add(new RemovingEnd(OperationRunner.arrayList, RemovingEndAL.ordinal()));
        tests.add(new RemovingEnd(OperationRunner.linkedList, RemovingEndLL.ordinal()));
        tests.add(new RemovingEnd(OperationRunner.arrayList, RemovingEndCoW.ordinal()));
        return tests;
    }
}
