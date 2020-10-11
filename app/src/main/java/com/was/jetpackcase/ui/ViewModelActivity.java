package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.view.View;

import com.was.jetpackcase.R;
import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.databinding.ActivityViewModelBinding;
import com.was.jetpackcase.model.UserViewModel;

//jetpack 以生命周期的方式存储与Ui相关的数据
//负责准备和管理Activity 和 Fragment 的数据 ViewModel的目的是获取并保留Activity或Fragment所需的信息
public class ViewModelActivity extends AppCompatActivity {

    ActivityViewModelBinding binding;
    UserViewModel viewModel = new UserViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model);

        viewModel.getUser().observe(this, new Observer<UserBean>() {
            @Override
            public void onChanged(UserBean userBean) {
                binding.tvContent.setText("名字: " + userBean.getName());
            }
        });
    }

    public void clickUpdate(View view) {
        viewModel.updateUser("我的名字");
    }
}