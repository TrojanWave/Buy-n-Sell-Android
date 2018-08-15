package com.zacseed.buynsell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpDateGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {
    public static String email;
    public static String pwd;
    public static String WvSwitch = "login";

    private String link;

    Intent loginToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginToHome = new Intent(this,MainActivity.class);
        final Intent loginToCreateAccount = new Intent(LoginActivity.this,CreateAccountActivity.class);

        Button btnGoToCreateAcc = (Button) findViewById(R.id.btnGoToCreateAcc);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextEmail = (EditText) findViewById(R.id.loginEmail);
                EditText editTextPwd = (EditText) findViewById(R.id.loginPwd);

                email = editTextEmail.getText().toString();
                pwd = editTextPwd.getText().toString();

                startActivity(loginToHome);
            }
        });

        btnGoToCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginToCreateAccount);
            }
        });


    }
}
