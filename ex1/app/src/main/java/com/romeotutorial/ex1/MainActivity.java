package com.romeotutorial.ex1;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayNotification(View view){
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        final int notify_id = 1;
        final NotificationManager NM = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


        builder.setContentTitle("Download Status..");
        builder.setContentText("Download in progres..");

        new Thread(new Runnable() {
            @Override
            public void run() {
                int icr;
                for (icr = 0; icr <= 100; icr += 5) {
                    builder.setProgress(100, icr, false);
                    NM.notify(notify_id, builder.build());
                    try {
                        Thread.sleep(2 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                builder.setProgress(0, 0, false);
                builder.setContentText("Download Complete");
                NM.notify(notify_id, builder.build());
            }
        }).start();
    }
    }

