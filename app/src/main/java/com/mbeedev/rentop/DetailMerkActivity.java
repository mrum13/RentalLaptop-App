package com.mbeedev.rentop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMerkActivity extends AppCompatActivity {
    private ImageView img_Back,imgPesan,imgKeranjang,imgDetailLaptop;
    private TextView namaDetail,isiDetail;
    private Button btnSewakan;

    String nama_detail,isi_detail;
    int image_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_merk);

        namaDetail = findViewById(R.id.nama_detail_laptop);
        isiDetail = findViewById(R.id.tv_spek_detail);
        imgPesan = findViewById(R.id.btn_pesan);
        imgKeranjang = findViewById(R.id.btn_keranjang);
        imgDetailLaptop = findViewById(R.id.gambar_detail_laptop);
        btnSewakan = findViewById(R.id.btn_sewa);

        img_Back = findViewById(R.id.ic_back_detail);

        img_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSewakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailMerkActivity.this, SewaActivity.class);
                intent.putExtra("nama_laptop", nama_detail);
                intent.putExtra("gambar_laptop", image_detail);
                startActivity(intent);
            }
        });

        imgPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailMerkActivity.this, MainActivity.class);
                intent.putExtra("pesan", "pesan");
                startActivity(intent);
            }
        });

        imgKeranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailMerkActivity.this, MainActivity.class);
                intent.putExtra("keranjang", "keranjang");
                startActivity(intent);
            }
        });

        if(getIntent().hasExtra("nama_laptop") && getIntent().hasExtra("gambar_laptop") && getIntent().hasExtra("detail_laptop")) {
            nama_detail = getIntent().getStringExtra("nama_laptop");
            isi_detail = getIntent().getStringExtra("detail_laptop");
            image_detail = getIntent().getIntExtra("gambar_laptop", 1);

            setDetail(nama_detail, isi_detail, image_detail);
        }
    }

    private void setDetail(String nama, String isi, int img){
        namaDetail.setText(nama);
        isiDetail.setText(isi);

        Glide.with(DetailMerkActivity.this).load(img).into(imgDetailLaptop);
    }
}