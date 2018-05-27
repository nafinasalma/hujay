package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iqrokedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqrokedua);
    }

    public void moveduateori(View view) {
        Intent i = new Intent(iqrokedua.this, teorikedua.class);
        startActivity(i);
    }

    public void moveduanulis(View view) {
        Intent i = new Intent(iqrokedua.this, nuliskedua.class);
        startActivity(i);
    }

    public void movegamekedua(View view) {
        Intent i = new Intent(iqrokedua.this, gamekedua.class);
        startActivity(i);
    }

    public void moveqakedua(View view) {
        Intent i = new Intent(iqrokedua.this, qakedua.class);
        startActivity(i);
    }
}
