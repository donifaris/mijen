package com.example.mijenhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void mainkuliner(View view) {
        Intent intent = new Intent(MainActivity.this, kuliner.class);
        startActivity(intent);
    }

    public void tematik(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void edukasi(View view) {
        Intent intent = new Intent(MainActivity.this, edukasi.class);
        startActivity(intent);
    }
}
