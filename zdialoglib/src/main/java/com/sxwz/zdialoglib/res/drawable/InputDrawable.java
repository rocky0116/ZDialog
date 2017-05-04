package com.sxwz.zdialoglib.res.drawable;

import android.graphics.drawable.GradientDrawable;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/

public class InputDrawable extends GradientDrawable {
    public InputDrawable(int strokeWidth, int strokeColor, int backgroundColor) {
        setColor(backgroundColor);//内部填充颜色
        setStroke(strokeWidth, strokeColor);//边框宽度,边框颜色
    }
}
