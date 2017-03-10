package com.example.jh.mvplogin.presenter.presenterImpl;

import com.example.jh.mvplogin.bean.UserInfo;
import com.example.jh.mvplogin.interfaces.OnLoginListener;
import com.example.jh.mvplogin.presenter.UserPresenter;

/**
 * 作者：jinhui on 2017/3/10
 * 邮箱：1004260403@qq.com
 * 当前类：实现接口，进行登录信息的判断
 */

public class UserPresenterImpl implements UserPresenter {

    private OnLoginListener listener;

    //构造方法
    public UserPresenterImpl(OnLoginListener listener) {
        this.listener = listener;
    }

    @Override
    public void login(UserInfo info) {
        //默认为false
        boolean status = false;
        String username,password;
        //实现了接口相当于继承父类，可以直接调用其方法
        username = info.getUsername();
        password = info.getPassword();
        if(username != null && "jh".equals(username))
            if (password != null && "123".equals(password))
                status = true;
        listener.loginStatus(status);
    }
}
