package com.sxwz.zdialoglib.view;

import android.content.Context;

import com.sxwz.zdialoglib.params.CircleParams;
import com.sxwz.zdialoglib.params.DialogParams;
import com.sxwz.zdialoglib.params.TitleParams;
import com.sxwz.zdialoglib.res.drawable.CircleDrawable;
import com.sxwz.zdialoglib.res.values.CircleColor;

/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/
class TitleView extends ScaleTextView {

    public TitleView(Context context, CircleParams params) {
        super(context);
        init(params);
    }

    private void init(CircleParams params) {
        DialogParams dialogParams = params.getDialogParams();
        TitleParams titleParams = params.getTitleParams();

        //如果标题没有背景色，则使用默认色
        int backgroundColor = titleParams.backgroundColor != 0 ? titleParams.backgroundColor : CircleColor.bgDialog;

        //有内容则顶部圆角
        if (params.getTextParams() != null || params.getItemsParams() != null || params.getProgressParams() != null
                || params.getInputParams() != null) {
            setBackground(new CircleDrawable(backgroundColor, dialogParams.radius, dialogParams.radius, 0, 0));
        }
        //无内容则全部圆角
        else setBackground(new CircleDrawable(backgroundColor, dialogParams.radius));

        setHeight(titleParams.height);
        setTextColor(titleParams.textColor);
        setTextSize(titleParams.textSize);
        setText(titleParams.text);
    }
}
