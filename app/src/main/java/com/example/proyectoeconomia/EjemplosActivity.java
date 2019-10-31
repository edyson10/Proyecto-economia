package com.example.proyectoeconomia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos);

        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        b1 = (Button) findViewById(R.id.btnPrueba1);
        b2 = (Button) findViewById(R.id.btnAleatorio2);
        b3 = (Button) findViewById(R.id.btnAleatorio3);
        b4 = (Button) findViewById(R.id.btnAleatorio4);
        b5 = (Button) findViewById(R.id.btnAleatorio5);

        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);


        Bundle parmetros = this.getIntent().getExtras();
        final String aleatorio = parmetros.getString("aleatorio");
        //Toast.makeText(getApplicationContext(), "Numero aleatorios: " + aleatorio, Toast.LENGTH_SHORT).show();
        final String []ale = aleatorio.split("-");
        numerosAleatorios(ale);

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
                enviarDatos(Integer.parseInt(ale[4]));
            }
        });
    }

    private void enviarDatos(int numero) {
        Intent intent = new Intent(getApplicationContext(), EjercicioActivity.class);
        intent.putExtra("alea", numero);
        startActivity(intent);
    }

    private void numerosAleatorios(String []ale){
        int tamano = ale.length;
        switch (tamano){
            case 1:
                b1.setText(ale[0].toString());
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
                break;
            case 2:
                b1.setText(ale[0].toString());
                b2.setText(ale[1].toString());
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
                break;
            case 3:
                b1.setText(ale[0].toString());
                b2.setText(ale[1].toString());
                b3.setText(ale[2].toString());
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
                break;
            case 4:
                b1.setText(ale[0].toString());
                b2.setText(ale[1].toString());
                b3.setText(ale[2].toString());
                b4.setText(ale[3].toString());
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.INVISIBLE);
                break;
            case 5:
                b1.setText(ale[0].toString());
                b2.setText(ale[1].toString());
                b3.setText(ale[2].toString());
                b4.setText(ale[3].toString());
                b5.setText(ale[4].toString());
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                break;
            default:Toast.makeText(getApplicationContext(), "No pueden haber más de 5 numeros", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
