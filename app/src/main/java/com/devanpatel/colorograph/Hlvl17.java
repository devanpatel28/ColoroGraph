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
import android.view.View;
import android.widget.ImageView;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class Hlvl17 extends AppCompatActivity {
    static int selectColor=0;
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
    static int v15=0;
    static int v16=0;
    static int v17=0;
    static int v18=0;
    static int v19=0;
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
    public void wheat(View view)
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
    public void v1Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.gray);
            v1 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.red);
            v1 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.blue);
            v1 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.yellow);
            v1 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.green);
            v1 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.brown);
            v1 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.pink);
            v1 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.cyan);
            v1 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.parot);
            v1 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.dpurple);
            v1 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.wheat);
            v1 = 10;
        }
    }
    public void v2Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.gray);
            v2 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.red);
            v2 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.blue);
            v2 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.yellow);
            v2 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.green);
            v2 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.brown);
            v2 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.pink);
            v2 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.cyan);
            v2 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.parot);
            v2 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.dpurple);
            v2 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.wheat);
            v2 = 10;
        }
    }
    public void v3Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.gray);
            v3 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.red);
            v3 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.blue);
            v3 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.yellow);
            v3 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.green);
            v3 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.brown);
            v3 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.pink);
            v3 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.cyan);
            v3 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.parot);
            v3 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.dpurple);
            v3 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.wheat);
            v3 = 10;
        }
    }
    public void v4Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.gray);
            v4 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.red);
            v4 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.blue);
            v4 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.yellow);
            v4 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.green);
            v4 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.brown);
            v4 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.pink);
            v4 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.cyan);
            v4 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.parot);
            v4 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.dpurple);
            v4 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.wheat);
            v4 = 10;
        }
    }
    public void v5Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.gray);
            v5 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.red);
            v5 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.blue);
            v5 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.yellow);
            v5 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.green);
            v5 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.brown);
            v5 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.pink);
            v5 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.cyan);
            v5 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.parot);
            v5 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.dpurple);
            v5 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.wheat);
            v5 = 10;
        }
    }
    public void v6Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.gray);
            v6 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.red);
            v6 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.blue);
            v6 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.yellow);
            v6 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.green);
            v6 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.brown);
            v6 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.pink);
            v6 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.cyan);
            v6 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.parot);
            v6 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.dpurple);
            v6 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.wheat);
            v6 = 10;
        }
    }
    public void v7Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.gray);
            v7 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.red);
            v7 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.blue);
            v7 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.yellow);
            v7 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.green);
            v7 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.brown);
            v7 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.pink);
            v7 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.cyan);
            v7 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.parot);
            v7 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.dpurple);
            v7 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.wheat);
            v7 = 10;
        }
    }
    public void v8Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.gray);
            v8 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.red);
            v8 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.blue);
            v8 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.yellow);
            v8 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.green);
            v8 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.brown);
            v8 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.pink);
            v8 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.cyan);
            v8 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.parot);
            v8 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.dpurple);
            v8 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.wheat);
            v8 = 10;
        }
    }
    public void v9Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.gray);
            v9 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.red);
            v9 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.blue);
            v9 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.yellow);
            v9 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.green);
            v9 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.brown);
            v9 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.pink);
            v9 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.cyan);
            v9 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.parot);
            v9 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.dpurple);
            v9 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.wheat);
            v9 = 10;
        }
    }
    public void v10Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.gray);
            v10 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.red);
            v10 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.blue);
            v10 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.yellow);
            v10 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.green);
            v10 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.brown);
            v10 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.pink);
            v10 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.cyan);
            v10 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.parot);
            v10 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.dpurple);
            v10 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.wheat);
            v10 = 10;
        }
    }
    public void v11Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.gray);
            v11 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.red);
            v11 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.blue);
            v11 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.yellow);
            v11 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.green);
            v11 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.brown);
            v11 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.pink);
            v11 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.cyan);
            v11 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.parot);
            v11 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.dpurple);
            v11 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.wheat);
            v11 = 10;
        }
    }
    public void v12Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.gray);
            v12 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.red);
            v12 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.blue);
            v12 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.yellow);
            v12 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.green);
            v12 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.brown);
            v12 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.pink);
            v12 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.cyan);
            v12 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.parot);
            v12 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.dpurple);
            v12 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.wheat);
            v12 = 10;
        }
    }
    public void v13Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.gray);
            v13 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.red);
            v13 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.blue);
            v13 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.yellow);
            v13 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.green);
            v13 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.brown);
            v13 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.pink);
            v13 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.cyan);
            v13 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.parot);
            v13 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.dpurple);
            v13 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.wheat);
            v13 = 10;
        }
    }
    public void v14Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.gray);
            v14 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.red);
            v14 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.blue);
            v14 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.yellow);
            v14 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.green);
            v14 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.brown);
            v14 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.pink);
            v14 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.cyan);
            v14 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.parot);
            v14 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.dpurple);
            v14 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.wheat);
            v14 = 10;
        }
    }
    public void v15Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.gray);
            v15 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.red);
            v15 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.blue);
            v15 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.yellow);
            v15 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.green);
            v15 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.brown);
            v15 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.pink);
            v15 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.cyan);
            v15 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.parot);
            v15 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.dpurple);
            v15 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.wheat);
            v15 = 10;
        }
    }
    public void v16Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.gray);
            v16 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.red);
            v16 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.blue);
            v16 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.yellow);
            v16 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.green);
            v16 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.brown);
            v16 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.pink);
            v16 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.cyan);
            v16 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.parot);
            v16 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.dpurple);
            v16 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.wheat);
            v16 = 10;
        }
    }
    public void v17Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.gray);
            v17 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.red);
            v17 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.blue);
            v17 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.yellow);
            v17 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.green);
            v17 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.brown);
            v17 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.pink);
            v17 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.cyan);
            v17 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.parot);
            v17 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.dpurple);
            v17 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.wheat);
            v17 = 10;
        }
    }
    public void v18Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.gray);
            v18 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.red);
            v18 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.blue);
            v18 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.yellow);
            v18 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.green);
            v18 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.brown);
            v18 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.pink);
            v18 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.cyan);
            v18 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.parot);
            v18 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.dpurple);
            v18 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.wheat);
            v18 = 10;
        }
    }
    public void v19Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.gray);
            v19 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.red);
            v19 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.blue);
            v19 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.yellow);
            v19 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.green);
            v19 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.brown);
            v19 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.pink);
            v19 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.cyan);
            v19 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.parot);
            v19 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.dpurple);
            v19 = 9;
        }else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.wheat);
            v19 = 10;
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
        v8=0;
        v9=0;
        v10=0;
        v11=0;
        v12=0;
        v13=0;
        v14=0;
        v15=0;
        v16=0;
        v17=0;
        v18=0;
        v19=0;
        ImageView img1 = (ImageView) findViewById(R.id.v1);
        ImageView img2 = (ImageView) findViewById(R.id.v2);
        ImageView img3 = (ImageView) findViewById(R.id.v3);
        ImageView img4 = (ImageView) findViewById(R.id.v4);
        ImageView img5 = (ImageView) findViewById(R.id.v5);
        ImageView img6 = (ImageView) findViewById(R.id.v6);
        ImageView img7 = (ImageView) findViewById(R.id.v7);
        ImageView img8 = (ImageView) findViewById(R.id.v8);
        ImageView img9 = (ImageView) findViewById(R.id.v9);
        ImageView img10 = (ImageView) findViewById(R.id.v10);
        ImageView img11 = (ImageView) findViewById(R.id.v11);
        ImageView img12 = (ImageView) findViewById(R.id.v12);
        ImageView img13 = (ImageView) findViewById(R.id.v13);
        ImageView img14 = (ImageView) findViewById(R.id.v14);
        ImageView img15 = (ImageView) findViewById(R.id.v15);
        ImageView img16 = (ImageView) findViewById(R.id.v16);
        ImageView img17 = (ImageView) findViewById(R.id.v17);
        ImageView img18 = (ImageView) findViewById(R.id.v18);
        ImageView img19 = (ImageView) findViewById(R.id.v19);


        img1.setImageResource(R.drawable.gray);
        img2.setImageResource(R.drawable.gray);
        img3.setImageResource(R.drawable.gray);
        img4.setImageResource(R.drawable.gray);
        img5.setImageResource(R.drawable.gray);
        img6.setImageResource(R.drawable.gray);
        img7.setImageResource(R.drawable.gray);
        img8.setImageResource(R.drawable.gray);
        img9.setImageResource(R.drawable.gray);
        img10.setImageResource(R.drawable.gray);
        img11.setImageResource(R.drawable.gray);
        img12.setImageResource(R.drawable.gray);
        img13.setImageResource(R.drawable.gray);
        img14.setImageResource(R.drawable.gray);
        img15.setImageResource(R.drawable.gray);
        img16.setImageResource(R.drawable.gray);
        img17.setImageResource(R.drawable.gray);
        img18.setImageResource(R.drawable.gray);
        img19.setImageResource(R.drawable.gray);


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
    public void check(View view) {
        if ((v1 == 0) ||
                (v2 == 0) ||
                (v3 == 0) ||
                (v4 == 0) ||
                (v5 == 0) ||
                (v6 == 0) ||
                (v7 == 0) ||
                (v8 == 0) ||
                (v9 == 0) ||
                (v10 == 0) ||
                (v11 == 0) ||
                (v12 == 0) ||
                (v13 == 0) ||
                (v14 == 0) ||
                (v15 == 0) ||
                (v16 == 0) ||
                (v17 == 0) ||
                (v18 == 0) ||
                (v19 == 0)) {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.error2);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        } else if ((v1 == v2)||
                (v2 == v3)||
                (v2 == v18)||
                (v2 == v17)||
                (v2 == v15)||
                (v2 == v13)||
                (v2 == v12)||
                (v2 == v11)||
                (v3 == v4)||
                (v3 == v19)||
                (v3 == v18)||
                (v3 == v17)||
                (v3 == v16)||
                (v3 == v15)||
                (v3 == v13)||
                (v3 == v6)||
                (v3 == v7)||
                (v3 == v8)||
                (v3 == v9)||
                (v4 == v5)||
                (v4 == v18)||
                (v4 == v17)||
                (v4 == v15)||
                (v5 == v18)||
                (v5 == v17)||
                (v5 == v15)||
                (v6 == v19)||
                (v6 == v18)||
                (v6 == v17)||
                (v6 == v16)||
                (v6 == v15)||
                (v6 == v9)||
                (v7 == v8)||
                (v7 == v19)||
                (v8 == v19)||
                (v9 == v18)||
                (v9 == v17)||
                (v9 == v16)||
                (v9 == v15)||
                (v10 == v11)||
                (v10 == v12)||
                (v10 == v18)||
                (v11 == v18)||
                (v11 == v12)||
                (v12 == v13)||
                (v12 == v18)||
                (v13 == v14)||
                (v13 == v18)||
                (v13 == v17)||
                (v14 == v18)||
                (v15 == v16)||
                (v15 == v17)||
                (v15 == v18)||
                (v16 == v17)||
                (v16 == v18)||
                (v17 == v18)||
                (v1 == v18))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.error1);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        } else {
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
        tapSound();
        clrAll(view);
        Intent intent = new Intent(this,Hlvl18.class);
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
        Intent intent = new Intent(this,LevelHard.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl17);
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