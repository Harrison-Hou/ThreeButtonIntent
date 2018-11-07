package com.mrhou.threebuttonintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Set;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "Second Activity";

    private TextView mTextView;
    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Declare the View
        mTextView = findViewById(R.id.textView);
        mIntent = getIntent();

        mTextView.setText(mIntent.getStringExtra(MainActivity.COUNTRY));



    }
}
