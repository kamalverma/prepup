package com.prepcgl.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kamal on 20/11/15.
 */
public class MyDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    private static final String DICTIONARY_TABLE_NAME = "dictionary";
    private static final String DATABASE_NAME ="prepup" ;
    private static MyDBHelper mDbInstance;
    public static SQLiteDatabase mDatabase;


    public static SQLiteDatabase getInstance(Context context){
        if(mDbInstance== null){
            mDbInstance= new MyDBHelper(context);
        }
        if(mDatabase== null){
            mDatabase= mDbInstance.getWritableDatabase();
        }
        return mDatabase;
    }

    private MyDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
