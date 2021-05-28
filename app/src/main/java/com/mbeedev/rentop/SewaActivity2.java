package com.mbeedev.rentop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SewaActivity2 extends AppCompatActivity {
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa2);

        btnOk = findViewById(R.id.btn_ok);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SewaActivity2.this, MainActivity.class);
                intent.putExtra("ok", "ok");
                startActivity(intent);
            }
        });
    }
}