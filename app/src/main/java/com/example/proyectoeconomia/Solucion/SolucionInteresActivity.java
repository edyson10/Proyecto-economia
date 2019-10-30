package com.example.proyectoeconomia.Solucion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.app.AlertDialog;
import android.content.Intent;
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

import uk.co.senab.photoview.PhotoViewAttacher;

public class SolucionInteresActivity extends AppCompatActivity {

    TextView titulo;
    ImageView imagen1, imagen2, imagen3;
    PhotoView photoView1, photoView2, photoView3;
    private PhotoViewAttacher photoView;

    Matrix matrix = new Matrix();
    Float scale = 1f;
    ScaleGestureDetector SGD1, SGD2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solucion_interes);

        titulo = (TextView) findViewById(R.id.tituloSolucion);
        //imagen1 = (ImageView) findViewById(R.id.imagenSolucion1);
        //imagen2 = (ImageView) findViewById(R.id.imagenSolucion2);
        //imagen3 = (ImageView) findViewById(R.id.imagenSolucion3);

        photoView1 = (PhotoView) findViewById(R.id.imagenSolucion1);
        photoView2 = (PhotoView) findViewById(R.id.imagenSolucion2);
        photoView3 = (PhotoView) findViewById(R.id.imagenSolucion3);


        Bundle datos = this.getIntent().getExtras();
        int solucion = datos.getInt("solucion");
        vistaSolucion(solucion);

        /*
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
        */



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        SGD1.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private void mostrarImagen(final PhotoView photo, final int drawable){
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SolucionInteresActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);

                photo.setImageResource(drawable);

                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }

    private void vistaSolucion(int boton){
        Drawable my1, my2, my3;
        switch (boton){
            //SOLUCION 1
            /****** INTERES SIMPLE ******/
            case 1:
                titulo.setText("SOLUCION EJERCICIO 1");
                photoView1.setImageResource(R.drawable.s1_1);
                photoView2.setImageResource(R.drawable.s1_2);
                break;
            //SOLUCION 2
            case 2:
                titulo.setText("SOLUCION EJERCICIO 2");
                photoView1.setImageResource(R.drawable.s2_1);
                photoView2.setImageResource(R.drawable.s2_2);
                break;
            //SOLUCION 3
            case 3:
                titulo.setText("SOLUCION EJERCICIO 3");
                photoView1.setImageResource(R.drawable.s3_1);
                photoView2.setImageResource(R.drawable.s3_2);
                break;
            //SOLUCION 4
            case 4:
                titulo.setText("SOLUCION EJERCICIO 4");
                photoView1.setImageResource(R.drawable.s4_1);
                photoView2.setImageResource(R.drawable.s4_2);
                break;
            //SOLUCION 5
            case 5:
                titulo.setText("SOLUCION EJERCICIO 5");
                photoView1.setImageResource(R.drawable.s5_1);
                photoView2.setImageResource(R.drawable.s5_2);
                break;
            //SOLUCION 6
            case 6:
                titulo.setText("SOLUCION EJERCICIO 6");
                photoView1.setImageResource(R.drawable.s6_1);
                photoView2.setImageResource(R.drawable.s6_2);
                break;
            //SOLUCION 7
            case 7:
                titulo.setText("SOLUCION EJERCICIO 7");
                photoView1.setImageResource(R.drawable.s7_1);
                photoView2.setImageResource(R.drawable.s7_2);
                break;
            //SOLUCION 8
            case 8:
                titulo.setText("SOLUCION EJERCICIO 8");
                photoView1.setImageResource(R.drawable.s8_1);
                photoView2.setImageResource(R.drawable.s8_2);
                break;
            //SOLUCION 9
            case 9:
                titulo.setText("SOLUCION EJERCICIO 9");
                photoView1.setImageResource(R.drawable.s9_1);
                photoView2.setImageResource(R.drawable.s9_2);
                break;
            //SOLUCION 10
            case 10:
                titulo.setText("SOLUCION EJERCICIO 10");
                photoView1.setImageResource(R.drawable.s10_1);
                photoView2.setImageResource(R.drawable.s10_2);
                break;
            //SOLUCION 11
            case 11:
                titulo.setText("SOLUCION EJERCICIO 11");
                photoView1.setImageResource(R.drawable.s11_1);
                photoView2.setImageResource(R.drawable.s11_2);
                break;
            //SOLUCION 12
            case 12:
                titulo.setText("SOLUCION EJERCICIO 12");
                photoView1.setImageResource(R.drawable.s12_1);
                photoView2.setImageResource(R.drawable.s12_2);
                break;
            //SOLUCION 13
            case 13:
                titulo.setText("SOLUCION EJERCICIO 13");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_13);
                break;
            //SOLUCION 14
            case 14:
                titulo.setText("SOLUCION EJERCICIO 14");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_14);
                break;
            //SOLUCION 15
            case 15:
                titulo.setText("SOLUCION EJERCICIO 15");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_15);
                break;
            //SOLUCION 16
            case 16:
                titulo.setText("SOLUCION EJERCICIO 16");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_16);
                break;
            //SOLUCION 17
            case 17:
                titulo.setText("SOLUCION EJERCICIO 17");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_17);
                break;
            //SOLUCION 18
            case 18:
                titulo.setText("SOLUCION EJERCICIO 18");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_18);
                break;
            //SOLUCION 19
            case 19:
                titulo.setText("SOLUCION EJERCICIO 19");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_19);
                break;
            //SOLUCION 20
            case 20:
                titulo.setText("SOLUCION EJERCICIO 20");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_20);
                break;
            //SOLUCION 21
            case 21:
                titulo.setText("SOLUCION EJERCICIO 21");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_21);
                break;
            //SOLUCION 22
            case 22:
                titulo.setText("SOLUCION EJERCICIO 22");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_22);
                break;
            //SOLUCION 23
            case 23:
                titulo.setText("SOLUCION EJERCICIO 23");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_23);
                break;
            //SOLUCION 24
            case 24:
                titulo.setText("SOLUCION EJERCICIO 24");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_24);
                break;
            //SOLUCION 25
            case 25:
                titulo.setText("SOLUCION EJERCICIO 25");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_25);
                break;
            //SOLUCION 26
            case 26:
                titulo.setText("SOLUCION EJERCICIO 26");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_26);
                break;
            //SOLUCION 27
            case 27:
                titulo.setText("SOLUCION EJERCICIO 27");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_27);
                break;
            //SOLUCION 28
            case 28:
                titulo.setText("SOLUCION EJERCICIO 28");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_28);
                break;
            //SOLUCION 29
            case 29:
                titulo.setText("SOLUCION EJERCICIO 29");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_29);
                break;
            //SOLUCION 30
            case 30:
                titulo.setText("SOLUCION EJERCICIO 30");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_30);
                break;
            //SOLUCION 31
            case 31:
                titulo.setText("SOLUCION EJERCICIO 31");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_31);
                break;
            //SOLUCION 32
            case 32:
                titulo.setText("SOLUCION EJERCICIO 32");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_32);
                break;
            //SOLUCION 33
            case 33:
                titulo.setText("SOLUCION EJERCICIO 33");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_33);
                break;
            //SOLUCION 34
            case 34:
                titulo.setText("SOLUCION EJERCICIO 34");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_34);
                break;
            //SOLUCION 35
            case 35:
                titulo.setText("SOLUCION EJERCICIO 35");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_35);
                break;
            //SOLUCION 36
            case 36:
                titulo.setText("SOLUCION EJERCICIO 36");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_36);
                break;
            //SOLUCION 37
            case 37:
                titulo.setText("SOLUCION EJERCICIO 37");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_37);
                break;
            //SOLUCION 38
            case 38:
                titulo.setText("SOLUCION EJERCICIO 38");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_38);
                break;
            //SOLUCION 39
            case 39:
                titulo.setText("SOLUCION EJERCICIO 39");
                photoView1.setImageResource(R.drawable.solucion_ejericicio_39);
                break;
            //SOLUCION 40
            case 40:
                titulo.setText("SOLUCION EJERCICIO 40");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_40);
                break;
            //SOLUCION 41
            case 41:
                titulo.setText("SOLUCION EJERCICIO 41");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_41);
                break;
            //SOLUCION 42
            case 42:
                titulo.setText("SOLUCION EJERCICIO 42");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_42);
                break;
            //SOLUCION 43
            case 43:
                titulo.setText("SOLUCION EJERCICIO 43");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_43);
                break;
            //SOLUCION 44
            case 44:
                titulo.setText("SOLUCION EJERCICIO 44");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_44);
                break;
            //SOLUCION 45
            case 45:
                titulo.setText("SOLUCION EJERCICIO 45");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_45);
                break;
            //SOLUCION 46
            case 46:
                titulo.setText("SOLUCION EJERCICIO 46");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_46);
                break;
            //SOLUCION 47
            case 47:
                titulo.setText("SOLUCION EJERCICIO 47");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_47);
                break;
            //SOLUCION 48
            case 48:
                titulo.setText("SOLUCION EJERCICIO 48");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_48);
                break;
            //SOLUCION 49
            case 49:
                titulo.setText("SOLUCION EJERCICIO 49");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_49);
                break;
            //SOLUCION 50
            case 50:
                titulo.setText("SOLUCION EJERCICIO 50");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_50);
                break;

            /****** INTERES COMPUESTO ******/
            //SOLUCION 51
            case 51:
                titulo.setText("SOLUCION EJERCICIO 1");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_1_1);
                photoView2.setImageResource(R.drawable.solucion_ejercicio_1_2);
                break;
            //SOLUCION 52
            case 52:
                titulo.setText("SOLUCION EJERCICIO 2");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_2);
                break;
            //SOLUCION 53
            case 53:
                titulo.setText("SOLUCION EJERCICIO 3");
                photoView1.setImageResource(R.drawable.solucion_3);
                break;
            //SOLUCION 54
            case 54:
                titulo.setText("SOLUCION EJERCICIO 4");
                photoView1.setImageResource(R.drawable.ejercicio_4_1);
                photoView2.setImageResource(R.drawable.ejercicio_4_2);
                break;
            //SOLUCION 55
            case 55:
                titulo.setText("SOLUCION EJERCICIO 5");
                photoView1.setImageResource(R.drawable.solicion_ejercicio_5_1);
                photoView2.setImageResource(R.drawable.solucion_ejercicio_5_2);
                break;
            //SOLUCION 56
            case 56:
                titulo.setText("SOLUCION EJERCICIO 6");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_6);
                break;
            //SOLUCION 57
            case 57:
                titulo.setText("SOLUCION EJERCICIO 7");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_7_1);
                photoView2.setImageResource(R.drawable.solucion_ejercicio_7_2);
                break;
            //SOLUCION 58
            case 58:
                titulo.setText("SOLUCION EJERCICIO 8");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_8);
                break;
            //SOLUCION 59
            case 59:
                titulo.setText("SOLUCION EJERCICIO 9");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_9);
                break;
            //SOLUCION 60
            case 60:
                titulo.setText("SOLUCION EJERCICIO 10");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_10_1);
                photoView2.setImageResource(R.drawable.solucion_ejercicio_10_2);
                photoView3.setImageResource(R.drawable.solucion_ejercicio_10_3);
                break;
            //SOLUCION 61
            case 61:
                titulo.setText("SOLUCION EJERCICIO 11");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_11_1);
                photoView2.setImageResource(R.drawable.solucion_ejercicio_11_2);
                break;
            //SOLUCION 62
            case 62:
                titulo.setText("SOLUCION EJERCICIO 12");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_12);
                break;
            //SOLUCION 63
            case 63:
                titulo.setText("SOLUCION EJERCICIO 13");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_13_1);
                break;
            //SOLUCION 64
            case 64:
                titulo.setText("SOLUCION EJERCICIO 14");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_14_1);
                break;
            //SOLUCION 65
            case 65:
                titulo.setText("SOLUCION EJERCICIO 15");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_15_1);
                break;
            //SOLUCION 66
            case 66:
                titulo.setText("SOLUCION EJERCICIO 16");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_16_1);
                break;
            //SOLUCION 67
            case 67:
                titulo.setText("SOLUCION EJERCICIO 17");
                photoView1.setImageResource(R.drawable.solicion_ejercicio_17__1);
                photoView2.setImageResource(R.drawable.solucion_ejercicio_17_2);
                break;
            //SOLUCION 68
            case 68:
                titulo.setText("SOLUCION EJERCICIO 18");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_18);
                break;
            //SOLUCION 69
            case 69:
                titulo.setText("SOLUCION EJERCICIO 19");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_19_1);
                photoView2.setImageResource(R.drawable.solcion_ejercicio_19_2);
                break;
            //SOLUCION 70
            case 70:
                titulo.setText("SOLUCION EJERCICIO 20");
                photoView1.setImageResource(R.drawable.solucion_ejercicio_20_1);
                break;
            case 71:
                titulo.setText("SOLUCION EJERCICIO 21");
                photoView1.setImageResource(R.drawable.compuesto_21_1);
                photoView2.setImageResource(R.drawable.compuesto_21_2);
                break;
            case 72:
                titulo.setText("SOLUCION EJERCICIO 22");
                photoView1.setImageResource(R.drawable.compuesto_22_1);
                photoView2.setImageResource(R.drawable.compuesto_22_2);
                break;
            case 73:
                titulo.setText("SOLUCION EJERCICIO 23");
                photoView1.setImageResource(R.drawable.compuesto_23_1);
                photoView2.setImageResource(R.drawable.compuesto_23_2);
                break;
            case 74:
                titulo.setText("SOLUCION EJERCICIO 24");
                photoView1.setImageResource(R.drawable.compuesto_24_1);
                photoView2.setImageResource(R.drawable.compuesto_24_2);
                break;
            case 75:
                titulo.setText("SOLUCION EJERCICIO 25");
                photoView1.setImageResource(R.drawable.compuesto_25_1);
                photoView2.setImageResource(R.drawable.compuesto_25_2);
                break;
            case 76:
                titulo.setText("SOLUCION EJERCICIO 26");
                photoView1.setImageResource(R.drawable.compuesto_26_1);
                photoView2.setImageResource(R.drawable.compuesto_26_2);
                break;
            case 77:
                titulo.setText("SOLUCION EJERCICIO 27");
                photoView1.setImageResource(R.drawable.compuesto_27_1);
                photoView2.setImageResource(R.drawable.compuesto_27_2);
                break;
            case 78:
                titulo.setText("SOLUCION EJERCICIO 28");
                photoView1.setImageResource(R.drawable.compuesto_28_1);
                photoView2.setImageResource(R.drawable.compuesto_28_2);
                break;
            case 79:
                titulo.setText("SOLUCION EJERCICIO 29");
                photoView1.setImageResource(R.drawable.compuesto_29_1);
                photoView2.setImageResource(R.drawable.compuesto_29_2);
                break;
            case 80:
                titulo.setText("SOLUCION EJERCICIO 30");
                photoView1.setImageResource(R.drawable.compuesto_30_1);
                photoView2.setImageResource(R.drawable.compuesto_30_2);
                break;
            case 81:
                titulo.setText("SOLUCION EJERCICIO 31");
                photoView1.setImageResource(R.drawable.compuesto_31);
                break;
            case 82:
                titulo.setText("SOLUCION EJERCICIO 32");
                photoView1.setImageResource(R.drawable.compuesto_32_1);
                photoView2.setImageResource(R.drawable.compuesto_32_2);
                break;
            case 83:
                titulo.setText("SOLUCION EJERCICIO 33");
                photoView1.setImageResource(R.drawable.compuesto_33_1);
                photoView2.setImageResource(R.drawable.compuesto_33_2);
                break;
            case 84:
                titulo.setText("SOLUCION EJERCICIO 34");
                photoView1.setImageResource(R.drawable.compuesto_34_1);
                photoView2.setImageResource(R.drawable.compuesto_34_2);
                break;
            case 85:
                titulo.setText("SOLUCION EJERCICIO 35");
                photoView1.setImageResource(R.drawable.compuesto_35_1);
                photoView2.setImageResource(R.drawable.compuesto_35_2);
                break;
            case 86:
                titulo.setText("SOLUCION EJERCICIO 36");
                photoView1.setImageResource(R.drawable.compuesto_36);
                break;
            case 87:
                titulo.setText("SOLUCION EJERCICIO 37");
                photoView1.setImageResource(R.drawable.compuesto_37_1);
                photoView1.setImageResource(R.drawable.compuesto_37_2);
                break;
            case 88:
                titulo.setText("SOLUCION EJERCICIO 38");
                photoView1.setImageResource(R.drawable.compuesto_38);
                break;
            case 89:
                titulo.setText("SOLUCION EJERCICIO 39");
                photoView1.setImageResource(R.drawable.compuesto_39_1);
                photoView2.setImageResource(R.drawable.compuesto_39_2);
                break;
            case 90:
                titulo.setText("SOLUCION EJERCICIO 40");
                photoView1.setImageResource(R.drawable.compuesto_40_1);
                photoView2.setImageResource(R.drawable.compuesto_40_2);
                break;
            case 91:
                titulo.setText("SOLUCION EJERCICIO 41");
                photoView1.setImageResource(R.drawable.compuesto_41_1);
                photoView1.setImageResource(R.drawable.compuesto_41_2);
                break;
            case 92:
                titulo.setText("SOLUCION EJERCICIO 42");
                photoView1.setImageResource(R.drawable.compuesto_42_1);
                photoView2.setImageResource(R.drawable.compuesto_42_2);
                break;
            case 93:
                titulo.setText("SOLUCION EJERCICIO 43");
                photoView1.setImageResource(R.drawable.compuesto_43_1);
                photoView2.setImageResource(R.drawable.compuesto_43_2);
                break;
            case 94:
                titulo.setText("SOLUCION EJERCICIO 44");
                photoView1.setImageResource(R.drawable.compuesto_44_1);
                photoView2.setImageResource(R.drawable.compuesto_44_2);
                break;
            case 95:
                titulo.setText("SOLUCION EJERCICIO 45");
                photoView1.setImageResource(R.drawable.compuesto_45_1);
                photoView2.setImageResource(R.drawable.compuesto_45_2);
                break;
            case 96:
                titulo.setText("SOLUCION EJERCICIO 46");
                photoView1.setImageResource(R.drawable.compuesto_46_1);
                photoView2.setImageResource(R.drawable.compuesto_46_2);
                break;
            case 97:
                titulo.setText("SOLUCION EJERCICIO 47");
                photoView1.setImageResource(R.drawable.compuesto_47_1);
                photoView2.setImageResource(R.drawable.compuesto_47_2);
                break;
            case 98:
                titulo.setText("SOLUCION EJERCICIO 48");
                photoView1.setImageResource(R.drawable.compuesto_48_1);
                photoView1.setImageResource(R.drawable.compuesto_48_2);
                break;
            case 99:
                titulo.setText("SOLUCION EJERCICIO 49");
                photoView1.setImageResource(R.drawable.compuesto_49_1);
                photoView2.setImageResource(R.drawable.compuesto_49_2);
                break;
            case 100:
                titulo.setText("SOLUCION EJERCICIO 50");
                photoView1.setImageResource(R.drawable.compuesto_50_1);
                photoView2.setImageResource(R.drawable.compuesto_50_2);
                break;

            /****** ANUALIDADES ******/
            case 101:
                titulo.setText("EJERCICIO 1");
                photoView1.setImageResource(R.drawable.anual_1);
                break;
            case 102:
                titulo.setText("EJERCICIO 2");
                photoView1.setImageResource(R.drawable.anual_2);
                break;
            case 103:
                titulo.setText("EJERCICIO 3");
                photoView1.setImageResource(R.drawable.anual_3);
                break;
            case 104:
                titulo.setText("EJERCICIO 4");
                photoView1.setImageResource(R.drawable.anual_4);
                break;
            case 105:
                titulo.setText("EJERCICIO 5");
                photoView1.setImageResource(R.drawable.anual_5);
                break;
            case 106:
                titulo.setText("EJERCICIO 6");
                photoView1.setImageResource(R.drawable.anual_6);
                break;
            case 107:
                titulo.setText("EJERCICIO 7");
                photoView1.setImageResource(R.drawable.anual_7);
                break;
            case 108:
                titulo.setText("EJERCICIO 8");
                photoView1.setImageResource(R.drawable.anual_8);
                break;
            case 109:
                titulo.setText("EJERCICIO 9");
                photoView1.setImageResource(R.drawable.anual_9);
                break;
            case 110:
                titulo.setText("EJERCICIO 10");
                photoView1.setImageResource(R.drawable.anual_10);
                break;
            case 111:
                titulo.setText("EJERCICIO 11");
                photoView1.setImageResource(R.drawable.anual_11);
                break;
            case 112:
                titulo.setText("EJERCICIO 12");
                photoView1.setImageResource(R.drawable.anual_12);
                break;
            case 113:
                titulo.setText("EJERCICIO 13");
                photoView1.setImageResource(R.drawable.anual_13);
                break;
            case 114:
                titulo.setText("EJERCICIO 14");
                photoView1.setImageResource(R.drawable.anual_14);
                break;
            case 115:
                titulo.setText("EJERCICIO 15");
                photoView1.setImageResource(R.drawable.anual_15);
                break;
            case 116:
                titulo.setText("EJERCICIO 16");
                photoView1.setImageResource(R.drawable.anual_16);
                break;
            case 117:
                titulo.setText("EJERCICIO 17");
                photoView1.setImageResource(R.drawable.anual_17);
                break;
            case 118:
                titulo.setText("EJERCICIO 18");
                photoView1.setImageResource(R.drawable.anual_18);
                break;
            case 119:
                titulo.setText("EJERCICIO 19");
                photoView1.setImageResource(R.drawable.anual_19);
                break;
            case 120:
                titulo.setText("EJERCICIO 20");
                photoView1.setImageResource(R.drawable.anual_20);
                photoView2.setVisibility(View.INVISIBLE);
                photoView3.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
