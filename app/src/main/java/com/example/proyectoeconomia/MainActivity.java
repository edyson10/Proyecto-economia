package com.example.proyectoeconomia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputType;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.proyectoeconomia.Ejercicios.EjercicioActivity;

public class MainActivity extends AppCompatActivity {

    Button interesSimple, interesCompuesto, anualidades, gradiente, aleatorio;
    private EditText numero;
    private ExampleDialogListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interesSimple = (Button) findViewById(R.id.btnInteresSimple);
        interesCompuesto = (Button) findViewById(R.id.btnInteresCompueto);
        anualidades = (Button) findViewById(R.id.btnAnualidades);
        gradiente = (Button) findViewById(R.id.btnGradientes);
        aleatorio = (Button) findViewById(R.id.btnAleatorio);

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

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
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
                if(  num >= 1 && num <= 5){
                    int []numAle = aleatorio(num);
                    String r = prueba(numAle);
                    Toast.makeText(getApplicationContext(), "Numeros Aleatorios {" + r + "}", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), EjercicioActivity.class);
                    intent.putExtra("arreglo", r);
                    startActivity(intent);
                }else Toast.makeText(getApplicationContext(), "Debe digitar un numero entre 1 y 5", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                numero.setText("");
            }
        });

        final AlertDialog alert = alertDialog.create();

        aleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.show();
            }
        });
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
        Toast.makeText(getApplicationContext(), "Opcion aún no disponible", Toast.LENGTH_SHORT).show();
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

    private String prueba(int[] numero){
        String cad = "";
        for (int i = 0; i < numero.length; i++){
            cad += "" + numero[i] + "-";
        }
        return cad;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private interface ExampleDialogListener {
    }
}
