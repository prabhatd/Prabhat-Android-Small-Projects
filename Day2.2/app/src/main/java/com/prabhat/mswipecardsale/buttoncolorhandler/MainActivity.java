package com.prabhat.mswipecardsale.buttoncolorhandler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textArticle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textArticle = findViewById(R.id.article);
        registerForContextMenu(textArticle);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.edit:
                showToast("Edit choice clicked.");
                return true;

            case R.id.share:
                showToast("Share choice clicked.");
                return true;

            case R.id.delete:
                showToast("Delete choice clicked.");
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }

    public void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
    public void next(View v){
        Intent intent = new Intent(MainActivity.this,DialogImplementActivity.class);
        startActivity(intent);
    }
}
