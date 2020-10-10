package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.was.jetpackcase.R;
import com.was.jetpackcase.adapter.DataBindingQuickAdapter;
import com.was.jetpackcase.databinding.ActivityDatabindingQuickBinding;
import com.was.jetpackcase.utils.DataUtils;

public class DataBindingQuickActivity extends AppCompatActivity {


    ActivityDatabindingQuickBinding viewDataBinding;
    DataBindingQuickAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_quick);

        adapter = new DataBindingQuickAdapter();
        viewDataBinding.recyclerview.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(DataBindingQuickActivity.this, "点击 ------   " + position, Toast.LENGTH_SHORT).show();
            }
        });

        adapter.setList(DataUtils.getUserDataList());
    }
}