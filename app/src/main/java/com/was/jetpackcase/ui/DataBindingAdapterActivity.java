package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.was.jetpackcase.R;
import com.was.jetpackcase.adapter.DataBindingAdapter;
import com.was.jetpackcase.databinding.ActivityDatabindingAdapterBinding;
import com.was.jetpackcase.utils.DataUtils;


public class DataBindingAdapterActivity extends AppCompatActivity {

    ActivityDatabindingAdapterBinding viewDataBinding;
    DataBindingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_adapter);
        viewDataBinding.setClick(new ClickProxy());
        initView();
    }

    private void initView() {
        adapter = new DataBindingAdapter(DataUtils.getUserDataList());
        viewDataBinding.recyclerview.setAdapter(adapter);
        adapter.setOnItemOnClickListener(new DataBindingAdapter.OnItemOnClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(DataBindingAdapterActivity.this, "行数：" + position, Toast.LENGTH_SHORT).show();
            }
        });
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