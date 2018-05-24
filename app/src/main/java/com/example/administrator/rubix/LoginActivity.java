package com.example.administrator.rubix;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.ErrorManager;

public class LoginActivity extends AppCompatActivity {
private EditText txtUserName,txtPassword;
private String userName,password;
private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        txtUserName=(EditText)findViewById(R.id.txtUserName);
        txtPassword=(EditText)findViewById(R.id.txtPassword);



    }

    /**
     * called when login button is clicked
     * @param view
     */
    public void btnLoginClick(View view) {
       Login(); //call when the login button is clicked to validate inputs
    }

    /**
     * attempt to Login
     */
    public void Login(){
        initialize();

        if(!validate())
        {
            Toast.makeText(this , "اطلاعات وارد شده اشتباه می باشد",Toast.LENGTH_LONG);
        }
        else{
            loginIsValid();
        }
    }

    /**
     * signing in to Account
     */
    private void loginIsValid() {
        // فعلا به صفحه بعدی برود

        Intent i=new Intent(this,SplashActivity.class);
        startActivity(i);



    }

    /**
     * validation of inputs
     * @return true if inputs are valid
     */
    public boolean validate(){
        boolean valid = true;

        if(userName.isEmpty()||userName.length()>30)
        {
            txtUserName.setError("نام کاربری را وارد نمایید");
            valid=false;

        }
        if (password.isEmpty()||password.length()>30)
        {
            txtPassword.setError("رمز عبور را وارد نمایید");
            valid=false;
        }


        return valid;
    }

    /**
     * Initialization of the inputs
     */
    public void initialize(){
        userName=txtUserName.getText().toString().trim();
        password=txtPassword.getText().toString().trim();
    }
}
