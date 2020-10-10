package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.was.jetpackcase.R;

//LiveData 是可以再给定生命周期内观察到的数据持有者
public class LiveDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
    }
}