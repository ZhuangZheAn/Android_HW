package com.example.android.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView text;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text = (TextView) findViewById(R.id.activity2);
        text.setText("2 bowls of rice\n" +
                    "2 eggs\n" +
                    "1 sausage\n" +
                    "3 shallots\n" +
                    "proper amount of salt\n" +
                    "A little black pepper\n" +
                    "1 tablespoon olive oil");
    }
}