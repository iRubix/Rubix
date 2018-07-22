package com.example.administrator.rubix;

import android.content.pm.ActivityInfo;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.util.List;

import model.DatabaseHelper;
import model.Login;

public class LoginActivity extends AppCompatActivity {
private EditText txtUserName,txtPassword;
private String userName,password;
private Button btnLogin;
    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;

   private Login user;
   Boolean storedPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        txtUserName=(EditText)findViewById(R.id.txtUserName);
        txtPassword=(EditText)findViewById(R.id.txtPassword);

        mDBHelper = new DatabaseHelper(this);

        try {
           mDBHelper.updateDataBase();
        } catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }

        try {
            mDb = mDBHelper.getWritableDatabase();
        } catch (SQLException mSQLException) {
            throw mSQLException;
        }
    }

    /**
     * called when login button is clicked
     * @param view
     */
    /*public void btnLoginClick(View view) {
       Login(); //call when the login button is clicked to validate inputs
    }

    *//**
     * attempt to Login
     *//*
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

    *//**
     * signing in to Account
     *//*
*//*    private void loginIsValid() {
        user = new Login();
        user.setUserName(userName);
        user.setPassword(password);
        //
        dba = new DatabaseHelper(LoginActivity.this);
        // TODO: Implement your own authentication logic here.
        storedPassword = dba.Authenticate(userName, password);
        if (storedPassword) {
            Toast.makeText(this, "خوش آمدید", Toast.LENGTH_LONG);
            Intent i = new Intent(this, SplashActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "بد آمدید", Toast.LENGTH_LONG);
        }
    }*//*
    *//**
     * validation of inputs
     * @return true if inputs are valid
     *//*
    public boolean validate(){
        boolean valid = true;

        if(userName.isEmpty())
        {
            txtUserName.setError("نام کاربری را وارد نمایید");
            valid=false;

        }
        if(userName.length()>30)
        {
            txtUserName.setError("نام کاربری معتبر نمی باشد");
            valid=false;

        }
        if (password.isEmpty())
        {
            txtPassword.setError("رمز عبور را وارد نمایید");
            valid=false;
        }
        if (password.length()>30)
        {
            txtPassword.setError("رمز عبور معتبر نمی باشد");
            valid=false;
        }


        return valid;
    }

    *//**
     * Initialization of the inputs
     *//*
    public void initialize(){
        userName=txtUserName.getText().toString().trim();
        password=txtPassword.getText().toString().trim();

    }
*/}
