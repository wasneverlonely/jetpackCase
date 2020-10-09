package com.was.jetpackcase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.was.jetpackcase.ui.DataBindingActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickViewModel(View view) {
//        Intent intent = new Intent(this, ViewModelActivity.class);
//        startActivity(intent);
    }

    public void clickLiveData(View view) {
//        Intent intent = new Intent(this, LiveDataActivity.class);
//        startActivity(intent);
    }

    public void clickDataBinding(View view) {
        Intent intent = new Intent(this, DataBindingActivity.class);
        startActivity(intent);
    }
}