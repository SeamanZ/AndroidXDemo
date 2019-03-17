package com.example.seamanz.androidxdemo

import android.content.Context
import android.util.AttributeSet
import androidx.core.view.ViewCompat
import androidx.viewpager.widget.ViewPager

class AppViewPager : ViewPager {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    override fun setLayoutDirection(layoutDirection: Int) {
        super.setLayoutDirection(layoutDirection)
        if (layoutDirection == ViewCompat.LAYOUT_DIRECTION_LTR) {
            rotationY = 0F
        } else if (layoutDirection == ViewCompat.LAYOUT_DIRECTION_RTL) {
            rotationY = 180F
        }
    }
}