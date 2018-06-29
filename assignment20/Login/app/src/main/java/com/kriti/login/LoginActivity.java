package com.kriti.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kriti.login.data.RegDbHelper;

/**
 * Created by kriti on 28/6/18.
 */

public class LoginActivity extends AppCompatActivity {
    public String et_username,et_password;
    public EditText username;
    private EditText password;
    boolean valid = true;
    SharedPreferences sharedPreferences;
    public static final String MyPREFERENCES = "Session" ;
    public static final String Name = "nameKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Button button = findViewById(R.id.Login);
        Context context = LoginActivity.this;
        sharedPreferences = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });
        Button reg = findViewById(R.id.Register);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void intialise(){
        et_username = username.getText().toString().trim();
        et_password = password.getText().toString().trim();
    }
    public void checkDataEntered() {
        intialise();
        if(!validate()){
            Toast.makeText(this,"Login has failed",Toast.LENGTH_SHORT).show();
        }
        else
            onSignUpSuccess();
    }
    public boolean validate(){
        valid =true;
        if(et_username.isEmpty()||username.length()>32){
            username.setError("Please enter valid username");
            valid=false;
        }
        if(et_password.isEmpty())
        {
            password.setError("Please enter the password");
            valid = false;
        }
        return valid;
    }
    public void onSignUpSuccess(){
        if(valid==true){
            Log.i("username", et_username);
            Log.i("password", et_password);
            RegDbHelper regDbHelper = new RegDbHelper(this);
            int result = regDbHelper.verifyLogin(et_username,et_password);
            Cursor cursor = regDbHelper.readDetails();
            while (cursor.moveToNext()) {
                Log.v("Hello", "details: " + cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2)
                        + " " + cursor.getString(3));
            }
           if(result==0){
               Toast.makeText(getApplicationContext(),"Invalid username",Toast.LENGTH_SHORT).show();
           }
           else if(result==1){
               Toast.makeText(getApplicationContext(),"Invalid password",Toast.LENGTH_SHORT).show();
           }
           else if(result==2){
               Toast.makeText(getApplicationContext(), "Logged In successfully", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(LoginActivity.this, Dashboard.class);
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putString(Name,  et_username);
               editor.commit();
               startActivity(intent);
           }
           Log.isLoggable("result" ,result);
        }
    }

}
