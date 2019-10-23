package com.example.proyectoeconomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectoeconomia.Ejercicios.EjercicioActivity;
import com.example.proyectoeconomia.Solucion.SolucionInteresActivity;

public class EjemplosActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        b1 = (Button) findViewById(R.id.btnPrueba1);
        //b2 = (Button) findViewById(R.id.btnAleatorio2);
        b3 = (Button) findViewById(R.id.btnAleatorio3);
        b4 = (Button) findViewById(R.id.btnAleatorio4);
        b5 = (Button) findViewById(R.id.btnAleatorio5);

        Bundle parmetros = this.getIntent().getExtras();
        final String aleatorio = parmetros.getString("arreglo");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hola: " + aleatorio, Toast.LENGTH_SHORT).show();
            }
        });



        final String []ale = aleatorio.split("-");

        /*
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos(Integer.parseInt(ale[0]));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos(Integer.parseInt(ale[1]));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos(Integer.parseInt(ale[2]));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos(Integer.parseInt(ale[3]));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos(Integer.parseInt(ale[5]));
            }
        });
        */
    }

    private void enviarDatos(int num){
        Intent intent = new Intent(getApplicationContext(), EjercicioActivity.class);
        intent.putExtra("vista", num);
    }
}
