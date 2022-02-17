package com.example.task4.presenter;

import static com.example.task4.model.constants.Operations.*;

import android.util.Log;

import com.example.task4.model.IDataKeeper;
import com.example.task4.model.OperationRunner;
import com.example.task4.model.operations.IOperation;
import com.example.task4.model.operations.fillingCollections.FillingMap;
import com.example.task4.model.operations.testsMap.AddingNewMap;
import com.example.task4.model.operations.testsMap.RemovingMap;
import com.example.task4.model.operations.testsMap.SearchByKeyMap;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;

@Singleton
public class MapPresenter extends FragmentPresenter.Presenter {

    private static final String TAG = "TAG";

    @Inject
    public MapPresenter(IDataKeeper model) {
        super(model);
    }

    @Override
    public void calculate(Integer count) {
        List<IOperation> fillingMap = new ArrayList<>();
        fillingMap.add(new FillingMap(count));
        model.runOperation(fillingMap)
                .flatMap(x -> model.runOperation(createTests()))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(intStrPair -> {
                    view.dataSetChanged(intStrPair.first, intStrPair.second);
                }, throwable -> {
                    Log.i(TAG, "createTests: " + throwable.toString());
                });
    }

    private List<IOperation> createTests() {
        List<IOperation> tests = new ArrayList<>();
        tests.add(new AddingNewMap(OperationRunner.hashMap, AddingNewHM.ordinal()));
        tests.add(new AddingNewMap(OperationRunner.treeMap, AddingNewTM.ordinal()));
        tests.add(new RemovingMap(OperationRunner.hashMap, RemovingHM.ordinal()));
        tests.add(new RemovingMap(OperationRunner.treeMap, RemovingTM.ordinal()));
        tests.add(new SearchByKeyMap(OperationRunner.hashMap, SearchHM.ordinal()));
        tests.add(new SearchByKeyMap(OperationRunner.treeMap, SearchTM.ordinal()));
        return tests;
    }
}
