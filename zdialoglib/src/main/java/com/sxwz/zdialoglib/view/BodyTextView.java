package com.sxwz.zdialoglib.view;

import android.content.Context;

import com.sxwz.zdialoglib.params.CircleParams;
import com.sxwz.zdialoglib.params.DialogParams;
import com.sxwz.zdialoglib.params.TextParams;
import com.sxwz.zdialoglib.params.ButtonParams;
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
class BodyTextView extends ScaleTextView {
    private CircleParams mParams;

    public BodyTextView(Context context, CircleParams params) {
        super(context);
        this.mParams = params;
        init(params);
    }

    private void init(CircleParams params) {
        DialogParams dialogParams = params.getDialogParams();
        TitleParams titleParams = params.getTitleParams();
        TextParams textParams = params.getTextParams();
        ButtonParams negativeParams = params.getNegativeParams();
        ButtonParams positiveParams = params.getPositiveParams();

        //如果标题没有背景色，则使用默认色
        int backgroundColor = textParams.backgroundColor != 0 ? textParams.backgroundColor : CircleColor.bgDialog;

        //有标题没按钮则底部圆角
        if (titleParams != null && negativeParams == null && positiveParams == null)
            setBackground(new CircleDrawable(backgroundColor, 0, 0, dialogParams.radius, dialogParams.radius));
            //没标题有按钮则顶部圆角
        else if (titleParams == null && (negativeParams != null || positiveParams != null))
            setBackground(new CircleDrawable(backgroundColor, dialogParams.radius, dialogParams.radius, 0, 0));
            //没标题没按钮则全部圆角
        else if (titleParams == null && negativeParams == null && positiveParams == null)
            setBackground(new CircleDrawable(backgroundColor, dialogParams.radius));
            //有标题有按钮则不用考虑圆角
        else setBackgroundColor(backgroundColor);

        setHeight(textParams.height);
        setTextColor(textParams.textColor);
        setTextSize(textParams.textSize);
        setText(textParams.text);

        int[] padding = textParams.padding;
        if (padding != null) setAutoPadding(padding[0], padding[1], padding[2], padding[3]);
    }

    public void refreshText() {
        if (mParams.getTextParams() == null) return;
        post(new Runnable() {
            @Override
            public void run() {
                setText(mParams.getTextParams().text);
            }
        });
    }
}
