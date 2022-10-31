package com.uts.uts_2024240045;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class dua extends AppCompatActivity {
    TextView tvNamaLengkap, tvNoPendaftaran, tvJalurp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        tvNamaLengkap = findViewById(R.id.tv_namapel);
        tvNoPendaftaran = findViewById(R.id.tv_no_pendaf);
        tvJalurp = findViewById(R.id.tv_jalur);

        Intent ambil = getIntent();
        tvNamaLengkap.setText(ambil.getStringExtra("vrNama"));
        tvNoPendaftaran.setText(ambil.getStringExtra("vrNoPend"));
        tvJalurp.setText(ambil.getStringExtra("varSpinr"));
    }
}