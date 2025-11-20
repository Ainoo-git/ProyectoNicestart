package com.example.nicestart;

import static kotlinx.coroutines.android.HandlerDispatcherKt.Main;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {
private SwipeRefreshLayout swipeLayout;
    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener= new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Toast toast0= Toast.makeText(MainActivity.this,"Hi there!  ",Toast.LENGTH_LONG);
            toast0.show();
            swipeLayout.setRefreshing(false);
        }
    };
    public boolean onContextItemSlected(MenuItem item){
        if(item.getItemId() == R.id.item1){
            Toast toast = Toast.makeText(this, "ITEM COPY", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast2 = Toast.makeText(this, "ITEM DOWLOADING ITEM", Toast.LENGTH_LONG);
            toast2.show();
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView mycontext = findViewById(R.id.webMenu);
        registerForContextMenu(mycontext);

        swipeLayout = findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

}
