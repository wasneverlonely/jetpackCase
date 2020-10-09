package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.was.jetpackcase.R;
import com.was.jetpackcase.bean.DataBean;
import com.was.jetpackcase.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {

    private DataBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        bean = new DataBean("李四", "123");

        binding.setData(bean);

    }
}