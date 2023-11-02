package com.devanpatel.colorograph;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Dialog mydialog;
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void vertexLvl(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Vertex.class);
        startActivity(intent);
    }
    public void edgeLvl(View view)
    {
        tapSound();
        Intent intent = new Intent(this,Edge.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBackPressed()
    {
        mydialog = new Dialog(this);
        mydialog.setCancelable(true);
        mydialog.setContentView(R.layout.close);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void quitGame(View view)
    {
        this.finishAffinity();
        System.exit(0);
    }
    public void retry(View view)
    {
        tapSound();
        mydialog.cancel();
    }
}