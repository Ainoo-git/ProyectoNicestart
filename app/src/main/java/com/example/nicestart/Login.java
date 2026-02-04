package com.example.nicestart;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Oculta la barra superior (ActionBar)
        if (getSupportActionBar() != null) getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        // Ajusta la vista para EdgeToEdge (pantallas modernas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // ---------- LOGIN ----------
    public void SignLogin(View v){

        // GUARDA QUE EL USUARIO YA HA INICIADO SESIÓN
        // Esto evita que se le vuelva a pedir login cada vez que entra a la app
        SharedPreferences prefs = getSharedPreferences("session", MODE_PRIVATE);
        prefs.edit()
                .putBoolean("logged", true)
                .apply();

        // Ir a la pantalla principal y limpiar el historial
        Intent intent = new Intent(Login.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    // ---------- ABRIR REGISTRO ----------
    public void OpenSignup(View v){
        startActivity(new Intent(Login.this, Signup.class));
    }
}
