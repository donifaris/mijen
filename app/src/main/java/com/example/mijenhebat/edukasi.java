package com.example.mijenhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class edukasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edukasi);
    }

    public void david(View view) {
        Intent intent = new Intent(edukasi.this, campdavid.class);
        startActivity(intent);
    }

    public void gajah(View view) {
        Intent intent = new Intent(edukasi.this, omahgajah.class);
        startActivity(intent);
    }

    public void nirwana(View view) {
        Intent intent = new Intent(edukasi.this, nirwanastable.class);
        startActivity(intent);
    }

    public void pendopo(View view) {
        Intent intent = new Intent(edukasi.this, pendopokinanti.class);
        startActivity(intent);
    }

    public void pawening(View view) {
        Intent intent = new Intent(edukasi.this, paweningjati.class);
        startActivity(intent);
    }

    public void sirkuit(View view) {
        Intent intent = new Intent(edukasi.this, sirkuit.class);
        startActivity(intent);
    }

    public void jatiombo(View view) {
        Intent intent = new Intent(edukasi.this, jatiombo.class);
        startActivity(intent);
    }
}
