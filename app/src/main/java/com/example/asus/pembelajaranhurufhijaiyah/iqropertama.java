package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iqropertama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqropertama);
    }

    public void movesatuteori(View view) {
        Intent i = new Intent(iqropertama.this, teoripertama.class);
        startActivity(i);
    }

    public void movesatunulis(View view) {
        Intent i = new Intent(iqropertama.this, nulispertama.class);
        startActivity(i);
    }

    public void movesatugame(View view) {
        Intent i = new Intent(iqropertama.this, gamepertama.class);
        startActivity(i);
    }

    public void movesatuqa(View view) {
        Intent i = new Intent(iqropertama.this, qapertama.class);
        startActivity(i);
    }
}
