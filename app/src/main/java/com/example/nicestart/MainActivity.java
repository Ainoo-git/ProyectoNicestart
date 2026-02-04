package com.example.nicestart;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private WebView miVisorWeb;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // ---------- WEBVIEW ----------
        miVisorWeb = findViewById(R.id.vistaweb);

        String html = "<html>" +
                "<head><style>" +
                "html, body { margin:0; padding:0; height:100%; overflow:hidden; }" +
                "img { width:100%; height:100%; object-fit:cover; }" +
                "</style></head>" +
                "<body>" +
                "<img src='https://thispersondoesnotexist.com' />" +
                "</body></html>";

        miVisorWeb.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);

        // ---------- SWIPE REFRESH ----------
        swipeLayout = findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(() -> {

            Snackbar.make(
                    swipeLayout,
                    "Nueva persona generada",
                    Snackbar.LENGTH_SHORT
            ).show();

            miVisorWeb.reload();
            swipeLayout.setRefreshing(false);
        });

        // Evitar conflicto scroll WebView / Swipe
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            miVisorWeb.setOnScrollChangeListener(
                    (View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) ->
                            swipeLayout.setEnabled(scrollY == 0)
            );
        }
    }

    // ---------- MENU APPBAR ----------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        // ---- PROFILE ----
        if (id == R.id.item_profile) {
            startActivity(new Intent(this, Profile.class));
            return true;
        }

        // ---- MAIN BAB ----
        if (id == R.id.item3) {
            startActivity(new Intent(this, MainBab.class));
            return true;
        }

        // ---- MAIN BN ----
       // if (id == R.id.item4) {
         //   startActivity(new Intent(this, MainBn.class));
           // return true;
        //}

        // ---- SIGN OUT ----
        if (id == R.id.item5) {
            mostrarDialogoLogout();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // ---------- LOGOUT ----------
    private void mostrarDialogoLogout() {

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setTitle("Cerrar sesión");
        builder.setMessage("¿Seguro que quieres salir?");
        builder.setCancelable(true);

        builder.setPositiveButton("Sí", (dialog, which) -> {

            // Borrar sesión
            SharedPreferences prefs = getSharedPreferences("session", MODE_PRIVATE);
            prefs.edit().clear().apply();

            // Ir al Login limpiando
            Intent intent = new Intent(MainActivity.this, Login.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            finish();
        });

        builder.setNegativeButton("Cancelar", (dialog, which) -> dialog.dismiss());

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
