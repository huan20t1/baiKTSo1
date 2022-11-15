package com.example.kiemtraso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    TextView textlogin;
    Button btnsignup, btnclose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();

        textlogin = findViewById(R.id.txtlogin);
        btnclose = findViewById(R.id.btclose);
        btnsignup = findViewById(R.id.btsignup);
        textlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signup.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signup.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signup.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}