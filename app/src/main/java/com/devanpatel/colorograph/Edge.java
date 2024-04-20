package com.devanpatel.colorograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Edge extends AppCompatActivity {
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void edgeElvl(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeElvl.class);
        startActivity(intent);
    }
    public void edgeMlvl(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeMlvl.class);
        startActivity(intent);
    }
    public void edgeHlvl(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHlvl.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge);
    }
    public void onBackPressed()
    {
        tapSound();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finishAffinity();
    }
}