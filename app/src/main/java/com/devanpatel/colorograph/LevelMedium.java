package com.devanpatel.colorograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class LevelMedium extends AppCompatActivity {

    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void lvl1(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl1.class);
        startActivity(intent);
    }
    public void lvl2(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl2.class);
        startActivity(intent);
    }
    public void lvl3(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl3.class);
        startActivity(intent);
    }
    public void lvl4(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl4.class);
        startActivity(intent);
    }
    public void lvl5(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl5.class);
        startActivity(intent);
    }
    public void lvl6(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl6.class);
        startActivity(intent);
    }
    public void lvl7(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl7.class);
        startActivity(intent);
    }
    public void lvl8(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl8.class);
        startActivity(intent);
    }
    public void lvl9(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl9.class);
        startActivity(intent);
    }
    public void lvl10(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl10.class);
        startActivity(intent);
    }
    public void lvl11(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl11.class);
        startActivity(intent);
    }
    public void lvl12(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl12.class);
        startActivity(intent);
    }
    public void lvl13(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl13.class);
        startActivity(intent);
    }
    public void lvl14(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl14.class);
        startActivity(intent);
    }
    public void lvl15(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl15.class);
        startActivity(intent);
    }
    public void lvl16(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl16.class);
        startActivity(intent);
    }
    public void lvl17(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl17.class);
        startActivity(intent);
    }
    public void lvl18(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl18.class);
        startActivity(intent);
    }
    public void lvl19(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl19.class);
        startActivity(intent);
    }
    public void lvl20(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Mlvl20.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_medium);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,Vertex.class);
        startActivity(intent);
        this.finishAffinity();
    }
}