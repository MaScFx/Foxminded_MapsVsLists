package com.example.task4.presenter;

import com.example.task4.model.IDataKeeper;
import com.example.task4.fragments.IResultObserver;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public interface FragmentPresenter {
    void attachView(IResultObserver view);

    void viewCreated(Set<Integer> idOperations);

    void calculate(Integer count);

    abstract class Presenter implements FragmentPresenter {
        protected IResultObserver view;
        protected IDataKeeper model;

        public Presenter(IDataKeeper model) {
            this.model = model;
        }

        @Override
        public void attachView(IResultObserver view) {
            this.view = view;
        }

        @Override
        public void viewCreated(Set<Integer> idOperations) {
            HashMap<Integer, String> data = model.getResults();
            String currentData;
            for (Integer i : idOperations) {
                currentData = data.get(i);
                if (currentData != null && !Objects.equals(currentData, " ")) {
                    view.dataSetChanged(i, currentData);
                }
            }
        }
    }
}
