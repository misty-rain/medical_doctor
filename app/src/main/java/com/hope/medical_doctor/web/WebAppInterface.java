package com.hope.medical_doctor.web;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;




/**
 * Created by wutao on 2016/4/14.
 */
public class WebAppInterface {
    Context mContext;
    public WebAppInterface(Context c) {
        mContext = c;
    }

    /**
     * 如果 targetSdkVersion >=17，一定要加注解，否则JS无法调用这个方法
     */
    @JavascriptInterface
    public void openScanByJs() {
//        Intent intent = new Intent(mContext, CaptureActivity.class);
//        mContext.startActivity(intent);
    }
}
