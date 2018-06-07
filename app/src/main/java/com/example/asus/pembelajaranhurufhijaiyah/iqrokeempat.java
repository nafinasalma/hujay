package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iqrokeempat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqrokeempat);
    }

    public void moveempatteori(View view) {
        Intent i = new Intent(iqrokeempat.this, teorikeempat.class);
        startActivity(i);
    }

    public void moveempatnulis(View view) {
        Intent i = new Intent(iqrokeempat.this, nuliskeempat.class);
        startActivity(i);
    }

    public void moveempatgame(View view) {
        Intent i = new Intent(iqrokeempat.this, gamekeempat.class);
        startActivity(i);
    }

    public void moveempatqa(View view) {
        Intent i = new Intent(iqrokeempat.this, qakeempat.class);
        startActivity(i);
    }
}
