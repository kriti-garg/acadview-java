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
        Context context = Dashboard.this;
        SharedPreferences sharedPreferences = context.getSharedPreferences(LoginActivity.MyPREFERENCES, Context.MODE_PRIVATE);

        //SharedPreferences sharedPreferences = this.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPreferences.edit();
        String var = sharedPreferences.getString(LoginActivity.Name,"");
        String[] vals = regDbHelper.fetchData(var);
        Log.v("id", vals[0]);
        Log.v("Email", vals[1]);
        Log.v("Name", vals[2]);

        // int result = regDbHelper.verifyLogin(et_username,et_password);
    }
}
