package com.cainiao.mvpdemo.model;

import android.util.SparseArray;

import com.cainiao.mvpdemo.bean.UserBean;

/**
 * 作者：毕空 on 2016/4/10 22:43
 * 邮箱：xianyu.hxy@alibaba-inc.com
 */
public class UserModel implements IUserModel{
    private String mFirstName;
    private String mLastName;
    private int mID;
    private SparseArray<UserBean> mUserArray=new SparseArray<UserBean>();

    @Override
    public void setId(int id) {
        mID=id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName=firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName=lastName;
        UserBean userBean=new UserBean(mFirstName,mLastName);
        mUserArray.append(mID,userBean);
    }

    @Override
    public UserBean load(int id) {
        mID=id;
        UserBean userBean=mUserArray.get(mID,new UserBean("not found","not found"));
        return userBean;
    }
}
