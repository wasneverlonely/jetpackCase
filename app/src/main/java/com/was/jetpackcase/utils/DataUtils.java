package com.was.jetpackcase.utils;

import com.was.jetpackcase.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    //初始化测试数据
    public static List<UserBean> getUserDataList() {
        List<UserBean> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            UserBean userBean = new UserBean();
            userBean.setId(i);
            userBean.setName("名字" + i);
            userBean.setSex(i % 2 == 0 ? 1 : 0);
            userBean.setNo("1234932874" + i);
            list.add(userBean);
        }
        return list;
    }

    //初始化测试数据
    public static UserBean getUserData(String name) {
        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setName(name);
        userBean.setSex(1);
        userBean.setNo("12349328741");
        return userBean;
    }

}


