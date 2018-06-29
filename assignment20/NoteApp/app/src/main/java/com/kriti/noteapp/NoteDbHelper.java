package com.kriti.noteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.kriti.noteapp.NoteContract.NoteEntry;

/**
 * Created by kriti on 30/6/18.
 */

public class NoteDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "n_detail.db";
    private static final int DATABASE_VERSION = 1;
    public NoteDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_NOTE_DETAILS_TABLE = "CREATE TABLE " + NoteEntry.TABLE_NAME + " ("
                +NoteEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +NoteEntry.COLUMN_TITLE + " TEXT NOT NULL UNIQUE, "
                +NoteEntry.COLUMN_NOTE + " TEXT NOT NULL);";
        Log.v("NoteDbHelper" , "create table: " + SQL_CREATE_NOTE_DETAILS_TABLE);
        db.execSQL(SQL_CREATE_NOTE_DETAILS_TABLE);

    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){ }

    public Cursor readDetails(){
        SQLiteDatabase db = getReadableDatabase();
        String[] projection = {
                NoteEntry._ID,
                NoteEntry.COLUMN_TITLE,
                NoteEntry.COLUMN_NOTE
        };
        Cursor cursor =db.query(
                NoteEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
        return  cursor;
    }
    public long insertDetails(String titleString , String noteString){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NoteContract.NoteEntry.COLUMN_TITLE,titleString);
        values.put(NoteEntry.COLUMN_NOTE,noteString);
        long newRowId = db.insert(NoteContract.NoteEntry.TABLE_NAME,null,values);
        if(newRowId==-1){
            Log.v("NoteDbHelper", "Error in insertion");
        }
        else{
            Log.v("NoteDbHelper","insertion Successful");

        }
        return newRowId;
    }
    public String[] fetchData(String title){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                NoteEntry.TABLE_NAME,
                null,
                " title = ?",
                new String[]{title},
                null,
                null,
                null);

        String[] str = new String[4];
        if(cursor.getCount()==1){
            cursor.moveToFirst();
            str[0] = String.valueOf(cursor.getInt(0));
            str[1] = cursor.getString(1);
            str[2] = cursor.getString(2);
            return str;
        }
        else
        {
            Log.v("hiiiii", "details: " + cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2)
                    + " " + cursor.getString(3) + " " + cursor.getString(4));
        }
        return str;
    }


}

