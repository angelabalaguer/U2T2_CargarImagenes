package com.example.u2t2_imageloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MiGlide extends AppCompatActivity {
    ImageView miimagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_glide);
        miimagen=findViewById(R.id.imageview);

        final String URL = "https://cdn.redcanina.es/wp-content/uploads/2013/07/como-cuidar-un-perro-chihuahua.jpg";

        Glide.with(this)
                .load(URL)
                .error(R.mipmap.ic_launcher)
                .placeholder(R.drawable.cargando)
                .into(miimagen);
    }
}
