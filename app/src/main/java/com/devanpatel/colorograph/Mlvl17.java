package com.devanpatel.colorograph;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class Mlvl17 extends AppCompatActivity {
    static int selectColor=0;
    static int v1=0;
    static int v2=0;
    static int v3=0;
    static int v4=0;
    static int v5=0;
    static int v6=0;
    static int v7=0;
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
    }
    // Vertex Coloring
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
    }

    public void clrAll(View view)
    {
        clearSound();

        // Vertex Reset
        selectColor=0;
        v1=0;
        v2=0;
        v3=0;
        v4=0;
        v5=0;
        v6=0;
        v7=0;
        ImageView img1 = (ImageView) findViewById(R.id.v1);
        ImageView img2 = (ImageView) findViewById(R.id.v2);
        ImageView img3 = (ImageView) findViewById(R.id.v3);
        ImageView img4 = (ImageView) findViewById(R.id.v4);
        ImageView img5 = (ImageView) findViewById(R.id.v5);
        ImageView img6 = (ImageView) findViewById(R.id.v6);
        ImageView img7 = (ImageView) findViewById(R.id.v7);
        img1.setImageResource(R.drawable.gray);
        img2.setImageResource(R.drawable.gray);
        img3.setImageResource(R.drawable.gray);
        img4.setImageResource(R.drawable.gray);
        img5.setImageResource(R.drawable.gray);
        img6.setImageResource(R.drawable.gray);
        img7.setImageResource(R.drawable.gray);

        // Color Reset
        ImageView c1= (ImageView)findViewById(R.id.sc1);
        ImageView c2= (ImageView)findViewById(R.id.sc2);
        ImageView c3= (ImageView)findViewById(R.id.sc3);
        ImageView c4= (ImageView)findViewById(R.id.sc4);
        ImageView c5= (ImageView)findViewById(R.id.sc5);
        ImageView c6= (ImageView)findViewById(R.id.sc6);
        ImageView c7= (ImageView)findViewById(R.id.sc7);
        ImageView c8= (ImageView)findViewById(R.id.sc8);
        c1.setAlpha(1000);
        c2.setAlpha(1000);
        c3.setAlpha(1000);
        c4.setAlpha(1000);
        c5.setAlpha(1000);
        c6.setAlpha(1000);
        c7.setAlpha(1000);
        c8.setAlpha(1000);
    }
    public int minColor(int[] a)
    {
        Arrays.sort(a);
        int n = a.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i=0; i<n-1; i++)
        {
            if (a[i]!=a[i+1])
            {
                temp[j++] = a[i];
            }
        }
        j++;
        return j;
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void check(View view) {
        if ((v1 == 0) || (v2 == 0) || (v3 == 0) || (v4 == 0) || (v5 == 0) || (v6 == 0)|| (v7 == 0)) {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.error2);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        } else if ( (v1 == v4) ||
                    (v1 == v5) ||
                    (v1 == v6) ||
                    (v1 == v7) ||
                    (v2 == v4) ||
                    (v2 == v5) ||
                    (v2 == v6) ||
                    (v2 == v7) ||
                    (v3 == v4) ||
                    (v3 == v5) ||
                    (v3 == v6) ||
                    (v3 == v7))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.error1);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        } else {
            int a[] = {v1,v2,v3,v4,v5,v6,v7};
            int m = minColor(a);
            if (m==2)
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
            else
            {
                errorSound();
                mydialog = new Dialog(this);
                mydialog.setCancelable(true);
                mydialog.setContentView(R.layout.error3);
                mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mydialog.show();
            }
        }
    }
    public void nextlvl(View view)
    {
        clrAll(view);
        Intent intent = new Intent(this,Mlvl18.class);
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
        Intent intent = new Intent(this,LevelMedium.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl17);
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