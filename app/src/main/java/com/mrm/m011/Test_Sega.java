package com.mrm.m011;

/**
 * Created by hp on 2/24/2017.
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
                    m1.imageArray[i].setImageResource(R.drawable.aa);
                    m1.imageArray[i].setOnTouchListener(dd.touchListener);
                } else if (m1.imageState[i] == 'n') {
                    m1.imageArray[i].setImageResource(R.drawable.ss);
                    m1.imageArray[i].setOnDragListener(dd.dragListener);
                } else if (m1.imageState[i] == 'y') {
                    m1.imageArray[i].setImageResource(R.drawable.aa);
                    m1.imageArray[i].setOnTouchListener(dd.touchListenerNo);
                }
            } else if (player == 0) {
                if (m1.imageState[i] == 'x') {
                    m1.imageArray[i].setImageResource(R.drawable.aa);
                    m1.imageArray[i].setOnTouchListener(dd.touchListenerNo);
                } else if (m1.imageState[i] == 'n') {
                    m1.imageArray[i].setImageResource(R.drawable.ss);
                    m1.imageArray[i].setOnDragListener(dd.dragListener);
                } else if (m1.imageState[i] == 'y') {
                    m1.imageArray[i].setImageResource(R.drawable.aa);
                    m1.imageArray[i].setOnTouchListener(dd.touchListener);
                }
            }
        }
    }

    ;

    public void win() {
        if (imageActive[1] == 1 && imageActive[2] == 1 && imageActive[3] == 1) {
            j = 0;
            for (i = 0; i < 10; i++) {
                if (m1.imageState[i] == 'x') {
                    p[j] = i;
                    j++;
                }
            }
            sum = p[0] + p[1] + p[2];
            if (sum == 15 || sum == 6 || sum == 24) {      //horizontal  1 2 3
                if (p[2] == p[1] + 1 && p[1] == p[0] + 1) {
                    //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            }
            if (sum == 15 || sum == 17 || sum == 18) {      //vertical  1 4 7
                if (p[2] == p[1] + 3 && p[1] == p[0] + 3) {
                    //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            } else if (p[2] == p[1] + 2 && p[1] == p[0] + 2) {   // ax 3 5 7
                //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            } else if (p[2] == p[1] + 4 && p[1] == p[0] + 4) {   // ax 1 5 9
                //player 1 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            }
        }
        if (imageActive[7] == 1 && imageActive[8] == 1 && imageActive[9] == 1) {
            j = 0;
            for (i = 0; i < 10; i++) {
                if (m1.imageState[i] == 'y') {
                    p[j] = i;
                    j++;
                }
            }
            sum = p[0] + p[1] + p[2];
            if (sum == 15 || sum == 6 || sum == 24) {      //horizontal  1 2 3
                if (p[2] == p[1] + 1 && p[1] == p[0] + 1) {
                    //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            }
            if (sum == 15 || sum == 17 || sum == 18) {      //vertical  1 4 7
                if (p[2] == p[1] + 3 && p[1] == p[0] + 3) {
                    //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                    this.zz();
                }
            } else if (p[2] == p[1] + 2 && p[1] == p[0] + 2) {   // ax 3 5 7
                //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            } else if (p[2] == p[1] + 4 && p[1] == p[0] + 4) {   // ax 1 5 9
                //player 2 wiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin
                this.zz();
            }
        }
    }

    ;

    public void zz() {
        m1.imageArray[1].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[2].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[3].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[7].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[8].setOnTouchListener(dd.touchListenerNo);
        m1.imageArray[9].setOnTouchListener(dd.touchListenerNo);
    }
}
