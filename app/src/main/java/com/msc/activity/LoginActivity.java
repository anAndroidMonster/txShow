package com.msc.activity;

import android.content.Context;
import android.content.Intent;

import com.common.Constant;
import com.common.NativeActivity;
import com.common.ShowActivity;
import com.lsf.xmchqq.android.R;

/**
 * Created by book4 on 2018/5/2.
 */

public class LoginActivity extends NativeActivity {
    public static void enterActivity(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getImg() {
        return R.drawable.mstx_login;
    }

    @Override
    protected String getNativeId() {
        return Constant.NATIVE_IDS[3];
    }

    @Override
    protected int getAlighType() {
        return 2;
    }

    @Override
    protected int getMarginHeight() {
        return 0;
    }
}
