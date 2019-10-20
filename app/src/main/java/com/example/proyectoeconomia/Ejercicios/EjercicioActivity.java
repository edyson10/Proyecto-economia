package com.example.proyectoeconomia.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectoeconomia.R;
import com.example.proyectoeconomia.Solucion.SolucionActivity;

public class EjercicioActivity extends AppCompatActivity {

    TextView titulo, enunciado;
    Button solucion;
    int boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        titulo = (TextView) findViewById(R.id.txtTituloEjercicio);
        enunciado = (TextView) findViewById(R.id.txtEnunciadoEjericico);
        solucion = (Button) findViewById(R.id.btnSolucionario);

        Bundle datos = this.getIntent().getExtras();
        boton = datos.getInt("boton");

        vistaEjerecicio(boton);

    }

    private void vistaEjerecicio(final int vista){
        switch (vista){
            //EJERCICIO 1
            case 0:
                titulo.setText("EJERCICIO 1");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 2
            case 1:
                titulo.setText("EJERCICIO 2");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 3
            case 2:
                titulo.setText("EJERCICIO 3");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 4
            case 3:
                titulo.setText("EJERCICIO 4");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 5
            case 4:
                titulo.setText("EJERCICIO 4");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 6
            case 5:
                titulo.setText("EJERCICIO 6");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 7
            case 6:
                titulo.setText("EJERCICIO 7");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 8
            case 7:
                titulo.setText("EJERCICIO 8");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 9
            case 8:
                titulo.setText("EJERCICIO 9");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 10
            case 9:
                titulo.setText("EJERCICIO 10");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 11
            case 10:
                titulo.setText("EJERCICIO 11");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 12
            case 11:
                titulo.setText("EJERCICIO 12");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
                //EJERCICIO 13
            case 12:
                titulo.setText("EJERCICIO 13");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 14
            case 13:
                titulo.setText("EJERCICIO 14");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 15
            case 14:
                titulo.setText("EJERCICIO 15");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 16
            case 15:
                titulo.setText("EJERCICIO 16");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 17
            case 16:
                titulo.setText("EJERCICIO 17");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 18
            case 17:
                titulo.setText("EJERCICIO 18");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 19
            case 18:
                titulo.setText("EJERCICIO 19");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 19
            case 19:
                titulo.setText("EJERCICIO 20");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
                //EJERCICIO 21
            case 20:
                titulo.setText("EJERCICIO 21");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 22
            case 21:
                titulo.setText("EJERCICIO 22");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 23
            case 22:
                titulo.setText("EJERCICIO 23");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 24
            case 23:
                titulo.setText("EJERCICIO 24");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 25
            case 24:
                titulo.setText("EJERCICIO 25");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 26
            case 25:
                titulo.setText("EJERCICIO 26");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 27
            case 26:
                titulo.setText("EJERCICIO 27");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 28
            case 27:
                titulo.setText("EJERCICIO 28");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 29
            case 28:
                titulo.setText("EJERCICIO 29");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 30
            case 29:
                titulo.setText("EJERCICIO 30");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 31
            case 30:
                titulo.setText("EJERCICIO 30");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 32
            case 31:
                titulo.setText("EJERCICIO 32");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 33
            case 32:
                titulo.setText("EJERCICIO 33");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 34
            case 33:
                titulo.setText("EJERCICIO 33");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 35
            case 34:
                titulo.setText("EJERCICIO 35");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 36
            case 35:
                titulo.setText("EJERCICIO 36");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 37
            case 36:
                titulo.setText("EJERCICIO 37");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 38
            case 37:
                titulo.setText("EJERCICIO 38");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 39
            case 38:
                titulo.setText("EJERCICIO 39");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 40
            case 39:
                titulo.setText("EJERCICIO 40");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 41
            case 40:
                titulo.setText("EJERCICIO 41");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 42
            case 41:
                titulo.setText("EJERCICIO 42");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 43
            case 42:
                titulo.setText("EJERCICIO 43");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 44
            case 43:
                titulo.setText("EJERCICIO 44");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 45
            case 44:
                titulo.setText("EJERCICIO 45");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 46
            case 45:
                titulo.setText("EJERCICIO 46");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 47
            case 46:
                titulo.setText("EJERCICIO 47");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 48
            case 47:
                titulo.setText("EJERCICIO 48");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 49
            case 48:
                titulo.setText("EJERCICIO 49");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 50
            case 50:
                titulo.setText("EJERCICIO 50");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
        }
    }
}
