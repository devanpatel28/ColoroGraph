package com.devanpatel.colorograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class EdgeMlvl extends AppCompatActivity {

    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void lvl1(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML1.class);
        startActivity(intent);
    }
    public void lvl2(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML2.class);
        startActivity(intent);
    }
    public void lvl3(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML3.class);
        startActivity(intent);
    }
    public void lvl4(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML4.class);
        startActivity(intent);
    }
    public void lvl5(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML5.class);
        startActivity(intent);
    }
    public void lvl6(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML6.class);
        startActivity(intent);
    }
    public void lvl7(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML7.class);
        startActivity(intent);
    }
    public void lvl8(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML8.class);
        startActivity(intent);
    }
    public void lvl9(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML9.class);
        startActivity(intent);
    }
    public void lvl10(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML10.class);
        startActivity(intent);
    }
    public void lvl11(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML11.class);
        startActivity(intent);
    }
    public void lvl12(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML12.class);
        startActivity(intent);
    }
    public void lvl13(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML13.class);
        startActivity(intent);
    }
    public void lvl14(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML14.class);
        startActivity(intent);
    }
    public void lvl15(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML15.class);
        startActivity(intent);
    }
    public void lvl16(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML16.class);
        startActivity(intent);
    }
    public void lvl17(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML17.class);
        startActivity(intent);
    }
    public void lvl18(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML18.class);
        startActivity(intent);
    }
    public void lvl19(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML19.class);
        startActivity(intent);
    }
    public void lvl20(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeML20.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge_mlvl);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,Edge.class);
        startActivity(intent);
        this.finishAffinity();
    }
}