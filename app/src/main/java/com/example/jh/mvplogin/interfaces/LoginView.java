package com.example.jh.mvplogin.interfaces;

/**
 * 作者：jinhui on 2017/3/10
 * 邮箱：1004260403@qq.com
 *   主要接口：
 *   得到用户姓名与密码
 *   登录、清空、显示信息
 */

public interface LoginView {

    public String getUserName();
    public String getPassWord();
    public void clearUserName();
    public void clearPassWord();
    public void showMsg(String msg);
}
