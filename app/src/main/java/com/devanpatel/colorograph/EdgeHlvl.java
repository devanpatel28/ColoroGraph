package com.devanpatel.colorograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class EdgeHlvl extends AppCompatActivity {

    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void lvl1(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL1.class);
        startActivity(intent);
    }
    public void lvl2(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL2.class);
        startActivity(intent);
    }
    public void lvl3(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL3.class);
        startActivity(intent);
    }
    public void lvl4(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL4.class);
        startActivity(intent);
    }
    public void lvl5(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL5.class);
        startActivity(intent);
    }
    public void lvl6(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL6.class);
        startActivity(intent);
    }
    public void lvl7(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL7.class);
        startActivity(intent);
    }
    public void lvl8(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL8.class);
        startActivity(intent);
    }
    public void lvl9(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL9.class);
        startActivity(intent);
    }
    public void lvl10(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL10.class);
        startActivity(intent);
    }
    public void lvl11(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL11.class);
        startActivity(intent);
    }
    public void lvl12(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL12.class);
        startActivity(intent);
    }
    public void lvl13(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL13.class);
        startActivity(intent);
    }
    public void lvl14(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL14.class);
        startActivity(intent);
    }
    public void lvl15(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL15.class);
        startActivity(intent);
    }
    public void lvl16(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL16.class);
        startActivity(intent);
    }
    public void lvl17(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL17.class);
        startActivity(intent);
    }
    public void lvl18(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL18.class);
        startActivity(intent);
    }
    public void lvl19(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL19.class);
        startActivity(intent);
    }
    public void lvl20(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHL20.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge_hlvl);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,Edge.class);
        startActivity(intent);
        this.finishAffinity();
    }
}