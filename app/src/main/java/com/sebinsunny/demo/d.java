package com.sebinsunny.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Log.d("ACTIVITY-B","concreate");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY B","onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY B","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY B","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY B","onstop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY B","onpause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY B","ondestroy");
    }

}
