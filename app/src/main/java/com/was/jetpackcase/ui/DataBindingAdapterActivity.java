package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.was.jetpackcase.R;
import com.was.jetpackcase.adapter.DataBindingAdapter;
import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.databinding.ActivityDatabindingAdapterBinding;

import java.util.ArrayList;
import java.util.List;

public class DataBindingAdapterActivity extends AppCompatActivity {

    ActivityDatabindingAdapterBinding viewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_adapter);
        viewDataBinding.setClick(new ClickProxy());
        initView();
    }

    DataBindingAdapter adapter;

    private void initView() {
        adapter = new DataBindingAdapter(initUserData());
        viewDataBinding.recyclerview.setAdapter(adapter);
        adapter.setOnItemOnClickListener(new DataBindingAdapter.OnItemOnClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(DataBindingAdapterActivity.this, "行数：" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //初始化测试数据
    private List<UserBean> initUserData() {
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

    public class ClickProxy {
        public void clickAdd() {
            Toast.makeText(DataBindingAdapterActivity.this, "添加 ------   ", Toast.LENGTH_SHORT).show();
        }

        public void clickDelete() {
            Toast.makeText(DataBindingAdapterActivity.this, "删除 ------   ", Toast.LENGTH_SHORT).show();
        }

        public void clickUpdate() {
            Toast.makeText(DataBindingAdapterActivity.this, "更新 ------   ", Toast.LENGTH_SHORT).show();
        }

    }

}