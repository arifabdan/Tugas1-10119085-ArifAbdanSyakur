package com.example.tugas1_10119085_arifabdansyakur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        Button lgn = (Button) findViewById(R.id.login);
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Login.this, Home.class);
                startActivity(i1);
            }
        });

        Button rgs = (Button) findViewById(R.id.register);
        rgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Login.this, Register.class);
                startActivity(i2);
            }
        });

    }
}