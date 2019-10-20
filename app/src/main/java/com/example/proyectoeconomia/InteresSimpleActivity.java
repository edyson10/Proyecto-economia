package com.example.proyectoeconomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.proyectoeconomia.Ejercicios.Ejercicio10Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio2Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio3Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio4Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio5Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio6Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio7Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio8Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio9Activity;
import com.example.proyectoeconomia.Ejercicios.EjercicioActivity;
import com.example.proyectoeconomia.Solucion.SolucionActivity;

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

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio2();
            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio3();
            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio4();
            }
        });

        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio5();
            }
        });

        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio6();
            }
        });

        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio7();
            }
        });

        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio8();
            }
        });

        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio9();
            }
        });

        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio10();
            }
        });

        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio11();
            }
        });

        e12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio12();
            }
        });

        e13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio13();
            }
        });

        e14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio14();
            }
        });

        e15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio15();
            }
        });

        e16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio16();
            }
        });

        e17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio17();
            }
        });

        e18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio18();
            }
        });

        e19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio19();
            }
        });

        e20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio20();
            }
        });

        btnAle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaAleatoria(aleatorio());
            }
        });

    }

    private void prueba(final Button []p){
        for (int i=0; i<p.length;i++){
            final int finalI = i;
            p[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(), "Se presiono el boton: " + p[finalI].getText().toString(),Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), EjercicioActivity.class);
                    intent.putExtra("boton", p[finalI].getText().toString());
                    startActivity(intent);
                }
            });
        }
    }

    private void vistaEjercicio1(){

    }

    private void vistaEjercicio2() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio2Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio3() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio3Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio4() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio4Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio5() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio5Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio6() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio6Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio7() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio7Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio8() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio8Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio9() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio9Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio10() {
        Intent intent = new Intent(getApplicationContext(), Ejercicio10Activity.class);
        startActivity(intent);
    }

    private void vistaEjercicio11() {

    }

    private void vistaEjercicio12() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio12Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio13() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio13Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio14() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio14Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio15() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio15Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio16() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio16Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio17() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio17Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio18() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio18Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio19() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio19Activity.class);
        startActivity(intent);
        */
    }

    private void vistaEjercicio20() {
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio20Activity.class);
        startActivity(intent);
        */
    }

    private int aleatorio(){
        int numero = (int) (Math.random() * 20) + 1;
        return numero;
    }

    private void vistaAleatoria(int vista){
        switch (vista){
            case 1:
                vistaEjercicio1();
                break;
            case 2:
                vistaEjercicio2();
                break;
            case 3:
                vistaEjercicio3();
                break;
            case 4:
                vistaEjercicio4();
                break;
            case 5:
                vistaEjercicio5();
                break;
            case 6:
                vistaEjercicio6();
                break;
            case 7:
                vistaEjercicio7();
                break;
            case 8:
                vistaEjercicio8();
                break;
            case 9:
                vistaEjercicio9();
                break;
            case 10:
                vistaEjercicio10();
                break;
            case 11:
                vistaEjercicio11();
                break;
            case 12:
                vistaEjercicio12();
                break;
            case 13:
                vistaEjercicio13();
                break;
            case 14:
                vistaEjercicio14();
                break;
            case 15:
                vistaEjercicio15();
                break;
            case 16:
                vistaEjercicio16();
                break;
             case 17:
                 vistaEjercicio17();
                 break;
            case 18:
                vistaEjercicio18();
                break;
            case 19:
                vistaEjercicio19();
                break;
            case 20:
                vistaEjercicio20();
                break;
        }
    }

}
