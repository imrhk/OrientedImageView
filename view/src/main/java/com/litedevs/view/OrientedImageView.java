package com.litedevs.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/*
Copyright 2018 Rahul Kumar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

public class OrientedImageView extends android.support.v7.widget.AppCompatImageView {

    private static final int ORIENTATION_HORIZONTAL = 0;
    private static final int ORIENTATION_VERTICAL = 1;

    private int mFixedOrientation;
    private float mFixedRatio;

    public OrientedImageView(Context context) {
        this(context, null);
    }

    public OrientedImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OrientedImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = null;
        try {
            a = context.obtainStyledAttributes(attrs, R.styleable.OrientedImageView, defStyleAttr, 0);
            mFixedOrientation = a.getInt(R.styleable.OrientedImageView_fixedOrientation, ORIENTATION_HORIZONTAL);
            mFixedRatio = a.getFloat(R.styleable.OrientedImageView_aspectRatio, 1.0f);
        }
        finally {
            if(a != null) {
                a.recycle();
            }
        }

        if(mFixedOrientation != ORIENTATION_HORIZONTAL && mFixedOrientation != ORIENTATION_VERTICAL) {
            throw new IllegalArgumentException("Orientation values can not be changed");
        }

        if(mFixedRatio <= 0.0f) {
            throw new IllegalArgumentException("Orientation ratio should be > 0");
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(mFixedOrientation == ORIENTATION_HORIZONTAL) {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
            setMeasuredDimension(getMeasuredWidth(), (int) (getMeasuredWidth() / mFixedRatio));
        }
        else {
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
            setMeasuredDimension((int) (getMeasuredHeight() * mFixedRatio), getMeasuredHeight());
        }
    }
}
