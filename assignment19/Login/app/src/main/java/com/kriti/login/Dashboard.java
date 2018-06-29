package com.kriti.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
//import com.kriti.login.LoginActivity.;

import com.kriti.login.data.RegDbHelper;

/**
 * Created by kriti on 29/6/18.
 */

public class Dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RegDbHelper regDbHelper = new RegDbHelper(this);
        SharedPreferences sharedPreferences = this.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPreferences.edit();
       String var = sharedPreferences.getString("UName", "");
      // regDbHelper.fetchData(var);
        Log.v("var",var);
       /* editor.putString("UName", email);
        editor.putString("Password", password);
        editor.commit();
        return sharedPreferences.getString("Email", "");*/

        // int result = regDbHelper.verifyLogin(et_username,et_password);
    }
}
