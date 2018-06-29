package com.kriti.noteapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateNote extends AppCompatActivity {

    public String title,note;
    public EditText et_title,et_note;
    Button saveButton,backButton;
    boolean valid = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        et_title = findViewById(R.id.addTitle);
        et_note = findViewById(R.id.addNote);
        Context context = CreateNote.this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateNote.this, MainActivity.class);
                startActivity(intent);
            }
        });
         saveButton = findViewById(R.id.save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
               /* Intent intent = new Intent(CreateNote.this, MainActivity.class);
                startActivity(intent);*/
            }
        });
    }
    public void intialise(){
        title = et_title.getText().toString().trim();
        note = et_note.getText().toString().trim();
    }
    public void checkDataEntered() {
        intialise();
        if(!validate()){
            Toast.makeText(this,"Note cannot be added",Toast.LENGTH_SHORT).show();
        }
        else
            onAddNoteSuccess();
    }
    public boolean validate(){
        valid = true;
        if(title.isEmpty()){
            et_title.setError("Title cannot be empty");
            valid=false;
        }
        if(note.isEmpty())
        {
            et_note.setError("Note cannot be empty");
            valid = false;
        }
        return valid;
    }
    public void onAddNoteSuccess() {
        if (valid == true) {
            NoteDbHelper noteDbHelper = new NoteDbHelper(this);
            long var = noteDbHelper.insertDetails(title,note);
            Cursor cursor = noteDbHelper.readDetails();
            while (cursor.moveToNext()) {
                Log.v("Hello", "details: " + cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2));
            }
            if (var != -1) {
                Intent intent = new Intent(CreateNote.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Successfully added", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Unable to add", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
