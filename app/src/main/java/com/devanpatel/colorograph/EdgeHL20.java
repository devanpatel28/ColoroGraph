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

public class EdgeHL20 extends AppCompatActivity
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
    static int e29=0;
    static int e30=0;
    static int e31=0;
    static int e32=0;
    static int e33=0;
    static int e34=0;
    static int e35=0;
    static int e36=0;
    static int e37=0;
    static int e38=0;
    static int e39=0;
    static int e40=0;
    static int e41=0;
    static int e42=0;
    static int e43=0;
    static int e44=0;
    static int e45=0;
    static int e46=0;
    static int e47=0;
    static int e48=0;
    static int e49=0;
    static int e50=0;
    static int e51=0;
    static int e52=0;
    static int e53=0;
    static int e54=0;
    static int e55=0;
    static int e56=0;
    static int e57=0;
    static int e58=0;
    static int e59=0;
    static int e60=0;
    static int e61=0;
    static int e62=0;
    static int e63=0;

    static int v1=0;
    static int v2=0;
    static int v3=0;
    static int v4=0;
    static int v5=0;
    static int v6=0;
    static int v7=0;
    static int v8=0;
    static int v9=0;
    static int v10=0;
    static int v11=0;
    static int v12=0;
    static int v13=0;
    static int v14=0;
    static int v16=0;
    static int v17=0;
    static int v18=0;
    static int v19=0;
    static int v20=0;
    static int v21=0;
    static int v22=0;
    static int v23=0;
    static int v24=0;
    static int v25=0;

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
    public void e28Tap(View view)
    {
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
    public void e29Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_black);
            e29=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_red);
            e29=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_blue);
            e29=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_yellow);
            e29=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_green);
            e29=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_brown);
            e29=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_pink);
            e29=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_cyan);
            e29=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_parrot);
            e29=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_dpurple);
            e29=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e29);
            img.setImageResource(R.drawable.ed_cblue);
            e29=10;
        }
    }
    public void e30Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_black);
            e30=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_red);
            e30=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_blue);
            e30=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_yellow);
            e30=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_green);
            e30=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_brown);
            e30=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_pink);
            e30=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_cyan);
            e30=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_parrot);
            e30=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_dpurple);
            e30=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e30);
            img.setImageResource(R.drawable.ed_cblue);
            e30=10;
        }
    }
    public void e31Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_black);
            e31=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_red);
            e31=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_blue);
            e31=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_yellow);
            e31=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_green);
            e31=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_brown);
            e31=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_pink);
            e31=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_cyan);
            e31=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_parrot);
            e31=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_dpurple);
            e31=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e31);
            img.setImageResource(R.drawable.ed_cblue);
            e31=10;
        }
    }
    public void e32Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_black);
            e32=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_red);
            e32=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_blue);
            e32=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_yellow);
            e32=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_green);
            e32=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_brown);
            e32=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_pink);
            e32=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_cyan);
            e32=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_parrot);
            e32=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_dpurple);
            e32=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e32);
            img.setImageResource(R.drawable.ed_cblue);
            e32=10;
        }
    }
    public void e33Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_black);
            e33=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_red);
            e33=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_blue);
            e33=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_yellow);
            e33=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_green);
            e33=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_brown);
            e33=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_pink);
            e33=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_cyan);
            e33=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_parrot);
            e33=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_dpurple);
            e33=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e33);
            img.setImageResource(R.drawable.ed_cblue);
            e33=10;
        }
    }
    public void e34Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_black);
            e34=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_red);
            e34=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_blue);
            e34=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_yellow);
            e34=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_green);
            e34=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_brown);
            e34=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_pink);
            e34=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_cyan);
            e34=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_parrot);
            e34=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_dpurple);
            e34=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e34);
            img.setImageResource(R.drawable.ed_cblue);
            e34=10;
        }
    }
    public void e35Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_black);
            e35=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_red);
            e35=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_blue);
            e35=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_yellow);
            e35=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_green);
            e35=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_brown);
            e35=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_pink);
            e35=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_cyan);
            e35=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_parrot);
            e35=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_dpurple);
            e35=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e35);
            img.setImageResource(R.drawable.ed_cblue);
            e35=10;
        }
    }
    public void e36Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_black);
            e36=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_red);
            e36=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_blue);
            e36=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_yellow);
            e36=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_green);
            e36=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_brown);
            e36=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_pink);
            e36=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_cyan);
            e36=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_parrot);
            e36=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_dpurple);
            e36=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e36);
            img.setImageResource(R.drawable.ed_cblue);
            e36=10;
        }
    }
    public void e37Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_black);
            e37=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_red);
            e37=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_blue);
            e37=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_yellow);
            e37=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_green);
            e37=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_brown);
            e37=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_pink);
            e37=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_cyan);
            e37=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_parrot);
            e37=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_dpurple);
            e37=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e37);
            img.setImageResource(R.drawable.ed_cblue);
            e37=10;
        }
    }
    public void e38Tap(View view)
    {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_black);
            e38 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_red);
            e38 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_blue);
            e38 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_yellow);
            e38 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_green);
            e38 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_brown);
            e38 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_pink);
            e38 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_cyan);
            e38 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_parrot);
            e38 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_dpurple);
            e38 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.e38);
            img.setImageResource(R.drawable.ed_cblue);
            e38 = 10;
        }
    }
    public void e39Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_black);
            e39=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_red);
            e39=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_blue);
            e39=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_yellow);
            e39=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_green);
            e39=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_brown);
            e39=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_pink);
            e39=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_cyan);
            e39=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_parrot);
            e39=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_dpurple);
            e39=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e39);
            img.setImageResource(R.drawable.ed_cblue);
            e39=10;
        }
    }
    public void e40Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_black);
            e40=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_red);
            e40=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_blue);
            e40=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_yellow);
            e40=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_green);
            e40=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_brown);
            e40=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_pink);
            e40=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_cyan);
            e40=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_parrot);
            e40=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_dpurple);
            e40=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e40);
            img.setImageResource(R.drawable.ed_cblue);
            e40=10;
        }
    }
    public void e41Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_black);
            e41=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_red);
            e41=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_blue);
            e41=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_yellow);
            e41=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_green);
            e41=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_brown);
            e41=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_pink);
            e41=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_cyan);
            e41=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_parrot);
            e41=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_dpurple);
            e41=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e41);
            img.setImageResource(R.drawable.ed_cblue);
            e41=10;
        }
    }
    public void e42Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_black);
            e42=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_red);
            e42=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_blue);
            e42=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_yellow);
            e42=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_green);
            e42=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_brown);
            e42=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_pink);
            e42=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_cyan);
            e42=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_parrot);
            e42=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_dpurple);
            e42=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e42);
            img.setImageResource(R.drawable.ed_cblue);
            e42=10;
        }
    }
    public void e43Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_black);
            e43=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_red);
            e43=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_blue);
            e43=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_yellow);
            e43=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_green);
            e43=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_brown);
            e43=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_pink);
            e43=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_cyan);
            e43=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_parrot);
            e43=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_dpurple);
            e43=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e43);
            img.setImageResource(R.drawable.ed_cblue);
            e43=10;
        }
    }
    public void e44Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_black);
            e44=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_red);
            e44=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_blue);
            e44=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_yellow);
            e44=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_green);
            e44=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_brown);
            e44=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_pink);
            e44=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_cyan);
            e44=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_parrot);
            e44=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_dpurple);
            e44=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e44);
            img.setImageResource(R.drawable.ed_cblue);
            e44=10;
        }
    }
    public void e45Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_black);
            e45=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_red);
            e45=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_blue);
            e45=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_yellow);
            e45=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_green);
            e45=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_brown);
            e45=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_pink);
            e45=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_cyan);
            e45=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_parrot);
            e45=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_dpurple);
            e45=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e45);
            img.setImageResource(R.drawable.ed_cblue);
            e45=10;
        }
    }
    public void e46Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_black);
            e46=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_red);
            e46=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_blue);
            e46=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_yellow);
            e46=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_green);
            e46=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_brown);
            e46=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_pink);
            e46=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_cyan);
            e46=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_parrot);
            e46=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_dpurple);
            e46=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e46);
            img.setImageResource(R.drawable.ed_cblue);
            e46=10;
        }
    }
    public void e47Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_black);
            e47=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_red);
            e47=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_blue);
            e47=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_yellow);
            e47=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_green);
            e47=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_brown);
            e47=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_pink);
            e47=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_cyan);
            e47=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_parrot);
            e47=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_dpurple);
            e47=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e47);
            img.setImageResource(R.drawable.ed_cblue);
            e47=10;
        }
    }
    public void e48Tap(View view)
    {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_black);
            e48 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_red);
            e48 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_blue);
            e48 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_yellow);
            e48 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_green);
            e48 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_brown);
            e48 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_pink);
            e48 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_cyan);
            e48 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_parrot);
            e48 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_dpurple);
            e48 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.e48);
            img.setImageResource(R.drawable.ed_cblue);
            e48 = 10;
        }
    }
    public void e49Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_black);
            e49=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_red);
            e49=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_blue);
            e49=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_yellow);
            e49=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_green);
            e49=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_brown);
            e49=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_pink);
            e49=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_cyan);
            e49=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_parrot);
            e49=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_dpurple);
            e49=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e49);
            img.setImageResource(R.drawable.ed_cblue);
            e49=10;
        }
    }
    public void e50Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_black);
            e50=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_red);
            e50=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_blue);
            e50=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_yellow);
            e50=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_green);
            e50=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_brown);
            e50=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_pink);
            e50=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_cyan);
            e50=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_parrot);
            e50=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_dpurple);
            e50=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e50);
            img.setImageResource(R.drawable.ed_cblue);
            e50=10;
        }
    }
    public void e51Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_black);
            e51=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_red);
            e51=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_blue);
            e51=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_yellow);
            e51=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_green);
            e51=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_brown);
            e51=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_pink);
            e51=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_cyan);
            e51=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_parrot);
            e51=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_dpurple);
            e51=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e51);
            img.setImageResource(R.drawable.ed_cblue);
            e51=10;
        }
    }
    public void e52Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_black);
            e52=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_red);
            e52=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_blue);
            e52=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_yellow);
            e52=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_green);
            e52=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_brown);
            e52=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_pink);
            e52=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_cyan);
            e52=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_parrot);
            e52=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_dpurple);
            e52=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e52);
            img.setImageResource(R.drawable.ed_cblue);
            e52=10;
        }
    }
    public void e53Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_black);
            e53=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_red);
            e53=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_blue);
            e53=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_yellow);
            e53=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_green);
            e53=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_brown);
            e53=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_pink);
            e53=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_cyan);
            e53=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_parrot);
            e53=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_dpurple);
            e53=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e53);
            img.setImageResource(R.drawable.ed_cblue);
            e53=10;
        }
    }
    public void e54Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_black);
            e54=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_red);
            e54=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_blue);
            e54=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_yellow);
            e54=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_green);
            e54=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_brown);
            e54=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_pink);
            e54=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_cyan);
            e54=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_parrot);
            e54=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_dpurple);
            e54=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e54);
            img.setImageResource(R.drawable.ed_cblue);
            e54=10;
        }
    }
    public void e55Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_black);
            e55=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_red);
            e55=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_blue);
            e55=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_yellow);
            e55=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_green);
            e55=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_brown);
            e55=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_pink);
            e55=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_cyan);
            e55=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_parrot);
            e55=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_dpurple);
            e55=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e55);
            img.setImageResource(R.drawable.ed_cblue);
            e55=10;
        }
    }
    public void e56Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_black);
            e56=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_red);
            e56=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_blue);
            e56=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_yellow);
            e56=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_green);
            e56=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_brown);
            e56=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_pink);
            e56=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_cyan);
            e56=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_parrot);
            e56=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_dpurple);
            e56=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e56);
            img.setImageResource(R.drawable.ed_cblue);
            e56=10;
        }
    }
    public void e57Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_black);
            e57=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_red);
            e57=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_blue);
            e57=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_yellow);
            e57=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_green);
            e57=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_brown);
            e57=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_pink);
            e57=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_cyan);
            e57=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_parrot);
            e57=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_dpurple);
            e57=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e57);
            img.setImageResource(R.drawable.ed_cblue);
            e57=10;
        }
    }
    public void e58Tap(View view)
    {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_black);
            e58 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_red);
            e58 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_blue);
            e58 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_yellow);
            e58 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_green);
            e58 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_brown);
            e58 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_pink);
            e58 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_cyan);
            e58 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_parrot);
            e58 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_dpurple);
            e58 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.e58);
            img.setImageResource(R.drawable.ed_cblue);
            e58 = 10;
        }
    }
    public void e59Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_black);
            e59=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_red);
            e59=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_blue);
            e59=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_yellow);
            e59=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_green);
            e59=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_brown);
            e59=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_pink);
            e59=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_cyan);
            e59=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_parrot);
            e59=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_dpurple);
            e59=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e59);
            img.setImageResource(R.drawable.ed_cblue);
            e59=10;
        }
    }
    public void e60Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_black);
            e60=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_red);
            e60=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_blue);
            e60=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_yellow);
            e60=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_green);
            e60=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_brown);
            e60=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_pink);
            e60=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_cyan);
            e60=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_parrot);
            e60=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_dpurple);
            e60=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e60);
            img.setImageResource(R.drawable.ed_cblue);
            e60=10;
        }
    }
    public void e61Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_black);
            e61=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_red);
            e61=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_blue);
            e61=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_yellow);
            e61=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_green);
            e61=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_brown);
            e61=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_pink);
            e61=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_cyan);
            e61=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_parrot);
            e61=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_dpurple);
            e61=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e61);
            img.setImageResource(R.drawable.ed_cblue);
            e61=10;
        }
    }
    public void e62Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_black);
            e62=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_red);
            e62=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_blue);
            e62=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_yellow);
            e62=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_green);
            e62=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_brown);
            e62=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_pink);
            e62=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_cyan);
            e62=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_parrot);
            e62=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_dpurple);
            e62=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e62);
            img.setImageResource(R.drawable.ed_cblue);
            e62=10;
        }
    }
    public void e63Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_black);
            e63=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_red);
            e63=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_blue);
            e63=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_yellow);
            e63=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_green);
            e63=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_brown);
            e63=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_pink);
            e63=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_cyan);
            e63=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_parrot);
            e63=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_dpurple);
            e63=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.e63);
            img.setImageResource(R.drawable.ed_cblue);
            e63=10;
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
    public void v9Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.gray);
            v9=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.red);
            v9=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.blue);
            v9=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.yellow);
            v9=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.green);
            v9=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.brown);
            v9=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.pink);
            v9=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.cyan);
            v9=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.parot);
            v9=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.dpurple);
            v9=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.cadedblue);
            v9=10;
        }

    }
    public void v10Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.gray);
            v10=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.red);
            v10=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.blue);
            v10=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.yellow);
            v10=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.green);
            v10=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.brown);
            v10=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.pink);
            v10=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.cyan);
            v10=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.parot);
            v10=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.dpurple);
            v10=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.cadedblue);
            v10=10;
        }

    }
    public void v11Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.gray);
            v11=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.red);
            v11=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.blue);
            v11=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.yellow);
            v11=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.green);
            v11=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.brown);
            v11=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.pink);
            v11=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.cyan);
            v11=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.parot);
            v11=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.dpurple);
            v11=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.cadedblue);
            v11=10;
        }

    }
    public void v12Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.gray);
            v12=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.red);
            v12=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.blue);
            v12=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.yellow);
            v12=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.green);
            v12=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.brown);
            v12=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.pink);
            v12=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.cyan);
            v12=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.parot);
            v12=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.dpurple);
            v12=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.cadedblue);
            v12=10;
        }

    }
    public void v13Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.gray);
            v13=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.red);
            v13=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.blue);
            v13=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.yellow);
            v13=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.green);
            v13=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.brown);
            v13=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.pink);
            v13=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.cyan);
            v13=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.parot);
            v13=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.dpurple);
            v13=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.cadedblue);
            v13=10;
        }

    }
    public void v14Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.gray);
            v14=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.red);
            v14=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.blue);
            v14=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.yellow);
            v14=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.green);
            v14=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.brown);
            v14=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.pink);
            v14=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.cyan);
            v14=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.parot);
            v14=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.dpurple);
            v14=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.cadedblue);
            v14=10;
        }

    }

    public void v16Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.gray);
            v16=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.red);
            v16=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.blue);
            v16=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.yellow);
            v16=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.green);
            v16=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.brown);
            v16=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.pink);
            v16=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.cyan);
            v16=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.parot);
            v16=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.dpurple);
            v16=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.cadedblue);
            v16=10;
        }

    }
    public void v17Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.gray);
            v17=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.red);
            v17=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.blue);
            v17=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.yellow);
            v17=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.green);
            v17=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.brown);
            v17=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.pink);
            v17=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.cyan);
            v17=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.parot);
            v17=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.dpurple);
            v17=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.cadedblue);
            v17=10;
        }

    }
    public void v18Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.gray);
            v18=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.red);
            v18=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.blue);
            v18=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.yellow);
            v18=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.green);
            v18=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.brown);
            v18=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.pink);
            v18=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.cyan);
            v18=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.parot);
            v18=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.dpurple);
            v18=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.cadedblue);
            v18=10;
        }

    }
    public void v19Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.gray);
            v19=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.red);
            v19=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.blue);
            v19=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.yellow);
            v19=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.green);
            v19=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.brown);
            v19=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.pink);
            v19=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.cyan);
            v19=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.parot);
            v19=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.dpurple);
            v19=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.cadedblue);
            v19=10;
        }

    }
    public void v20Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.gray);
            v20=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.red);
            v20=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.blue);
            v20=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.yellow);
            v20=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.green);
            v20=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.brown);
            v20=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.pink);
            v20=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.cyan);
            v20=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.parot);
            v20=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.dpurple);
            v20=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.cadedblue);
            v20=10;
        }

    }
    public void v21Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.gray);
            v21=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.red);
            v21=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.blue);
            v21=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.yellow);
            v21=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.green);
            v21=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.brown);
            v21=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.pink);
            v21=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.cyan);
            v21=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.parot);
            v21=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.dpurple);
            v21=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.cadedblue);
            v21=10;
        }

    }
    public void v22Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.gray);
            v22=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.red);
            v22=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.blue);
            v22=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.yellow);
            v22=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.green);
            v22=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.brown);
            v22=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.pink);
            v22=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.cyan);
            v22=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.parot);
            v22=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.dpurple);
            v22=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.cadedblue);
            v22=10;
        }

    }
    public void v23Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.gray);
            v23=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.red);
            v23=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.blue);
            v23=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.yellow);
            v23=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.green);
            v23=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.brown);
            v23=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.pink);
            v23=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.cyan);
            v23=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.parot);
            v23=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.dpurple);
            v23=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.cadedblue);
            v23=10;
        }

    }
    public void v24Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.gray);
            v24=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.red);
            v24=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.blue);
            v24=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.yellow);
            v24=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.green);
            v24=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.brown);
            v24=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.pink);
            v24=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.cyan);
            v24=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.parot);
            v24=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.dpurple);
            v24=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.cadedblue);
            v24=10;
        }

    }
    public void v25Tap(View view)
    {
        tapSound();
        if(selectColor==0)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.gray);
            v25=0;
        }
        else if(selectColor==1)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.red);
            v25=1;
        }
        else if(selectColor==2)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.blue);
            v25=2;
        }
        else if(selectColor==3)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.yellow);
            v25=3;
        }
        else if(selectColor==4)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.green);
            v25=4;
        }
        else if(selectColor==5)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.brown);
            v25=5;
        }
        else if(selectColor==6)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.pink);
            v25=6;
        }
        else if(selectColor==7)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.cyan);
            v25=7;
        }
        else if(selectColor==8)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.parot);
            v25=8;
        }
        else if(selectColor==9)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.dpurple);
            v25=9;
        }
        else if(selectColor==10)
        {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.cadedblue);
            v25=10;
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
        e29=0;
        e30=0;
        e31=0;
        e32=0;
        e33=0;
        e34=0;
        e35=0;
        e36=0;
        e37=0;
        e38=0;
        e39=0;
        e40=0;
        e41=0;
        e42=0;
        e43=0;
        e44=0;
        e45=0;
        e46=0;
        e47=0;
        e48=0;
        e49=0;
        e50=0;
        e51=0;
        e52=0;
        e53=0;
        e54=0;
        e55=0;
        e56=0;
        e57=0;
        e58=0;
        e59=0;
        e60=0;
        e61=0;
        e62=0;
        e63=0;

        v1=0;
        v2=0;
        v3=0;
        v4=0;
        v5=0;
        v6=0;
        v7=0;
        v8=0;
        v9=0;
        v10=0;
        v11=0;
        v12=0;
        v13=0;
        v14=0;
        v16=0;
        v17=0;
        v18=0;
        v19=0;
        v20=0;
        v21=0;
        v22=0;
        v23=0;
        v24=0;
        v25=0;


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
        ImageView img29 = (ImageView) findViewById(R.id.e29);
        ImageView img30 = (ImageView) findViewById(R.id.e30);
        ImageView img31 = (ImageView) findViewById(R.id.e31);
        ImageView img32 = (ImageView) findViewById(R.id.e32);
        ImageView img33 = (ImageView) findViewById(R.id.e33);
        ImageView img34 = (ImageView) findViewById(R.id.e34);
        ImageView img35 = (ImageView) findViewById(R.id.e35);
        ImageView img36 = (ImageView) findViewById(R.id.e36);
        ImageView img37 = (ImageView) findViewById(R.id.e37);
        ImageView img38 = (ImageView) findViewById(R.id.e38);
        ImageView img39 = (ImageView) findViewById(R.id.e39);
        ImageView img40 = (ImageView) findViewById(R.id.e40);
        ImageView img41 = (ImageView) findViewById(R.id.e41);
        ImageView img42 = (ImageView) findViewById(R.id.e42);
        ImageView img43 = (ImageView) findViewById(R.id.e43);
        ImageView img44 = (ImageView) findViewById(R.id.e44);
        ImageView img45 = (ImageView) findViewById(R.id.e45);
        ImageView img46 = (ImageView) findViewById(R.id.e46);
        ImageView img47 = (ImageView) findViewById(R.id.e47);
        ImageView img48 = (ImageView) findViewById(R.id.e48);
        ImageView img49 = (ImageView) findViewById(R.id.e49);
        ImageView img50 = (ImageView) findViewById(R.id.e50);
        ImageView img51 = (ImageView) findViewById(R.id.e51);
        ImageView img52 = (ImageView) findViewById(R.id.e52);
        ImageView img53 = (ImageView) findViewById(R.id.e53);
        ImageView img54 = (ImageView) findViewById(R.id.e54);
        ImageView img55 = (ImageView) findViewById(R.id.e55);
        ImageView img56 = (ImageView) findViewById(R.id.e56);
        ImageView img57 = (ImageView) findViewById(R.id.e57);
        ImageView img58 = (ImageView) findViewById(R.id.e58);
        ImageView img59 = (ImageView) findViewById(R.id.e59);
        ImageView img60 = (ImageView) findViewById(R.id.e60);
        ImageView img61 = (ImageView) findViewById(R.id.e61);
        ImageView img62 = (ImageView) findViewById(R.id.e62);
        ImageView img63 = (ImageView) findViewById(R.id.e63);

        ImageView imgV1 = (ImageView) findViewById(R.id.v1);
        ImageView imgV2 = (ImageView) findViewById(R.id.v2);
        ImageView imgV3 = (ImageView) findViewById(R.id.v3);
        ImageView imgV4 = (ImageView) findViewById(R.id.v4);
        ImageView imgV5 = (ImageView) findViewById(R.id.v5);
        ImageView imgV6 = (ImageView) findViewById(R.id.v6);
        ImageView imgV7 = (ImageView) findViewById(R.id.v7);
        ImageView imgV8 = (ImageView) findViewById(R.id.v8);
        ImageView imgV9 = (ImageView) findViewById(R.id.v9);
        ImageView imgV10 = (ImageView) findViewById(R.id.v10);
        ImageView imgV11 = (ImageView) findViewById(R.id.v11);
        ImageView imgV12 = (ImageView) findViewById(R.id.v12);
        ImageView imgV13 = (ImageView) findViewById(R.id.v13);
        ImageView imgV14 = (ImageView) findViewById(R.id.v14);
        ImageView imgV16 = (ImageView) findViewById(R.id.v16);
        ImageView imgV17 = (ImageView) findViewById(R.id.v17);
        ImageView imgV18 = (ImageView) findViewById(R.id.v18);
        ImageView imgV19 = (ImageView) findViewById(R.id.v19);
        ImageView imgV20 = (ImageView) findViewById(R.id.v20);
        ImageView imgV21 = (ImageView) findViewById(R.id.v21);
        ImageView imgV22 = (ImageView) findViewById(R.id.v22);
        ImageView imgV23 = (ImageView) findViewById(R.id.v23);
        ImageView imgV24 = (ImageView) findViewById(R.id.v24);
        ImageView imgV25 = (ImageView) findViewById(R.id.v25);


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
        img29.setImageResource(R.drawable.ed_black);
        img30.setImageResource(R.drawable.ed_black);
        img31.setImageResource(R.drawable.ed_black);
        img32.setImageResource(R.drawable.ed_black);
        img33.setImageResource(R.drawable.ed_black);
        img34.setImageResource(R.drawable.ed_black);
        img35.setImageResource(R.drawable.ed_black);
        img36.setImageResource(R.drawable.ed_black);
        img37.setImageResource(R.drawable.ed_black);
        img38.setImageResource(R.drawable.ed_black);
        img39.setImageResource(R.drawable.ed_black);
        img40.setImageResource(R.drawable.ed_black);
        img41.setImageResource(R.drawable.ed_black);
        img42.setImageResource(R.drawable.ed_black);
        img43.setImageResource(R.drawable.ed_black);
        img44.setImageResource(R.drawable.ed_black);
        img45.setImageResource(R.drawable.ed_black);
        img46.setImageResource(R.drawable.ed_black);
        img47.setImageResource(R.drawable.ed_black);
        img48.setImageResource(R.drawable.ed_black);
        img49.setImageResource(R.drawable.ed_black);
        img50.setImageResource(R.drawable.ed_black);
        img51.setImageResource(R.drawable.ed_black);
        img52.setImageResource(R.drawable.ed_black);
        img53.setImageResource(R.drawable.ed_black);
        img54.setImageResource(R.drawable.ed_black);
        img55.setImageResource(R.drawable.ed_black);
        img56.setImageResource(R.drawable.ed_black);
        img57.setImageResource(R.drawable.ed_black);
        img58.setImageResource(R.drawable.ed_black);
        img59.setImageResource(R.drawable.ed_black);
        img60.setImageResource(R.drawable.ed_black);
        img61.setImageResource(R.drawable.ed_black);
        img62.setImageResource(R.drawable.ed_black);
        img63.setImageResource(R.drawable.ed_black);

        imgV1.setImageResource(R.drawable.gray);
        imgV2.setImageResource(R.drawable.gray);
        imgV3.setImageResource(R.drawable.gray);
        imgV4.setImageResource(R.drawable.gray);
        imgV5.setImageResource(R.drawable.gray);
        imgV6.setImageResource(R.drawable.gray);
        imgV7.setImageResource(R.drawable.gray);
        imgV8.setImageResource(R.drawable.gray);
        imgV9.setImageResource(R.drawable.gray);
        imgV10.setImageResource(R.drawable.gray);
        imgV11.setImageResource(R.drawable.gray);
        imgV12.setImageResource(R.drawable.gray);
        imgV13.setImageResource(R.drawable.gray);
        imgV14.setImageResource(R.drawable.gray);
        imgV16.setImageResource(R.drawable.gray);
        imgV17.setImageResource(R.drawable.gray);
        imgV18.setImageResource(R.drawable.gray);
        imgV19.setImageResource(R.drawable.gray);
        imgV20.setImageResource(R.drawable.gray);
        imgV21.setImageResource(R.drawable.gray);
        imgV22.setImageResource(R.drawable.gray);
        imgV23.setImageResource(R.drawable.gray);
        imgV24.setImageResource(R.drawable.gray);
        imgV25.setImageResource(R.drawable.gray);

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
        if((e1==0) ||
                (e2==0)||
                (e3==0)||
                (e4==0)||
                (e5==0)||
                (e6==0)||
                (e7==0)||
                (e8==0)||
                (e9==0)||
                (e10==0)||
                (e11==0)||
                (e12==0)||
                (e13==0)||
                (e14==0)||
                (e15==0)||
                (e16==0)||
                (e17==0)||
                (e18==0)||
                (e19==0)||(e20==0)||(e21==0)||(e22==0)||(e23==0)||(e24==0)||(e25==0)||(e26==0)||(e27==0)||(e28==0)||(e29==0)||(e30==0)||(v1==0)||(v2==0)||(v3==0)||(v4==0)||(v5==0)||(v6==0)||(v7==0)||(v8==0)||(v9==0)||(v10==0)||(v11==0)||(v12==0)||(v13==0)||(v14==0)||(v25==0)||(v16==0)||(v17==0)||(v18==0)||(v19==0)||(v20==0)
                ||(e30==0)||
                (e31==0)||
                (e32==0)||
                (e33==0)||
                (e34==0)||
                (e35==0)||
                (e36==0)||
                (e37==0)||
                (e38==0)||
                (e39==0)||
                (e40==0)||
                (e41==0)||
                (e42==0)||
                (e43==0)||
                (e44==0)||
                (e45==0)||
                (e46==0)||
                (e47==0)||
                (e48==0)||
                (e49==0)||
                (e50==0)||
                (e51==0)||
                (e52==0)||
                (e53==0)||
                (e54==0)||
                (e55==0)||
                (e56==0)||
                (e57==0)||
                (e58==0)||
                (e59==0)||
                (e60==0)||
                (e61==0)||
                (e62==0)||
                (e63==0))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.edvr_e2);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        }
        else if((e1 == e8)||
                (e1 == e10)||
                (e1 == e11)||
                (e1 == e12)||
                (e1 == e2)||
                (e1 == e3)||
                (e1 == e5)||
                (e1 == e6)||
                (e2 == e8)||
                (e2 == e10)||
                (e2 == e11)||
                (e2 == e12)||
                (e2 == e3)||
                (e2 == e4)||
                (e2 == e13)||
                (e2 == e14)||
                (e2 == e15)||
                (e3 == e5)||
                (e3 == e6)||
                (e3 == e4)||
                (e3 == e13)||
                (e3 == e14)||
                (e3 == e15)||
                (e4 == e13)||
                (e4 == e14)||
                (e4 == e15)||
                (e4 == e5)||
                (e4 == e7)||
                (e4 == e16)||
                (e4 == e17)||
                (e4 == e18)||
                (e5 == e7)||
                (e5 == e6)||
                (e5 == e16)||
                (e5 == e17)||
                (e5 == e18)||
                (e6 == e7)||
                (e6 == e19)||
                (e6 == e20)||
                (e7 == e16)||
                (e7 == e17)||
                (e7 == e18)||
                (e7 == e19)||
                (e7 == e20)||
                (e8 == e10)||
                (e8 == e11)||
                (e8 == e12)||
                (e8 == e9)||
                (e8 == e21)||
                (e8 == e22)||
                (e9 == e21)||
                (e9 == e22)||
                (e9 == e23)||
                (e9 == e24)||
                (e9 == e25)||
                (e9 == e10)||
                (e10 == e11)||
                (e10 == e12)||
                (e23 == e10)||
                (e10 == e24)||
                (e10 == e25)||
                (e11 == e12)||
                (e11 == e25)||
                (e11 == e26)||
                (e11 == e34)||
                (e11 == e35)||
                (e11 == e37)||
                (e12 == e13)||
                (e12 == e26)||
                (e12 == e27)||
                (e12 == e28)||
                (e12 == e29)||
                (e13 == e14)||
                (e13 == e15)||
                (e13 == e26)||
                (e13 == e27)||
                (e13 == e28)||
                (e13 == e29)||
                (e14 == e15)||
                (e14 == e28)||
                (e14 == e30)||
                (e14 == e57)||
                (e15 == e16)||
                (e15 == e29)||
                (e15 == e30)||
                (e15 == e40)||
                (e15 == e31)||
                (e16 == e17)||
                (e16 == e18)||
                (e16 == e29)||
                (e16 == e30)||
                (e16 == e31)||
                (e16 == e40)||
                (e17 == e18)||
                (e17 == e31)||
                (e17 == e41)||
                (e17 == e43)||
                (e17 == e44)||
                (e17 == e19)||
                (e18 == e20)||
                (e18 == e44)||
                (e18 == e45)||
                (e19 == e20)||
                (e19 == e31)||
                (e19 == e41)||
                (e19 == e43)||
                (e19 == e44)||
                (e20 == e44)||
                (e20 == e45)||
                (e21 == e32)||
                (e21 == e46)||
                (e21 == e47)||
                (e21 == e22)||
                (e22 == e32)||
                (e22 == e48)||
                (e22 == e50)||
                (e22 == e33)||
                (e23 == e24)||
                (e23 == e25)||
                (e23 == e33)||
                (e23 == e50)||
                (e23 == e48)||
                (e24 == e25)||
                (e24 == e33)||
                (e24 == e34)||
                (e24 == e36)||
                (e24 == e53)||
                (e24 == e51)||
                (e25 == e26)||
                (e25 == e34)||
                (e25 == e35)||
                (e25 == e37)||
                (e26 == e34)||
                (e26 == e35)||
                (e26 == e37)||
                (e26 == e27)||
                (e26 == e28)||
                (e26 == e29)||
                (e27 == e28)||
                (e27 == e29)||
                (e27 == e36)||
                (e27 == e37)||
                (e27 == e38)||
                (e27 == e54)||
                (e27 == e56)||
                (e28 == e29)||
                (e28 == e30)||
                (e28 == e38)||
                (e28 == e39)||
                (e28 == e57)||
                (e29 == e30)||
                (e29 == e31)||
                (e29 == e40)||
                (e30 == e31)||
                (e30 == e40)||
                (e30 == e38)||
                (e30 == e39)||
                (e30 == e57)||
                (e31 == e40)||
                (e31 == e41)||
                (e31 == e43)||
                (e31 == e44)||
                (e32 == e46)||
                (e32 == e47)||
                (e32 == e33)||
                (e32 == e50)||
                (e33 == e50)||
                (e32 == e48)||
                (e33 == e48)||
                (e33 == e34)||
                (e33 == e51)||
                (e33 == e53)||
                (e33 == e36)||
                (e34 == e36)||
                (e34 == e53)||
                (e34 == e51)||
                (e34 == e35)||
                (e34 == e37)||
                (e35 == e37)||
                (e35 == e53)||
                (e35 == e54)||
                (e35 == e52)||
                (e35 == e55)||
                (e36 == e51)||
                (e36 == e53)||
                (e36 == e37)||
                (e36 == e38)||
                (e36 == e54)||
                (e36 == e56)||
                (e37 == e38)||
                (e37 == e54)||
                (e37 == e56)||
                (e38 == e54)||
                (e38 == e56)||
                (e38 == e57)||
                (e38 == e39)||
                (e39 == e57)||
                (e39 == e58)||
                (e39 == e40)||
                (e39 == e41)||
                (e39 == e42)||
                (e40 == e41)||
                (e40 == e42)||
                (e40 == e58)||
                (e41 == e42)||
                (e41 == e58)||
                (e41 == e43)||
                (e41 == e44)||
                (e42 == e58)||
                (e42 == e59)||
                (e42 == e43)||
                (e42 == e45)||
                (e43 == e45)||
                (e43 == e59)||
                (e43 == e44)||
                (e44 == e45)||
                (e45 == e59)||
                (e46 == e47)||
                (e46 == e48)||
                (e46 == e49)||
                (e46 == e60)||
                (e47 == e49)||
                (e47 == e50)||
                (e47 == e51)||
                (e47 == e52)||
                (e47 == e61)||
                (e48 == e50)||
                (e48 == e49)||
                (e48 == e60)||
                (e49 == e50)||
                (e49 == e51)||
                (e49 == e52)||
                (e49 == e60)||
                (e49 == e61)||
                (e50 == e51)||
                (e50 == e52)||
                (e50 == e61)||
                (e51 == e52)||
                (e51 == e53)||
                (e51 == e61)||
                (e52 == e53)||
                (e52 == e61)||
                (e52 == e62)||
                (e52 == e54)||
                (e52 == e55)||
                (e53 == e54)||
                (e53 == e55)||
                (e53 == e62)||
                (e54 == e55)||
                (e54 == e56)||
                (e54 == e62)||
                (e55 == e62)||
                (e55 == e56)||
                (e55 == e57)||
                (e55 == e58)||
                (e55 == e59)||
                (e55 == e63)||
                (e56 == e57)||
                (e56 == e58)||
                (e56 == e59)||
                (e56 == e63)||
                (e57 == e58)||
                (e57 == e59)||
                (e57 == e63)||
                (e58 == e59)||
                (e58 == e63)||
                (e59 == e63)||
                (e60 == e61)||
                (e60 == e62)||
                (e60 == e63)||
                (e61 == e62)||
                (e61 == e63)||
                (e62 == e63)||
                (v1 == v2)||
                (v1 == v5)||
                (v1 == v3)||
                (v1 == v4)||
                (v2 == v3)||
                (v2 == v5)||
                (v2 == v11)||
                (v3 == v5)||
                (v3 == v6)||
                (v3 == v7)||
                (v3 == v4)||
                (v4 == v7)||
                (v4 == v10)||
                (v5 == v6)||
                (v5 == v8)||
                (v5 == v11)||
                (v6 == v7)||
                (v6 == v8)||
                (v6 == v9)||
                (v6 == v12)||
                (v7 == v9)||
                (v7 == v10)||
                (v8 == v11)||
                (v8 == v16)||
                (v8 == v12)||
                (v8 == v9)||
                (v9 == v10)||
                (v9 == v12)||
                (v9 == v13)||
                (v10 == v13)||
                (v10 == v14)||
                (v10 == v18)||
                (v11 == v16)||
                (v12 == v13)||
                (v12 == v16)||
                (v12 == v17)||
                (v13 == v17)||
                (v13 == v18)||
                (v13 == v20)||
                (v14 == v18)||
                (v14 == v21)||
                (v14 == v24)||
                (v16 == v17)||
                (v16 == v19)||
                (v16 == v22)||
                (v17 == v18)||
                (v17 == v19)||
                (v17 == v20)||
                (v18 == v20)||
                (v18 == v21)||
                (v19 == v20)||
                (v19 == v22)||
                (v19 == v23)||
                (v20 == v23)||
                (v20 == v21)||
                (v21 == v23)||
                (v21 == v25)||
                (v21 == v24)||
                (v22 == v23)||
                (v22 == v25)||
                (v23 == v24)||
                (v23 == v25)||
                (v24 == v25)||
                (v1 == e20)||
                (v1 == e18)||
                (v1 == e44)||
                (v1 == e45)||
                (v2 == e6)||
                (v2 == e7)||
                (v2 == e19)||
                (v2 == e20)||
                (v3 == e19)||
                (v3 == e17)||
                (v3 == e31)||
                (v3 == e41)||
                (v3 == e43)||
                (v3 == e44)||
                (v4 == e45)||
                (v4 == e43)||
                (v4 == e42)||
                (v4 == e59)||
                (v5 == e7)||
                (v5 == e5)||
                (v5 == e4)||
                (v5 == e16)||
                (v5 == e17)||
                (v5 == e18)||
                (v6 == e14)||
                (v6 == e15)||
                (v6 == e16)||
                (v6 == e31)||
                (v6 == e40)||
                (v6 == e30)||
                (v7 == e39)||
                (v7 == e40)||
                (v7 == e41)||
                (v7 == e42)||
                (v7 == e58)||
                (v8 == e4)||
                (v8 == e3)||
                (v8 == e2)||
                (v8 == e13)||
                (v8 == e14)||
                (v8 == e15)||
                (v9 == e14)||
                (v9 == e28)||
                (v9 == e30)||
                (v9 == e38)||
                (v9 == e57)||
                (v9 == e39)||
                (v10 == e63)||
                (v10 == e55)||
                (v10 == e56)||
                (v10 == e57)||
                (v10 == e58)||
                (v10 == e59)||
                (v11 == e1)||
                (v11 == e3)||
                (v11 == e5)||
                (v11 == e6)||
                (v12 == e12)||
                (v12 == e13)||
                (v12 == e29)||
                (v12 == e28)||
                (v12 == e27)||
                (v12 == e26)||
                (v13 == e38)||
                (v13 == e56)||
                (v13 == e54)||
                (v13 == e36)||
                (v13 == e37)||
                (v13 == e27)||
                (v14 == e63)||
                (v14 == e62)||
                (v14 == e61)||
                (v14 == e60)||
                (v16 == e1)||
                (v16 == e2)||
                (v16 == e12)||
                (v16 == e11)||
                (v16 == e10)||
                (v16 == e8)||
                (v17 == e25)||
                (v17 == e11)||
                (v17 == e26)||
                (v17 == e34)||
                (v17 == e35)||
                (v17 == e37)||
                (v18 == e52)||
                (v18 == e53)||
                (v18 == e35)||
                (v18 == e54)||
                (v18 == e55)||
                (v18 == e62)||
                (v19 == e9)||
                (v19 == e10)||
                (v19 == e23)||
                (v19 == e24)||
                (v19 == e25)||
                (v20 == e33)||
                (v20 == e24)||
                (v20 == e34)||
                (v20 == e36)||
                (v20 == e53)||
                (v20 == e51)||
                (v21 == e49)||
                (v21 == e47)||
                (v21 == e50)||
                (v21 == e51)||
                (v21 == e52)||
                (v21 == e61)||
                (v22 == e8)||
                (v22 == e9)||
                (v22 == e22)||
                (v22 == e21)||
                (v23 == e22)||
                (v23 == e23)||
                (v23 == e33)||
                (v23 == e50)||
                (v23 == e48)||
                (v23 == e32)||
                (v24 == e46)||
                (v24 == e48)||
                (v24 == e49)||
                (v24 == e60)||
                (v25 == e21)||
                (v25 == e32)||
                (v25 == e47)||
                (v25 == e46))
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
        setContentView(R.layout.activity_edge_hl20);
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