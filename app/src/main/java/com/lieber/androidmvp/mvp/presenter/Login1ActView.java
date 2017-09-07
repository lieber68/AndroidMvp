package com.lieber.androidmvp.mvp.presenter;


import com.lieber.androidmvp.mvp.model.LoginBean;

/**
 * Copyright (C) 2017
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:29
 * @description
 */

public interface Login1ActView {
    void loginSuccess(LoginBean loginBean);

    void loginFailed(LoginBean loginBean);
}
