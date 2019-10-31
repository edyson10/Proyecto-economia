package com.example.proyectoeconomia;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button interesSimple, interesCompuesto, anualidades, gradiente;
    private EditText numero;

    private Toolbar toolbar;
    AlertDialog.Builder alertDialog;
    AlertDialog alert;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interesSimple = (Button) findViewById(R.id.btnInteresSimple);
        interesCompuesto = (Button) findViewById(R.id.btnInteresCompueto);
        anualidades = (Button) findViewById(R.id.btnAnualidades);
        gradiente = (Button) findViewById(R.id.btnGradientes);

        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        //toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

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

        alertDialog = new AlertDialog.Builder(this);

    }

    private void vistaInteresSimple(){
        Intent intent = new Intent(getApplicationContext(), InteresSimpleActivity.class);
        startActivity(intent);
    }

    private void vistaInteresCompuesto(){
        Intent intent = new Intent(getApplicationContext(), InteresCompuestoActivity.class);
        startActivity(intent);
    }

    private void vistaAnualidades(){
        Intent intent = new Intent(getApplicationContext(), AnualidadesActivity.class);
        startActivity(intent);
    }

    private void vistaGradiente(){
        Toast.makeText(getApplicationContext(), "Opcion aún no disponible", Toast.LENGTH_SHORT).show();
    }

    public int[] aleatorio(int numero){
        int []arreglo = new int[numero];
        for(int i = 0; i < arreglo.length; i++){
            int alea = (int)(Math.random() * 100);
            arreglo[i] = alea;
        }

        return arreglo;
    }

    private String concatenarArreglo(int[] numero){
        String cad = "";
        for (int i = 0; i < numero.length; i++){
            cad += "" + numero[i] + "-";
        }
        return cad;
    }

    private void botonAleatorio(){
        alertDialog.setTitle("Solucionario");
        alertDialog.setMessage("¿Cuantos ejercicios desea hacer? \n Del 1 al 5");
        numero = new EditText(this);
        numero.setInputType(InputType.TYPE_CLASS_NUMBER);
        numero.setPadding(30,10,30,25);
        alertDialog.setView(numero);

        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String n = numero.getText().toString();
                numero.setText("");
                int num = Integer.parseInt(n);
                if (num >= 1 && num <= 5) {
                    int []numAle = aleatorio(num);
                    String r = concatenarArreglo(numAle);
                    //Toast.makeText(getApplicationContext(), "Numeros Aleatorios {" + r + "}", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), EjemplosActivity.class);
                    intent.putExtra("aleatorio", r);
                    startActivity(intent);
                } else Toast.makeText(getApplicationContext(), "Debe digitar un numero entre 1 y 5", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                numero.setText("");
            }
        });
        alert = alertDialog.create();
        alert.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu item) {
        getMenuInflater().inflate(R.menu.main,item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.aleatorio:
                botonAleatorio();
                break;
        }
        return true;
    }
}
