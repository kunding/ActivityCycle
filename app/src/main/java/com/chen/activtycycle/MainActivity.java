package com.chen.activtycycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","on create执行了");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart:执行了 ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:执行了 ");
    }

    
}
