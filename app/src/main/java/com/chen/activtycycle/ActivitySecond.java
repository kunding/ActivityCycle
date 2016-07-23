package com.chen.activtycycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String inforContent = getIntent().getStringExtra("name");
        Toast.makeText(ActivitySecond.this, inforContent, Toast.LENGTH_SHORT).show();
    }
}
