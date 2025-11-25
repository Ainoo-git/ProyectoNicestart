package com.example.nicestart;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;



public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


//    Glide for loading girls, fondo de la pantalla del login, se coge el id
        ImageView icono = findViewById(R.id.profile_image);

        Glide.with(this)
                .load(R.drawable.baseline_person_24)
                .circleCrop()
                .into(icono);
    }
}