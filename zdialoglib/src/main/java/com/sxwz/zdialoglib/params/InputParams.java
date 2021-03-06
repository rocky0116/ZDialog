package com.sxwz.zdialoglib.params;

import android.graphics.Color;

import com.sxwz.zdialoglib.res.values.CircleColor;
import com.sxwz.zdialoglib.res.values.CircleDimen;

import java.io.Serializable;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/
public class InputParams implements Serializable {
    private static final int[] MARGINS = {50, 20, 50, 40};

    /**
     * 输入框与body视图的距离
     */
    public int[] margins = MARGINS;
    /**
     * 输入框的高度
     */
    public int inputHeight = CircleDimen.inputHeight;
    /**
     * 输入框提示语
     */
    public String hintText;
    /**
     * 输入框提示语颜色
     */
    public int hintTextColor = CircleColor.content;
    /**
     * 输入框背景资源文件
     */
    public int inputBackgroundResourceId;
    /**
     * 输入框边框线条粗细
     */
    public int strokeWidth = 1;
    /**
     * 输入框边框线条颜色
     */
    public int strokeColor = CircleColor.inputStroke;
    /**
     * 输入框的背景
     */
    public int inputBackgroundColor = Color.TRANSPARENT;
    /**
     * body视图的背景色
     */
    public int backgroundColor;
    /**
     * 输入框字体大小
     */
    public int textSize = CircleDimen.contentTextSize;
    /**
     * 输入框字体颜色
     */
    public int textColor = CircleColor.title;
}
