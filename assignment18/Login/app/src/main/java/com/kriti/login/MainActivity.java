package com.kriti.login;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/*
    EditText name = findViewById(R.id.Name);
    EditText email = findViewById(R.id.E_mail);
    EditText password = findViewById(R.id.password);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "registered", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

   /* boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email)) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return (TextUtils.isEmpty(str));
    }

    void checkDataEntered() {
        if (isEmpty(name)) {
            Toast.makeText(this, "You must enter name to register!!", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(phone)) {
            phone.setError("address is required");
        }
        if (isEmail(email) == false) {
            email.setError("enter a valid email id");
        }
        if (isEmpty(password)){
            password.setError("password cannot be empty");
        }
        if(password == repassword) {
        }
        else password.setError("both not same");
        }*/



