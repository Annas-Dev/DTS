package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txthasil;
    Button satu, nol, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, tambah, kurang, kali, bagi, clear, samadengan;
    public static double nilaisekarang =0;
    public static String operasisekarang ="";
    public static double hasil ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txthasil = findViewById(R.id.tvhasil);
        nol = findViewById(R.id.btnnol);
        nol.setOnClickListener(this);
        satu = findViewById(R.id.btn1);
        satu.setOnClickListener(this);
        dua = findViewById(R.id.btn2);
        dua.setOnClickListener(this);
        tiga = findViewById(R.id.btn3);
        tiga.setOnClickListener(this);
        empat = findViewById(R.id.btn4);
        empat.setOnClickListener(this);
        lima = findViewById(R.id.btn5);
        lima.setOnClickListener(this);
        enam = findViewById(R.id.btn6);
        enam.setOnClickListener(this);
        tujuh = findViewById(R.id.btn7);
        tujuh.setOnClickListener(this);
        delapan = findViewById(R.id.btn8);
        delapan.setOnClickListener(this);
        sembilan = findViewById(R.id.btn9);
        sembilan.setOnClickListener(this);
        tambah = findViewById(R.id.btntambah);
        tambah.setOnClickListener(this);
        kurang = findViewById(R.id.btnkurang);
        kurang.setOnClickListener(this);
        kali = findViewById(R.id.btnkali);
        kali.setOnClickListener(this);
        bagi = findViewById(R.id.btnbagi);
        bagi.setOnClickListener(this);
        clear = findViewById(R.id.btnclear);
        clear.setOnClickListener(this);
        samadengan = findViewById(R.id.btnsamadengan);
        samadengan.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnnol:
                txthasil.setText(txthasil.getText().toString().trim()+"0");
                break;
            case R.id.btn1:
            txthasil.setText(txthasil.getText().toString().trim()+"1");
            break;

            case R.id.btn2:
                txthasil.setText(txthasil.getText().toString().trim()+"2");
                break;

            case R.id.btn3:
                txthasil.setText(txthasil.getText().toString().trim()+"3");
                break;

            case R.id.btn4:
                txthasil.setText(txthasil.getText().toString().trim()+"4");
                break;

            case R.id.btn5:
                txthasil.setText(txthasil.getText().toString().trim()+"5");
                break;

            case R.id.btn6:
                txthasil.setText(txthasil.getText().toString().trim()+"6");
                break;

            case R.id.btn7:
                txthasil.setText(txthasil.getText().toString().trim()+"7");
                break;

            case R.id.btn8:
                txthasil.setText(txthasil.getText().toString().trim()+"8");
                break;

            case R.id.btn9:
                txthasil.setText(txthasil.getText().toString().trim()+"9");
                break;



            case R.id.btntambah:
                if (txthasil.getText().toString().trim().equals("")){
                    Toast.makeText(this, "input tidak valid",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "tambah";
                nilaisekarang = Double.parseDouble(txthasil.getText().toString());
                txthasil.setText("");
                break;

            case R.id.btnkurang:
                if (txthasil.getText().toString().trim().equals("")){
                    Toast.makeText(this, "input tidak valid",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "kurang";
                nilaisekarang = Double.parseDouble(txthasil.getText().toString());
                txthasil.setText("");
                break;

            case R.id.btnkali:
                if (txthasil.getText().toString().trim().equals("")){
                    Toast.makeText(this, "input tidak valid",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "kali";
                nilaisekarang = Double.parseDouble(txthasil.getText().toString());
                txthasil.setText("");
                break;

            case R.id.btnbagi:
                if (txthasil.getText().toString().trim().equals("")){
                    Toast.makeText(this, "input tidak valid",Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "bagi";
                nilaisekarang = Double.parseDouble(txthasil.getText().toString());
                txthasil.setText("");
                break;

            case R.id.btnclear:
                nilaisekarang=0;
                txthasil.setText("");
                break;
            case R.id.btnsamadengan:
                if (operasisekarang.equals("tambah")){
                    hasil = nilaisekarang+Double.parseDouble(txthasil.getText().toString().trim());
                }

                if (operasisekarang.equals("kurang")){
                    hasil= nilaisekarang-Double.parseDouble(txthasil.getText().toString().trim());
                }

                if (operasisekarang.equals("kali")){
                    hasil= nilaisekarang*Double.parseDouble(txthasil.getText().toString().trim());
                }

                if (operasisekarang.equals("bagi")){
                    hasil= nilaisekarang/Double.parseDouble(txthasil.getText().toString().trim());
                }

                int nilaiTemp = (int) hasil;
                if (nilaiTemp == hasil){
                    txthasil.setText(String.valueOf((int)hasil));
                }else {
                    txthasil.setText(String.valueOf(hasil));
                }
                break;
        }

    }
}
