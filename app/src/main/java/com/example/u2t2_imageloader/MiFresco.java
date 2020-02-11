package com.example.u2t2_imageloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MiFresco extends AppCompatActivity {
    SimpleDraweeView draweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_fresco);
        Fresco.initialize(this);
        draweeView = findViewById(R.id.my_image_view);
        draweeView.setImageURI("https://cdn.redcanina.es/wp-content/uploads/2013/07/como-cuidar-un-perro-chihuahua.jpg");

    }
}
