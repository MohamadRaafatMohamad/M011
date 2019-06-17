package com.mrm.m011;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class M1Activity extends AppCompatActivity {

    static ImageView imageArray[]=new ImageView[10] ;
    static char imageState[]=new char[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);

        DragDrop dd=new DragDrop();
        Test_Sega tt=new Test_Sega();

        imageState[1]=imageState[2]=imageState[3]='x';
        imageState[4]=imageState[5]=imageState[6]='n';
        imageState[7]=imageState[8]=imageState[9]='y';

        imageArray[1]=(ImageView)findViewById(R.id.imageView1);
        imageArray[2]=(ImageView)findViewById(R.id.imageView2);
        imageArray[3]=(ImageView)findViewById(R.id.imageView3);
        imageArray[4]=(ImageView)findViewById(R.id.imageView4);
        imageArray[5]=(ImageView)findViewById(R.id.imageView5);
        imageArray[6]=(ImageView)findViewById(R.id.imageView6);
        imageArray[7]=(ImageView)findViewById(R.id.imageView7);
        imageArray[8]=(ImageView)findViewById(R.id.imageView8);
        imageArray[9]=(ImageView)findViewById(R.id.imageView9);

        tt.image(0);


    }


}
