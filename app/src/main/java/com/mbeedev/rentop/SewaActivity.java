package com.mbeedev.rentop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SewaActivity extends AppCompatActivity {
    private ImageView imgLaptop;
    private TextView tvSewa;
    private String nama_detail_sewa1;
    private int gambar_detail_sewa1;
    private Button btnSewami;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa);

        imgLaptop = findViewById(R.id.gambar_merk);
        tvSewa = findViewById(R.id.tv_card);
        btnSewami = findViewById(R.id.btn_sewami);

        btnSewami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SewaActivity.this, SewaActivity2.class);
//                intent.putExtra("nama_laptop", nama_detail);
//                intent.putExtra("gambar_laptop", image_detail);
                startActivity(intent);
            }
        });

        if(getIntent().hasExtra("nama_laptop") && getIntent().hasExtra("gambar_laptop")) {
            nama_detail_sewa1 = getIntent().getStringExtra("nama_laptop");
            gambar_detail_sewa1 = getIntent().getIntExtra("gambar_laptop", 1);

            tvSewa.setText(nama_detail_sewa1);
            Glide.with(SewaActivity.this).load(gambar_detail_sewa1).into(imgLaptop);

        }
    }
}