package com.example.task4.model.operations;

import android.os.Handler;

public interface IOperation extends Runnable {
    Integer getIDOperation();

    void setHandler(Handler handler);
}
