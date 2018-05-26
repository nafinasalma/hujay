package com.example.asus.pembelajaranhurufhijaiyah;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView txt = (TextView) findViewById(R.id.custom_font);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/comic.ttf");
        txt.setTypeface(font);
        TextView txt1 = (TextView) findViewById(R.id.font_custom);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/comic.ttf");
        txt.setTypeface(font);
    }

    public void pindahsatu(View view) {
        Intent i = new Intent(home.this, iqropertama.class);
        startActivity(i);
    }

    public void pindahdua(View view) {
        Intent i = new Intent(home.this, iqrokedua.class);
        startActivity(i);
    }

    public void pindahtiga(View view) {
        Intent i = new Intent(home.this, iqroketiga.class);
        startActivity(i);
    }

    public void pindahempat(View view) {
        Intent i = new Intent(home.this, iqrokeempat.class);
        startActivity(i);
    }

    public void pindahlima(View view) {
        Intent i = new Intent(home.this, iqrokelima.class);
        startActivity(i);
    }

    public void pindahenam(View view) {
        Intent i = new Intent(home.this, iqrokeenam.class);
        startActivity(i);
    }
}
