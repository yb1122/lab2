package com.cs407.cal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTextView = findViewById(R.id.resultTextView);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("result")) {
            int result = intent.getIntExtra("result", 0);
            resultTextView.setText("Result: " + result);
        }
    }
}