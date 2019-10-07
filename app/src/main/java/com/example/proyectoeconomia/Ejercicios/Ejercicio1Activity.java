package com.example.proyectoeconomia.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectoeconomia.R;
import com.example.proyectoeconomia.Solucion.Solucion1Activity;

public class Ejercicio1Activity extends AppCompatActivity {

    Button solucion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        solucion = (Button) findViewById(R.id.btnSolucion1);
        solucion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaSolucion();
            }
        });
    }

    private void vistaSolucion(){
        Intent intent = new Intent(getApplicationContext(), Solucion1Activity.class);
        startActivity(intent);
    }
}
