package com.mrm.m011;

/**
 * Created by mrm on 2/24/2017.
 */
public class Test_Sega {

    public int i, j, sum;
    protected M1Activity m1;
    protected DragDrop dd;
    static int imageActive[] = new int[10];
    public int p[] = new int[2];

    public Test_Sega() {
        m1 = new M1Activity();
        dd = new DragDrop();
    }

    public void swap(int drag, int drop) {
        char img;
        imageActive[drag] = 1;
        img = m1.imageState[drag];
        m1.imageState[drag] = m1.imageState[drop];
        m1.imageState[drop] = img;
    }

    ;

    public void image(int player) {

        int i;
        for (i = 1; i < 10; i++) {
            if (player == 1) {
                if (m1.imageState[i] == 'x') {
                    m1.imageArray[i].setImageResource(R.drawable.bb);
                    m1.imageArray[i].setOnTouchListener(dd.touchListener);
                    m1.imageArray[i].setOnDragListener(dd.dragListenerNo);
                } else if (m1.imageState[i] == 'n') {
                    m1.imageArray[i].setImageResource(R.drawable.ss);
                    m1.imageArray[i].setOnDragListener(dd.dragListener);
                    m1.imageArray[i].setOnTouchListener(dd.touchListenerNo);
                } else if (m1.imageState[i] == 'y') {
                    m1.imageArray[i].setImageResource(R.drawable.aa);
                    m1.imageArray[i].setOnTouchListener(dd.touchListenerNo);
                    m1.imageArray[i].setOnDragListener(dd.dragListenerNo);
                }
            } else if (player == 0) {
                if (m1.imageState[i] == 'x') {
                    m1.imageArray[i].setImageResource(R.drawable.bb);
                    m1.imageArray[i].setOnTouchListener(dd.touchListenerNo);
                    m1.imageArray[i].setOnDragListener(dd.dragListenerNo);
                } else if (m1.imageState[i] == 'n') {
                    m1.imageArray[i].setImageResource(R.drawable.ss);
                    m1.imageArray[i].setOnDragListener(dd.dragListener);
                    m1.imageArray[i].setOnTouchListener(dd.touchListenerNo);
                } else if (m1.imageState[i] == 'y') {
                    m1.imageArray[i].setImageResource(R.drawable.aa);
                    m1.imageArray[i].setOnTouchListener(dd.touchListener);
                    m1.imageArray[i].setOnDragListener(dd.dragListenerNo);
                }
            }
        }
    }

    ;

    public void win() {
        if (imageActive[1] == 1 && imageActive[2] == 1 && imageActive[3] == 1) {
            if (m1.imageState[1]=='x'&&m1.imageState[5]=='x'&& m1.imageState[9]=='x') {      //axis  1 5 9
                    //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
            }
            if (m1.imageState[3]=='x'&&m1.imageState[5]=='x'&& m1.imageState[7]=='x') {      //axis  3 5 7
                //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            }
            for(int i=1;i<=3;i++){
                if (m1.imageState[i]=='x'&&m1.imageState[i+3]=='x'&& m1.imageState[i+6]=='x') {      //ver.  1 4 7
                    //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            }
            for(int i=1;i<=7;i+=3){
                if (m1.imageState[i]=='x'&&m1.imageState[i+1]=='x'&& m1.imageState[i+2]=='x') {      //her.  1 2 3
                    //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            }
        }
        if (imageActive[7] == 1 && imageActive[8] == 1 && imageActive[9] == 1) {
            if (m1.imageState[1]=='y'&&m1.imageState[5]=='y'&& m1.imageState[9]=='y') {      //axis  1 5 9
                //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            }
            if (m1.imageState[3]=='y'&&m1.imageState[5]=='y'&& m1.imageState[7]=='y') {      //axis  3 5 7
                //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            }
            for(int i=1;i<=3;i++){
                if (m1.imageState[i]=='y'&&m1.imageState[i+3]=='y'&& m1.imageState[i+6]=='y') {      //ver.  1 4 7
                    //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            }
            for(int i=1;i<=7;i+=3){
                if (m1.imageState[i]=='y'&&m1.imageState[i+1]=='y'&& m1.imageState[i+2]=='y') {      //her.  1 2 3
                    //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            }
        }
    }

    ;

    public void zz() {
        m1.imageArray[1].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[2].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[3].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[4].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[5].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[6].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[7].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[8].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[9].setOnTouchListener(dd.touchListenerNo);
    }

    public void test (){
        //Toast.makeText(getContext(), "drag"+"drop", Toast.LENGTH_LONG).show();
    }
}
