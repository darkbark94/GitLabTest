package com.gitlabtest.darkbark.gitlabtest;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthActivity extends AppCompatActivity implements View.OnClickListener {

    EditText passwordEditText;
    EditText emailEditText;
    Button authenticateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        authenticateButton = (Button) findViewById(R.id.authenticateButton);

        authenticateButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();


        switch (id) {
            case R.id.authenticateButton:

                makeAuth();
                break;


        }
    }


    public void makeAuth() {
        Toast.makeText(this,"makeAuth",Toast.LENGTH_LONG).show();
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
