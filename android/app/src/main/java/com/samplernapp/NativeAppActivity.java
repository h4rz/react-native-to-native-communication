package com.samplernapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;

public class NativeAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_app);
        Intent intent = getIntent();
        String userName = "Username : " + intent.getStringExtra("username");
        String password = "Password : " + intent.getStringExtra("password");
        TextView tvUserNamePass = findViewById(R.id.tv_username_pass);
        tvUserNamePass.setText(MessageFormat.format("{0} {1}", userName, password));
    }
}
