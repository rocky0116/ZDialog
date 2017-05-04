package com.sxwz.zdialoglib.res.drawable;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/
public class CircleDrawable extends ShapeDrawable {

    public CircleDrawable(int backgroundColor, int radius) {
        this(backgroundColor, radius, radius, radius, radius);
    }

    public CircleDrawable(int backgroundColor, int leftTopRadius, int rightTopRadius
            , int rightBottomRadius, int leftBottomRadius) {
        getPaint().setColor(backgroundColor);//内部填充颜色
        //圆角半径
        setShape(DrawableHelper.getRoundRectShape(leftTopRadius, rightTopRadius, rightBottomRadius, leftBottomRadius));
    }

}
