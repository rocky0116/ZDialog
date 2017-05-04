package com.sxwz.zdialoglib.res.drawable;

import android.graphics.drawable.shapes.RoundRectShape;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/

class DrawableHelper {

    public static RoundRectShape getRoundRectShape(int leftTop, int rightTop, int rightBottom, int leftBottom) {
        float outerRadii[] = new float[8];
        if (leftTop > 0) {
            outerRadii[0] = leftTop;
            outerRadii[1] = leftTop;
        }
        if (rightTop > 0) {
            outerRadii[2] = rightTop;
            outerRadii[3] = rightTop;
        }
        if (rightBottom > 0) {
            outerRadii[4] = rightBottom;
            outerRadii[5] = rightBottom;
        }
        if (leftBottom > 0) {
            outerRadii[6] = leftBottom;
            outerRadii[7] = leftBottom;
        }
        return new RoundRectShape(outerRadii, null, null);
    }
}
