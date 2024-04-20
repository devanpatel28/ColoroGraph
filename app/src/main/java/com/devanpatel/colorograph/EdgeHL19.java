package com.devanpatel.colorograph;


import android.app.Dialog;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class EdgeHL19 extends AppCompatActivity
{
    static int selectColor=0;
    static int e1=0;
    static int e2=0;
    static int e3=0;
    static int e4=0;
    static int e5=0;
    static int e6=0;
    static int e7=0;
    static int e8=0;
    static int e9=0;
    static int e10=0;
    static int e11=0;
    static int e12=0;
    static int e13=0;
    static int e14=0;
    static int e15=0;
    static int e16=0;
    static int e17=0;
    static int e18=0;
    static int e19=0;
    static int e20=0;
    static int e21=0;
    static int e22=0;
    static int e23=0;
    static int e24=0;
    static int e25=0;
    static int e26=0;
    static int e27=0;
    static int e28=0;
    static int v1=0;
    static int v2=0;
    static int v3=0;
    static int v4=0;
    static int v5=0;
    static int v6=0;
    static int v7=0;
    static int v8=0;
    Dialog mydialog;

    // Sounds
    public void tapSound()
    {
        MediaPlayer bt = MediaPlayer.create(this,R.raw.tap);
        bt.start();
    }
    public void selectSound()
    {
        MediaPlayer sl = MediaPlayer.create(this,R.raw.select);
        sl.start();
    }
    public void errorSound()
    {
        MediaPlayer er = MediaPlayer.create(this,R.raw.error);
        er.start();
    }
    public void winSound()
    {
        MediaPlayer wn = MediaPlayer.create(this,R.raw.winning);
        wn.start();
    }
    public void clearSound()
    {
        MediaPlayer cls = MediaPlayer.create(this,R.raw.clear);
        cls.start();
    }

    // Color Select
    public void red(View view)
    {
        selectSound();
        selectColor=1;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(1000);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void blue(View view)
    {
        selectSound();
        selectColor=2;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(1000);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void yellow(View view)
    {
        selectSound();
        selectColor=3;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(1000);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void green(View view)
    {
        selectSound();
        selectColor=4;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(1000);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void brown(View view)
    {
        selectSound();
        selectColor=5;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(1000);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void pink(View view)
    {
        selectSound();
        selectColor=6;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(1000);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void cyan(View view)
    {
        selectSound();
        selectColor=7;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(1000);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void parrot(View view)
    {
        selectSound();
        selectColor=8;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(1000);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void dpurple(View view)
    {
        selectSound();
        selectColor=9;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(1000);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(50);
    }
    public void cadedblue(View view)
    {
        selectSound();
        selectColor=10;
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        c1.setAlpha(50);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        c2.setAlpha(50);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        c3.setAlpha(50);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        c4.setAlpha(50);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        c5.setAlpha(50);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        c6.setAlpha(50);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        c7.setAlpha(50);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c8.setAlpha(50);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        c9.setAlpha(50);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c10.setAlpha(1000);
    }

    // Vertex Coloring
    public void e1Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_black);
            e1=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_red);
            e1=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_blue);
            e1=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_yellow);
            e1=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_green);
            e1=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_brown);
            e1=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_pink);
            e1=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_cyan);
            e1=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_parrot);
            e1=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_dpurple);
            e1=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e1);
            img.setImageResource(R.drawable.ed_cblue);
            e1=10;
        }
    }
    public void e2Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_black);
            e2=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_red);
            e2=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_blue);
            e2=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_yellow);
            e2=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_green);
            e2=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_brown);
            e2=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_pink);
            e2=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_cyan);
            e2=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_parrot);
            e2=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_dpurple);
            e2=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e2);
            img.setImageResource(R.drawable.ed_cblue);
            e2=10;
        }
    }
    public void e3Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_black);
            e3=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_red);
            e3=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_blue);
            e3=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_yellow);
            e3=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_green);
            e3=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_brown);
            e3=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_pink);
            e3=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_cyan);
            e3=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_parrot);
            e3=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_dpurple);
            e3=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e3);
            img.setImageResource(R.drawable.ed_cblue);
            e3=10;
        }
    }
    public void e4Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_black);
            e4=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_red);
            e4=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_blue);
            e4=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_yellow);
            e4=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_green);
            e4=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_brown);
            e4=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_pink);
            e4=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_cyan);
            e4=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_parrot);
            e4=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_dpurple);
            e4=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e4);
            img.setImageResource(R.drawable.ed_cblue);
            e4=10;
        }
    }
    public void e5Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_black);
            e5=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_red);
            e5=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_blue);
            e5=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_yellow);
            e5=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_green);
            e5=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_brown);
            e5=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_pink);
            e5=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_cyan);
            e5=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_parrot);
            e5=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_dpurple);
            e5=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e5);
            img.setImageResource(R.drawable.ed_cblue);
            e5=10;
        }
    }
    public void e6Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_black);
            e6=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_red);
            e6=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_blue);
            e6=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_yellow);
            e6=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_green);
            e6=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_brown);
            e6=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_pink);
            e6=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_cyan);
            e6=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_parrot);
            e6=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_dpurple);
            e6=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e6);
            img.setImageResource(R.drawable.ed_cblue);
            e6=10;
        }
    }
    public void e7Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_black);
            e7=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_red);
            e7=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_blue);
            e7=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_yellow);
            e7=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_green);
            e7=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_brown);
            e7=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_pink);
            e7=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_cyan);
            e7=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_parrot);
            e7=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_dpurple);
            e7=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e7);
            img.setImageResource(R.drawable.ed_cblue);
            e7=10;
        }
    }
    public void e8Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_black);
            e8=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_red);
            e8=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_blue);
            e8=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_yellow);
            e8=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_green);
            e8=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_brown);
            e8=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_pink);
            e8=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_cyan);
            e8=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_parrot);
            e8=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_dpurple);
            e8=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e8);
            img.setImageResource(R.drawable.ed_cblue);
            e8=10;
        }
    }
    public void e9Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_black);
            e9=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_red);
            e9=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_blue);
            e9=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_yellow);
            e9=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_green);
            e9=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_brown);
            e9=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_pink);
            e9=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_cyan);
            e9=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_parrot);
            e9=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_dpurple);
            e9=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e9);
            img.setImageResource(R.drawable.ed_cblue);
            e9=10;
        }
    }
    public void e10Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_black);
            e10=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_red);
            e10=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_blue);
            e10=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_yellow);
            e10=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_green);
            e10=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_brown);
            e10=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_pink);
            e10=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_cyan);
            e10=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_parrot);
            e10=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_dpurple);
            e10=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e10);
            img.setImageResource(R.drawable.ed_cblue);
            e10=10;
        }
    }
    public void e11Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_black);
            e11=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_red);
            e11=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_blue);
            e11=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_yellow);
            e11=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_green);
            e11=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_brown);
            e11=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_pink);
            e11=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_cyan);
            e11=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_parrot);
            e11=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_dpurple);
            e11=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e11);
            img.setImageResource(R.drawable.ed_cblue);
            e11=10;
        }
    }
    public void e12Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_black);
            e12=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_red);
            e12=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_blue);
            e12=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_yellow);
            e12=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_green);
            e12=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_brown);
            e12=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_pink);
            e12=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_cyan);
            e12=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_parrot);
            e12=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_dpurple);
            e12=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e12);
            img.setImageResource(R.drawable.ed_cblue);
            e12=10;
        }
    }
    public void e13Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_black);
            e13=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_red);
            e13=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_blue);
            e13=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_yellow);
            e13=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_green);
            e13=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_brown);
            e13=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_pink);
            e13=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_cyan);
            e13=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_parrot);
            e13=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_dpurple);
            e13=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e13);
            img.setImageResource(R.drawable.ed_cblue);
            e13=10;
        }
    }
    public void e14Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_black);
            e14=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_red);
            e14=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_blue);
            e14=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_yellow);
            e14=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_green);
            e14=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_brown);
            e14=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_pink);
            e14=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_cyan);
            e14=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_parrot);
            e14=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_dpurple);
            e14=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e14);
            img.setImageResource(R.drawable.ed_cblue);
            e14=10;
        }
    }
    public void e15Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_black);
            e15=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_red);
            e15=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_blue);
            e15=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_yellow);
            e15=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_green);
            e15=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_brown);
            e15=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_pink);
            e15=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_cyan);
            e15=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_parrot);
            e15=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_dpurple);
            e15=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e15);
            img.setImageResource(R.drawable.ed_cblue);
            e15=10;
        }
    }
    public void e16Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_black);
            e16=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_red);
            e16=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_blue);
            e16=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_yellow);
            e16=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_green);
            e16=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_brown);
            e16=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_pink);
            e16=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_cyan);
            e16=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_parrot);
            e16=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_dpurple);
            e16=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e16);
            img.setImageResource(R.drawable.ed_cblue);
            e16=10;
        }
    }
    public void e17Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_black);
            e17=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_red);
            e17=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_blue);
            e17=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_yellow);
            e17=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_green);
            e17=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_brown);
            e17=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_pink);
            e17=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_cyan);
            e17=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_parrot);
            e17=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_dpurple);
            e17=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e17);
            img.setImageResource(R.drawable.ed_cblue);
            e17=10;
        }
    }
    public void e18Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_black);
            e18=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_red);
            e18=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_blue);
            e18=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_yellow);
            e18=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_green);
            e18=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_brown);
            e18=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_pink);
            e18=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_cyan);
            e18=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_parrot);
            e18=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_dpurple);
            e18=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e18);
            img.setImageResource(R.drawable.ed_cblue);
            e18=10;
        }
    }
    public void e19Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_black);
            e19=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_red);
            e19=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_blue);
            e19=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_yellow);
            e19=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_green);
            e19=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_brown);
            e19=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_pink);
            e19=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_cyan);
            e19=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_parrot);
            e19=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_dpurple);
            e19=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e19);
            img.setImageResource(R.drawable.ed_cblue);
            e19=10;
        }
    }
    public void e20Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_black);
            e20=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_red);
            e20=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_blue);
            e20=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_yellow);
            e20=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_green);
            e20=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_brown);
            e20=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_pink);
            e20=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_cyan);
            e20=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_parrot);
            e20=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_dpurple);
            e20=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e20);
            img.setImageResource(R.drawable.ed_cblue);
            e20=10;
        }
    }
    public void e21Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_black);
            e21=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_red);
            e21=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_blue);
            e21=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_yellow);
            e21=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_green);
            e21=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_brown);
            e21=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_pink);
            e21=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_cyan);
            e21=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_parrot);
            e21=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_dpurple);
            e21=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e21);
            img.setImageResource(R.drawable.ed_cblue);
            e21=10;
        }
    }
    public void e22Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_black);
            e22=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_red);
            e22=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_blue);
            e22=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_yellow);
            e22=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_green);
            e22=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_brown);
            e22=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_pink);
            e22=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_cyan);
            e22=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_parrot);
            e22=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_dpurple);
            e22=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e22);
            img.setImageResource(R.drawable.ed_cblue);
            e22=10;
        }
    }
    public void e23Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_black);
            e23=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_red);
            e23=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_blue);
            e23=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_yellow);
            e23=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_green);
            e23=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_brown);
            e23=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_pink);
            e23=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_cyan);
            e23=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_parrot);
            e23=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_dpurple);
            e23=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e23);
            img.setImageResource(R.drawable.ed_cblue);
            e23=10;
        }
    }
    public void e24Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_black);
            e24=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_red);
            e24=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_blue);
            e24=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_yellow);
            e24=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_green);
            e24=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_brown);
            e24=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_pink);
            e24=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_cyan);
            e24=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_parrot);
            e24=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_dpurple);
            e24=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e24);
            img.setImageResource(R.drawable.ed_cblue);
            e24=10;
        }
    }
    public void e25Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_black);
            e25=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_red);
            e25=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_blue);
            e25=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_yellow);
            e25=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_green);
            e25=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_brown);
            e25=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_pink);
            e25=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_cyan);
            e25=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_parrot);
            e25=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_dpurple);
            e25=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e25);
            img.setImageResource(R.drawable.ed_cblue);
            e25=10;
        }
    }
    public void e26Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_black);
            e26=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_red);
            e26=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_blue);
            e26=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_yellow);
            e26=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_green);
            e26=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_brown);
            e26=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_pink);
            e26=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_cyan);
            e26=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_parrot);
            e26=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_dpurple);
            e26=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e26);
            img.setImageResource(R.drawable.ed_cblue);
            e26=10;
        }
    }
    public void e27Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_black);
            e27=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_red);
            e27=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_blue);
            e27=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_yellow);
            e27=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_green);
            e27=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_brown);
            e27=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_pink);
            e27=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_cyan);
            e27=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_parrot);
            e27=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_dpurple);
            e27=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e27);
            img.setImageResource(R.drawable.ed_cblue);
            e27=10;
        }
    }
    public void e28Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_black);
            e28 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_red);
            e28 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_blue);
            e28 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_yellow);
            e28 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_green);
            e28 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_brown);
            e28 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_pink);
            e28 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_cyan);
            e28 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_parrot);
            e28 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_dpurple);
            e28 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.e28);
            img.setImageResource(R.drawable.ed_cblue);
            e28 = 10;
        }
    }
    public void v1Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.gray);
            v1=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.red);
            v1=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.blue);
            v1=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.yellow);
            v1=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.green);
            v1=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.brown);
            v1=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.pink);
            v1=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.cyan);
            v1=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.parot);
            v1=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.dpurple);
            v1=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.cadedblue);
            v1=10;
        }

    }
    public void v2Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.gray);
            v2=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.red);
            v2=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.blue);
            v2=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.yellow);
            v2=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.green);
            v2=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.brown);
            v2=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.pink);
            v2=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.cyan);
            v2=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.parot);
            v2=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.dpurple);
            v2=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.cadedblue);
            v2=10;
        }
    }
    public void v3Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.gray);
            v3=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.red);
            v3=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.blue);
            v3=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.yellow);
            v3=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.green);
            v3=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.brown);
            v3=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.pink);
            v3=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.cyan);
            v3=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.parot);
            v3=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.dpurple);
            v3=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.cadedblue);
            v3=10;
        }

    }
    public void v4Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.gray);
            v4=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.red);
            v4=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.blue);
            v4=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.yellow);
            v4=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.green);
            v4=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.brown);
            v4=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.pink);
            v4=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.cyan);
            v4=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.parot);
            v4=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.dpurple);
            v4=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.cadedblue);
            v4=10;
        }

    }
    public void v5Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.gray);
            v5=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.red);
            v5=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.blue);
            v5=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.yellow);
            v5=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.green);
            v5=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.brown);
            v5=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.pink);
            v5=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.cyan);
            v5=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.parot);
            v5=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.dpurple);
            v5=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.cadedblue);
            v5=10;
        }

    }
    public void v6Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.gray);
            v6=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.red);
            v6=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.blue);
            v6=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.yellow);
            v6=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.green);
            v6=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.brown);
            v6=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.pink);
            v6=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.cyan);
            v6=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.parot);
            v6=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.dpurple);
            v6=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.cadedblue);
            v6=10;
        }

    }
    public void v7Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.gray);
            v7=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.red);
            v7=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.blue);
            v7=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.yellow);
            v7=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.green);
            v7=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.brown);
            v7=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.pink);
            v7=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.cyan);
            v7=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.parot);
            v7=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.dpurple);
            v7=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.cadedblue);
            v7=10;
        }

    }
    public void v8Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.gray);
            v8=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.red);
            v8=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.blue);
            v8=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.yellow);
            v8=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.green);
            v8=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.brown);
            v8=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.pink);
            v8=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.cyan);
            v8=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.parot);
            v8=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.dpurple);
            v8=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.cadedblue);
            v8=10;
        }

    }

    public void clrAll(View view)
    {
        clearSound();
        // Vertex Reset
        selectColor=0;
        e1=0;
        e2=0;
        e3=0;
        e4=0;
        e5=0;
        e6=0;
        e7=0;
        e8=0;
        e9=0;
        e10=0;
        e11=0;
        e12=0;
        e13=0;
        e14=0;
        e15=0;
        e16=0;
        e17=0;
        e18=0;
        e19=0;
        e20=0;
        e21=0;
        e22=0;
        e23=0;
        e24=0;
        e25=0;
        e26=0;
        e27=0;
        e28=0;
        v1=0;
        v2=0;
        v3=0;
        v4=0;
        v5=0;
        v6=0;
        v7=0;
        v8=0;


        ImageView img1 = (ImageView) findViewById(R.id.e1);
        ImageView img2 = (ImageView) findViewById(R.id.e2);
        ImageView img3 = (ImageView) findViewById(R.id.e3);
        ImageView img4 = (ImageView) findViewById(R.id.e4);
        ImageView img5 = (ImageView) findViewById(R.id.e5);
        ImageView img6 = (ImageView) findViewById(R.id.e6);
        ImageView img7 = (ImageView) findViewById(R.id.e7);
        ImageView img8 = (ImageView) findViewById(R.id.e8);
        ImageView img9 = (ImageView) findViewById(R.id.e9);
        ImageView img10 = (ImageView) findViewById(R.id.e10);
        ImageView img11 = (ImageView) findViewById(R.id.e11);
        ImageView img12 = (ImageView) findViewById(R.id.e12);
        ImageView img13 = (ImageView) findViewById(R.id.e13);
        ImageView img14 = (ImageView) findViewById(R.id.e14);
        ImageView img15 = (ImageView) findViewById(R.id.e15);
        ImageView img16 = (ImageView) findViewById(R.id.e16);
        ImageView img17 = (ImageView) findViewById(R.id.e17);
        ImageView img18 = (ImageView) findViewById(R.id.e18);
        ImageView img19 = (ImageView) findViewById(R.id.e19);
        ImageView img20 = (ImageView) findViewById(R.id.e20);
        ImageView img21 = (ImageView) findViewById(R.id.e21);
        ImageView img22 = (ImageView) findViewById(R.id.e22);
        ImageView img23 = (ImageView) findViewById(R.id.e23);
        ImageView img24 = (ImageView) findViewById(R.id.e24);
        ImageView img25 = (ImageView) findViewById(R.id.e25);
        ImageView img26 = (ImageView) findViewById(R.id.e26);
        ImageView img27 = (ImageView) findViewById(R.id.e27);
        ImageView img28 = (ImageView) findViewById(R.id.e28);
        ImageView imgV1 = (ImageView) findViewById(R.id.v1);
        ImageView imgV2 = (ImageView) findViewById(R.id.v2);
        ImageView imgV3 = (ImageView) findViewById(R.id.v3);
        ImageView imgV4 = (ImageView) findViewById(R.id.v4);
        ImageView imgV5 = (ImageView) findViewById(R.id.v5);
        ImageView imgV6 = (ImageView) findViewById(R.id.v6);
        ImageView imgV7 = (ImageView) findViewById(R.id.v7);
        ImageView imgV8 = (ImageView) findViewById(R.id.v8);

        img1.setImageResource(R.drawable.ed_black);
        img2.setImageResource(R.drawable.ed_black);
        img3.setImageResource(R.drawable.ed_black);
        img4.setImageResource(R.drawable.ed_black);
        img5.setImageResource(R.drawable.ed_black);
        img6.setImageResource(R.drawable.ed_black);
        img7.setImageResource(R.drawable.ed_black);
        img8.setImageResource(R.drawable.ed_black);
        img9.setImageResource(R.drawable.ed_black);
        img10.setImageResource(R.drawable.ed_black);
        img11.setImageResource(R.drawable.ed_black);
        img12.setImageResource(R.drawable.ed_black);
        img13.setImageResource(R.drawable.ed_black);
        img14.setImageResource(R.drawable.ed_black);
        img15.setImageResource(R.drawable.ed_black);
        img16.setImageResource(R.drawable.ed_black);
        img17.setImageResource(R.drawable.ed_black);
        img18.setImageResource(R.drawable.ed_black);
        img19.setImageResource(R.drawable.ed_black);
        img20.setImageResource(R.drawable.ed_black);
        img21.setImageResource(R.drawable.ed_black);
        img22.setImageResource(R.drawable.ed_black);
        img23.setImageResource(R.drawable.ed_black);
        img24.setImageResource(R.drawable.ed_black);
        img25.setImageResource(R.drawable.ed_black);
        img26.setImageResource(R.drawable.ed_black);
        img27.setImageResource(R.drawable.ed_black);
        img28.setImageResource(R.drawable.ed_black);
        imgV1.setImageResource(R.drawable.gray);
        imgV2.setImageResource(R.drawable.gray);
        imgV3.setImageResource(R.drawable.gray);
        imgV4.setImageResource(R.drawable.gray);
        imgV5.setImageResource(R.drawable.gray);
        imgV6.setImageResource(R.drawable.gray);
        imgV7.setImageResource(R.drawable.gray);
        imgV8.setImageResource(R.drawable.gray);

        // Color Reset
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        ImageView c9= (ImageView)findViewById(R.id.sc9);
        ImageView c10= (ImageView)findViewById(R.id.sc10);
        c1.setAlpha(1000);
        c2.setAlpha(1000);
        c3.setAlpha(1000);
        c4.setAlpha(1000);
        c5.setAlpha(1000);
        c6.setAlpha(1000);
        c7.setAlpha(1000);
        c8.setAlpha(1000);
        c9.setAlpha(1000);
        c10.setAlpha(1000);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void check(View view)
    {
        if((e1==0)||(e2==0)||(e3==0)||(e4==0)||(e5==0)||(e6==0)||(e7==0)||(e8==0)||(e9==0)||(e10==0)||(e11==0)||(e12==0)||(e13==0)||(e14==0)||(e15==0)||(e16==0)||(e17==0)||(e18==0)||(e19==0)||(e20==0)||(e21==0)||(e22==0)||(e23==0)||(e24==0)||(e25==0)||(e26==0)||(e27==0)||(e28==0)||(v1==0)||(v2==0)||(v3==0)||(v4==0)||(v5==0)||(v6==0)||(v7==0)||(v8==0))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.edvr_e2);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        }
        else if((v1 == v2)||
                (v1 == v3)||
                (v1 == v4)||
                (v1 == v5)||
                (v1 == v6)||
                (v1 == v7)||
                (v1 == v8)||
                (v2 == v3)||
                (v2 == v4)||
                (v2 == v5)||
                (v2 == v6)||
                (v2 == v7)||
                (v2 == v8)||
                (v3 == v4)||
                (v3 == v5)||
                (v3 == v6)||
                (v3 == v7)||
                (v3 == v8)||
                (v4 == v5)||
                (v4 == v6)||
                (v4 == v7)||
                (v4 == v8)||
                (v5 == v6)||
                (v5 == v7)||
                (v5 == v8)||
                (v6 == v7)||
                (v6 == v8)||
                (v7 == v8)||
                (v1 == e1)||
                (v1 == e8)||
                (v1 == e9)||
                (v1 == e10)||
                (v1 == e11)||
                (v1 == e12)||
                (v1 == e2)||
                (v2 == e2)||
                (v2 == e28)||
                (v2 == e13)||
                (v2 == e14)||
                (v2 == e15)||
                (v2 == e16)||
                (v2 == e3)||
                (v3 == e3)||
                (v3 == e12)||
                (v3 == e17)||
                (v3 == e18)||
                (v3 == e19)||
                (v3 == e20)||
                (v3 == e4)||
                (v4 == e4)||
                (v4 == e16)||
                (v4 == e11)||
                (v4 == e21)||
                (v4 == e22)||
                (v4 == e23)||
                (v4 == e5)||
                (v5 == e5)||
                (v5 == e20)||
                (v5 == e15)||
                (v5 == e24)||
                (v5 == e9)||
                (v5 == e25)||
                (v5 == e6)||
                (v6 == e6)||
                (v6 == e23)||
                (v6 == e19)||
                (v6 == e26)||
                (v6 == e13)||
                (v6 == e8)||
                (v6 == e7)||
                (v7 == e7)||
                (v7 == e25)||
                (v7 == e22)||
                (v7 == e27)||
                (v7 == e17)||
                (v7 == e28)||
                (v7 == e1)||
                (v8 == e10)||
                (v8 == e14)||
                (v8 == e18)||
                (v8 == e21)||
                (v8 == e24)||
                (v8 == e26)||
                (v8 == e27)||
                (e1 == e7)||
                (e1 == e25)||
                (e1 == e22)||
                (e1 == e27)||
                (e1 == e17)||
                (e1 == e28)||
                (e1 == e8)||
                (e1 == e9)||
                (e1 == e10)||
                (e1 == e11)||
                (e1 == e12)||
                (e1 == e2)||
                (e2 == e8)||
                (e2 == e9)||
                (e2 == e10)||
                (e2 == e11)||
                (e2 == e12)||
                (e2 == e28)||
                (e2 == e13)||
                (e2 == e15)||
                (e2 == e16)||
                (e2 == e3)||
                (e3 == e28)||
                (e3 == e13)||
                (e3 == e14)||
                (e3 == e15)||
                (e3 == e16)||
                (e3 == e12)||
                (e3 == e17)||
                (e3 == e18)||
                (e3 == e19)||
                (e3 == e20)||
                (e3 == e4)||
                (e4 == e12)||
                (e4 == e17)||
                (e4 == e18)||
                (e4 == e19)||
                (e4 == e20)||
                (e4 == e16)||
                (e4 == e11)||
                (e4 == e21)||
                (e4 == e22)||
                (e4 == e23)||
                (e4 == e5)||
                (e5 == e16)||
                (e5 == e11)||
                (e5 == e21)||
                (e5 == e22)||
                (e5 == e23)||
                (e5 == e20)||
                (e5 == e15)||
                (e5 == e24)||
                (e5 == e9)||
                (e5 == e25)||
                (e5 == e6)||
                (e6 == e20)||
                (e6 == e15)||
                (e6 == e24)||
                (e6 == e9)||
                (e6 == e25)||
                (e6 == e23)||
                (e6 == e19)||
                (e6 == e26)||
                (e6 == e13)||
                (e6 == e8)||
                (e6 == e7)||
                (e7 == e23)||
                (e7 == e19)||
                (e7 == e26)||
                (e7 == e13)||
                (e7 == e8)||
                (e7 == e25)||
                (e7 == e22)||
                (e7 == e27)||
                (e7 == e17)||
                (e7 == e28)||
                (e8 == e9)||
                (e8 == e10)||
                (e8 == e11)||
                (e8 == e12)||
                (e8 == e23)||
                (e8 == e19)||
                (e8 == e26)||
                (e8 == e13)||
                (e9 == e10)||
                (e9 == e11)||
                (e9 == e12)||
                (e9 == e20)||
                (e9 == e15)||
                (e9 == e24)||
                (e9 == e25)||
                (e10 == e11)||
                (e10 == e12)||
                (e10 == e14)||
                (e10 == e18)||
                (e10 == e21)||
                (e10 == e24)||
                (e10 == e26)||
                (e10 == e27)||
                (e11 == e12)||
                (e11 == e16)||
                (e11 == e21)||
                (e11 == e22)||
                (e11 == e23)||
                (e12 == e17)||
                (e12 == e18)||
                (e12 == e19)||
                (e12 == e20)||
                (e13 == e14)||
                (e13 == e15)||
                (e13 == e16)||
                (e13 == e28)||
                (e13 == e23)||
                (e13 == e19)||
                (e13 == e26)||
                (e14 == e15)||
                (e14 == e16)||
                (e14 == e28)||
                (e14 == e18)||
                (e14 == e21)||
                (e14 == e24)||
                (e14 == e26)||
                (e14 == e27)||
                (e15 == e16)||
                (e15 == e28)||
                (e15 == e20)||
                (e15 == e24)||
                (e15 == e25)||
                (e16 == e28)||
                (e16 == e21)||
                (e16 == e22)||
                (e16 == e23)||
                (e17 == e28)||
                (e17 == e27)||
                (e17 == e22)||
                (e17 == e25)||
                (e17 == e18)||
                (e17 == e19)||
                (e17 == e20)||
                (e18 == e19)||
                (e18 == e20)||
                (e18 == e21)||
                (e18 == e24)||
                (e18 == e26)||
                (e18 == e27)||
                (e19 == e20)||
                (e19 == e23)||
                (e19 == e26)||
                (e20 == e24)||
                (e20 == e25)||
                (e21 == e24)||
                (e21 == e26)||
                (e21 == e27)||
                (e22 == e27)||
                (e22 == e25)||
                (e22 == e23)||
                (e22 == e28)||
                (e21 == e22)||
                (e21 == e23)||
                (e23 == e26)||
                (e24 == e26)||
                (e24 == e27)||
                (e24 == e25)||
                (e25 == e27)||
                (e25 == e28)||
                (e26 == e27)||
                (e27 == e28))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.edvr_e1);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        }
        else
        {
            winSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.winning_popup);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
            final KonfettiView conf= findViewById(R.id.conffetti);
            conf.build()
                    .addColors(Color.YELLOW, getColor(R.color.orange),getColor(R.color.cyan),getColor(R.color.red))
                    .setDirection(0,360)
                    .setSpeed(1f,5f)
                    .setFadeOutEnabled(true)
                    .setTimeToLive(1000L)
                    .addShapes(Shape.Square.INSTANCE,Shape.RECT)
                    .addSizes(new Size(7,5))
                    .setPosition(-10f,conf.getWidth() + 10f,-10f,-10f)
                    .streamFor(300,5000L);

        }
    }

    public void nextlvl(View view)
    {
        clrAll(view);
        Intent intent = new Intent(this,EdgeHL20.class);
        startActivity(intent);
    }
    public void rstlvl(View view)
    {
        clrAll(view);
        mydialog.cancel();
    }
    public void reTry(View view)
    {
        mydialog.cancel();
    }
    public void gotoMenu(View view)
    {
        tapSound();
        Intent intent = new Intent(this,EdgeHlvl.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge_hl19);
    }
    public void onBackPressed()
    {
        mydialog = new Dialog(this);
        mydialog.setCancelable(true);
        mydialog.setContentView(R.layout.paused);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
}