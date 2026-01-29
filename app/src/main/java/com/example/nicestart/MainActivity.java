package com.example.nicestart;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Context menu sobre la WebView
        WebView myContext = findViewById(R.id.vistaweb);
        registerForContextMenu(myContext);

        // Swipe Refresh
        swipeLayout = findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        // WebView
        myWebView = findViewById(R.id.vistaweb);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        myWebView.loadUrl("https://thispersondoesnotexist.com");

        // Evita conflicto entre scroll de WebView y SwipeRefresh
        myWebView.setOnScrollChangeListener(
                (View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) ->
                        swipeLayout.setEnabled(scrollY == 0)
        );
    }

    // DIÁLOGO MODAL
    public void showAlertDialogButtonClicked(MainActivity mainActivity) {

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setTitle("Ejemplo");
        builder.setMessage("Ejemplo de AlertDialog");
        builder.setCancelable(true);

        builder.setPositiveButton("Si", (dialog, which) -> dialog.dismiss());

        builder.setNegativeButton("No", (dialog, which) -> dialog.dismiss());

        builder.setNeutralButton("Otro", (dialog, which) -> {
            System.exit(0);
            dialog.dismiss();
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // SWIPE REFRESH

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = () -> {

        ConstraintLayout mainLayout = findViewById(R.id.main);

        Snackbar.make(
                mainLayout,
                "Nueva persona generada",
                Snackbar.LENGTH_SHORT
        ).show();

        // Recarga nueva persona
        myWebView.reload();

        swipeLayout.setRefreshing(false);
    };

    // MENU APPBAR

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item3) {
            // Ir a MainBab
            startActivity(new Intent(this, MainBab.class));
            return true;
        }
        if (id == R.id.item_profile) {
            startActivity(new Intent(this, Profile.class));
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    // MENU CONTEXTUAL
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.item1) {
            Toast.makeText(this, "Item1 seleccionado", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.item4) {
            Toast.makeText(this, "Item2 seleccionado", Toast.LENGTH_LONG).show();
        }
        return false;
    }



}
