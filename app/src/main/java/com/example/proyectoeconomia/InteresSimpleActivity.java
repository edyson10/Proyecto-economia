package com.example.proyectoeconomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.proyectoeconomia.Ejercicios.EjercicioActivity;

public class InteresSimpleActivity extends AppCompatActivity {

    Button e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, btnAle;
    Button e21,e22,e23,e24,e25,e26,e27,e28,e29,e30,e31,e32,e33,e34,e35,e36,e37,e38,e39,e40;
    Button e41,e42,e43,e44,e45,e46,e47,e48,e49,e50;
    Button []pru = new Button[50];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interes_simple);

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
        e21 = (Button) findViewById(R.id.btnEjercicio21);
        e22 = (Button) findViewById(R.id.btnEjercicio22);
        e23 = (Button) findViewById(R.id.btnEjercicio23);
        e24 = (Button) findViewById(R.id.btnEjercicio24);
        e25 = (Button) findViewById(R.id.btnEjercicio25);
        e26 = (Button) findViewById(R.id.btnEjercicio26);
        e27 = (Button) findViewById(R.id.btnEjercicio27);
        e28 = (Button) findViewById(R.id.btnEjercicio28);
        e29 = (Button) findViewById(R.id.btnEjercicio29);
        e30 = (Button) findViewById(R.id.btnEjercicio30);
        e31 = (Button) findViewById(R.id.btnEjercicio31);
        e32 = (Button) findViewById(R.id.btnEjercicio32);
        e33 = (Button) findViewById(R.id.btnEjercicio33);
        e34 = (Button) findViewById(R.id.btnEjercicio34);
        e35 = (Button) findViewById(R.id.btnEjercicio35);
        e36 = (Button) findViewById(R.id.btnEjercicio36);
        e37 = (Button) findViewById(R.id.btnEjercicio37);
        e38 = (Button) findViewById(R.id.btnEjercicio38);
        e39 = (Button) findViewById(R.id.btnEjercicio39);
        e40 = (Button) findViewById(R.id.btnEjercicio40);
        e41 = (Button) findViewById(R.id.btnEjercicio41);
        e42 = (Button) findViewById(R.id.btnEjercicio42);
        e43 = (Button) findViewById(R.id.btnEjercicio43);
        e44 = (Button) findViewById(R.id.btnEjercicio44);
        e45 = (Button) findViewById(R.id.btnEjercicio45);
        e46 = (Button) findViewById(R.id.btnEjercicio46);
        e47 = (Button) findViewById(R.id.btnEjercicio47);
        e48 = (Button) findViewById(R.id.btnEjercicio48);
        e49 = (Button) findViewById(R.id.btnEjercicio49);
        e50 = (Button) findViewById(R.id.btnEjercicio50);

        pru = new Button[]{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10,
                e11, e12, e13, e14, e15, e16, e17, e18, e19, e20,
                e21, e22, e23, e24, e25, e26, e27, e28, e29, e30,
                e31, e32, e33, e34, e35, e36, e37, e38, e39, e40,
                e41, e42, e43, e44, e45, e46, e47, e48, e49, e50};

        prueba(pru);

        btnAle = (Button) findViewById(R.id.btnAleatorio);
        btnAle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaAleatoria();
            }
        });

    }

    private void prueba(final Button []p){
        for (int i = 0; i < p.length;i++){
            final int finalI = i;
            p[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(), "Se presiono el boton: " + p[finalI].getText().toString(),Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), EjercicioActivity.class);
                    intent.putExtra("boton", finalI);
                    startActivity(intent);
                }
            });
        }
    }

    private void vistaAleatoria(){

    }
}
