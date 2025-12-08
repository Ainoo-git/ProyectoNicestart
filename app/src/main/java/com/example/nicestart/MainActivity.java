package com.example.nicestart;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private WebView miVisorWeb;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //  usar el ID correcto del ConstraintLayout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), (v, insets) -> {
            Insets sysBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(sysBars.left, sysBars.top, sysBars.right, sysBars.bottom);
            return insets;
        });

        // SwipeRefreshLayout
        swipeLayout = findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        // WebView
        miVisorWeb = findViewById(R.id.vistaweb);

        String html =
                "<html>" +
                        "<head><style>" +
                        "html, body { margin:0; padding:0; height:100%; overflow:hidden; }" +
                        "img { width:100%; height:100%; object-fit:cover; }" +
                        "</style></head>" +
                        "<body>" +
                        "<img src='https://thispersondoesnotexist.com' />" +
                        "</body></html>";

        miVisorWeb.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);

        registerForContextMenu(miVisorWeb);

        miVisorWeb.setOnLongClickListener(v -> {
            openContextMenu(miVisorWeb);
            return true;
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.item1) {
            Toast.makeText(this, "Item copied", Toast.LENGTH_LONG).show();

        } else if (item.getItemId() == R.id.item2) {
            Toast.makeText(this, "Downloading item...", Toast.LENGTH_LONG).show();

        } else if (item.getItemId() == R.id.item5) {

            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
            builder.setTitle("¿Quieres salir?");
            builder.setMessage("Acción importante");

            builder.setPositiveButton("Ir al login", (dialog, which) -> {
                Intent intent = new Intent(MainActivity.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            });

            builder.setNegativeButton("Cancelar", (dialog, which) -> dialog.dismiss());

            AlertDialog dialog = builder.create();
            dialog.show();
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

        if (id == R.id.item_profile) {
            startActivity(new Intent(MainActivity.this, Profile.class));
            return true;
        }

        if (id == R.id.item5) {
            showAlertDialogButtonClicked();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showAlertDialogButtonClicked() {

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
        builder.setTitle("Options!!");
        builder.setMessage("Where do you go?");
        builder.setIcon(R.drawable.baseline_emoji_people_24);

        builder.setPositiveButton("Scrolling", (dialog, which) ->
                Toast.makeText(MainActivity.this, "Scrolling...", Toast.LENGTH_LONG).show()
        );

        builder.setNegativeButton("Do nothing", (dialog, which) -> dialog.dismiss());

        builder.setNeutralButton("Other", (dialog, which) -> {
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });

        builder.show();
    }

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener =
            () -> {
                Toast.makeText(MainActivity.this,
                        "Hi there! I don't exist :)",
                        Toast.LENGTH_LONG).show();
                swipeLayout.setRefreshing(false);
            };
}
