package com.example.android.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private TextView text;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        text = (TextView) findViewById(R.id.activity3);
        text.setText("300g stinky tofu\n" +
                    "100g soybean sprouts\n" +
                    "20g garlic\n" +
                    "20g shallot\n" +
                    "10g chilli\n" +
                    "green onion\n" +
                    "2 tablespoons spicy bean curd\n" +
                    "2 tablespoons sugar\n" +
                    "3 tablespoons rice wine\n" +
                    "2 tablespoons soy sauce\n" +
                    "2 tablespoons salt");
    }
}