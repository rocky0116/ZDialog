package com.sxwz.zdialoglib.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.sxwz.zdialoglib.res.values.CircleColor;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/
class DividerView extends View {
    public DividerView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutParams(new LinearLayout.LayoutParams(1, LinearLayout.LayoutParams.MATCH_PARENT));
        setBackgroundColor(CircleColor.divider);
    }

    /**
     * 将分隔线设置为水平分隔
     */
    public void setVertical() {
        setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1));
    }
}
