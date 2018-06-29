package com.kriti.noteapp;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.kriti.noteapp.NoteContract.NoteEntry;


/**
 * Created by kriti on 30/6/18.
 */

public class NotesAdapter extends CursorAdapter {
    private final MainActivity activity;
    public NotesAdapter(MainActivity context){
        super(context, null, 0 /* flags */);
        this.activity = context;
    }
    public void bindView(View view, Context context, Cursor cursor){
        TextView titleTextView = view.findViewById(R.id.titleText);
        TextView noteTextView = view.findViewById(R.id.noteText);
       int titleColumnIndex= cursor.getColumnIndex(NoteEntry.COLUMN_TITLE);
        int noteColumnIndex=cursor.getColumnIndex(NoteEntry.COLUMN_NOTE);

        String title = cursor.getString(titleColumnIndex);
        String note = cursor.getString(noteColumnIndex);

        titleTextView.setText(title);
        noteTextView.setText(note);


    }
    public View newView(Context context, Cursor cursor, ViewGroup parent){
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }
}
