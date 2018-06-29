package com.kriti.noteapp;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by kriti on 30/6/18.
 */
final class NoteContract {
    private NoteContract(){ }
    public static final String CONTENT_AUTHORITY = "com.example.kriti.noteapp";
    private static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_NOTES = "notes";
    public final static class NoteEntry implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_NOTES);
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_NOTES;
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_NOTES;
        public final static String TABLE_NAME ="n_detail";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TITLE ="title";
        public final static String COLUMN_NOTE = "note";
    }


}
