package com.example.proyectoeconomia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyectoeconomia.Ejercicios.EjercicioActivity;

public class AnualidadesActivity extends AppCompatActivity {

    Button e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
    Button []botones = new Button[50];
    private EditText numero;

    private Toolbar toolbar;
    AlertDialog.Builder alertDialog;
    AlertDialog alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anualidades);

        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        e1 = (Button) findViewById(R.id.btnEjercicio1);
        e2 = (Button) findViewById(R.id.btnEjercicio2);
        e3 = (Button) findViewById(R.id.btnEjercicio3);
        e4 = (Button) findViewById(R.id.btnEjercicio4);
        e5 = (Button) findViewById(R.id.btnEjercicio5);
        e6 = (Button) findViewById(R.id.btnEjercicio6);
        e7 = (Button) findViewById(R.id.btnEjercicio7);
        e8 = (Button) findViewById(R.id.btnEjercicio8);
        e9 = (Button) findViewById(R.id.btnEjercicio9);
        e10 = (Button) findViewById(R.id.btnEjercicio10);
        e11 = (Button) findViewById(R.id.btnEjercicio11);
        e12 = (Button) findViewById(R.id.btnEjercicio12);
        e13 = (Button) findViewById(R.id.btnEjercicio13);
        e14 = (Button) findViewById(R.id.btnEjercicio14);
        e15 = (Button) findViewById(R.id.btnEjercicio15);
        e16 = (Button) findViewById(R.id.btnEjercicio16);
        e17 = (Button) findViewById(R.id.btnEjercicio17);
        e18 = (Button) findViewById(R.id.btnEjercicio18);
        e19 = (Button) findViewById(R.id.btnEjercicio19);
        e20 = (Button) findViewById(R.id.btnEjercicio20);

        botones = new Button[]{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10,
                e11, e12, e13, e14, e15, e16, e17, e18, e19, e20};

        vistaEjercicios(botones);

        alertDialog = new AlertDialog.Builder(this);

    }

    private void vistaEjercicios(final Button []p){
        for (int i = 0; i < p.length;i++){
            final int finalI = i;
            p[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(), "Se presiono el boton: " + (Integer.parseInt(p[finalI].getText().toString()) + 100),Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), EjercicioActivity.class);
                    intent.putExtra("anualidades", (Integer.parseInt(p[finalI].getText().toString()) + 100));
                    startActivity(intent);
                }
            });
        }
    }

    public int[] aleatorio(int numero){
        int []arreglo = new int[numero];
        for(int i = 0; i < arreglo.length; i++){
            //int alea = (int) Math.floor(Math.random() * 50 + 100);
            int alea = (int)(Math.random() * (120 - 101 + 1) + 101);
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
