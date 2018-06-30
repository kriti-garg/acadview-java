package com.kriti.noteapp;


import android.content.ContentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/**
 * Created by kriti on 30/6/18.
 */

public class NotesProvider extends ContentProvider {

    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
    private static final int NOTES = 100;
    private static final int NOTES_ID = 101;

    static {
        sUriMatcher.addURI(NoteContract.CONTENT_AUTHORITY, NoteContract.PATH_NOTES, NOTES);
        sUriMatcher.addURI(NoteContract.CONTENT_AUTHORITY, NoteContract.PATH_NOTES + "/#", NOTES_ID);
    }

    private NoteDbHelper mDbHelper;

    @Override
    public boolean onCreate() {
        mDbHelper = new NoteDbHelper(getContext());
        return true;
    }
    @Override
    public String getType(Uri uri) {
        return null;
    }
    @Override
    public int update(Uri uri, ContentValues contentValues, String selection,
                      String[] selectionArgs) { return 0;}
                     @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
                        String sortOrder){
                         SQLiteDatabase database = mDbHelper.getReadableDatabase();
                         // This cursor will hold the result of the query
                         Cursor cursor;

                         // Figure out if the URI matcher can match the URI to a specific code
                         int match = sUriMatcher.match(uri);

                         cursor = database.query(NoteContract.NoteEntry.TABLE_NAME, projection, selection, selectionArgs,
                                 null, null, sortOrder);
                         cursor.setNotificationUri(getContext().getContentResolver(), uri);

                         // Return the cursor
                         return cursor;
                     }
 @Override
        public int delete(Uri uri, String selection, String[] selectionArgs) {
                                    return  0;
                              }

 @Override
            public Uri insert(Uri uri, ContentValues values){ return null;}
}
