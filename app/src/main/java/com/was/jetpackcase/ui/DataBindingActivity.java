package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.was.jetpackcase.R;
import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {

    private UserBean user;
    ActivityDataBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        binding.setClick(new ClickProxy());
        user = new UserBean(1, "李四", 1, "1232323");
        binding.setUser(user);
    }

    public class ClickProxy {
        public void click() {
            user = new UserBean(2, "张三", 0, "1232323");
            binding.setUser(user);
        }
    }
}