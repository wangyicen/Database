package com.feicui.edu.sqliteproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.ParcelUuid;

/**
 * Created by ASUS on 2016/9/13.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    //数据库版本号
    public static final int DATABASE_VERSION = 1;
    //数据库名
    public static final String DATABASE_NAME = "FeedReader.db";

    private static final String TAG = "MySQLiteOpenHelper";

    public MySQLiteOpenHelper(Context context,
                              String name,//要创建的数据库名
                              SQLiteDatabase.CursorFactory factory,//游标工厂，用来创建cursor
                              int version//创建数据库的版本号
    ) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //当数据库被创建的时候，回调此函数
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //当数据库版本更新的时候，回调此函数，oldVersion旧版本号，newVersion新版本号
    }
}
