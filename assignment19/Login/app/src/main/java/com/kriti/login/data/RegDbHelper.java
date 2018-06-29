package com.kriti.login.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.kriti.login.data.RegContract.RegEntry;
/**
 * Created by kriti on 29/6/18.
 */

public class RegDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "registration_details.db";
    private static final int DATABASE_VERSION = 1;
    public RegDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_REG_DETAILS_TABLE = "CREATE_TABLE " + RegEntry.TABLE_NAME + "("
                + RegEntry._ID + "  INTEGER PRIMARY KEY AUTOINCREMENT,"
                +RegEntry.COLUMN_EMAIL + "  TEXT NOT NULL,"
                +RegEntry.COLUMN_USERNAME + "TEXT NOT NULL,"
                +RegEntry.COLUMN_PASSWORD + "TEXT NOT NULL);";
        Log.v("RegDbHelper" , "create table: " + SQL_CREATE_REG_DETAILS_TABLE);
        db.execSQL(SQL_CREATE_REG_DETAILS_TABLE);

    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){ }
    public Cursor readDetails(){
        SQLiteDatabase db = getReadableDatabase();
        String[] projection = {
                RegEntry._ID,
                RegEntry.COLUMN_EMAIL,
                RegEntry.COLUMN_USERNAME,
                RegEntry.COLUMN_PASSWORD
        };
        Cursor cursor =db.query(
                RegEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
        return  cursor;
    }
    public void insertDetails(String emailString , String usernameString , String passwordString){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(RegContract.RegEntry.COLUMN_EMAIL,emailString);
        values.put(RegContract.RegEntry.COLUMN_USERNAME,emailString);
        values.put(RegContract.RegEntry.COLUMN_PASSWORD,emailString);
        long newRowId = db.insert(RegContract.RegEntry.TABLE_NAME,null,values);
        if(newRowId==-1){
            Log.v("RegDbHelper", "Error in insertion");
        }
        else{
            Log.v("RegDbHelper","insertion Successful");
        }
    }

}
