package com.prabhat.mswipecardsale.desertordering;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {
    private String mOrdermsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                Intent intent = new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra("orderMsg",mOrdermsg);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
/*
        int id = item.getItemId();
*/

     /*   //noinspection SimplifiableIfStatement
        if (id == R.id.action_contact) {
            return true;
        }*/

     switch (item.getItemId()){
         case R.id.action_order:
            Intent intent = new Intent(MainActivity.this,OrderActivity.class);
            startActivity(intent);
                 return true;

         case R.id.action_favorites:
             displayToast("You clicked The favourite button");
             return true;

         case R.id.action_status:
             displayToast("You want to Know the Statu of Application");
                return true;
         case R.id.action_contact:
             displayToast("You clicked Contact Access Button");
             return true;

             default:
     }

        return super.onOptionsItemSelected(item);
    }

    public void donut(View v){
/*
        Toast.makeText(MainActivity.this,"You ordered a donut.",Toast.LENGTH_LONG).show();
*/
        mOrdermsg="You ordered a donut.";
        displayToast(mOrdermsg);
    }

    public void froyo(View v){
/*
        Toast.makeText(MainActivity.this,"You ordered a FroYo.",Toast.LENGTH_LONG).show();
*/
    mOrdermsg="You ordered a FroYo.";
    displayToast(mOrdermsg);
    }

    public void icecream(View v){
/*
        Toast.makeText(MainActivity.this,"You ordered an ice cream sandwich.",Toast.LENGTH_LONG).show();
*/

        mOrdermsg="You ordered an ice cream sandwich.";
         displayToast(mOrdermsg);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}
