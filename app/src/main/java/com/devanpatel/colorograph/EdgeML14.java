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

public class EdgeML14 extends AppCompatActivity
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
        if((e1==0)||(e2==0)||(e3==0)||(e4==0)||(e5==0)||(e6==0)||(e7==0)||(e8==0)||(e9==0)||(e10==0)||(e11==0)||(e12==0))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.edge_e2);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        }
        else if((e1 == e2) ||
                (e1 == e3) ||
                (e1 == e4) ||
                (e1 == e5) ||
                (e1 == e9) ||
                (e2 == e3) ||
                (e2 == e4) ||
                (e2 == e6) ||
                (e2 == e10) ||
                (e3 == e4) ||
                (e3 == e7) ||
                (e3 == e11) ||
                (e4 == e8) ||
                (e4 == e12) ||
                (e5 == e6) ||
                (e5 == e7) ||
                (e5 == e8) ||
                (e5 == e9) ||
                (e6 == e7) ||
                (e6 == e8) ||
                (e6 == e10) ||
                (e7 == e8) ||
                (e7 == e11) ||
                (e8 == e12) ||
                (e9 == e10) ||
                (e9 == e11) ||
                (e9 == e12) ||
                (e10 == e11) ||
                (e10 == e12) ||
                (e11 == e12))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.edge_e1);
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
        Intent intent = new Intent(this,EdgeML15.class);
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
        Intent intent = new Intent(this,EdgeMlvl.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge_ml14);
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