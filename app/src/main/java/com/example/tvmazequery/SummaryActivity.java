package com.example.tvmazequery;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    private TextView fullSummary;

    protected void onCreateBundle(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_activity);

        fullSummary = (TextView) findViewById(R.id.fullSummary);

        Intent intent = getIntent();

        String sum = intent.getStringExtra("fullSummary");
        fullSummary.setText(sum);









    }









}
