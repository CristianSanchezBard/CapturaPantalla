package com.example.capturapantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class SegundaPantalla extends AppCompatActivity {

    ImageView imagen;
    int seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        seleccion = getIntent().getIntExtra("eleccion",0);
        Bitmap b=MainActivity.bitmap;
        if(b!= null) {
            if (seleccion == 1) {
                imagen = findViewById(R.id.ivImagen);
                imagen.setImageBitmap(b);
            } else {
                imagen = findViewById(R.id.ivImagen);
                imagen.setImageResource(R.drawable.ibra);
            }
        }
    }
}