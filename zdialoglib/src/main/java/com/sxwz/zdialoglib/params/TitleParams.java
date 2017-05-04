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
public class TitleParams implements Serializable {
    /**
     * 标题
     */
    public String text;
    /**
     * 标题高度
     */
    public int height = CircleDimen.titleHeight;
    /**
     * 标题字体大小
     */
    public int textSize = CircleDimen.titleTextSize;
    /**
     * 标题字体颜色
     */
    public int textColor = CircleColor.title;
    /**
     * 标题背景颜色
     */
    public int backgroundColor;
}
