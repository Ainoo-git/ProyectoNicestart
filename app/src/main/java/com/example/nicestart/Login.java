package com.example.nicestart;

import android.content.Intent;
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
<<<<<<< HEAD
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_login);

=======
        setContentView(R.layout.activity_login);
>>>>>>> 77a781ad06cebdad258eb0ae46aced1c284ff1d8
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
<<<<<<< HEAD

    public void SignLogin(View v){
        startActivity(new Intent(Login.this, MainActivity.class));
    }

    public void OpenSignup(View v){
        startActivity(new Intent(Login.this, Signup.class));
    }
}
=======
    public void OpenMain(View v){
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }
}
>>>>>>> 77a781ad06cebdad258eb0ae46aced1c284ff1d8
