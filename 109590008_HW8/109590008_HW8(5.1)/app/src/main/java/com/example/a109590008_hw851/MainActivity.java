package com.example.a109590008_hw851;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int count;
    private ImageView battery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = (ImageView) findViewById(R.id.img_battery);
        count = 4;
        battery.setImageLevel(count);
    }
    public void BtnIncrease(View view) {
        if(count < 7){
            count += 1;
        }
        battery.setImageLevel(count);
    }

    public void BtnReduce(View view) {
        if(count > 1){
            count -= 1;
        }
        battery.setImageLevel(count);
    }
}