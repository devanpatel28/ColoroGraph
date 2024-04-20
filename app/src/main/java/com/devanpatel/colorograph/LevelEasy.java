package com.devanpatel.colorograph;

import android.app.Dialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class LevelEasy extends AppCompatActivity {
    // Sounds
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void lvl1(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl1.class);
        startActivity(intent);
    }
    public void lvl2(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl2.class);
        startActivity(intent);
    }
    public void lvl3(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl3.class);
        startActivity(intent);
    }
    public void lvl4(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl4.class);
        startActivity(intent);
    }
    public void lvl5(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl5.class);
        startActivity(intent);
    }
    public void lvl6(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl6.class);
        startActivity(intent);
    }
    public void lvl7(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl7.class);
        startActivity(intent);
    }
    public void lvl8(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl8.class);
        startActivity(intent);
    }
    public void lvl9(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl9.class);
        startActivity(intent);
    }
    public void lvl10(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl10.class);
        startActivity(intent);
    }
    public void lvl11(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl11.class);
        startActivity(intent);
    }
    public void lvl12(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl12.class);
        startActivity(intent);
    }
    public void lvl13(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl13.class);
        startActivity(intent);
    }
    public void lvl14(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl14.class);
        startActivity(intent);
    }
    public void lvl15(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl15.class);
        startActivity(intent);
    }
    public void lvl16(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl16.class);
        startActivity(intent);
    }
    public void lvl17(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl17.class);
        startActivity(intent);
    }
    public void lvl18(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl18.class);
        startActivity(intent);
    }
    public void lvl19(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl19.class);
        startActivity(intent);
    }
    public void lvl20(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Elvl20.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_easy);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,Vertex.class);
        startActivity(intent);
        this.finishAffinity();
    }
}