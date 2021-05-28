package com.mbeedev.rentop;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AkunFragment extends Fragment {
    TextView tvAkun;
    Button btnKeluar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_akun, container, false);

        tvAkun = root.findViewById(R.id.text_akun);
        btnKeluar = root.findViewById(R.id.btn_keluar);

        tvAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pengaturanAkun = new Intent(getActivity(), AkunActivity2.class);
                startActivity(pengaturanAkun);
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPrefManager.getInstance(getActivity()).clear();
                Intent intent = new Intent(getActivity(), DaftarActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        return root;
    }
}