package com.example.mijenhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kuliner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);
    }

    public void sekopek(View view) {
        Intent intent = new Intent(kuliner.this, sekopek.class);
        startActivity(intent);
    }

    public void gs(View view) {
        Intent intent = new Intent(kuliner.this, gebyarsumiah.class);
        startActivity(intent);
    }

    public void pasar(View view) {
        Intent intent = new Intent(kuliner.this, pasar.class);
        startActivity(intent);
    }

    public void nirwana(View view) {
        Intent intent = new Intent(kuliner.this, nirwanastable.class);
        startActivity(intent);
    }

    public void gama(View view) {
        Intent intent = new Intent(kuliner.this, gamaresto.class);
        startActivity(intent);
    }

    public void lakers(View view) {
        Intent intent = new Intent(kuliner.this, lakers.class);
        startActivity(intent);
    }
}
