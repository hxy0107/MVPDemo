package com.cainiao.mvpdemo.bean;

/**
 * 作者：毕空 on 2016/4/10 22:41
 * 邮箱：xianyu.hxy@alibaba-inc.com
 */
public class UserBean {
    private String mFirstName;
    private String mLastName;

    public UserBean(String mFirstName, String mLastName) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
