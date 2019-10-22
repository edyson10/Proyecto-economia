package com.example.proyectoeconomia;

import android.content.Context;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    private ImageView imagen;
    private float scale = 0;

    public ScaleListener (ImageView imageView){
        this.imagen = imageView;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector){
        scale *= scaleGestureDetector.getScaleFactor();
        imagen.setScaleX(scale);
        imagen.setScaleY(scale);
        return true;

    }
}
