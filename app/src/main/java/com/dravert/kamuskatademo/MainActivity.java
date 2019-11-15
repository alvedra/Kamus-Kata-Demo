package com.dravert.kamuskatademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAngka, btnWarna, btnKeluarga, btnBenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAngka = findViewById(R.id.button_angka);
        btnWarna = findViewById(R.id.button_warna);
        btnKeluarga = findViewById(R.id.button_keluarga);
        btnBenda = findViewById(R.id.button_benda);

        btnAngka.setOnClickListener(this);
        btnWarna.setOnClickListener(this);
        btnKeluarga.setOnClickListener(this);
        btnBenda.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_angka:
                Intent intent = new Intent(MainActivity.this, AngkaActivity.class);
                startActivity(intent);
                break;
            case R.id.button_warna:
                Intent intent2 = new Intent(MainActivity.this, WarnaActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_keluarga:
                Intent intent3 = new Intent(MainActivity.this, KeluargaActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_benda:
                Intent intent4 = new Intent(MainActivity.this, BendaActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
