package com.prabhat.mswipecardsale.androidsupportlibraries;

import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView hellotext;
    Button btnColor;

    private String[] mColorArray={"red", "pink", "purple", "deep_purple",
            "indigo", "blue", "light_blue", "cyan", "teal", "green",
            "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
            "brown", "grey", "blue_grey", "black"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hellotext=findViewById(R.id.helloText);
        btnColor=findViewById(R.id.btnColor);

        if(savedInstanceState!=null){
            hellotext.setTextColor(savedInstanceState.getInt("color"));
        }

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Random random = new Random();

               String colorName=mColorArray[random.nextInt(20)];

                // Get the color identifier that matches the color name.
                int referenceColor=getResources().getIdentifier(colorName,"color",getApplicationContext().getPackageName());

                // Get the color ID from the resources.
                int colorParam=ContextCompat.getColor(MainActivity.this,referenceColor);

                // Set the text color.
                hellotext.setTextColor(colorParam);
                }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("color",hellotext.getCurrentTextColor());
    }
}
