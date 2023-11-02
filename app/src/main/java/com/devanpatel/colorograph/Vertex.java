package com.devanpatel.colorograph;

import android.app.Dialog;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Vertex extends AppCompatActivity {

    Dialog mydialog;
    // Sounds
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }

    public void easyLevel(View view)
    {
        tapSound();
        Intent intent = new Intent(this,LevelEasy.class);
        startActivity(intent);
    }
    public void mediumLevel(View view)
    {
        tapSound();
        Intent intent = new Intent(this,LevelMedium.class);
        startActivity(intent);
    }
    public void hardLevel(View view)
    {
        tapSound();
        Intent intent = new Intent(this,LevelHard.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertex);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finishAffinity();
    }
}


