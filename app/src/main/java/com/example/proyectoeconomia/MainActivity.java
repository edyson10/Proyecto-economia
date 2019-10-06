package com.example.proyectoeconomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button interesSimple, interesCompuesto, anualidades, gradiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interesSimple = (Button) findViewById(R.id.btnInteresSimple);
        interesCompuesto = (Button) findViewById(R.id.btnInteresCompueto);
        anualidades = (Button) findViewById(R.id.btnAnualidades);
        gradiente = (Button) findViewById(R.id.btnGradientes);

        interesSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaInteresSimple();
            }
        });

        interesCompuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaInteresCompuesto();
            }
        });

        anualidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaAnualidades();
            }
        });

        gradiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaGradiente();
            }
        });
    }

    private void vistaInteresSimple(){
        Intent intent = new Intent(getApplicationContext(), InteresSimpleActivity.class);
        startActivity(intent);
    }

    private void vistaInteresCompuesto(){
        Toast.makeText(getApplicationContext(), "Opcion aún no disponible", Toast.LENGTH_SHORT).show();
    }

    private void vistaAnualidades(){
        Toast.makeText(getApplicationContext(), "Opcion aún no disponible", Toast.LENGTH_SHORT).show();
    }

    private void vistaGradiente(){
        Toast.makeText(getApplicationContext(), "Opcion aún no disponible", Toast.LENGTH_SHORT).show();
    }
}
