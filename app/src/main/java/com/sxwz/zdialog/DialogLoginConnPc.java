package com.sxwz.zdialog;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxwz.zdialoglib.BaseCircleDialog;
/***********************************************************
 * Author:       wz
 * Email:        wangzhong0116@foxmail.com
 * Version:      1.0
 * Date:         2017/5/4
 * Description:
 ***********************************************************/

public class DialogLoginConnPc extends BaseCircleDialog implements View.OnClickListener {

    public static DialogLoginConnPc getInstance() {
        DialogLoginConnPc dialogLoginConnPc = new DialogLoginConnPc();
        dialogLoginConnPc.setCanceledBack(false);
        dialogLoginConnPc.setCanceledOnTouchOutside(false);
        return dialogLoginConnPc;
    }

    @Override
    public View createView(Context context, LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.dialog_login_conn_pic, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView().findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
