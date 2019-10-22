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
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button interesSimple, interesCompuesto, anualidades, gradiente, aleatorio;
    private EditText numero, p;
    private ExampleDialogListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.txtEjercicio);
        interesSimple = (Button) findViewById(R.id.btnInteresSimple);
        interesCompuesto = (Button) findViewById(R.id.btnInteresCompueto);
        anualidades = (Button) findViewById(R.id.btnAnualidades);
        gradiente = (Button) findViewById(R.id.btnGradientes);
        aleatorio = (Button) findViewById(R.id.btnAleatorio);
        p = new EditText(this);
        p.setInputType(InputType.TYPE_CLASS_NUMBER);

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

        aleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getApplicationContext());
                //.setIcon(R.drawable.icono)
                alertDialog.setTitle("Solucionario");
                alertDialog.setMessage("¿Cuantos ejercicios desea hacer? \n Del 1 al 5");

                LayoutInflater inflater = getLayoutInflater();
                alertDialog.setView(p);
                alertDialog.create();

                //final int n = aleatorio(Integer.parseInt(numero.getText().toString()));

                alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(getApplicationContext(), "--> " + p.getText().toString(), Toast.LENGTH_SHORT).show();
                            }
                }).show();


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

    private void pantallaAleatorio(){

    }

    public int aleatorio(int numero){
        int num = (int)(Math.random()*numero);
        return num;
    }

    private interface ExampleDialogListener {
    }
}
