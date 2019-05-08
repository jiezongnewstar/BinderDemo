package com.xibei.binderdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Xibei on 2019/5/8.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration: 可跟着收拖拽的View
 */
public class MoveVIew extends View {


    private Paint mPaint;

    public MoveVIew(Context context) {
        super(context);
    }

    public MoveVIew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(100,100,400,400,mPaint);
    }

}
