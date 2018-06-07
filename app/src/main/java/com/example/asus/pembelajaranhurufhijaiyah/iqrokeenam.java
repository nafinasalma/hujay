package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iqrokeenam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqrokeenam);
    }

    public void moveenamteori(View view) {
        Intent i = new Intent(iqrokeenam.this, teorikeenam.class);
        startActivity(i);
    }

    public void moveenamnulis(View view) {
        Intent i = new Intent(iqrokeenam.this, nuliskeenam.class);
        startActivity(i);
    }

    public void moveenamgame(View view) {
        Intent i = new Intent(iqrokeenam.this, gamekeenam.class);
        startActivity(i);
    }

    public void moveenamqa(View view) {
        Intent i = new Intent(iqrokeenam.this, qakeenam.class);
        startActivity(i);
    }
}
