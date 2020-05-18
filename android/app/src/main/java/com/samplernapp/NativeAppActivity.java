package com.samplernapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

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

        AppCompatButton btn = findViewById(R.id.btn_eg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NativeAppActivity.this, ExampleActivity.class));
            }
        });
    }
}
