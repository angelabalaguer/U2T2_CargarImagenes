package com.example.u2t2_imageloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.net.Uri;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import me.relex.photodraweeview.PhotoDraweeView;

public class MiFresco extends AppCompatActivity {
    SimpleDraweeView draweeView;
    private PhotoDraweeView mPhotoDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_mi_fresco);
        final SimpleDraweeView draweeView = findViewById(R.id.photo_drawee_view);
        draweeView.setImageURI(Uri.parse("res:///" + R.drawable.panda));


    }
}
