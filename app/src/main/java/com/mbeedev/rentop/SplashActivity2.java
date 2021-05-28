package com.mbeedev.rentop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity2 extends AppCompatActivity {
    Button btnGabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        btnGabung = findViewById(R.id.btn_gabung);

        btnGabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keDaftar = new Intent(SplashActivity2.this, DaftarActivity.class);
                startActivity(keDaftar);
            }
        });
    }
}