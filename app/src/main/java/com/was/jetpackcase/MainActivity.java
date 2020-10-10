package com.was.jetpackcase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.was.jetpackcase.ui.DataBindingActivity;
import com.was.jetpackcase.ui.DataBindingAdapterActivity;
import com.was.jetpackcase.ui.DataBindingQuickActivity;
import com.was.jetpackcase.ui.RoomActivity;
import com.was.jetpackcase.ui.ViewModelActivity;
import com.was.jetpackcase.ui.ViewModelFragmentActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickDataBinding(View view) {
        Intent intent = new Intent(this, DataBindingActivity.class);
        startActivity(intent);
    }

    public void clickDataBindingAdapter(View view) {
        Intent intent = new Intent(this, DataBindingAdapterActivity.class);
        startActivity(intent);
    }

    public void clickDataBindingQuick(View view) {
        Intent intent = new Intent(this, DataBindingQuickActivity.class);
        startActivity(intent);
    }


    public void clickViewModel(View view) {
        Intent intent = new Intent(this, ViewModelActivity.class);
        startActivity(intent);
    }

    public void clickViewFragmentModel(View view) {
        Intent intent = new Intent(this, ViewModelFragmentActivity.class);
        startActivity(intent);
    }

    public void clickRoom(View view) {
        Intent intent = new Intent(this, RoomActivity.class);
        startActivity(intent);
    }


}