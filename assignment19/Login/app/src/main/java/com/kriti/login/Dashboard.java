package com.kriti.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
//import com.kriti.login.LoginActivity.;

import com.kriti.login.data.RegDbHelper;

import org.w3c.dom.Text;

/**
 * Created by kriti on 29/6/18.
 */

public class Dashboard extends AppCompatActivity {

    public TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        RegDbHelper regDbHelper = new RegDbHelper(this);
        Context context = Dashboard.this;
        SharedPreferences sharedPreferences = context.getSharedPreferences(LoginActivity.MyPREFERENCES, Context.MODE_PRIVATE);
        String var = sharedPreferences.getString(LoginActivity.Name,"");
        String[] vals = regDbHelper.fetchData(var);
        String result = "User id:" + vals[0] + "\nName: " + vals[2] + "\nEmail: " + vals[1]
                + "\nPhone Number: " + vals[3];
        text = (TextView) findViewById(R.id.textview);
        text.setText(result);
        Log.v("id", vals[0]);
        Log.v("Email", vals[1]);
        Log.v("Name", vals[2]);
    }
}
