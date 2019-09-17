package com.prabhat.mswipecardsale.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl=findViewById(R.id.activity_main);
        t=new ActionBarDrawerToggle(this,dl,R.string.open,R.string.close);
        t.setDrawerIndicatorEnabled(true);
        dl.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        nv=findViewById(R.id.nv);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();

                switch (id){
                    case R.id.account:
                        Toast.makeText(MainActivity.this,"My Account",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.settings:
                        Toast.makeText(MainActivity.this,"My Setting",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.mycart:
                        Toast.makeText(MainActivity.this,"My Cart",Toast.LENGTH_LONG).show();
                        break;
                        default:
                            return true;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(t.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
