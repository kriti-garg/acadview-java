package com.kriti.login;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
   private String et_name,et_mail,et_phone,et_password,c_password;
    boolean valid =true;
   private EditText name,email,phone,password,cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sharedPreferences = this.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        name = (EditText) findViewById(R.id.et_name);
        email = findViewById(R.id.et_mail);
        phone = findViewById(R.id.et_phone);
        password = findViewById(R.id.et_password);
        cpassword = findViewById(R.id.c_password);
        Button button = findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
                sharedPreferences.edit().putString("username","xyz").apply();
                et_name= sharedPreferences.getString("username","");
                et_mail= sharedPreferences.getString("email","");
                et_phone= sharedPreferences.getString("phone","");
                et_password = sharedPreferences.getString("password","");
                Log.i("clicked",et_mail);
            }
        });}
        public void intialise(){
            et_name = name.getText().toString().trim();
            et_mail = email.getText().toString().trim();
            et_phone = phone.getText().toString().trim();
            et_password = password.getText().toString().trim();
            c_password = cpassword.getText().toString().trim();
        }
   public void checkDataEntered() {
        intialise();
        if(!validate()){
             Toast.makeText(this,"Signup has failed",Toast.LENGTH_SHORT).show();
        }
        else
            onSignUpSuccess();
    }
    public boolean validate(){
        valid =true;
            if(et_name.isEmpty()||name.length()>32){
                name.setError("Please enter valid name");
                valid=false;
            }
            if(et_mail.isEmpty() ||!Patterns.EMAIL_ADDRESS.matcher(et_mail).matches()){
                email.setError("Please enter valid email address");
                valid = false;
            }
            if(!et_password.equals(c_password) || et_password==""||c_password=="")
            {
                password.setError("Passwords don't match");
                valid = false;
            }
            return valid;
    }
    public void onSignUpSuccess(){
          if(valid == true )
          {
              Intent intent = new Intent(MainActivity.this, LoginActivity.class);
              startActivity(intent);
              Toast.makeText(getApplicationContext(), "registered", Toast.LENGTH_SHORT).show();
          }
    }

}

