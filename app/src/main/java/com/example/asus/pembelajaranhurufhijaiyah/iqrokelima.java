package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iqrokelima extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqrokelima);
    }

    public void movelimateori(View view) {
        Intent i = new Intent(iqrokelima.this, teorikelima.class);
        startActivity(i);
    }

    public void movelimanulis(View view) {
        Intent i = new Intent(iqrokelima.this, nuliskelima.class);
        startActivity(i);
    }

    public void movelimagame(View view) {
        Intent i = new Intent(iqrokelima.this, gamekelima.class);
        startActivity(i);
    }

    public void movelimaqa(View view) {
        Intent i = new Intent(iqrokelima.this, qakelima.class);
        startActivity(i);
    }
}
