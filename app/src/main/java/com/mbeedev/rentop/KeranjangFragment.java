package com.mbeedev.rentop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class KeranjangFragment extends Fragment {
    private TextView btnTambah, btnKurang, tvAngka, subTotal;
    private int angkanya;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_keranjang, container, false);

        btnKurang = root.findViewById(R.id.btn_kurang);
        btnTambah = root.findViewById(R.id.btn_tambah);
        tvAngka = root.findViewById(R.id.angka);
        subTotal = root.findViewById(R.id.subtotal);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkanya = Integer.parseInt(tvAngka.getText().toString().trim());
                angkanya++;
                tvAngka.setText(Integer.toString(angkanya));
                angkanya = angkanya * 250000;

                subTotal.setText(Integer.toString(angkanya));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkanya = Integer.parseInt(tvAngka.getText().toString().trim());
                angkanya--;
                tvAngka.setText(Integer.toString(angkanya));

                if (angkanya<0){
                    tvAngka.setText("0");
                }

                angkanya = angkanya * 250000;
                subTotal.setText(Integer.toString(angkanya));

            }
        });

        return root;
    }
}