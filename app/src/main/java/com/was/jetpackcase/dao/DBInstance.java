package com.was.jetpackcase.dao;

import android.content.Context;

import androidx.room.Room;

public class DBInstance {

    private static final String DB_NAME = "room_test";
    public static AppDataBase appDataBase;

    public static AppDataBase getInstance(Context context) {
        if (appDataBase == null) {
            synchronized (DBInstance.class) {
                if (appDataBase == null) {
                    return Room.databaseBuilder(context, AppDataBase.class, DB_NAME)
                            .addMigrations(AppDataBase.MIGRATION_1_2)
                            .build();
                }
            }
        }
        return appDataBase;
    }


}


