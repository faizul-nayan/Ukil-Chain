package com.tuhin.ukilchain;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mUsernameET;
    private EditText mPasswordET;
    private Button mLoginBtn;
    private Button mCreateAccBtn;
    private TextView mForgetPassTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        mUsernameET = (EditText) findViewById(R.id.userNameET);
        mPasswordET = (EditText) findViewById(R.id.passwordET);
        mLoginBtn = (Button) findViewById(R.id.loginBtn);
        mCreateAccBtn = (Button) findViewById(R.id.createAccBtn);
        mForgetPassTv = (TextView) findViewById(R.id.forgetPasswordTV);



    }

    public void onLoginAttempt(View view) {

        String userName = mUsernameET.getText().toString().trim();
        String password = mPasswordET.getText().toString().trim();

        if(userName.isEmpty() || userName.contentEquals("")){
            mUsernameET.setError("Require");
            mUsernameET.requestFocus();
        }else if(password.isEmpty() || password.contentEquals("")){
            mPasswordET.setError("Require");
            mPasswordET.requestFocus();
        }else{
            validateLogin(userName, password);
        }

    }

    private void validateLogin(String userName, String password){

    }
}
