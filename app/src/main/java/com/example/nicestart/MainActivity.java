package com.example.nicestart;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;

    // Listener del gesto deslizar para refrescar
    private final SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = () -> {
        Toast.makeText(MainActivity.this, "Refrescando...", Toast.LENGTH_SHORT).show();
        swipeLayout.setRefreshing(false);
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        swipeLayout = findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }

    // Menú contextual
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
            Toast.makeText(this, "ITEM COPY", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "ITEM DOWNLOADING ITEM", Toast.LENGTH_LONG).show();
        }
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item5) {
            // Mostrar el AlertDialog cuando se pulse Signup
            showAlertDialog();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void showAlertDialog() {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setTitle("Achtung!");
        builder.setMessage("Where do you go?");
        builder.setIcon(R.drawable.baseline_emoji_people_24);

        builder.setPositiveButton("Yes", (dialog, which) -> {
            Toast.makeText(MainActivity.this, "You clicked Yes", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        builder.setNegativeButton("No", (dialog, which) -> {
            Toast.makeText(MainActivity.this, "You clicked No", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        builder.setNeutralButton("Can't say", (dialog, which) -> {
            Toast.makeText(MainActivity.this, "You clicked Can't say", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        builder.create().show();
    }
}
