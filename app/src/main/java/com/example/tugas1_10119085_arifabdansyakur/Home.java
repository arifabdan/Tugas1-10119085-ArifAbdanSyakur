package com.example.tugas1_10119085_arifabdansyakur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//21-4-2022,Arif Abdan Syakur,10119085,IF-3
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        Button prf = (Button) findViewById(R.id.profile);
        prf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Profile.class);
                startActivity(i);
            }
        });

        Button lgt = (Button) findViewById(R.id.Logout);
        lgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Home.this, Login.class);
                startActivity(i2);
            }
        });

    }
}