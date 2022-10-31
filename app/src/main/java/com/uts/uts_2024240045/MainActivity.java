package com.uts.uts_2024240045;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNamaLeng,etNomorpe;
    private CheckBox checkBoxconfir;
    private Spinner spinner1;
    private Button btn;
    private String nama,nomorpendaftaran,spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNamaLeng= findViewById(R.id.et_namalengkap);
        etNomorpe     = findViewById(R.id.et_noped);
        checkBoxconfir  = findViewById(R.id.checkbox_Confirm);
        spinner1      = findViewById(R.id.Spinner1);
        btn      = findViewById(R.id.btn_dfr);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = etNamaLeng.getText().toString();
                nomorpendaftaran = etNomorpe.getText().toString();
                spinner          =  spinner1.getSelectedItem().toString();
                if(nomorpendaftaran.trim().equals("")){
                    etNomorpe. setError("Set error!");
                }
                else if (nama.trim().equals("")){
                    etNamaLeng. setError("Set error!");
                }
                else if (spinner.trim().equals("jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "pilih jalur pendaftaran!", Toast.LENGTH_SHORT).show();
                }
                else if (!(checkBoxconfir.isChecked())){
                    Toast.makeText(MainActivity.this, "check box belum dicentang", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new
                            Intent(MainActivity.this, dua.class);
                    intent.putExtra("vrNama", nama);
                    intent.putExtra("vrNoPend", nomorpendaftaran);
                    intent.putExtra("varSpinr", spinner);
                    startActivity(intent);
                }
            }
        });




    }
}

