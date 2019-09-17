package com.prabhat.mswipecardsale.drawablestylesandtheme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score1;
    private int score2;
    private TextView mscore1,mscore2;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mscore1=findViewById(R.id.score_1);
        mscore2=findViewById(R.id.score_2);

    }

    public void increase(View v){
        int id=v.getId();
        switch (id){
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
    public void decrease(View v){
        int id=v.getId();
        switch (id){
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
}
