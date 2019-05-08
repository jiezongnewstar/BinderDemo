package com.xibei.binderdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private WindowManager windowManager;
    private WindowManager.LayoutParams layoutParams;
    private Button moveVIew;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moveVIew = new Button(this);
        moveVIew.setText("拖着我");
        windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        layoutParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                1,0, PixelFormat.TRANSPARENT);

        layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE|
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL|
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED;
        layoutParams.gravity = Gravity.LEFT|Gravity.TOP;

        layoutParams.x = 300;
        layoutParams.y = 300;

        moveVIew.setOnTouchListener(this);



        windowManager.addView(moveVIew,layoutParams);
//        WindowGlobal  windowGlobal = WindowGlobal

    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();

        if (event.getActionMasked() == MotionEvent.ACTION_MOVE){
            layoutParams.y = rawY;
            layoutParams.x = rawX;
            windowManager.updateViewLayout(moveVIew,layoutParams);
        }

        return false;
    }
}
