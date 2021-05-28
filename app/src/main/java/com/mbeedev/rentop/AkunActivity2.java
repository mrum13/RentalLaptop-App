package com.mbeedev.rentop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AkunActivity2 extends AppCompatActivity {
    View viewProfil,viewAlamat;
    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun2);

        viewProfil = findViewById(R.id.view_profile);
        viewAlamat = findViewById(R.id.view_alamat);
        imgBack = findViewById(R.id.ic_back_akun);

        viewProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ubahProfil = new Intent(AkunActivity2.this, UbahProfilActivity.class);
                startActivity(ubahProfil);
            }
        });

        viewAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ubahAlamat = new Intent(AkunActivity2.this, AlamatActivity.class);
                startActivity(ubahAlamat);
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}