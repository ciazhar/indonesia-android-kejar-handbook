package com.ciazhar.tutorialapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000L);
        // Handler adalah perintah untuk mulai beberapa waktu lalu pindah activity
        // Intent adalah perintah yang ditujukan untuk pindah dari activity satu ke activity lain
        // startactivity untuk memulai proses Intent finish untuk mengakhiri perintah Intent
        // 3000L adalah durasi perbindahan dari activity satu ke activity lain
    }
}
