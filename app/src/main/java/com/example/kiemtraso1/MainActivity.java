package com.example.kiemtraso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonnDangNhap,btndn;
    EditText edtUserName, edtPassWord;
    TextView textsignup;
    CheckBox chkacc;
    String ten,matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        buttonnDangNhap = (Button)findViewById(R.id.dn);
        edtPassWord = (EditText) findViewById(R.id.edpass);
        edtUserName = (EditText) findViewById(R.id.eduser);
        textsignup = findViewById(R.id.txtsignup);
        chkacc = findViewById(R.id.savedn);
        buttonnDangNhap.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "admin";
                String password ="admin";
                if(edtUserName.getText().toString().equals(username) && edtPassWord.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, ListVire.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Tài khoản hoặc mật khẩu không chính xác",Toast.LENGTH_LONG).show();
                }
            }
        }));

        textsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, signup.class);
                startActivity(i);
            }
        });
    }
}