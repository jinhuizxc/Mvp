package com.example.jh.mvplogin.presenter.presenterImpl;

import com.example.jh.mvplogin.bean.UserInfo;
import com.example.jh.mvplogin.interfaces.LoginView;
import com.example.jh.mvplogin.interfaces.OnLoginListener;
import com.example.jh.mvplogin.presenter.UserPresenter;
import com.example.jh.mvplogin.presenter.LoginPresenter;

/**
 * 作者：jinhui on 2017/3/10
 * 邮箱：1004260403@qq.com
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginListener {

    private UserPresenter userPresenterImpl;
    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        //实现监听接口  --- 父类对象引用指向子类对象
        this.userPresenterImpl = new UserPresenterImpl(this);
    }

    @Override
    public void login() {
        UserInfo info = new UserInfo();
        info.setUsername(loginView.getUserName());
        info.setPassword(loginView.getPassWord());
        userPresenterImpl.login(info);
    }
    @Override
    public void clear() {
        loginView.clearUserName();
        loginView.clearPassWord();
    }

    @Override
    public void loginStatus(boolean status) {
        String msg;
        if(status)
            msg = "login success";
        else
            msg = "login failed";
        loginView.showMsg(msg);
    }
}
