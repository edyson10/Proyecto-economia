package com.example.proyectoeconomia.Solucion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyectoeconomia.R;
import com.example.proyectoeconomia.ScaleListener;
import com.github.chrisbanes.photoview.PhotoView;

public class SolucionInteresActivity extends AppCompatActivity {

    TextView titulo;
    ImageView imagen1, imagen2;
    int boton;

    Matrix matrix = new Matrix();
    Float scale = 1f;
    ScaleGestureDetector SGD1, SGD2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solucion_interes);

        titulo = (TextView) findViewById(R.id.tituloSolucion);
        imagen1 = (ImageView) findViewById(R.id.imagenSolucion1);
        imagen2 = (ImageView) findViewById(R.id.imagenSolucion2);

        Bundle datos = this.getIntent().getExtras();
        boton = datos.getInt("solucion");

        SGD1 = new ScaleGestureDetector(this, new ScaleListener(imagen1));
        SGD2 = new ScaleGestureDetector(this, new ScaleListener(imagen2));

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.s1_1);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(true);
        imagen1.setImageDrawable(mDrawable);


        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SolucionInteresActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imagenSolucion1);
                Drawable my1 = getResources().getDrawable(R.drawable.s1_1);
                photoView.setImageResource(R.drawable.logo_ufps);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        vistaSolucion(boton);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        SGD1.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private void vistaSolucion(int boton){
        Drawable my1, my2, my3;
        switch (boton){
            //SOLUCION 1
            case 0:
                titulo.setText("SOLUCION EJERCICIO 1");
                my1 = getResources().getDrawable(R.drawable.s1_1);
                my2 = getResources().getDrawable(R.drawable.s1_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 2
            case 1:
                titulo.setText("SOLUCION EJERCICIO 2");
                my1 = getResources().getDrawable(R.drawable.s2_1);
                my2 = getResources().getDrawable(R.drawable.s2_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 3
            case 2:
                titulo.setText("SOLUCION EJERCICIO 3");
                my1 = getResources().getDrawable(R.drawable.s3_1);
                my2 = getResources().getDrawable(R.drawable.s3_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 4
            case 3:
                titulo.setText("SOLUCION EJERCICIO 4");
                my1 = getResources().getDrawable(R.drawable.s4_1);
                my2 = getResources().getDrawable(R.drawable.s4_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 5
            case 4:
                titulo.setText("SOLUCION EJERCICIO 5");
                my1 = getResources().getDrawable(R.drawable.s5_1);
                my2 = getResources().getDrawable(R.drawable.s5_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 6
            case 5:
                titulo.setText("SOLUCION EJERCICIO 6");
                my1 = getResources().getDrawable(R.drawable.s6_1);
                my2 = getResources().getDrawable(R.drawable.s6_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 7
            case 6:
                titulo.setText("SOLUCION EJERCICIO 7");
                my1 = getResources().getDrawable(R.drawable.s7_1);
                my2 = getResources().getDrawable(R.drawable.s7_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 8
            case 7:
                titulo.setText("SOLUCION EJERCICIO 8");
                my1 = getResources().getDrawable(R.drawable.s8_1);
                my2 = getResources().getDrawable(R.drawable.s8_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 9
            case 8:
                titulo.setText("SOLUCION EJERCICIO 9");
                my1 = getResources().getDrawable(R.drawable.s9_1);
                my2 = getResources().getDrawable(R.drawable.s9_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 10
            case 9:
                titulo.setText("SOLUCION EJERCICIO 10");
                my1 = getResources().getDrawable(R.drawable.s10_1);
                my2 = getResources().getDrawable(R.drawable.s10_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 11
            case 10:
                titulo.setText("SOLUCION EJERCICIO 11");
                my1 = getResources().getDrawable(R.drawable.s11_1);
                my2 = getResources().getDrawable(R.drawable.s11_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 12
            case 11:
                titulo.setText("SOLUCION EJERCICIO 12");
                my1 = getResources().getDrawable(R.drawable.s12_1);
                my2 = getResources().getDrawable(R.drawable.s12_2);
                imagen1.setImageDrawable(my1);
                imagen2.setImageDrawable(my2);
                break;
            //SOLUCION 13
            case 12:
                titulo.setText("SOLUCION EJERCICIO 13");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_13);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 14
            case 13:
                titulo.setText("SOLUCION EJERCICIO 14");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_14);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 15
            case 14:
                titulo.setText("SOLUCION EJERCICIO 15");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_15);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 16
            case 15:
                titulo.setText("SOLUCION EJERCICIO 16");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_16);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 17
            case 16:
                titulo.setText("SOLUCION EJERCICIO 17");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_17);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 18
            case 17:
                titulo.setText("SOLUCION EJERCICIO 18");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_18);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 19
            case 18:
                titulo.setText("SOLUCION EJERCICIO 19");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_19);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 20
            case 19:
                titulo.setText("SOLUCION EJERCICIO 20");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_20);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 21
            case 20:
                titulo.setText("SOLUCION EJERCICIO 21");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_21);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 22
            case 21:
                titulo.setText("SOLUCION EJERCICIO 22");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_22);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 23
            case 22:
                titulo.setText("SOLUCION EJERCICIO 23");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_23);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 24
            case 23:
                titulo.setText("SOLUCION EJERCICIO 24");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_24);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 25
            case 24:
                titulo.setText("SOLUCION EJERCICIO 25");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_25);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 26
            case 25:
                titulo.setText("SOLUCION EJERCICIO 26");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_26);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 27
            case 26:
                titulo.setText("SOLUCION EJERCICIO 27");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_27);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 28
            case 27:
                titulo.setText("SOLUCION EJERCICIO 28");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_28);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 29
            case 28:
                titulo.setText("SOLUCION EJERCICIO 29");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_29);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 30
            case 29:
                titulo.setText("SOLUCION EJERCICIO 30");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_30);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 31
            case 30:
                titulo.setText("SOLUCION EJERCICIO 31");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_31);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 32
            case 31:
                titulo.setText("SOLUCION EJERCICIO 32");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_32);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 33
            case 32:
                titulo.setText("SOLUCION EJERCICIO 33");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_33);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 34
            case 33:
                titulo.setText("SOLUCION EJERCICIO 34");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_34);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 35
            case 34:
                titulo.setText("SOLUCION EJERCICIO 35");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_35);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 36
            case 35:
                titulo.setText("SOLUCION EJERCICIO 36");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_36);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 37
            case 36:
                titulo.setText("SOLUCION EJERCICIO 37");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_37);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 38
            case 37:
                titulo.setText("SOLUCION EJERCICIO 38");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_38);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 39
            case 38:
                titulo.setText("SOLUCION EJERCICIO 39");
                my1 = getResources().getDrawable(R.drawable.solucion_ejericicio_39);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 40
            case 39:
                titulo.setText("SOLUCION EJERCICIO 40");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_40);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 41
            case 40:
                titulo.setText("SOLUCION EJERCICIO 41");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_41);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 42
            case 41:
                titulo.setText("SOLUCION EJERCICIO 42");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_42);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 43
            case 42:
                titulo.setText("SOLUCION EJERCICIO 43");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_43);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 44
            case 43:
                titulo.setText("SOLUCION EJERCICIO 44");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_44);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 45
            case 44:
                titulo.setText("SOLUCION EJERCICIO 45");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_45);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 46
            case 45:
                titulo.setText("SOLUCION EJERCICIO 46");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_46);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 47
            case 46:
                titulo.setText("SOLUCION EJERCICIO 47");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_47);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 48
            case 47:
                titulo.setText("SOLUCION EJERCICIO 48");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_48);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 49
            case 48:
                titulo.setText("SOLUCION EJERCICIO 49");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_49);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 50
            case 49:
                titulo.setText("SOLUCION EJERCICIO 50");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_50);
                imagen1.setImageDrawable(my1);
                break;

            /* ===== INTERES COMPUESTO ===== */
            //SOLUCION 51
            case 50:
                titulo.setText("SOLUCION EJERCICIO 1");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_1_1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_1_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 52
            case 51:
                titulo.setText("SOLUCION EJERCICIO 2");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 53
            case 52:
                titulo.setText("SOLUCION EJERCICIO 3");
                my1 = getResources().getDrawable(R.drawable.solucion_3);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 54
            case 53:
                titulo.setText("SOLUCION EJERCICIO 4");
                my1 = getResources().getDrawable(R.drawable.ejercicio_4_1);
                my2 = getResources().getDrawable(R.drawable.ejercicio_4_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 55
            case 54:
                titulo.setText("SOLUCION EJERCICIO 5");
                my1 = getResources().getDrawable(R.drawable.solicion_ejercicio_5_1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_5_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 56
            case 55:
                titulo.setText("SOLUCION EJERCICIO 6");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_6);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 57
            case 56:
                titulo.setText("SOLUCION EJERCICIO 7");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_7_1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_7_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 58
            case 57:
                titulo.setText("SOLUCION EJERCICIO 8");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_8);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 59
            case 58:
                titulo.setText("SOLUCION EJERCICIO 9");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_9);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 60
            case 59:
                titulo.setText("SOLUCION EJERCICIO 10");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_10_1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_10_2);
                my3 = getResources().getDrawable(R.drawable.solucion_ejercicio_10_3);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 61
            case 60:
                titulo.setText("SOLUCION EJERCICIO 11");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_11_1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_11_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 62
            case 61:
                titulo.setText("SOLUCION EJERCICIO 12");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_12);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 63
            case 62:
                titulo.setText("SOLUCION EJERCICIO 13");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_13_1);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 64
            case 63:
                titulo.setText("SOLUCION EJERCICIO 14");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_14_1);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 65
            case 64:
                titulo.setText("SOLUCION EJERCICIO 15");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_15_1);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 66
            case 65:
                titulo.setText("SOLUCION EJERCICIO 16");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_16_1);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 67
            case 66:
                titulo.setText("SOLUCION EJERCICIO 17");
                my1 = getResources().getDrawable(R.drawable.solicion_ejercicio_17__1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_17_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 68
            case 67:
                titulo.setText("SOLUCION EJERCICIO 18");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_18);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 69
            case 68:
                titulo.setText("SOLUCION EJERCICIO 19");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_19_1);
                my1 = getResources().getDrawable(R.drawable.solcion_ejercicio_19_2);
                imagen1.setImageDrawable(my1);
                break;
            //SOLUCION 70
            case 69:
                titulo.setText("SOLUCION EJERCICIO 20");
                my1 = getResources().getDrawable(R.drawable.solucion_ejercicio_20_1);
                my2 = getResources().getDrawable(R.drawable.solucion_ejercicio_20_2);
                imagen1.setImageDrawable(my1);
                break;
        }
    }
}
