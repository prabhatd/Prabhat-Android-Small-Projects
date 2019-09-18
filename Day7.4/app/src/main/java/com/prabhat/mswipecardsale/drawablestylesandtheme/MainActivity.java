package com.prabhat.mswipecardsale.drawablestylesandtheme;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score1;
    private int score2;
    private TextView mscore1, mscore2;
    int count = 0;

   static final String team1_score="FirstTeam";

    static final String team2_score="SecondTeam";

    public static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mscore1 = findViewById(R.id.score_1);
        mscore2 = findViewById(R.id.score_2);


        if(savedInstanceState!=null){
            score1=savedInstanceState.getInt(team1_score);
            score2=savedInstanceState.getInt(team2_score);

            Log.e(TAG,"score1,score2"+score1+" "+score2);

            mscore1.setText(String.valueOf(score1));
            mscore2.setText(String.valueOf(score2));
        }

    }

    public void increase(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.increaseTeam1:
                score1++;
                mscore1.setText(String.valueOf(score1));
                break;
            case R.id.increaseTeam2:
                score2++;
                mscore2.setText(String.valueOf(score2));
                break;
        }


    }

    public void decrease(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.decreaseTeam1:
                score1--;
                mscore1.setText(String.valueOf(score1));
                break;

            case R.id.decreaseTeam2:
                score2--;
                mscore2.setText(String.valueOf(score2));
                break;
        }
    }


     // Here i have Implemented Dark Theme logic on CLick of menu Button

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        int nightMode = AppCompatDelegate.getDefaultNightMode();

        if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
            menu.findItem(R.id.night_mode).setTitle(R.string.day_mode);
        } else {
            menu.findItem(R.id.night_mode).setTitle(R.string.night_mode);
        }
        return true;
    }

    // Here i have Implemented Dark Theme logic on CLick of menu Button

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.night_mode) {

            int nightMode = AppCompatDelegate.getDefaultNightMode();

            if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
            recreate();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e(TAG,"saveInstance Score1"+score1);

        Log.e(TAG,"saveInstance Score2"+score2);
        outState.putInt(team1_score,score1);
        outState.putInt(team2_score,score2);

        super.onSaveInstanceState(outState);
    }
}
