package com.example.nicestart;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;

    // Listener del gesto deslizar para refrescar
    private SwipeRefreshLayout.OnRefreshListener mOnRefreshListener =
            new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    // Acción al refrescar (ejemplo: mostrar toast)
                    Toast.makeText(MainActivity.this,
                            "Refrescando...", Toast.LENGTH_SHORT).show();

                    // IMPORTANTE → detener la animación del refresh
                    swipeLayout.setRefreshing(false);
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Registramos el TextView para el menú contextual
        TextView mycontext = findViewById(R.id.webMenu);
        registerForContextMenu(mycontext);

        // Obtener el SwipeRefreshLayout y activar el listener
        swipeLayout = findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }

    // Crear menú contextual (mantener pulsado)
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);
    }

    //Métodoo correcto para detectar opción del menú contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
            Toast.makeText(this, "ITEM COPY", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "ITEM DOWNLOADING ITEM", Toast.LENGTH_LONG).show();
        }
        return true;
    }

    // Menú del app bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }
}
