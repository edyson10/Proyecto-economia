package com.example.proyectoeconomia.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectoeconomia.R;
import com.example.proyectoeconomia.Solucion.Solucion5Activity;
import com.example.proyectoeconomia.Solucion.Solucion6Activity;

public class Ejercicio7Activity extends AppCompatActivity {

    Button solucion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        solucion = (Button) findViewById(R.id.btnSolucion7);
        solucion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaSolucion();
            }
        });
    }

    private void vistaSolucion(){
        Intent intent = new Intent(getApplicationContext(), Solucion6Activity.class);
        startActivity(intent);
    }
}
