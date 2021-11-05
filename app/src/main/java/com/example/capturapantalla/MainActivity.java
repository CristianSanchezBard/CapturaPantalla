package com.example.capturapantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity {


    static Bitmap bitmap;
    Switch interruptor;
    Button boton;
    int seleccion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=findViewById(R.id.btPresidente);
        interruptor = findViewById(R.id.sActivalo);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!interruptor.isChecked()){
                    seleccion = 1;
                }else{
                    seleccion = 2;
                }
                lanzarVentalla();
            }
        });
    }


    @Override
    protected void onPause() {
        super.onPause();
        View v= getWindow().getDecorView().getRootView();
        v.setDrawingCacheEnabled(true);
        bitmap= Bitmap.createBitmap(v.getDrawingCache());
        v.setDrawingCacheEnabled(false);

    }

    public void lanzarVentalla(){
        Intent lanzar = new Intent(this,SegundaPantalla.class);
        lanzar.putExtra("eleccion",seleccion);
        startActivity(lanzar);

    }


}