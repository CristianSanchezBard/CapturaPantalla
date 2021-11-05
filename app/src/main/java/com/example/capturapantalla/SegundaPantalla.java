package com.example.capturapantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SegundaPantalla extends AppCompatActivity {

    ImageView imagen= findViewById(R.id.ivImagen);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
    }
}