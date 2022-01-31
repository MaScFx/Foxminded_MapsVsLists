package com.example.task4.presenter;

import android.app.Application;

import com.example.task4.di.AppComponent;
import com.example.task4.di.DaggerAppComponent;

public class MainApp extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }
}
