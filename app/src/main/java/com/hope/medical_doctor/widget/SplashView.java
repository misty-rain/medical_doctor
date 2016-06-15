package com.hope.medical_doctor.widget;

import android.view.animation.Animation;

/**
 * Created by wutao on 2016/4/26.
 */
public interface SplashView {
    void animateBackgroundImage(Animation animation);

    void initializeViews(String versionName, String copyright, int backgroundResId);

    void initializeUmengConfig();

    void navigateToHomePage();
}
