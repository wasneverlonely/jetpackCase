package com.was.jetpackcase.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.was.jetpackcase.bean.Student;

import java.util.List;

@Dao
public interface StudentDao {

    @Query("Select * from student")
    List<Student> getAll();

    @Insert
    void insertAll(Student... students);

    @Delete
    void delete(Student... students);

    @Update
    void update(Student... students);

}
