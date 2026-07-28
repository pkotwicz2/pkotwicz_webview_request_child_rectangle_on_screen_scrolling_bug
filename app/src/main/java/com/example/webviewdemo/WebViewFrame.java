package com.example.webviewdemo;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.util.Log;

public class WebViewFrame extends FrameLayout {
    private static final String TAG = "WebViewFrame";

    public WebViewFrame(Context context) {
        super(context);
    }

    public WebViewFrame(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WebViewFrame(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        View v = getChildAt(0);
        if (v == null) {
            return false;
        }
        return ((android.webkit.WebView) v).requestChildRectangleOnScreen(child, rectangle, immediate);
    }
}
