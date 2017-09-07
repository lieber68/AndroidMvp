package com.lieber.androidmvp.mvp.model;

/**
 * @author :lieber
 * @date : on 17-9-7 11:13
 * @e-mail :liubo@yifangdigital.com
 */

public class LoginBean {
    String name;
    String age;
    String status;
    String msg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
