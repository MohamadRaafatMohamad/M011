package com.mrm.m011;

import android.content.ClipData;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by hp on 2/24/2017.
 */
public class DragDrop {

    static int op,ag,i,player=1;

    View.OnTouchListener touchListener =new View.OnTouchListener(){

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);

                v.startDrag(data, shadowBuilder, v, 0);
                return true;
            } else {
                return false;
            }
        }
    };

    View.OnTouchListener touchListenerNo = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            return false;
        }
    };

    View.OnDragListener dragListenerNo = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            return false;
        }
    };
    View.OnDragListener dragListener = new View.OnDragListener() {

        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            final View view =(View)event.getLocalState();

            ImageView drop = (ImageView) v;
            ImageView drag = (ImageView) view;

            Test_Sega tt=new Test_Sega();
            M1Activity m1 =new M1Activity();

            switch(dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED :

                    break;
                case DragEvent.ACTION_DRAG_EXITED :

                    break;
                case DragEvent.ACTION_DROP :

                    for (i=1;i<10;i++){
                        if(m1.imageArray[i]==drag)
                            ag=i;
                        else if (m1.imageArray[i]==drop)
                            op=i;
                    }

                    tt.swap(ag,op);
                    tt.image(player);
                    tt.win();
                    player=(player+1)%2;

                    break;
            }
            return true;
        }
    };
}
