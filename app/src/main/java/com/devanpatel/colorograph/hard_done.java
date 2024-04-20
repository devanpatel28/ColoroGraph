package com.devanpatel.colorograph;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class hard_done extends AppCompatActivity {
    public void sound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.easy_done);
        bt.start();
    }
    public void mainMenu(View view)
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_done);
        TextView tv1 = findViewById(R.id.textView6);
        TextView tv2 = findViewById(R.id.textView7);
        ImageView iv = findViewById(R.id.imageView4);
        Button bt = findViewById(R.id.button4);

        sound();
        YoYo.with(Techniques.FadeIn).duration(2000).playOn(tv1);
        YoYo.with(Techniques.Bounce).duration(1500).repeat(10).playOn(tv1);

        YoYo.with(Techniques.FadeIn).duration(2000).playOn(tv2);
        YoYo.with(Techniques.Bounce).duration(1500).repeat(10).playOn(tv2);

        YoYo.with(Techniques.FadeIn).duration(2000).playOn(iv);

        YoYo.with(Techniques.FadeIn).duration(4000).playOn(bt);

    }
}