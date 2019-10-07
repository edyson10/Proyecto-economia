package com.example.proyectoeconomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.proyectoeconomia.Ejercicios.Ejercicio10Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio11Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio12Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio13Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio14Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio15Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio16Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio17Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio18Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio19Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio1Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio20Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio2Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio3Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio4Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio5Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio6Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio7Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio8Activity;
import com.example.proyectoeconomia.Ejercicios.Ejercicio9Activity;

public class InteresSimpleActivity extends AppCompatActivity {

    Button e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;

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

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vistaEjercicio1();
            }
        });

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
    }

    private void vistaEjercicio1(){
        Intent intent = new Intent(getApplicationContext(), Ejercicio1Activity.class);
        startActivity(intent);
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
        Toast.makeText(getApplicationContext(), "¡Opción no disponible!", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(getApplicationContext(), Ejercicio11Activity.class);
        startActivity(intent);
        */
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
}
