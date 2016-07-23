package com.chen.activtycycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    private Button mSendBackButton;
    private EditText mNameEditText;
    private TextView mtextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String inforContent = getIntent().getStringExtra(MainActivity.BOOK_NAME_CATEGORY_PHISICAL);
//        mtextView = (TextView)findViewById(R.id.second_activity_text_view) ;
//        mtextView.setText(inforContent);
        mSendBackButton = (Button)findViewById(R.id.button_second);
        mNameEditText = (EditText)findViewById(R.id.second_activity_text_view) ;
        mSendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("back",name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });



    }
}
