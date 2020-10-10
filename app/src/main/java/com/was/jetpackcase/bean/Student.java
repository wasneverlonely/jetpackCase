package com.was.jetpackcase.bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//实体类
@Entity(tableName = "student")
public class Student {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "user_name")
    public String userName;

    @ColumnInfo(name = "age")
    public int age;

}
