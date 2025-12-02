package com.example.nicestart;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeRLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        swipeRLayout = findViewById(R.id.myswipe);
        swipeRLayout.setOnRefreshListener(monRefreshListener);

        WebView mycontext = findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);


    }

    protected SwipeRefreshLayout.OnRefreshListener monRefreshListener =
            new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    Toast.makeText(MainActivity.this, "Hola, has recargado la pagina", Toast.LENGTH_LONG).show();
                    swipeRLayout.setRefreshing(false);
                }
            };


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

        if (id == R.id.item_profile) {
            Intent intent = new Intent(MainActivity.this, Profile.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.item5) {
            showAlertDialogButtonClicked(MainActivity.this);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void showAlertDialogButtonClicked(MainActivity mainActivity){
        //alert builder
        MaterialAlertDialogBuilder builder=new MaterialAlertDialogBuilder(this);
        //el dialogo
        builder.setTitle("Options!!");
        builder.setMessage("Where do you go?");
        builder.setIcon(R.drawable.baseline_emoji_people_24);
        builder.setCancelable(true);
        //añadir botones
        builder.setPositiveButton("Scrolling", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                Toast toast = Toast.makeText(MainActivity.this, "Scrolling...", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        builder.setNegativeButton("Do nothing", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setNeutralButton("Other", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                //System.exit(0);
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }


}
