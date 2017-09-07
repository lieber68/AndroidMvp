package com.lieber.androidmvp.mvp.presenter;

import android.os.Handler;

import com.lieber.androidmvp.mvp.model.LoginBean;


/**
 * Copyright (C) 2017
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:30
 * @description
 */

public class Login1PresenterImp {
    private Login1ActView login1ActView;

    public Login1PresenterImp(Login1ActView login1ActView) {
        this.login1ActView = login1ActView;
    }

    public void login(String userName, String passWord) {
        //模拟登录(Mock login)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSuccess = true;//根据实际情况判断
                if (login1ActView == null)
                    return;
                LoginBean loginBean = new LoginBean();
                if (isSuccess) {
                    login1ActView.loginSuccess(loginBean);
                } else {
                    login1ActView.loginFailed(loginBean);
                }
            }
        }, 2000);
    }
}
