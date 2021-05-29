package com.mbeedev.rentop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());
        BottomNavigationView navView =findViewById(R.id.bn_main);

        if(getIntent().hasExtra("pesan")) {
            loadFragment(new PesanFragment());
            navView.setSelectedItemId(R.id.navigation_pesan);
//            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
        }else if(getIntent().hasExtra("keranjang")) {
            navView.setSelectedItemId(R.id.navigation_keranjang);
            loadFragment(new KeranjangFragment());
        } else if(getIntent().hasExtra("ok")) {

            loadFragment(new HomeFragment());
        }

        navView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        fragment = null;
        //switch case fragment{}
        switch (item.getItemId()){
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;
            case R.id.navigation_keranjang:
                fragment = new KeranjangFragment();
                break;
            case R.id.navigation_pesan:
                fragment = new PesanFragment();
                break;
            case R.id.navigation_akun:
                fragment = new AkunFragment()   ;
                break;
        }
        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
            return true;
        }
        return false;
    }
}