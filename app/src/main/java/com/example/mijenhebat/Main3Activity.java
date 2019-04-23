package com.example.mijenhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void kebunanggrek(View view) {
        Intent intent = new Intent(Main3Activity.this, kebunanggrek.class);
        startActivity(intent);
    }

    public void nirwana(View view) {
        Intent intent = new Intent(Main3Activity.this, nirwanastable.class);
        startActivity(intent);
    }

    public void dandang(View view) {
        Intent intent = new Intent(Main3Activity.this, sodong.class);
        startActivity(intent);
    }
}
