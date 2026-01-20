package app.example.nicestart;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.nicestart.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class Main extends AppCompatActivity {
    private WebView myWebView;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        WebView myContext = findViewById(R.id.vistaWeb);
        registerForContextMenu(myContext);

        swipeLayout = findViewById(R.id.swipeRefresh);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        myWebView = (WebView) findViewById(R.id.vistaWeb);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        myWebView.loadUrl("file:///android_asset/persona.html");
    }

    // DIÁLOGO MODAL

    public void showAlertDialogButtonClicked(Main mainActivity) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setTitle("Ejemplo");
        builder.setMessage("Ejemplo de AlertDialog");
        builder.setCancelable(true);

        //builder.setView(getLayoutInflater().inflate(R.layout.alertdialog_view, null));

        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNeutralButton("Otro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // SWIPE REFRESH

    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            //Toast toast = Toast.makeText(Main.this, "Ejemplo de Toast", Toast.LENGTH_LONG);
            //toast.show();

            ConstraintLayout mainLayout = findViewById(R.id.main);

            Snackbar snackbar = Snackbar
                    .make(mainLayout, "Nueva persona desbloqueda", Snackbar.LENGTH_LONG);
            snackbar.show();

            myWebView.reload();
            swipeLayout.setRefreshing(false);
        }
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

        if (id == R.id.buscar) {
            Toast toast = Toast.makeText(this, "Pulsado el buscar", Toast.LENGTH_LONG);
            toast.show();
        }
        if (id == R.id.favoritos) {
            Toast toast = Toast.makeText(this, "Pulsado el favoritos", Toast.LENGTH_LONG);
            toast.show();
        }
        if (id == R.id.ajustes) {
            showAlertDialogButtonClicked(Main.this);
        }
        return super.onOptionsItemSelected(item);
    }

    // MENU CONTEXTUAL

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
            Toast toast = Toast.makeText(this, "Item1 seleccionado",
                    Toast.LENGTH_LONG);
            toast.show();
        } else if (item.getItemId() == R.id.item2) {
            Toast toast2 = Toast.makeText(this, "Item2 seleccionado",
                    Toast.LENGTH_LONG);
            toast2.show();
        }
        return false;
    }
}