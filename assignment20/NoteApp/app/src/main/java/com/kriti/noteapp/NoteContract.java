package com.kriti.noteapp;

import android.provider.BaseColumns;

/**
 * Created by kriti on 30/6/18.
 */
final class NoteContract {
    private NoteContract(){ }
    public final static class NoteEntry implements BaseColumns {
        public final static String TABLE_NAME ="n_detail";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TITLE ="title";
        public final static String COLUMN_NOTE = "note";
    }
}
