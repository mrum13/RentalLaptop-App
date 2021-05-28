package com.mbeedev.rentop;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mbeedev.rentop.merklaptop.AdapterMerk;
import com.mbeedev.rentop.merklaptop.DataMerk;
import com.mbeedev.rentop.merklaptop.ModelMerk;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private CardView cvAcer,cvLenovo, cvAsus, cvMacbook, cvHp;
    Intent intent1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        rvMerk = (RecyclerView)root.findViewById(R.id.rv_merk);
//        rvMerk.setHasFixedSize(true);
//
//        listMerk.addAll(DataMerk.getListData());
//        linearLayoutMerk = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
//
//        rvMerk.setLayoutManager(linearLayoutMerk);
//        AdapterMerk adapterMerk = new AdapterMerk(getContext(), listMerk);
//        rvMerk.setAdapter(adapterMerk);

        cvAcer = root.findViewById(R.id.cv_acer);
        cvLenovo = root.findViewById(R.id.cv_lenovo);
        cvAsus = root.findViewById(R.id.cv_asus);
        cvMacbook = root.findViewById(R.id.cv_macbook);
//        cvHp = root.findViewById(R.id.cv_HP);

        cvAcer.setOnClickListener(this::onClick);
        cvLenovo.setOnClickListener(this::onClick);
        cvAsus.setOnClickListener(this::onClick);
        cvMacbook.setOnClickListener(this::onClick);
//        cvHp.setOnClickListener(this::onClick);

        intent1 = new Intent(getActivity(), MerkActivity.class);


        return root;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cv_acer:
                intent1.putExtra("merk", "acer");
                startActivity(intent1);
                break;
            case R.id.cv_lenovo:
                intent1.putExtra("merk", "lenovo");
                startActivity(intent1);
                break;
            case R.id.cv_asus:
                intent1.putExtra("merk", "asus");
                startActivity(intent1);
                break;
            case R.id.cv_macbook:
                intent1.putExtra("merk", "macbook");
                startActivity(intent1);
                break;
//            case R.id.cv_HP:
//                intent1.putExtra("merk", "hp");
//                startActivity(intent1);
//                break;
            default:
                break;
        }
    }
}