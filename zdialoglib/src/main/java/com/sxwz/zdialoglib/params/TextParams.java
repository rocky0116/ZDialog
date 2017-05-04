package com.sxwz.zdialoglib.params;

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
public class TextParams implements Serializable {
    /**
     * body文本内间距
     */
    public int[] padding;
    /**
     * 文本
     */
    public String text;
    /**
     * 文本高度
     */
    public int height = CircleDimen.titleHeight;
    /**
     * 文本背景颜色
     */
    public int backgroundColor;
    /**
     * 文本字体颜色
     */
    public int textColor = CircleColor.content;
    /**
     * 文本字体大小
     */
    public int textSize = CircleDimen.contentTextSize;
}
