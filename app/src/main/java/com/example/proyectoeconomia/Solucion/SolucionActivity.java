package com.example.proyectoeconomia.Solucion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyectoeconomia.R;

public class SolucionActivity extends AppCompatActivity {

    TextView titulo;
    ImageView imagen1, imagen2;
    int boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solucion);

        titulo = (TextView) findViewById(R.id.tituloSolucion);
        imagen1 = (ImageView) findViewById(R.id.imagenSolucion1);
        imagen2 = (ImageView) findViewById(R.id.imagenSolucion2);

        Bundle datos = this.getIntent().getExtras();
        boton = datos.getInt("solucion");

        vistaSolucion(boton);
    }

    private void vistaSolucion(int boton){
        switch (boton){
            //SOLUCION 1
            case 0:
                titulo.setText("SOLUCION EJERCICIO 1");
                Drawable my1 = getResources().getDrawable(R.drawable.s1_1);
                Drawable my2 = getResources().getDrawable(R.drawable.s1_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 2
            case 1:
                break;
            //SOLUCION 3
            case 2:
                break;
            //SOLUCION 4
            case 3:
                break;
            //SOLUCION 5
            case 4:
                break;
            //SOLUCION 6
            case 5:
                break;
            //SOLUCION 7
            case 6:
                break;
            //SOLUCION 8
            case 7:
                break;
            //SOLUCION 9
            case 8:
                break;
            //SOLUCION 10
            case 9:
                break;
            //SOLUCION 11
            case 10:
                break;
            //SOLUCION 12
            case 11:
                break;
            //SOLUCION 13
            case 12:
                break;
            //SOLUCION 14
            case 13:
                break;
            //SOLUCION 15
            case 14:
                break;
            //SOLUCION 16
            case 15:
                break;
            //SOLUCION 17
            case 16:
                break;
            //SOLUCION 18
            case 17:
                break;
            //SOLUCION 19
            case 18:
                break;
            //SOLUCION 20
            case 19:
                break;
            //SOLUCION 21
            case 20:
                break;
            //SOLUCION 22
            case 21:
                break;
            //SOLUCION 23
            case 22:
                break;
            //SOLUCION 24
            case 23:
                break;
            //SOLUCION 25
            case 24:
                break;
            //SOLUCION 26
            case 25:
                break;
            //SOLUCION 27
            case 26:
                break;
            //SOLUCION 28
            case 27:
                break;
            //SOLUCION 29
            case 28:
                break;
            //SOLUCION 30
            case 29:
                break;
            //SOLUCION 31
            case 30:
                break;
            //SOLUCION 32
            case 31:
                break;
            //SOLUCION 33
            case 32:
                break;
            //SOLUCION 34
            case 33:
                break;
            //SOLUCION 35
            case 34:
                break;
            //SOLUCION 36
            case 35:
                break;
            //SOLUCION 37
            case 36:
                break;
            //SOLUCION 38
            case 37:
                break;
            //SOLUCION 39
            case 38:
                break;
            //SOLUCION 40
            case 39:
                break;
            //SOLUCION 41
            case 40:
                break;
            //SOLUCION 42
            case 41:
                break;
            //SOLUCION 43
            case 42:
                break;
            //SOLUCION 44
            case 43:
                break;
            //SOLUCION 45
            case 44:
                break;
            //SOLUCION 46
            case 45:
                break;
            //SOLUCION 47
            case 46:
                break;
            //SOLUCION 48
            case 47:
                break;
            //SOLUCION 49
            case 48:
                break;
            //SOLUCION 50
            case 49:
                break;

        }
    }
}
