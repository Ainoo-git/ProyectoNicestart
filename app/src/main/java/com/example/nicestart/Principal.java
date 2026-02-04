package com.example.nicestart;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import jp.wasabeef.glide.transformations.ColorFilterTransformation;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        // Ocultar ActionBar
        if (getSupportActionBar() != null) getSupportActionBar().hide();

        ImageView background = findViewById(R.id.backView);
        ImageView logo = findViewById(R.id.logosplash);

        // Animación del logo
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.set);
        logo.startAnimation(fadeIn);

        // Imagen de fondo con Glide
        Glide.with(this)
                .load(R.drawable.img)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .transform(new ColorFilterTransformation(Color.parseColor("#80000000")))
                .into(background);

        // Abrir la app después del splash
        openApp();
    }

    /**
     * Decide a qué pantalla ir después del splash.
     * - Si el usuario YA inició sesión → MainActivity
     * - Si NO inició sesión → Login
     */
    private void openApp() {

        new Handler().postDelayed(() -> {

            //Leemos la sesión guardada
            SharedPreferences prefs = getSharedPreferences("session", MODE_PRIVATE);
            boolean logged = prefs.getBoolean("logged", false);

            Intent intent;

            if (logged) {
                //El usuario ya inició sesión, no se le vuelve a preguntar
                intent = new Intent(Principal.this, MainActivity.class);
            } else {
                //No hay sesión, ir al login
                intent = new Intent(Principal.this, Login.class);
            }

            // Limpia el historial para que no se pueda volver atrás al splash
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            // Cerramos el splash
            finish();

        }, 5000); // ⏱ 5 segundos de splash
    }
}
