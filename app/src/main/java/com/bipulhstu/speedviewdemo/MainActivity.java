package com.bipulhstu.speedviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.anastr.speedviewlib.SpeedView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpeedView speedometer = findViewById(R.id.speedView);

// move to 50 Km/s
        speedometer.speedTo(50);

        // move to 50 Km/s with Duration = 4 sec
        speedometer.speedTo(50, 4000);
    }
}