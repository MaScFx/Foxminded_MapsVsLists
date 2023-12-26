package com.example.task4.model;

import static com.example.task4.model.constants.Operations.FillingListCompleted;
import static com.example.task4.model.constants.Operations.FillingMapCompleted;
import static org.junit.Assert.assertEquals;

import com.example.task4.model.operations.fillingCollections.FillingList;
import com.example.task4.model.operations.fillingCollections.FillingMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.TestScheduler;


public class OperationRunnerTest {
    private OperationRunner operationRunner;
    private FillingList fillingList;
    private FillingMap fillingMap;
    TestScheduler testScheduler;

    @Before
    public void setUp() {
        testScheduler = new TestScheduler();
        RxJavaPlugins.setComputationSchedulerHandler(ignore -> testScheduler);

        operationRunner = new OperationRunner();
        fillingList = new FillingList(50);
        fillingMap = new FillingMap(50);
        operationRunner.runOperation(Arrays.asList(fillingList, fillingMap))
                .subscribe();

        testScheduler.advanceTimeBy(1, TimeUnit.MINUTES);
    }

    @Test
    public void checkResultOperation() {
        assert (OperationRunner.hashMap.size() == 50);
        assert (OperationRunner.treeMap.size() == 50);
        assert (OperationRunner.arrayList.size() == 50);
        assert (OperationRunner.linkedList.size() == 50);
        assert (OperationRunner.copyOnWrite.size() == 50);
    }

    @Test
    public void getResults() {
        HashMap<Integer, String> resultMap = operationRunner.getResults();
        assert (resultMap.size() == 2);
        assert (resultMap.get(FillingListCompleted.ordinal()).equals(""));
    }

    @Test
    public void checkIDFillingOperations() {
        assertEquals(Integer.valueOf(FillingListCompleted.ordinal()), fillingList.getIDOperation());
        assertEquals(Integer.valueOf(FillingMapCompleted.ordinal()), fillingMap.getIDOperation());
    }

    @After
    public void after() {
        RxJavaPlugins.setComputationSchedulerHandler(null);
    }
}
