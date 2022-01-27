package com.example.task4.presenter;

import android.app.Application;

import com.example.task4.model.OperationRunner;

public class MVPApp extends Application {

    private static CollectionPresenter collectionPresenter;
    private static MapPresenter mapPresenter;

    @Override
    public void onCreate() {
        super.onCreate();
        OperationRunner model = new OperationRunner();
        collectionPresenter = new CollectionPresenter(model);
        mapPresenter = new MapPresenter(model);
    }

    public static CollectionPresenter getCollectionPresenter() {
        return collectionPresenter;
    }

    public static MapPresenter getMapPresenter() {
        return mapPresenter;
    }
}
