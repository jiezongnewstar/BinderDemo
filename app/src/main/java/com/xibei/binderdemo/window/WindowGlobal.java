package com.xibei.binderdemo.window;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Created by Xibei on 2019/5/8.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class WindowGlobal implements WindowManager {

    @Override
    public Display getDefaultDisplay() {
        return null;
    }

    @Override
    public void removeViewImmediate(View view) {

    }

    @Override
    public void addView(View view, ViewGroup.LayoutParams params) {

    }

    @Override
    public void updateViewLayout(View view, ViewGroup.LayoutParams params) {

    }

    @Override
    public void removeView(View view) {

    }
}
