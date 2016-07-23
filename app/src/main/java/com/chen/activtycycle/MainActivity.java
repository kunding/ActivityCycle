package com.chen.activtycycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String BOOK_NAME_CATEGORY_PHISICAL = "BookOfCategoryPhisical";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","on create执行了");
        Button button = (Button) findViewById(R.id.activity_main_button);
        final EditText editText = (EditText)findViewById(R.id.editText_1) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:");
                Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
                intent.putExtra(BOOK_NAME_CATEGORY_PHISICAL, editText.getText().toString());
                startActivityForResult(intent,0);
            }
        });

        Button mThirdButton = (Button)findViewById(R.id.third_button);
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivityForResult(intent,1);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String name = "";
        switch (requestCode){
            case 0:
                name = data.getStringExtra("back");
                break;
            case 1:
                name = data.getStringExtra("thirdBack");
                break;
        }


        Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
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

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 执行了");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 执行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 执行了");
    }
}
