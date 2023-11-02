package com.devanpatel.colorograph;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome_page extends AppCompatActivity {
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tapSound();
                startActivity(new Intent(Welcome_page.this,MainActivity.class));
                finish();
            }
        },2450);
    }
}