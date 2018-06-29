package com.kriti.login.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import com.kriti.login.data.RegContract.RegEntry;
/**
 * Created by kriti on 29/6/18.
 */

public class RegDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "reg_details.db";
    private static final int DATABASE_VERSION = 1;
    public RegDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_REG_DETAILS_TABLE = "CREATE TABLE " + RegEntry.TABLE_NAME + " ("
                + RegEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +RegEntry.COLUMN_EMAIL + " TEXT NOT NULL UNIQUE, "
                +RegEntry.COLUMN_USERNAME + " TEXT NOT NULL UNIQUE, "
                +RegEntry.COLUMN_PASSWORD + " TEXT NOT NULL);";
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
    public long insertDetails(String emailString , String usernameString , String passwordString){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(RegContract.RegEntry.COLUMN_EMAIL,emailString);
        values.put(RegContract.RegEntry.COLUMN_USERNAME,usernameString);
        values.put(RegContract.RegEntry.COLUMN_PASSWORD,passwordString);
        long newRowId = db.insert(RegContract.RegEntry.TABLE_NAME,null,values);
        if(newRowId==-1){
            Log.v("RegDbHelper", "Error in insertion");
        }
        else{
            Log.v("RegDbHelper","insertion Successful");

        }
        return newRowId;
    }
    public int verifyLogin(String userName, String password){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                RegEntry.TABLE_NAME,
                null,
                " username = ?",
                new String[]{userName},
                null,
                null,
                null);

        if(cursor.getCount()==0)
            return 0; //Username is not there in the database

        else {
            Cursor cursor1 = db.query(
                    RegEntry.TABLE_NAME,
                    null,
                    " username = ? and password = ?",
                    new String[]{userName, password},
                    null,
                    null,
                    null);
            if(cursor1.getCount()==1)
                return 2; //Username and password are both correct
            else
                return 1; // Password is wrong
        }
    }
    public String[] fetchData(String username){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                RegEntry.TABLE_NAME,
                null,
                " username = ?",
                new String[]{username},
                null,
                null,
                null);

        String[] str = new String[3];
        if(cursor.getCount()==1){
            cursor.moveToFirst();
            str[0] = String.valueOf(cursor.getInt(0));
            str[1] = cursor.getString(1);
            str[2] = cursor.getString(2);
            return str;
            //+ cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2)
              //      + " " + cursor.getString(3));
        }
        else
        {
            Log.v("hiiiii", "details: " + cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2)
                    + " " + cursor.getString(3));
            //Toast.makeText(getApplicationContext(),"Username or Email id is already registered", Toast.LENGTH_SHORT).show();
        }
        return str;
    }


}
