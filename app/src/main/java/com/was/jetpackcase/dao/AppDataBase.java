package com.was.jetpackcase.dao;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.was.jetpackcase.bean.Student;


@Database(entities = {Student.class}, version = 2)
public abstract class AppDataBase extends RoomDatabase {
    public abstract StudentDao getStudentDao();

    //版本更新内容
    public static Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("alter table student add column sex text");
        }
    };

}
