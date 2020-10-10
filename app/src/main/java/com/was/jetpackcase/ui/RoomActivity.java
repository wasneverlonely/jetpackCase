package com.was.jetpackcase.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.was.jetpackcase.R;
import com.was.jetpackcase.dao.DBInstance;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
    }

    void dao() {
        DBInstance.getInstance(getApplicationContext()).getStudentDao().getAll();
    }
}