package com.was.jetpackcase.model;

import android.util.Log;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.utils.DataUtils;

public class UserViewModel extends ViewModel {

    public final ObservableField<String> name = new ObservableField<>();

    public MutableLiveData<UserBean> userLiveData = new MutableLiveData<>();

    public MutableLiveData<UserBean> getUser() {
        return userLiveData;
    }

    private void loadData(final String name) {
        new Thread() {
            @Override
            public void run() {
                userLiveData.postValue(DataUtils.getUserData(name));
                super.run();
            }
        }.start();
    }

    public void updateUser(String name) {
        userLiveData.setValue(DataUtils.getUserData(name));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(UserViewModel.class.getSimpleName(), "===========onCleared()");
    }

    {
        name.set("我是初始化名字");
    }
}
