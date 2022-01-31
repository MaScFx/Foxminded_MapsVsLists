package com.example.task4.model.operations.testsCollection;

import static com.example.task4.model.constants.Operations.SearchCoW;
import android.util.Pair;
import java.util.List;

public class SearchCoW extends BaseListOperationClass {

    public SearchCoW(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer getIDOperation() {
        return SearchCoW.ordinal();
    }

    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = list.size();

        long startTime = System.currentTimeMillis();
        list.indexOf(size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(SearchCoW.ordinal(), String.valueOf(finalTime));
    }
}
