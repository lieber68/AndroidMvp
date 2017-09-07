package com.lieber.androidmvp.enhancedMvp.presenter;

import android.os.Handler;

import com.lieber.androidmvp.enhancedMvp.model.LoginBean2;
import com.lieber.androidmvp.enhancedMvp.view.Login2Act;


/**
 * Copyright (C) 2017  ben
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:40
 * @description
 */

public class Login2PresenterImp extends BasePresenter<Login2Act> {
    public void login(String userName, String passWord) {
        final Login2ActView login2ActView = getView();
        //模拟登录(Mock login)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSuccess = true;//depend on result from your server
                if (login2ActView == null)
                    return;
                LoginBean2 loginBean2 = new LoginBean2();
                if (isSuccess) {
                    login2ActView.loginSuccess(loginBean2);
                } else {
                    login2ActView.loginFailed(loginBean2);
                }
            }
        }, 2000);
    }
}
