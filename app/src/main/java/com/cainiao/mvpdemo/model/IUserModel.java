package com.cainiao.mvpdemo.model;

import com.cainiao.mvpdemo.bean.UserBean;

/**
 * 作者：毕空 on 2016/4/10 22:42
 * 邮箱：xianyu.hxy@alibaba-inc.com
 */
public interface IUserModel {
    void setId(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    UserBean load(int id);
}
