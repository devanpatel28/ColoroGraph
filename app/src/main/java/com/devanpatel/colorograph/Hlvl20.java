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

public class Hlvl20 extends AppCompatActivity {
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
    static int v20=0;
    static int v21=0;
    static int v22=0;
    static int v23=0;
    static int v24=0;
    static int v25=0;
    static int v26=0;
    static int v27=0;
    static int v28=0;
    static int v29=0;
    static int v30=0;
    static int v31=0;
    static int v32=0;
    static int v33=0;
    static int v34=0;
    static int v35=0;
    static int v36=0;
    static int v37=0;
    static int v38=0;
    static int v39=0;
    static int v40=0;
    static int v41=0;
    static int v42=0;
    static int v43=0;
    static int v44=0;
    static int v45=0;
    static int v46=0;
    static int v47=0;
    static int v48=0;
    static int v49=0;
    static int v50=0;
    static int v51=0;
    static int v52=0;
    static int v53=0;
    static int v54=0;
    static int v55=0;
    static int v56=0;
    static int v57=0;
    static int v58=0;
    static int v59=0;
    static int v60=0;
    static int v61=0;
    static int v62=0;
    static int v63=0;
    static int v64=0;
    static int v65=0;
    static int v66=0;
    static int v67=0;
    static int v68=0;
    static int v69=0;
    static int v70=0;
    static int v71=0;
    static int v72=0;
    static int v73=0;
    static int v74=0;
    static int v75=0;
    static int v76=0;
    static int v77=0;
    static int v78=0;
    static int v79=0;
    static int v80=0;

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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
    }
    public void orange(View view)
    {
        selectSound();
        selectColor=11;
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
        c10.setAlpha(50);
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(1000);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
    }
    public void dslate(View view)
    {
        selectSound();
        selectColor=12;
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
        c10.setAlpha(50);
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(1000);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
    }
    public void cblue(View view)
    {
        selectSound();
        selectColor=13;
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
        c10.setAlpha(50);
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(1000);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
    }
    public void marron(View view)
    {
        selectSound();
        selectColor=14;
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
        c10.setAlpha(50);
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(1000);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(50);
    }
    public void peach(View view)
    {
        selectSound();
        selectColor=15;
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
        c10.setAlpha(50);
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        c11.setAlpha(50);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        c12.setAlpha(50);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        c13.setAlpha(50);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        c14.setAlpha(50);
        ImageView c15= (ImageView)findViewById(R.id.sc15);
        c15.setAlpha(1000);
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.wheat);
            v1 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.orange);
            v1 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.dslate);
            v1 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.cadedblue);
            v1 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.marron);
            v1 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v1);
            img.setImageResource(R.drawable.peach);
            v1 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.wheat);
            v2 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.orange);
            v2 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.dslate);
            v2 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.cadedblue);
            v2 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.marron);
            v2 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v2);
            img.setImageResource(R.drawable.peach);
            v2 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.wheat);
            v3 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.orange);
            v3 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.dslate);
            v3 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.cadedblue);
            v3 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.marron);
            v3 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v3);
            img.setImageResource(R.drawable.peach);
            v3 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.wheat);
            v4 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.orange);
            v4 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.dslate);
            v4 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.cadedblue);
            v4 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.marron);
            v4 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v4);
            img.setImageResource(R.drawable.peach);
            v4 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.wheat);
            v5 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.orange);
            v5 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.dslate);
            v5 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.cadedblue);
            v5 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.marron);
            v5 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v5);
            img.setImageResource(R.drawable.peach);
            v5 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.wheat);
            v6 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.orange);
            v6 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.dslate);
            v6 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.cadedblue);
            v6 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.marron);
            v6 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v6);
            img.setImageResource(R.drawable.peach);
            v6 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.wheat);
            v7 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.orange);
            v7 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.dslate);
            v7 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.cadedblue);
            v7 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.marron);
            v7 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v7);
            img.setImageResource(R.drawable.peach);
            v7 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.wheat);
            v8 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.orange);
            v8 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.dslate);
            v8 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.cadedblue);
            v8 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.marron);
            v8 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v8);
            img.setImageResource(R.drawable.peach);
            v8 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.wheat);
            v9 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.orange);
            v9 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.dslate);
            v9 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.cadedblue);
            v9 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.marron);
            v9 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v9);
            img.setImageResource(R.drawable.peach);
            v9 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.wheat);
            v10 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.orange);
            v10 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.dslate);
            v10 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.cadedblue);
            v10 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.marron);
            v10 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v10);
            img.setImageResource(R.drawable.peach);
            v10 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.wheat);
            v11 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.orange);
            v11 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.dslate);
            v11 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.cadedblue);
            v11 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.marron);
            v11 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v11);
            img.setImageResource(R.drawable.peach);
            v11 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.wheat);
            v12 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.orange);
            v12 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.dslate);
            v12 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.cadedblue);
            v12 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.marron);
            v12 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v12);
            img.setImageResource(R.drawable.peach);
            v12 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.wheat);
            v13 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.orange);
            v13 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.dslate);
            v13 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.cadedblue);
            v13 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.marron);
            v13 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v13);
            img.setImageResource(R.drawable.peach);
            v13 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.wheat);
            v14 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.orange);
            v14 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.dslate);
            v14 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.cadedblue);
            v14 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.marron);
            v14 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v14);
            img.setImageResource(R.drawable.peach);
            v14 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.wheat);
            v15 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.orange);
            v15 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.dslate);
            v15 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.cadedblue);
            v15 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.marron);
            v15 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v15);
            img.setImageResource(R.drawable.peach);
            v15 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.wheat);
            v16 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.orange);
            v16 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.dslate);
            v16 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.cadedblue);
            v16 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.marron);
            v16 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v16);
            img.setImageResource(R.drawable.peach);
            v16 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.wheat);
            v17 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.orange);
            v17 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.dslate);
            v17 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.cadedblue);
            v17 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.marron);
            v17 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v17);
            img.setImageResource(R.drawable.peach);
            v17 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.wheat);
            v18 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.orange);
            v18 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.dslate);
            v18 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.cadedblue);
            v18 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.marron);
            v18 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v18);
            img.setImageResource(R.drawable.peach);
            v18 = 15;
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
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.wheat);
            v19 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.orange);
            v19 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.dslate);
            v19 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.cadedblue);
            v19 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.marron);
            v19 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v19);
            img.setImageResource(R.drawable.peach);
            v19 = 15;
        }
    }
    public void v20Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.gray);
            v20 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.red);
            v20 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.blue);
            v20 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.yellow);
            v20 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.green);
            v20 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.brown);
            v20 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.pink);
            v20 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.cyan);
            v20 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.parot);
            v20 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.dpurple);
            v20 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.wheat);
            v20 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.orange);
            v20 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.dslate);
            v20 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.cadedblue);
            v20 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.marron);
            v20 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v20);
            img.setImageResource(R.drawable.peach);
            v20 = 15;
        }
    }
    public void v21Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.gray);
            v21 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.red);
            v21 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.blue);
            v21 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.yellow);
            v21 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.green);
            v21 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.brown);
            v21 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.pink);
            v21 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.cyan);
            v21 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.parot);
            v21 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.dpurple);
            v21 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.wheat);
            v21 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.orange);
            v21 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.dslate);
            v21 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.cadedblue);
            v21 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.marron);
            v21 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v21);
            img.setImageResource(R.drawable.peach);
            v21 = 15;
        }
    }
    public void v22Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.gray);
            v22 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.red);
            v22 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.blue);
            v22 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.yellow);
            v22 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.green);
            v22 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.brown);
            v22 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.pink);
            v22 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.cyan);
            v22 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.parot);
            v22 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.dpurple);
            v22 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.wheat);
            v22 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.orange);
            v22 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.dslate);
            v22 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.cadedblue);
            v22 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.marron);
            v22 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v22);
            img.setImageResource(R.drawable.peach);
            v22 = 15;
        }
    }
    public void v23Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.gray);
            v23 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.red);
            v23 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.blue);
            v23 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.yellow);
            v23 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.green);
            v23 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.brown);
            v23 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.pink);
            v23 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.cyan);
            v23 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.parot);
            v23 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.dpurple);
            v23 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.wheat);
            v23 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.orange);
            v23 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.dslate);
            v23 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.cadedblue);
            v23 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.marron);
            v23 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v23);
            img.setImageResource(R.drawable.peach);
            v23 = 15;
        }
    }
    public void v24Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.gray);
            v24 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.red);
            v24 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.blue);
            v24 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.yellow);
            v24 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.green);
            v24 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.brown);
            v24 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.pink);
            v24 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.cyan);
            v24 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.parot);
            v24 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.dpurple);
            v24 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.wheat);
            v24 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.orange);
            v24 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.dslate);
            v24 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.cadedblue);
            v24 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.marron);
            v24 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v24);
            img.setImageResource(R.drawable.peach);
            v24 = 15;
        }
    }
    public void v25Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.gray);
            v25 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.red);
            v25 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.blue);
            v25 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.yellow);
            v25 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.green);
            v25 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.brown);
            v25 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.pink);
            v25 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.cyan);
            v25 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.parot);
            v25 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.dpurple);
            v25 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.wheat);
            v25 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.orange);
            v25 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.dslate);
            v25 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.cadedblue);
            v25 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.marron);
            v25 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v25);
            img.setImageResource(R.drawable.peach);
            v25 = 15;
        }
    }
    public void v26Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.gray);
            v26 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.red);
            v26 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.blue);
            v26 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.yellow);
            v26 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.green);
            v26 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.brown);
            v26 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.pink);
            v26 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.cyan);
            v26 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.parot);
            v26 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.dpurple);
            v26 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.wheat);
            v26 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.orange);
            v26 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.dslate);
            v26 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.cadedblue);
            v26 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.marron);
            v26 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v26);
            img.setImageResource(R.drawable.peach);
            v26 = 15;
        }
    }
    public void v27Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.gray);
            v27 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.red);
            v27 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.blue);
            v27 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.yellow);
            v27 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.green);
            v27 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.brown);
            v27 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.pink);
            v27 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.cyan);
            v27 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.parot);
            v27 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.dpurple);
            v27 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.wheat);
            v27 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.orange);
            v27 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.dslate);
            v27 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.cadedblue);
            v27 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.marron);
            v27 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v27);
            img.setImageResource(R.drawable.peach);
            v27 = 15;
        }
    }
    public void v28Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.gray);
            v28 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.red);
            v28 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.blue);
            v28 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.yellow);
            v28 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.green);
            v28 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.brown);
            v28 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.pink);
            v28 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.cyan);
            v28 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.parot);
            v28 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.dpurple);
            v28 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.wheat);
            v28 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.orange);
            v28 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.dslate);
            v28 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.cadedblue);
            v28 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.marron);
            v28 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v28);
            img.setImageResource(R.drawable.peach);
            v28 = 15;
        }
    }
    public void v29Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.gray);
            v29 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.red);
            v29 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.blue);
            v29 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.yellow);
            v29 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.green);
            v29 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.brown);
            v29 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.pink);
            v29 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.cyan);
            v29 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.parot);
            v29 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.dpurple);
            v29 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.wheat);
            v29 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.orange);
            v29 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.dslate);
            v29 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.cadedblue);
            v29 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.marron);
            v29 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v29);
            img.setImageResource(R.drawable.peach);
            v29 = 15;
        }
    }
    public void v30Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.gray);
            v30 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.red);
            v30 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.blue);
            v30 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.yellow);
            v30 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.green);
            v30 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.brown);
            v30 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.pink);
            v30 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.cyan);
            v30 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.parot);
            v30 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.dpurple);
            v30 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.wheat);
            v30 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.orange);
            v30 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.dslate);
            v30 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.cadedblue);
            v30 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.marron);
            v30 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v30);
            img.setImageResource(R.drawable.peach);
            v30 = 15;
        }
    }
    public void v31Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.gray);
            v31 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.red);
            v31 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.blue);
            v31 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.yellow);
            v31 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.green);
            v31 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.brown);
            v31 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.pink);
            v31 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.cyan);
            v31 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.parot);
            v31 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.dpurple);
            v31 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.wheat);
            v31 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.orange);
            v31 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.dslate);
            v31 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.cadedblue);
            v31 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.marron);
            v31 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v31);
            img.setImageResource(R.drawable.peach);
            v31 = 15;
        }
    }
    public void v32Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.gray);
            v32 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.red);
            v32 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.blue);
            v32 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.yellow);
            v32 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.green);
            v32 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.brown);
            v32 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.pink);
            v32 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.cyan);
            v32 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.parot);
            v32 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.dpurple);
            v32 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.wheat);
            v32 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.orange);
            v32 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.dslate);
            v32 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.cadedblue);
            v32 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.marron);
            v32 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v32);
            img.setImageResource(R.drawable.peach);
            v32 = 15;
        }
    }
    public void v33Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.gray);
            v33 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.red);
            v33 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.blue);
            v33 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.yellow);
            v33 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.green);
            v33 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.brown);
            v33 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.pink);
            v33 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.cyan);
            v33 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.parot);
            v33 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.dpurple);
            v33 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.wheat);
            v33 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.orange);
            v33 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.dslate);
            v33 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.cadedblue);
            v33 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.marron);
            v33 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v33);
            img.setImageResource(R.drawable.peach);
            v33 = 15;
        }
    }
    public void v34Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.gray);
            v34 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.red);
            v34 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.blue);
            v34 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.yellow);
            v34 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.green);
            v34 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.brown);
            v34 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.pink);
            v34 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.cyan);
            v34 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.parot);
            v34 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.dpurple);
            v34 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.wheat);
            v34 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.orange);
            v34 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.dslate);
            v34 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.cadedblue);
            v34 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.marron);
            v34 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v34);
            img.setImageResource(R.drawable.peach);
            v34 = 15;
        }
    }
    public void v35Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.gray);
            v35 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.red);
            v35 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.blue);
            v35 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.yellow);
            v35 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.green);
            v35 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.brown);
            v35 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.pink);
            v35 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.cyan);
            v35 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.parot);
            v35 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.dpurple);
            v35 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.wheat);
            v35 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.orange);
            v35 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.dslate);
            v35 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.cadedblue);
            v35 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.marron);
            v35 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v35);
            img.setImageResource(R.drawable.peach);
            v35 = 15;
        }
    }
    public void v36Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.gray);
            v36 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.red);
            v36 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.blue);
            v36 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.yellow);
            v36 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.green);
            v36 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.brown);
            v36 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.pink);
            v36 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.cyan);
            v36 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.parot);
            v36 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.dpurple);
            v36 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.wheat);
            v36 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.orange);
            v36 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.dslate);
            v36 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.cadedblue);
            v36 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.marron);
            v36 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v36);
            img.setImageResource(R.drawable.peach);
            v36 = 15;
        }
    }
    public void v37Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.gray);
            v37 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.red);
            v37 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.blue);
            v37 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.yellow);
            v37 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.green);
            v37 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.brown);
            v37 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.pink);
            v37 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.cyan);
            v37 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.parot);
            v37 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.dpurple);
            v37 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.wheat);
            v37 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.orange);
            v37 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.dslate);
            v37 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.cadedblue);
            v37 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.marron);
            v37 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v37);
            img.setImageResource(R.drawable.peach);
            v37 = 15;
        }
    }
    public void v38Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.gray);
            v38 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.red);
            v38 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.blue);
            v38 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.yellow);
            v38 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.green);
            v38 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.brown);
            v38 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.pink);
            v38 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.cyan);
            v38 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.parot);
            v38 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.dpurple);
            v38 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.wheat);
            v38 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.orange);
            v38 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.dslate);
            v38 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.cadedblue);
            v38 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.marron);
            v38 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v38);
            img.setImageResource(R.drawable.peach);
            v38 = 15;
        }
    }
    public void v39Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.gray);
            v39 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.red);
            v39 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.blue);
            v39 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.yellow);
            v39 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.green);
            v39 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.brown);
            v39 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.pink);
            v39 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.cyan);
            v39 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.parot);
            v39 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.dpurple);
            v39 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.wheat);
            v39 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.orange);
            v39 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.dslate);
            v39 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.cadedblue);
            v39 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.marron);
            v39 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v39);
            img.setImageResource(R.drawable.peach);
            v39 = 15;
        }
    }
    public void v40Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.gray);
            v40 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.red);
            v40 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.blue);
            v40 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.yellow);
            v40 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.green);
            v40 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.brown);
            v40 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.pink);
            v40 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.cyan);
            v40 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.parot);
            v40 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.dpurple);
            v40 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.wheat);
            v40 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.orange);
            v40 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.dslate);
            v40 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.cadedblue);
            v40 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.marron);
            v40 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v40);
            img.setImageResource(R.drawable.peach);
            v40 = 15;
        }
    }
    public void v41Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.gray);
            v41 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.red);
            v41 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.blue);
            v41 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.yellow);
            v41 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.green);
            v41 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.brown);
            v41 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.pink);
            v41 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.cyan);
            v41 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.parot);
            v41 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.dpurple);
            v41 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.wheat);
            v41 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.orange);
            v41 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.dslate);
            v41 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.cadedblue);
            v41 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.marron);
            v41 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v41);
            img.setImageResource(R.drawable.peach);
            v41 = 15;
        }
    }
    public void v42Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.gray);
            v42 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.red);
            v42 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.blue);
            v42 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.yellow);
            v42 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.green);
            v42 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.brown);
            v42 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.pink);
            v42 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.cyan);
            v42 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.parot);
            v42 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.dpurple);
            v42 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.wheat);
            v42 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.orange);
            v42 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.dslate);
            v42 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.cadedblue);
            v42 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.marron);
            v42 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v42);
            img.setImageResource(R.drawable.peach);
            v42 = 15;
        }
    }
    public void v43Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.gray);
            v43 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.red);
            v43 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.blue);
            v43 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.yellow);
            v43 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.green);
            v43 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.brown);
            v43 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.pink);
            v43 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.cyan);
            v43 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.parot);
            v43 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.dpurple);
            v43 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.wheat);
            v43 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.orange);
            v43 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.dslate);
            v43 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.cadedblue);
            v43 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.marron);
            v43 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v43);
            img.setImageResource(R.drawable.peach);
            v43 = 15;
        }
    }
    public void v44Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.gray);
            v44 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.red);
            v44 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.blue);
            v44 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.yellow);
            v44 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.green);
            v44 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.brown);
            v44 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.pink);
            v44 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.cyan);
            v44 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.parot);
            v44 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.dpurple);
            v44 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.wheat);
            v44 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.orange);
            v44 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.dslate);
            v44 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.cadedblue);
            v44 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.marron);
            v44 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v44);
            img.setImageResource(R.drawable.peach);
            v44 = 15;
        }
    }
    public void v45Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.gray);
            v45 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.red);
            v45 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.blue);
            v45 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.yellow);
            v45 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.green);
            v45 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.brown);
            v45 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.pink);
            v45 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.cyan);
            v45 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.parot);
            v45 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.dpurple);
            v45 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.wheat);
            v45 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.orange);
            v45 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.dslate);
            v45 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.cadedblue);
            v45 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.marron);
            v45 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v45);
            img.setImageResource(R.drawable.peach);
            v45 = 15;
        }
    }
    public void v46Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.gray);
            v46 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.red);
            v46 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.blue);
            v46 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.yellow);
            v46 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.green);
            v46 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.brown);
            v46 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.pink);
            v46 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.cyan);
            v46 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.parot);
            v46 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.dpurple);
            v46 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.wheat);
            v46 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.orange);
            v46 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.dslate);
            v46 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.cadedblue);
            v46 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.marron);
            v46 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v46);
            img.setImageResource(R.drawable.peach);
            v46 = 15;
        }
    }
    public void v47Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.gray);
            v47 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.red);
            v47 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.blue);
            v47 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.yellow);
            v47 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.green);
            v47 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.brown);
            v47 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.pink);
            v47 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.cyan);
            v47 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.parot);
            v47 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.dpurple);
            v47 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.wheat);
            v47 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.orange);
            v47 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.dslate);
            v47 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.cadedblue);
            v47 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.marron);
            v47 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v47);
            img.setImageResource(R.drawable.peach);
            v47 = 15;
        }
    }
    public void v48Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.gray);
            v48 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.red);
            v48 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.blue);
            v48 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.yellow);
            v48 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.green);
            v48 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.brown);
            v48 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.pink);
            v48 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.cyan);
            v48 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.parot);
            v48 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.dpurple);
            v48 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.wheat);
            v48 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.orange);
            v48 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.dslate);
            v48 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.cadedblue);
            v48 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.marron);
            v48 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v48);
            img.setImageResource(R.drawable.peach);
            v48 = 15;
        }
    }
    public void v49Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.gray);
            v49 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.red);
            v49 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.blue);
            v49 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.yellow);
            v49 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.green);
            v49 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.brown);
            v49 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.pink);
            v49 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.cyan);
            v49 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.parot);
            v49 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.dpurple);
            v49 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.wheat);
            v49 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.orange);
            v49 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.dslate);
            v49 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.cadedblue);
            v49 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.marron);
            v49 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v49);
            img.setImageResource(R.drawable.peach);
            v49 = 15;
        }
    }
    public void v50Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.gray);
            v50 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.red);
            v50 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.blue);
            v50 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.yellow);
            v50 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.green);
            v50 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.brown);
            v50 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.pink);
            v50 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.cyan);
            v50 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.parot);
            v50 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.dpurple);
            v50 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.wheat);
            v50 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.orange);
            v50 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.dslate);
            v50 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.cadedblue);
            v50 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.marron);
            v50 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v50);
            img.setImageResource(R.drawable.peach);
            v50 = 15;
        }
    }
    public void v51Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.gray);
            v51 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.red);
            v51 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.blue);
            v51 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.yellow);
            v51 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.green);
            v51 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.brown);
            v51 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.pink);
            v51 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.cyan);
            v51 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.parot);
            v51 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.dpurple);
            v51 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.wheat);
            v51 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.orange);
            v51 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.dslate);
            v51 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.cadedblue);
            v51 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.marron);
            v51 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v51);
            img.setImageResource(R.drawable.peach);
            v51 = 15;
        }
    }
    public void v52Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.gray);
            v52 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.red);
            v52 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.blue);
            v52 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.yellow);
            v52 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.green);
            v52 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.brown);
            v52 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.pink);
            v52 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.cyan);
            v52 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.parot);
            v52 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.dpurple);
            v52 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.wheat);
            v52 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.orange);
            v52 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.dslate);
            v52 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.cadedblue);
            v52 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.marron);
            v52 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v52);
            img.setImageResource(R.drawable.peach);
            v52 = 15;
        }
    }
    public void v53Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.gray);
            v53 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.red);
            v53 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.blue);
            v53 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.yellow);
            v53 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.green);
            v53 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.brown);
            v53 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.pink);
            v53 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.cyan);
            v53 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.parot);
            v53 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.dpurple);
            v53 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.wheat);
            v53 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.orange);
            v53 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.dslate);
            v53 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.cadedblue);
            v53 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.marron);
            v53 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v53);
            img.setImageResource(R.drawable.peach);
            v53 = 15;
        }
    }
    public void v54Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.gray);
            v54 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.red);
            v54 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.blue);
            v54 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.yellow);
            v54 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.green);
            v54 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.brown);
            v54 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.pink);
            v54 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.cyan);
            v54 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.parot);
            v54 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.dpurple);
            v54 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.wheat);
            v54 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.orange);
            v54 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.dslate);
            v54 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.cadedblue);
            v54 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.marron);
            v54 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v54);
            img.setImageResource(R.drawable.peach);
            v54 = 15;
        }
    }
    public void v55Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.gray);
            v55 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.red);
            v55 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.blue);
            v55 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.yellow);
            v55 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.green);
            v55 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.brown);
            v55 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.pink);
            v55 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.cyan);
            v55 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.parot);
            v55 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.dpurple);
            v55 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.wheat);
            v55 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.orange);
            v55 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.dslate);
            v55 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.cadedblue);
            v55 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.marron);
            v55 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v55);
            img.setImageResource(R.drawable.peach);
            v55 = 15;
        }
    }
    public void v56Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.gray);
            v56 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.red);
            v56 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.blue);
            v56 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.yellow);
            v56 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.green);
            v56 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.brown);
            v56 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.pink);
            v56 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.cyan);
            v56 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.parot);
            v56 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.dpurple);
            v56 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.wheat);
            v56 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.orange);
            v56 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.dslate);
            v56 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.cadedblue);
            v56 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.marron);
            v56 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v56);
            img.setImageResource(R.drawable.peach);
            v56 = 15;
        }
    }
    public void v57Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.gray);
            v57 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.red);
            v57 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.blue);
            v57 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.yellow);
            v57 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.green);
            v57 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.brown);
            v57 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.pink);
            v57 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.cyan);
            v57 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.parot);
            v57 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.dpurple);
            v57 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.wheat);
            v57 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.orange);
            v57 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.dslate);
            v57 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.cadedblue);
            v57 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.marron);
            v57 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v57);
            img.setImageResource(R.drawable.peach);
            v57 = 15;
        }
    }
    public void v58Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.gray);
            v58 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.red);
            v58 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.blue);
            v58 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.yellow);
            v58 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.green);
            v58 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.brown);
            v58 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.pink);
            v58 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.cyan);
            v58 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.parot);
            v58 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.dpurple);
            v58 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.wheat);
            v58 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.orange);
            v58 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.dslate);
            v58 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.cadedblue);
            v58 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.marron);
            v58 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v58);
            img.setImageResource(R.drawable.peach);
            v58 = 15;
        }
    }
    public void v59Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.gray);
            v59 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.red);
            v59 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.blue);
            v59 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.yellow);
            v59 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.green);
            v59 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.brown);
            v59 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.pink);
            v59 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.cyan);
            v59 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.parot);
            v59 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.dpurple);
            v59 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.wheat);
            v59 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.orange);
            v59 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.dslate);
            v59 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.cadedblue);
            v59 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.marron);
            v59 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v59);
            img.setImageResource(R.drawable.peach);
            v59 = 15;
        }
    }
    public void v60Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.gray);
            v60 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.red);
            v60 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.blue);
            v60 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.yellow);
            v60 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.green);
            v60 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.brown);
            v60 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.pink);
            v60 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.cyan);
            v60 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.parot);
            v60 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.dpurple);
            v60 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.wheat);
            v60 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.orange);
            v60 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.dslate);
            v60 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.cadedblue);
            v60 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.marron);
            v60 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v60);
            img.setImageResource(R.drawable.peach);
            v60 = 15;
        }
    }
    public void v61Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.gray);
            v61 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.red);
            v61 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.blue);
            v61 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.yellow);
            v61 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.green);
            v61 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.brown);
            v61 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.pink);
            v61 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.cyan);
            v61 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.parot);
            v61 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.dpurple);
            v61 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.wheat);
            v61 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.orange);
            v61 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.dslate);
            v61 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.cadedblue);
            v61 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.marron);
            v61 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v61);
            img.setImageResource(R.drawable.peach);
            v61 = 15;
        }
    }
    public void v62Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.gray);
            v62 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.red);
            v62 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.blue);
            v62 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.yellow);
            v62 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.green);
            v62 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.brown);
            v62 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.pink);
            v62 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.cyan);
            v62 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.parot);
            v62 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.dpurple);
            v62 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.wheat);
            v62 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.orange);
            v62 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.dslate);
            v62 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.cadedblue);
            v62 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.marron);
            v62 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v62);
            img.setImageResource(R.drawable.peach);
            v62 = 15;
        }
    }
    public void v63Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.gray);
            v63 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.red);
            v63 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.blue);
            v63 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.yellow);
            v63 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.green);
            v63 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.brown);
            v63 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.pink);
            v63 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.cyan);
            v63 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.parot);
            v63 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.dpurple);
            v63 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.wheat);
            v63 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.orange);
            v63 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.dslate);
            v63 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.cadedblue);
            v63 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.marron);
            v63 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v63);
            img.setImageResource(R.drawable.peach);
            v63 = 15;
        }
    }
    public void v64Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.gray);
            v64 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.red);
            v64 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.blue);
            v64 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.yellow);
            v64 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.green);
            v64 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.brown);
            v64 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.pink);
            v64 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.cyan);
            v64 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.parot);
            v64 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.dpurple);
            v64 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.wheat);
            v64 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.orange);
            v64 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.dslate);
            v64 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.cadedblue);
            v64 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.marron);
            v64 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v64);
            img.setImageResource(R.drawable.peach);
            v64 = 15;
        }
    }
    public void v65Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.gray);
            v65 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.red);
            v65 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.blue);
            v65 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.yellow);
            v65 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.green);
            v65 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.brown);
            v65 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.pink);
            v65 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.cyan);
            v65 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.parot);
            v65 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.dpurple);
            v65 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.wheat);
            v65 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.orange);
            v65 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.dslate);
            v65 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.cadedblue);
            v65 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.marron);
            v65 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v65);
            img.setImageResource(R.drawable.peach);
            v65 = 15;
        }
    }
    public void v66Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.gray);
            v66 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.red);
            v66 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.blue);
            v66 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.yellow);
            v66 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.green);
            v66 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.brown);
            v66 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.pink);
            v66 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.cyan);
            v66 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.parot);
            v66 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.dpurple);
            v66 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.wheat);
            v66 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.orange);
            v66 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.dslate);
            v66 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.cadedblue);
            v66 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.marron);
            v66 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v66);
            img.setImageResource(R.drawable.peach);
            v66 = 15;
        }
    }
    public void v67Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.gray);
            v67 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.red);
            v67 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.blue);
            v67 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.yellow);
            v67 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.green);
            v67 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.brown);
            v67 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.pink);
            v67 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.cyan);
            v67 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.parot);
            v67 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.dpurple);
            v67 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.wheat);
            v67 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.orange);
            v67 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.dslate);
            v67 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.cadedblue);
            v67 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.marron);
            v67 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v67);
            img.setImageResource(R.drawable.peach);
            v67 = 15;
        }
    }
    public void v68Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.gray);
            v68 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.red);
            v68 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.blue);
            v68 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.yellow);
            v68 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.green);
            v68 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.brown);
            v68 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.pink);
            v68 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.cyan);
            v68 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.parot);
            v68 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.dpurple);
            v68 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.wheat);
            v68 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.orange);
            v68 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.dslate);
            v68 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.cadedblue);
            v68 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.marron);
            v68 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v68);
            img.setImageResource(R.drawable.peach);
            v68 = 15;
        }
    }
    public void v69Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.gray);
            v69 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.red);
            v69 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.blue);
            v69 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.yellow);
            v69 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.green);
            v69 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.brown);
            v69 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.pink);
            v69 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.cyan);
            v69 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.parot);
            v69 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.dpurple);
            v69 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.wheat);
            v69 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.orange);
            v69 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.dslate);
            v69 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.cadedblue);
            v69 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.marron);
            v69 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v69);
            img.setImageResource(R.drawable.peach);
            v69 = 15;
        }
    }
    public void v70Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.gray);
            v70 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.red);
            v70 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.blue);
            v70 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.yellow);
            v70 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.green);
            v70 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.brown);
            v70 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.pink);
            v70 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.cyan);
            v70 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.parot);
            v70 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.dpurple);
            v70 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.wheat);
            v70 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.orange);
            v70 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.dslate);
            v70 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.cadedblue);
            v70 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.marron);
            v70 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v70);
            img.setImageResource(R.drawable.peach);
            v70 = 15;
        }
    }
    public void v71Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.gray);
            v71 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.red);
            v71 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.blue);
            v71 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.yellow);
            v71 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.green);
            v71 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.brown);
            v71 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.pink);
            v71 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.cyan);
            v71 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.parot);
            v71 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.dpurple);
            v71 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.wheat);
            v71 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.orange);
            v71 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.dslate);
            v71 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.cadedblue);
            v71 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.marron);
            v71 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v71);
            img.setImageResource(R.drawable.peach);
            v71 = 15;
        }
    }
    public void v72Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.gray);
            v72 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.red);
            v72 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.blue);
            v72 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.yellow);
            v72 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.green);
            v72 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.brown);
            v72 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.pink);
            v72 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.cyan);
            v72 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.parot);
            v72 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.dpurple);
            v72 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.wheat);
            v72 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.orange);
            v72 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.dslate);
            v72 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.cadedblue);
            v72 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.marron);
            v72 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v72);
            img.setImageResource(R.drawable.peach);
            v72 = 15;
        }
    }
    public void v73Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.gray);
            v73 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.red);
            v73 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.blue);
            v73 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.yellow);
            v73 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.green);
            v73 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.brown);
            v73 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.pink);
            v73 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.cyan);
            v73 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.parot);
            v73 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.dpurple);
            v73 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.wheat);
            v73 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.orange);
            v73 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.dslate);
            v73 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.cadedblue);
            v73 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.marron);
            v73 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v73);
            img.setImageResource(R.drawable.peach);
            v73 = 15;
        }
    }
    public void v74Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.gray);
            v74 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.red);
            v74 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.blue);
            v74 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.yellow);
            v74 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.green);
            v74 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.brown);
            v74 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.pink);
            v74 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.cyan);
            v74 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.parot);
            v74 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.dpurple);
            v74 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.wheat);
            v74 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.orange);
            v74 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.dslate);
            v74 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.cadedblue);
            v74 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.marron);
            v74 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v74);
            img.setImageResource(R.drawable.peach);
            v74 = 15;
        }
    }
    public void v75Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.gray);
            v75 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.red);
            v75 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.blue);
            v75 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.yellow);
            v75 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.green);
            v75 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.brown);
            v75 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.pink);
            v75 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.cyan);
            v75 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.parot);
            v75 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.dpurple);
            v75 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.wheat);
            v75 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.orange);
            v75 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.dslate);
            v75 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.cadedblue);
            v75 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.marron);
            v75 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v75);
            img.setImageResource(R.drawable.peach);
            v75 = 15;
        }
    }
    public void v76Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.gray);
            v76 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.red);
            v76 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.blue);
            v76 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.yellow);
            v76 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.green);
            v76 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.brown);
            v76 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.pink);
            v76 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.cyan);
            v76 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.parot);
            v76 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.dpurple);
            v76 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.wheat);
            v76 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.orange);
            v76 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.dslate);
            v76 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.cadedblue);
            v76 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.marron);
            v76 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v76);
            img.setImageResource(R.drawable.peach);
            v76 = 15;
        }
    }
    public void v77Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.gray);
            v77 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.red);
            v77 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.blue);
            v77 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.yellow);
            v77 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.green);
            v77 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.brown);
            v77 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.pink);
            v77 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.cyan);
            v77 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.parot);
            v77 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.dpurple);
            v77 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.wheat);
            v77 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.orange);
            v77 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.dslate);
            v77 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.cadedblue);
            v77 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.marron);
            v77 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v77);
            img.setImageResource(R.drawable.peach);
            v77 = 15;
        }
    }
    public void v78Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.gray);
            v78 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.red);
            v78 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.blue);
            v78 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.yellow);
            v78 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.green);
            v78 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.brown);
            v78 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.pink);
            v78 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.cyan);
            v78 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.parot);
            v78 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.dpurple);
            v78 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.wheat);
            v78 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.orange);
            v78 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.dslate);
            v78 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.cadedblue);
            v78 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.marron);
            v78 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v78);
            img.setImageResource(R.drawable.peach);
            v78 = 15;
        }
    }
    public void v79Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.gray);
            v79 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.red);
            v79 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.blue);
            v79 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.yellow);
            v79 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.green);
            v79 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.brown);
            v79 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.pink);
            v79 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.cyan);
            v79 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.parot);
            v79 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.dpurple);
            v79 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.wheat);
            v79 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.orange);
            v79 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.dslate);
            v79 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.cadedblue);
            v79 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.marron);
            v79 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v79);
            img.setImageResource(R.drawable.peach);
            v79 = 15;
        }
    }
    public void v80Tap(View view) {
        tapSound();
        if (selectColor == 0) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.gray);
            v80 = 0;
        } else if (selectColor == 1) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.red);
            v80 = 1;
        } else if (selectColor == 2) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.blue);
            v80 = 2;
        } else if (selectColor == 3) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.yellow);
            v80 = 3;
        } else if (selectColor == 4) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.green);
            v80 = 4;
        } else if (selectColor == 5) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.brown);
            v80 = 5;
        } else if (selectColor == 6) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.pink);
            v80 = 6;
        } else if (selectColor == 7) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.cyan);
            v80 = 7;
        } else if (selectColor == 8) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.parot);
            v80 = 8;
        } else if (selectColor == 9) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.dpurple);
            v80 = 9;
        } else if (selectColor == 10) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.wheat);
            v80 = 10;
        } else if (selectColor == 11) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.orange);
            v80 = 11;
        } else if (selectColor == 12) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.dslate);
            v80 = 12;
        } else if (selectColor == 13) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.cadedblue);
            v80 = 13;
        } else if (selectColor == 14) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.marron);
            v80 = 14;
        } else if (selectColor == 15) {
            ImageView img = (ImageView) findViewById(R.id.v80);
            img.setImageResource(R.drawable.peach);
            v80 = 15;
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
        v20=0;
        v21=0;
        v22=0;
        v23=0;
        v24=0;
        v25=0;
        v26=0;
        v27=0;
        v28=0;
        v29=0;
        v30=0;
        v31=0;
        v32=0;
        v33=0;
        v34=0;
        v35=0;
        v36=0;
        v37=0;
        v38=0;
        v39=0;
        v40=0;
        v41=0;
        v42=0;
        v43=0;
        v44=0;
        v45=0;
        v46=0;
        v47=0;
        v48=0;
        v49=0;
        v50=0;
        v51=0;
        v52=0;
        v53=0;
        v54=0;
        v55=0;
        v56=0;
        v57=0;
        v58=0;
        v59=0;
        v60=0;
        v61=0;
        v62=0;
        v63=0;
        v64=0;
        v65=0;
        v66=0;
        v67=0;
        v68=0;
        v69=0;
        v70=0;
        v71=0;
        v72=0;
        v73=0;
        v74=0;
        v75=0;
        v76=0;
        v77=0;
        v78=0;
        v79=0;
        v80=0;

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
        ImageView img20 = (ImageView) findViewById(R.id.v20);
        ImageView img21 = (ImageView) findViewById(R.id.v21);
        ImageView img22 = (ImageView) findViewById(R.id.v22);
        ImageView img23 = (ImageView) findViewById(R.id.v23);
        ImageView img24 = (ImageView) findViewById(R.id.v24);
        ImageView img25 = (ImageView) findViewById(R.id.v25);
        ImageView img26 = (ImageView) findViewById(R.id.v26);
        ImageView img27 = (ImageView) findViewById(R.id.v27);
        ImageView img28 = (ImageView) findViewById(R.id.v28);
        ImageView img29 = (ImageView) findViewById(R.id.v29);
        ImageView img30 = (ImageView) findViewById(R.id.v30);
        ImageView img31 = (ImageView) findViewById(R.id.v31);
        ImageView img32 = (ImageView) findViewById(R.id.v32);
        ImageView img33 = (ImageView) findViewById(R.id.v33);
        ImageView img34 = (ImageView) findViewById(R.id.v34);
        ImageView img35 = (ImageView) findViewById(R.id.v35);
        ImageView img36 = (ImageView) findViewById(R.id.v36);
        ImageView img37 = (ImageView) findViewById(R.id.v37);
        ImageView img38 = (ImageView) findViewById(R.id.v38);
        ImageView img39 = (ImageView) findViewById(R.id.v39);
        ImageView img40 = (ImageView) findViewById(R.id.v40);
        ImageView img41 = (ImageView) findViewById(R.id.v41);
        ImageView img42 = (ImageView) findViewById(R.id.v42);
        ImageView img43 = (ImageView) findViewById(R.id.v43);
        ImageView img44 = (ImageView) findViewById(R.id.v44);
        ImageView img45 = (ImageView) findViewById(R.id.v45);
        ImageView img46 = (ImageView) findViewById(R.id.v46);
        ImageView img47 = (ImageView) findViewById(R.id.v47);
        ImageView img48 = (ImageView) findViewById(R.id.v48);
        ImageView img49 = (ImageView) findViewById(R.id.v49);
        ImageView img50 = (ImageView) findViewById(R.id.v50);
        ImageView img51 = (ImageView) findViewById(R.id.v51);
        ImageView img52 = (ImageView) findViewById(R.id.v52);
        ImageView img53 = (ImageView) findViewById(R.id.v53);
        ImageView img54 = (ImageView) findViewById(R.id.v54);
        ImageView img55 = (ImageView) findViewById(R.id.v55);
        ImageView img56 = (ImageView) findViewById(R.id.v56);
        ImageView img57 = (ImageView) findViewById(R.id.v57);
        ImageView img58 = (ImageView) findViewById(R.id.v58);
        ImageView img59 = (ImageView) findViewById(R.id.v59);
        ImageView img60 = (ImageView) findViewById(R.id.v60);
        ImageView img61 = (ImageView) findViewById(R.id.v61);
        ImageView img62 = (ImageView) findViewById(R.id.v62);
        ImageView img63 = (ImageView) findViewById(R.id.v63);
        ImageView img64 = (ImageView) findViewById(R.id.v64);
        ImageView img65 = (ImageView) findViewById(R.id.v65);
        ImageView img66 = (ImageView) findViewById(R.id.v66);
        ImageView img67 = (ImageView) findViewById(R.id.v67);
        ImageView img68 = (ImageView) findViewById(R.id.v68);
        ImageView img69 = (ImageView) findViewById(R.id.v69);
        ImageView img70 = (ImageView) findViewById(R.id.v70);
        ImageView img71 = (ImageView) findViewById(R.id.v71);
        ImageView img72 = (ImageView) findViewById(R.id.v72);
        ImageView img73 = (ImageView) findViewById(R.id.v73);
        ImageView img74 = (ImageView) findViewById(R.id.v74);
        ImageView img75 = (ImageView) findViewById(R.id.v75);
        ImageView img76 = (ImageView) findViewById(R.id.v76);
        ImageView img77 = (ImageView) findViewById(R.id.v77);
        ImageView img78 = (ImageView) findViewById(R.id.v78);
        ImageView img79 = (ImageView) findViewById(R.id.v79);
        ImageView img80 = (ImageView) findViewById(R.id.v80);


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
        img20.setImageResource(R.drawable.gray);
        img21.setImageResource(R.drawable.gray);
        img22.setImageResource(R.drawable.gray);
        img23.setImageResource(R.drawable.gray);
        img24.setImageResource(R.drawable.gray);
        img25.setImageResource(R.drawable.gray);
        img26.setImageResource(R.drawable.gray);
        img27.setImageResource(R.drawable.gray);
        img28.setImageResource(R.drawable.gray);
        img29.setImageResource(R.drawable.gray);
        img30.setImageResource(R.drawable.gray);
        img31.setImageResource(R.drawable.gray);
        img32.setImageResource(R.drawable.gray);
        img33.setImageResource(R.drawable.gray);
        img34.setImageResource(R.drawable.gray);
        img35.setImageResource(R.drawable.gray);
        img36.setImageResource(R.drawable.gray);
        img37.setImageResource(R.drawable.gray);
        img38.setImageResource(R.drawable.gray);
        img39.setImageResource(R.drawable.gray);
        img40.setImageResource(R.drawable.gray);
        img41.setImageResource(R.drawable.gray);
        img42.setImageResource(R.drawable.gray);
        img43.setImageResource(R.drawable.gray);
        img44.setImageResource(R.drawable.gray);
        img45.setImageResource(R.drawable.gray);
        img46.setImageResource(R.drawable.gray);
        img47.setImageResource(R.drawable.gray);
        img48.setImageResource(R.drawable.gray);
        img49.setImageResource(R.drawable.gray);
        img50.setImageResource(R.drawable.gray);
        img51.setImageResource(R.drawable.gray);
        img52.setImageResource(R.drawable.gray);
        img53.setImageResource(R.drawable.gray);
        img54.setImageResource(R.drawable.gray);
        img55.setImageResource(R.drawable.gray);
        img56.setImageResource(R.drawable.gray);
        img57.setImageResource(R.drawable.gray);
        img58.setImageResource(R.drawable.gray);
        img59.setImageResource(R.drawable.gray);
        img60.setImageResource(R.drawable.gray);
        img61.setImageResource(R.drawable.gray);
        img62.setImageResource(R.drawable.gray);
        img63.setImageResource(R.drawable.gray);
        img64.setImageResource(R.drawable.gray);
        img65.setImageResource(R.drawable.gray);
        img66.setImageResource(R.drawable.gray);
        img67.setImageResource(R.drawable.gray);
        img68.setImageResource(R.drawable.gray);
        img69.setImageResource(R.drawable.gray);
        img70.setImageResource(R.drawable.gray);
        img71.setImageResource(R.drawable.gray);
        img72.setImageResource(R.drawable.gray);
        img73.setImageResource(R.drawable.gray);
        img74.setImageResource(R.drawable.gray);
        img75.setImageResource(R.drawable.gray);
        img76.setImageResource(R.drawable.gray);
        img77.setImageResource(R.drawable.gray);
        img78.setImageResource(R.drawable.gray);
        img79.setImageResource(R.drawable.gray);
        img80.setImageResource(R.drawable.gray);

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
        ImageView c11= (ImageView)findViewById(R.id.sc11);
        ImageView c12= (ImageView)findViewById(R.id.sc12);
        ImageView c13= (ImageView)findViewById(R.id.sc13);
        ImageView c14= (ImageView)findViewById(R.id.sc14);
        ImageView c15= (ImageView)findViewById(R.id.sc15);

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
        c11.setAlpha(1000);
        c12.setAlpha(1000);
        c13.setAlpha(1000);
        c14.setAlpha(1000);
        c15.setAlpha(1000);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void check(View view) {
        if (    (v1 == 0) ||
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
                (v19 == 0) ||
                (v20 == 0) ||
                (v21 == 0) ||
                (v22 == 0) ||
                (v23 == 0) ||
                (v24 == 0) ||
                (v25 == 0) ||
                (v26 == 0) ||
                (v27 == 0) ||
                (v28 == 0) ||
                (v29 == 0) ||
                (v30 == 0) ||
                (v31 == 0) ||
                (v32 == 0) ||
                (v33 == 0) ||
                (v34 == 0) ||
                (v35 == 0) ||
                (v36 == 0) ||
                (v37 == 0) ||
                (v38 == 0) ||
                (v39 == 0) ||
                (v40 == 0) ||
                (v41 == 0) ||
                (v42 == 0) ||
                (v43 == 0) ||
                (v44 == 0) ||
                (v45 == 0) ||
                (v46 == 0) ||
                (v47 == 0) ||
                (v48 == 0) ||
                (v49 == 0) ||
                (v50 == 0) ||
                (v51 == 0) ||
                (v52 == 0) ||
                (v53 == 0) ||
                (v54 == 0) ||
                (v55 == 0) ||
                (v56 == 0) ||
                (v57 == 0) ||
                (v58 == 0) ||
                (v59 == 0) ||
                (v60 == 0) ||
                (v61 == 0) ||
                (v62 == 0) ||
                (v63 == 0) ||
                (v64 == 0) ||
                (v65 == 0) ||
                (v66 == 0) ||
                (v67 == 0) ||
                (v68 == 0) ||
                (v69 == 0) ||
                (v70 == 0) ||
                (v71 == 0) ||
                (v72 == 0) ||
                (v73 == 0) ||
                (v74 == 0) ||
                (v75 == 0) ||
                (v76 == 0) ||
                (v77 == 0) ||
                (v78 == 0) ||
                (v79 == 0) ||
                (v80 == 0)) {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.error2);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        } else if ((v1 == v2)||
                (v1 == v5)||
                (v1 == v8)||
                (v1 == v44)||
                (v2 == v3)||
                (v3 == v7)||
                (v3 == v4)||
                (v3 == v10)||
                (v4 == v8)||
                (v4 == v5)||
                (v5 == v6)||
                (v5 == v48)||
                (v6 == v7)||
                (v6 == v47)||
                (v6 == v68)||
                (v7 == v67)||
                (v7 == v8)||
                (v9 == v45)||
                (v9 == v68)||
                (v9 == v10)||
                (v9 == v14)||
                (v10 == v11)||
                (v10 == v14)||
                (v11 == v12)||
                (v11 == v13)||
                (v12 == v79)||
                (v12 == v23)||
                (v12 == v53)||
                (v12 == v13)||
                (v13 == v14)||
                (v15 == v16)||
                (v15 == v17)||
                (v15 == v79)||
                (v16 == v17)||
                (v16 == v79)||
                (v17 == v50)||
                (v18 == v19)||
                (v18 == v23)||
                (v18 == v73)||
                (v18 == v79)||
                (v19 == v20)||
                (v19 == v22)||
                (v20 == v21)||
                (v20 == v23)||
                (v21 == v22)||
                (v21 == v24)||
                (v21 == v76)||
                (v22 == v23)||
                (v22 == v80)||
                (v24 == v25)||
                (v24 == v26)||
                (v24 == v31)||
                (v25 == v26)||
                (v25 == v27)||
                (v25 == v31)||
                (v26 == v27)||
                (v26 == v33)||
                (v27 == v28)||
                (v28 == v29)||
                (v28 == v32)||
                (v28 == v60)||
                (v28 == v30)||
                (v29 == v30)||
                (v29 == v80)||
                (v30 == v31)||
                (v30 == v56)||
                (v32 == v33)||
                (v32 == v37)||
                (v32 == v80)||
                (v33 == v34)||
                (v33 == v37)||
                (v34 == v35)||
                (v34 == v36)||
                (v35 == v36)||
                (v35 == v38)||
                (v35 == v65)||
                (v36 == v37)||
                (v36 == v46)||
                (v37 == v80)||
                (v38 == v39)||
                (v38 == v40)||
                (v38 == v61)||
                (v39 == v40)||
                (v39 == v41)||
                (v40 == v77)||
                (v40 == v78)||
                (v41 == v62)||
                (v41 == v42)||
                (v41 == v46)||
                (v42 == v43)||
                (v42 == v45)||
                (v43 == v44)||
                (v43 == v46)||
                (v44 == v45)||
                (v44 == v47)||
                (v45 == v46)||
                (v47 == v48)||
                (v47 == v52)||
                (v47 == v72)||
                (v48 == v49)||
                (v49 == v50)||
                (v50 == v51)||
                (v50 == v73)||
                (v51 == v52)||
                (v51 == v64)||
                (v52 == v63)||
                (v53 == v54)||
                (v53 == v58)||
                (v53 == v74)||
                (v54 == v55)||
                (v55 == v56)||
                (v56 == v57)||
                (v56 == v80)||
                (v56 == v75)||
                (v57 == v58)||
                (v59 == v60)||
                (v59 == v76)||
                (v59 == v64)||
                (v60 == v61)||
                (v61 == v62)||
                (v62 == v63)||
                (v62 == v77)||
                (v63 == v64)||
                (v65 == v78)||
                (v65 == v66)||
                (v65 == v70)||
                (v66 == v67)||
                (v67 == v68)||
                (v68 == v69)||
                (v68 == v71)||
                (v69 == v70)||
                (v71 == v72)||
                (v71 == v76)||
                (v71 == v74)||
                (v72 == v75)||
                (v73 == v74)||
                (v73 == v78)||
                (v74 == v77)||
                (v75 == v76)||
                (v75 == v78)||
                (v76 == v80)||
                (v77 == v78))
        {
            errorSound();
            mydialog = new Dialog(this);
            mydialog.setCancelable(true);
            mydialog.setContentView(R.layout.error1);
            mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mydialog.show();
        } else {
            if((v2 == v5)||
                    (v2 == v8)||
                    (v2 == v44)||
                    (v5 == v8)||
                    (v5 == v44)||
                    (v8 == v44)||
                    (v1 == v3)||
                    (v4 == v7)||
                    (v4 == v10)||
                    (v7 == v10)||
                    (v3 == v5)||
                    (v3 == v8)||
                    (v5 == v8)||
                    (v4 == v1)||
                    (v4 == v6)||
                    (v6 == v1)||
                    (v5 == v7)||
                    (v5 == v47)||
                    (v5 == v68)||
                    (v7 == v47)||
                    (v7 == v68)||
                    (v47 == v68)||
                    (v3 == v6)||
                    (v3 == v8)||
                    (v3 == v67)||
                    (v6 == v8)||
                    (v6 == v67)||
                    (v8 == v67)||
                    (v1 == v7)||
                    (v1 == v4)||
                    (v7 == v4)||
                    (v10 == v14)||
                    (v10 == v45)||
                    (v10 == v68)||
                    (v14 == v45)||
                    (v14 == v68)||
                    (v45 == v68)||
                    (v3 == v9)||
                    (v3 == v11)||
                    (v3 == v14)||
                    (v9 == v11)||
                    (v9 == v14)||
                    (v11 == v14)||
                    (v10 == v12)||
                    (v10 == v13)||
                    (v12 == v13)||
                    (v11 == v13)||
                    (v11 == v23)||
                    (v11 == v53)||
                    (v11 == v79)||
                    (v13 == v23)||
                    (v13 == v53)||
                    (v13 == v79)||
                    (v23 == v53)||
                    (v23 == v79)||
                    (v53 == v79)||
                    (v11 == v12)||
                    (v11 == v14)||
                    (v12 == v14)||
                    (v10 == v9)||
                    (v10 == v13)||
                    (v13 == v9)||
                    (v16 == v17)||
                    (v16 == v79)||
                    (v17 == v79)||
                    (v15 == v17)||
                    (v15 == v79)||
                    (v17 == v79)||
                    (v15 == v16)||
                    (v15 == v50)||
                    (v16 == v50)||
                    (v19 == v23)||
                    (v19 == v73)||
                    (v19 == v79)||
                    (v23 == v73)||
                    (v23 == v79)||
                    (v73 == v79)||
                    (v18 == v20)||
                    (v18 == v22)||
                    (v20 == v22)||
                    (v19 == v21)||
                    (v19 == v23)||
                    (v21 == v23)||
                    (v20 == v22)||
                    (v20 == v24)||
                    (v20 == v76)||
                    (v22 == v24)||
                    (v22 == v76)||
                    (v24 == v76)||
                    (v19 == v21)||
                    (v19 == v23)||
                    (v19 == v80)||
                    (v21 == v23)||
                    (v21 == v80)||
                    (v23 == v80)||
                    (v12 == v18)||
                    (v12 == v20)||
                    (v12 == v22)||
                    (v18 == v20)||
                    (v18 == v22)||
                    (v20 == v22)||
                    (v21 == v25)||
                    (v21 == v26)||
                    (v21 == v31)||
                    (v25 == v26)||
                    (v25 == v31)||
                    (v26 == v31)||
                    (v24 == v26)||
                    (v24 == v27)||
                    (v24 == v31)||
                    (v26 == v27)||
                    (v26 == v31)||
                    (v27 == v31)||
                    (v24 == v25)||
                    (v24 == v27)||
                    (v24 == v33)||
                    (v25 == v27)||
                    (v25 == v33)||
                    (v27 == v33)||
                    (v25 == v26)||
                    (v25 == v28)||
                    (v26 == v28)||
                    (v27 == v29)||
                    (v27 == v30)||
                    (v27 == v32)||
                    (v27 == v60)||
                    (v29 == v30)||
                    (v29 == v32)||
                    (v29 == v60)||
                    (v30 == v32)||
                    (v30 == v60)||
                    (v32 == v60)||
                    (v28 == v30)||
                    (v28 == v80)||
                    (v30 == v80)||
                    (v28 == v29)||
                    (v28 == v31)||
                    (v28 == v56)||
                    (v29 == v31)||
                    (v29 == v56)||
                    (v31 == v56)||
                    (v24 == v25)||
                    (v24 == v30)||
                    (v25 == v30)||
                    (v28 == v33)||
                    (v28 == v37)||
                    (v28 == v80)||
                    (v33 == v37)||
                    (v33 == v80)||
                    (v37 == v80)||
                    (v26 == v32)||
                    (v26 == v34)||
                    (v26 == v37)||
                    (v32 == v34)||
                    (v32 == v37)||
                    (v34 == v37)||
                    (v33 == v35)||
                    (v33 == v36)||
                    (v35 == v36)||
                    (v34 == v36)||
                    (v34 == v38)||
                    (v34 == v65)||
                    (v36 == v38)||
                    (v36 == v65)||
                    (v38 == v65)||
                    (v35 == v34)||
                    (v35 == v37)||
                    (v35 == v46)||
                    (v34 == v37)||
                    (v34 == v46)||
                    (v37 == v46)||
                    (v32 == v33)||
                    (v32 == v36)||
                    (v32 == v80)||
                    (v33 == v36)||
                    (v33 == v80)||
                    (v36 == v80)||
                    (v35 == v39)||
                    (v35 == v40)||
                    (v35 == v61)||
                    (v39 == v40)||
                    (v39 == v61)||
                    (v40 == v61)||
                    (v38 == v40)||
                    (v38 == v41)||
                    (v40 == v41)||
                    (v38 == v39)||
                    (v38 == v77)||
                    (v38 == v78)||
                    (v39 == v77)||
                    (v39 == v78)||
                    (v77 == v78)||
                    (v42 == v46)||
                    (v42 == v39)||
                    (v42 == v62)||
                    (v46 == v39)||
                    (v46 == v62)||
                    (v39 == v62)||
                    (v41 == v43)||
                    (v41 == v45)||
                    (v43 == v45)||
                    (v42 == v44)||
                    (v42 == v46)||
                    (v44 == v46)||
                    (v43 == v45)||
                    (v43 == v1)||
                    (v43 == v47)||
                    (v45 == v1)||
                    (v45 == v47)||
                    (v1 == v47)||
                    (v44 == v42)||
                    (v44 == v46)||
                    (v44 == v9)||
                    (v42 == v46)||
                    (v42 == v9)||
                    (v46 == v9)||
                    (v41 == v43)||
                    (v41 == v45)||
                    (v41 == v36)||
                    (v43 == v45)||
                    (v43 == v36)||
                    (v45 == v36)||
                    (v6 == v48)||
                    (v6 == v44)||
                    (v6 == v72)||
                    (v6 == v52)||
                    (v48 == v44)||
                    (v48 == v72)||
                    (v48 == v52)||
                    (v44 == v72)||
                    (v44 == v52)||
                    (v72 == v52)||
                    (v47 == v49)||
                    (v47 == v5)||
                    (v49 == v5)||
                    (v48 == v50)||
                    (v17 == v49)||
                    (v17 == v51)||
                    (v17 == v73)||
                    (v49 == v51)||
                    (v49 == v73)||
                    (v51 == v73)||
                    (v50 == v52)||
                    (v50 == v64)||
                    (v52 == v64)||
                    (v47 == v51)||
                    (v47 == v63)||
                    (v51 == v63)||
                    (v12 == v54)||
                    (v12 == v58)||
                    (v12 == v74)||
                    (v54 == v58)||
                    (v54 == v74)||
                    (v58 == v74)||
                    (v53 == v55)||
                    (v54 == v56)||
                    (v55 == v57)||
                    (v55 == v30)||
                    (v55 == v80)||
                    (v55 == v75)||
                    (v57 == v30)||
                    (v57 == v80)||
                    (v57 == v75)||
                    (v30 == v80)||
                    (v30 == v75)||
                    (v80 == v75)||
                    (v56 == v58)||
                    (v57 == v53)||
                    (v60 == v64)||
                    (v60 == v76)||
                    (v64 == v76)||
                    (v59 == v61)||
                    (v59 == v28)||
                    (v61 == v28)||
                    (v62 == v60)||
                    (v62 == v38)||
                    (v60 == v38)||
                    (v61 == v63)||
                    (v61 == v77)||
                    (v61 == v41)||
                    (v63 == v77)||
                    (v63 == v41)||
                    (v77 == v41)||
                    (v62 == v64)||
                    (v62 == v52)||
                    (v64 == v52)||
                    (v59 == v51)||
                    (v59 == v63)||
                    (v51 == v63)||
                    (v66 == v70)||
                    (v66 == v78)||
                    (v66 == v35)||
                    (v70 == v78)||
                    (v70 == v35)||
                    (v78 == v35)||
                    (v65 == v67)||
                    (v7 == v66)||
                    (v7 == v68)||
                    (v66 == v68)||
                    (v6 == v9)||
                    (v6 == v67)||
                    (v6 == v69)||
                    (v6 == v71)||
                    (v9 == v67)||
                    (v9 == v69)||
                    (v9 == v71)||
                    (v67 == v69)||
                    (v67 == v71)||
                    (v69 == v71)||
                    (v68 == v70)||
                    (v69 == v65)||
                    (v68 == v72)||
                    (v68 == v74)||
                    (v68 == v76)||
                    (v72 == v74)||
                    (v72 == v76)||
                    (v74 == v76)||
                    (v47 == v71)||
                    (v47 == v75)||
                    (v71 == v75)||
                    (v18 == v50)||
                    (v18 == v74)||
                    (v18 == v78)||
                    (v50 == v74)||
                    (v50 == v78)||
                    (v74 == v78)||
                    (v53 == v71)||
                    (v53 == v73)||
                    (v53 == v77)||
                    (v71 == v73)||
                    (v71 == v77)||
                    (v73 == v77)||
                    (v56 == v72)||
                    (v56 == v76)||
                    (v56 == v78)||
                    (v72 == v76)||
                    (v72 == v78)||
                    (v76 == v78)||
                    (v21 == v59)||
                    (v21 == v71)||
                    (v21 == v75)||
                    (v21 == v80)||
                    (v59 == v71)||
                    (v59 == v75)||
                    (v59 == v80)||
                    (v71 == v75)||
                    (v71 == v80)||
                    (v75 == v80)||
                    (v40 == v62)||
                    (v40 == v74)||
                    (v40 == v78)||
                    (v62 == v74)||
                    (v62 == v78)||
                    (v74 == v78)||
                    (v40 == v65)||
                    (v40 == v73)||
                    (v40 == v75)||
                    (v40 == v77)||
                    (v65 == v73)||
                    (v65 == v75)||
                    (v65 == v77)||
                    (v73 == v75)||
                    (v73 == v77)||
                    (v75 == v77)||
                    (v12 == v15)||
                    (v12 == v16)||
                    (v12 == v18)||
                    (v15 == v16)||
                    (v15 == v18)||
                    (v16 == v18)||
                    (v22 == v56)||
                    (v22 == v76)||
                    (v22 == v37)||
                    (v22 == v32)||
                    (v22 == v29)||
                    (v56 == v76)||
                    (v56 == v37)||
                    (v56 == v32)||
                    (v56 == v29)||
                    (v76 == v37)||
                    (v76 == v32)||
                    (v76 == v29)||
                    (v37 == v32)||
                    (v37 == v29)||
                    (v32 == v29))
            {
                errorSound();
                mydialog = new Dialog(this);
                mydialog.setCancelable(true);
                mydialog.setContentView(R.layout.error5);
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
    }
    public void nextlvl(View view)
    {
        tapSound();
        clrAll(view);
        Intent intent = new Intent(this,MainActivity.class);
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
        setContentView(R.layout.activity_hlvl20);
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