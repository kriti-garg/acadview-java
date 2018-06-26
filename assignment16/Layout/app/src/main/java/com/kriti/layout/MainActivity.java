package com.kriti.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t  = Toast.makeText(this,"I am a toast",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
}
