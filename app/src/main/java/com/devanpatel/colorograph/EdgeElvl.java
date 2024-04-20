package com.devanpatel.colorograph;

import android.app.Dialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class EdgeElvl extends AppCompatActivity {
    // Sounds
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void lvl1(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL1.class);
        startActivity(intent);
    }
    public void lvl2(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL2.class);
        startActivity(intent);
    }
    public void lvl3(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL3.class);
        startActivity(intent);
    }
    public void lvl4(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL4.class);
        startActivity(intent);
    }
    public void lvl5(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL5.class);
        startActivity(intent);
    }
    public void lvl6(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL6.class);
        startActivity(intent);
    }
    public void lvl7(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL7.class);
        startActivity(intent);
    }
    public void lvl8(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL8.class);
        startActivity(intent);
    }
    public void lvl9(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL9.class);
        startActivity(intent);
    }
    public void lvl10(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL10.class);
        startActivity(intent);
    }
    public void lvl11(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL11.class);
        startActivity(intent);
    }
    public void lvl12(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL12.class);
        startActivity(intent);
    }
    public void lvl13(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL13.class);
        startActivity(intent);
    }
    public void lvl14(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL14.class);
        startActivity(intent);
    }
    public void lvl15(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL15.class);
        startActivity(intent);
    }
    public void lvl16(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL16.class);
        startActivity(intent);
    }
    public void lvl17(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL17.class);
        startActivity(intent);
    }
    public void lvl18(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL18.class);
        startActivity(intent);
    }
    public void lvl19(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL19.class);
        startActivity(intent);
    }
    public void lvl20(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeEL20.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge_elvl);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,Edge.class);
        startActivity(intent);
        this.finishAffinity();
    }
}