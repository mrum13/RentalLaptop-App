package com.mbeedev.rentop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mbeedev.rentop.merklaptop.AdapterMerk;
import com.mbeedev.rentop.merklaptop.DataMerk;
import com.mbeedev.rentop.merklaptop.ModelMerk;

import java.util.ArrayList;

public class MerkActivity extends AppCompatActivity {
    private RecyclerView rvMerk;
    private ArrayList<ModelMerk> listMerk = new ArrayList<ModelMerk>();
    private LinearLayoutManager linearLayoutMerk;
    private String merkLaptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merk);

        rvMerk = (RecyclerView)findViewById(R.id.rv_merk);
        rvMerk.setHasFixedSize(true);

        if (getIntent().hasExtra("merk")){
            merkLaptop = getIntent().getStringExtra("merk");

            if (merkLaptop.equals("acer")){
                listMerk.addAll(DataMerk.getListDataAcer());
            } else if (merkLaptop.equals("lenovo")){
                listMerk.addAll(DataMerk.getListDataLenovo());
            } else if (merkLaptop.equals("asus")){
                listMerk.addAll(DataMerk.getListDataAsus());
            } else if (merkLaptop.equals("macbook")){
                listMerk.addAll(DataMerk.getListDataMacbook());
            }

            linearLayoutMerk = new LinearLayoutManager(MerkActivity.this);

            rvMerk.setLayoutManager(linearLayoutMerk);
            AdapterMerk adapterMerk = new AdapterMerk(MerkActivity.this, listMerk);
            rvMerk.setAdapter(adapterMerk);
        }
    }
}