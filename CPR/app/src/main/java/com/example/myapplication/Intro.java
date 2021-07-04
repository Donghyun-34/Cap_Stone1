package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            public void run() {
                Intent intent = new Intent(Intro.this, MainActivity.class);
                finish();
                startActivity(intent);
                overridePendingTransition(R.anim.fadeout, R.anim.fadein);
            }
        }, 1000);
    }
}