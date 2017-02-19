package com.sebinsunny.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //implements OnClickListener

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        // b2= (Button) findViewById(R.id.b2);
        Log.i("sebin", "hai");

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, d.class);
                startActivity(i);
//Toast t=Toast.makeText(MainActivity.this,"this is sebin",Toast.LENGTH_LONG);
                //  t.setGravity(Gravity.CENTER,-100,-200);
                //  t.show();
                LayoutInflater layoutInflater = getLayoutInflater();
                View view = layoutInflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.root_layout));
                Toast t = new Toast(MainActivity.this);
                t.setDuration(Toast.LENGTH_LONG);
                t.setGravity(Gravity.BOTTOM, 0, 0);
                t.setView(view);
                t.show();
            }
        });
        //   b2.setOnClickListener(this);

        Log.d("ACTIVITY A", "oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY A", "onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY A", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY A", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY A", "onstop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY A", "onpause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY A", "ondestroy");
    }


    /*
    //@Override
    public void actionPerformed(View v) {


        switch(v.getId()) {


            case R.id.b1 :
            Log.d("sebin", "hai");
            Toast.makeText(MainActivity.this, "hai", Toast.LENGTH_LONG).show();
                Intent i=new Intent("ss");
                startActivity(i);



                break;
            case R.id.b2:
                Log.d("sebin","mylove");
                Toast.makeText(MainActivity.this, "haikk", Toast.LENGTH_LONG).show();
        }
    }



    public void hai(View v){
        Toast.makeText(MainActivity.this,"hai",Toast.LENGTH_LONG).show();
    }
    */
}
