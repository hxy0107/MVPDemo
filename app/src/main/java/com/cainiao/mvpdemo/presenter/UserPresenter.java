package com.cainiao.mvpdemo.presenter;

import com.cainiao.mvpdemo.bean.UserBean;
import com.cainiao.mvpdemo.model.IUserModel;
import com.cainiao.mvpdemo.model.UserModel;
import com.cainiao.mvpdemo.view.IUserView;

/**
 * 作者：毕空 on 2016/4/10 22:48
 * 邮箱：xianyu.hxy@alibaba-inc.com
 */
public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView mUserView) {
        this.mUserView = mUserView;
        mUserModel=new UserModel();
    }

    public void saveUser(int id,String firstName,String lastName){
        mUserModel.setId(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id){
        UserBean user=mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());
        mUserView.setLastName(user.getLastName());
    }
}
