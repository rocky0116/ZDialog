package com.sxwz.zdialoglib.params;

import android.widget.AdapterView;

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
public abstract class ItemsParams implements Serializable {
    public abstract void dismiss();

    /**
     * item点击事件
     */
    public AdapterView.OnItemClickListener listener;
    /**
     * item高度
     */
    public int itemHeight = CircleDimen.itemHeight;
    /**
     * item内间距
     */
    public int[] padding;
    /**
     * 数据源：array or list
     */
    public Object items;
    /**
     * item背景色
     */
    public int backgroundColor;
    /**
     * item字体色
     */
    public int textColor = CircleColor.content;
    /**
     * item字体大小
     */
    public int textSize = CircleDimen.contentTextSize;
}
