package com.jfdimarzio.activity101;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.*;


public class MainActivity extends Activity {

    private String test = "hej med dig";

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(test, "on create");


    }

    public void onStart()
    {
        super.onStart();
        progressDialog = ProgressDialog.show(this,"Please Wait", "Processing...",true);
        Log.d(test, "on start");
        CountDownTimer timer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }



            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();
    }


    public void onRestart(){

        super.onRestart();
        Log.d(test, "on restart");

    }

    public void onPause(){
        super.onPause();
        Log.d(test, "on pause");
    }

    public void onStop(){
        super.onStop();
        Log.d(test, "on stop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(test, "on destroy");
    }

    public void onResume(){
        super.onResume();
        Log.d(test, "on resume");
    }
}


