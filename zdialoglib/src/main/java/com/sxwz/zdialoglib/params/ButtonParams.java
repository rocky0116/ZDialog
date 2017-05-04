package com.sxwz.zdialoglib.params;

import android.view.View;

import com.sxwz.zdialoglib.res.values.CircleColor;
import com.sxwz.zdialoglib.res.values.CircleDimen;
import com.sxwz.zdialoglib.view.listener.OnInputClickListener;

import java.io.Serializable;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/
public abstract class ButtonParams implements Serializable {
    public abstract void dismiss();

    /**
     * 按钮点击事件
     */
    public View.OnClickListener listener;
    /**
     * 输入框确定事件
     */
    public OnInputClickListener inputListener;
    /**
     * 按钮框与顶部距离
     */
    public int topMargin;
    /**
     * 按钮文本颜色
     */
    public int textColor = CircleColor.button;
    /**
     * 按钮文本大小
     */
    public int textSize = CircleDimen.footerTextSize;
    /**
     * 按钮高度
     */
    public int height = CircleDimen.footerHeight;
    /**
     * 按钮背景颜色
     */
    public int backgroundColor;
    /**
     * 按钮文本
     */
    public String text;
}
