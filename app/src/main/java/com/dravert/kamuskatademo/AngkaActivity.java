package com.dravert.kamuskatademo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AngkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(
                getResources().getColor(R.color.red)
        ));

        String[] data = {
               "1", "2", "3"
        };

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, R.layout.list_item_layout, R.id.text_item, data
        );

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position).toString();
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });


















//        String[] mobileArray = {"Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
//                "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas", "Dua Belas"};
//
//        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.layout.list_item_layout, R.id.text_item, mobileArray);
//
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String value = adapter.getItem(position).toString();
//                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
