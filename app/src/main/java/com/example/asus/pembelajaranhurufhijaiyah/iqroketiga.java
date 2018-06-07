package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iqroketiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqroketiga);
    }

    public void movetigateori(View view) {
        Intent i = new Intent(iqroketiga.this, teoriketiga.class);
        startActivity(i);
    }

    public void movetiganulis(View view) {
        Intent i = new Intent(iqroketiga.this, nulisketiga.class);
        startActivity(i);
    }

    public void movetigagame(View view) {
        Intent i = new Intent(iqroketiga.this, gameketiga.class);
        startActivity(i);
    }

    public void movetigaqa(View view) {
        Intent i = new Intent(iqroketiga.this, qaketiga.class);
        startActivity(i);
    }
}