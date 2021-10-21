package com.example.todoapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.todoapp.params.params;

public class MydbHandler extends SQLiteOpenHelper {
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    String create = "CREATE TABLE " + params.TABLE_NAME+"("+
            params.KEY_ID+"INTEGER KEY"+params.KEY_TODO
            +"TEXT"+")";
    sqLiteDatabase.execSQL(create);
    }

    public MydbHandler(Context context) {
        super(context,params.DB_NAME,null,params.DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
