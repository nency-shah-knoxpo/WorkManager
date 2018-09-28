package com.example.applecustomer.wm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Toast;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class NotificationWorker extends Worker {

    public NotificationWorker(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Toast.makeText(getApplicationContext(),"in dowork",Toast.LENGTH_LONG).show();
        return Result.SUCCESS;
    }
}
