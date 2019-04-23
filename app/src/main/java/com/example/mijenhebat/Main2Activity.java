package com.example.mijenhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void sawah(View view) {
        Intent intent = new Intent(Main2Activity.this, kampungsawah.class);
        startActivity(intent);
    }

    public void jamu(View view) {
        Intent intent = new Intent(Main2Activity.this, jamu.class);
        startActivity(intent);
    }

    public void sayur(View view) {
        Intent intent = new Intent(Main2Activity.this, sayur.class);
        startActivity(intent);
    }

    public void tape(View view) {
        Intent intent = new Intent(Main2Activity.this, tape.class);
        startActivity(intent);
    }

    public void anggrek(View view) {
        Intent intent = new Intent(Main2Activity.this, anggrek.class);
        startActivity(intent);
    }

    public void naga(View view) {
        Intent intent = new Intent(Main2Activity.this, naga.class);
        startActivity(intent);
    }

    public void mebel(View view) {
        Intent intent = new Intent(Main2Activity.this, mebel.class);
        startActivity(intent);
    }

    public void konveksi(View view) {
        Intent intent = new Intent(Main2Activity.this, konveksi.class);
        startActivity(intent);
    }

    public void besi(View view) {
        Intent intent = new Intent(Main2Activity.this, pandebesi.class);
        startActivity(intent);
    }

    public void durian(View view) {
        Intent intent = new Intent(Main2Activity.this, durian.class);
        startActivity(intent);
    }

    public void jajan(View view) {
        Intent intent = new Intent(Main2Activity.this, jajanan.class);
        startActivity(intent);
    }

    public void buah(View view) {
        Intent intent = new Intent(Main2Activity.this, buah.class);
        startActivity(intent);
    }

    public void anyaman(View view) {
        Intent intent = new Intent(Main2Activity.this, anyaman.class);
        startActivity(intent);
    }

    public void labu(View view) {
        Intent intent = new Intent(Main2Activity.this, labu.class);
        startActivity(intent);
    }
}
