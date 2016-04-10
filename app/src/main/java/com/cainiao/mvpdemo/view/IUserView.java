package com.cainiao.mvpdemo.view;

/**
 * 作者：毕空 on 2016/4/10 22:49
 * 邮箱：xianyu.hxy@alibaba-inc.com
 */
public interface IUserView {
    int getID();
    String getFirstName();
    String getLastName();
    void setFirstName(String firstName);
    void setLastName(String lastName);
}
