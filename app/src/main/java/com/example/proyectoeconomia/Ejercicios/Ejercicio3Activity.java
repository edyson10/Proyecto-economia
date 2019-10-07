package com.example.proyectoeconomia.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectoeconomia.R;
import com.example.proyectoeconomia.Solucion.Solucion1Activity;
import com.example.proyectoeconomia.Solucion.Solucion3Activity;

public class Ejercicio3Activity extends AppCompatActivity {

    Button solucion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        solucion = (Button) findViewById(R.id.btnSolucion3);
        solucion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaSolucion();
            }
        });
    }

    private void vistaSolucion(){
        Intent intent = new Intent(getApplicationContext(), Solucion3Activity.class);
        startActivity(intent);
    }
}
