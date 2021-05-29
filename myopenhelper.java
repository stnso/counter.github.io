package com.example.counter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public abstract class myopenhelper extends SQLiteOpenHelper{
private static final int DATEBASE_VERSION=1;
private static final String DATEBASE_NAME="myopenhelper.db";
private static final String _ID="_id";
private static final String TABLE_NAME="number save";
private static final String COLUMN_NUMBER_ID="NUMBER";

private  static final String SQL_CREATE_ENTRIES=
        "CREATE TABLE"+TABLE_NAME+"("+
                _ID+"INTEGER PRIMART KEY,"+
                COLUMN_NUMBER_ID+"TEXT)";



}
