package com.lieber.androidmvp.enhancedMvp.presenter;


import com.lieber.androidmvp.enhancedMvp.model.LoginBean2;

/**
 * Copyright (C) 2017
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:40
 * @description
 */

public interface Login2ActView {
    void loginSuccess(LoginBean2 loginBean2);

    void loginFailed(LoginBean2 loginBean2);
}
