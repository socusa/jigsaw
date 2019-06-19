package com.example.lynn.jigsaw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.RelativeLayout;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(0xFF000000);

        for (int counter=0;counter<3;counter++)
            for (int counter1=0;counter1<3;counter1++) {
                canvas.drawLine(400,400 + counter*100,700,400 + counter*100,paint);
            }


    }

}
