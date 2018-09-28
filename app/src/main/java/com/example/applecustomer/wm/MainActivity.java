package com.example.applecustomer.wm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;
import java.util.concurrent.TimeUnit;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.WorkStatus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnStart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

/*PeriodicWorkRequest request = new PeriodicWorkRequest.Builder(NotificationWorker.class,1,TimeUnit.SECONDS).build();

                WorkManager.getInstance().enqueue(request);*/

                WorkManager workManager = WorkManager.getInstance();

                    WorkRequest callDataRequest = new PeriodicWorkRequest.Builder(NotificationWorker.class,
                            4, TimeUnit.SECONDS)
                            .build();
                    workManager.enqueue(callDataRequest);
                }

        });
    }
}
