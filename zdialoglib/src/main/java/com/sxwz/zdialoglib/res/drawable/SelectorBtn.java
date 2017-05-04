package com.sxwz.zdialoglib.res.drawable;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;

import com.sxwz.zdialoglib.res.values.CircleColor;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/

public class SelectorBtn extends StateListDrawable {

    public SelectorBtn(int backgroundColor, int leftTopRadius, int rightTopRadius, int rightBottomRadius, int
            leftBottomRadius) {
        //按下
        ShapeDrawable drawablePress = new ShapeDrawable(DrawableHelper.getRoundRectShape(leftTopRadius, rightTopRadius,
                rightBottomRadius, leftBottomRadius));
        drawablePress.getPaint().setColor(CircleColor.buttonPress);
        //默认
        ShapeDrawable defaultDrawable = new ShapeDrawable(DrawableHelper.getRoundRectShape(leftTopRadius,
                rightTopRadius,
                rightBottomRadius, leftBottomRadius));
        defaultDrawable.getPaint().setColor(backgroundColor);

        addState(new int[]{android.R.attr.state_pressed}, drawablePress);
        addState(new int[]{-android.R.attr.state_pressed}, defaultDrawable);
    }
}
