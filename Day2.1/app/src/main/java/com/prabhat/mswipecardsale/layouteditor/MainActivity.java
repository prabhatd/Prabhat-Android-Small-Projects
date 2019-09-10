package com.prabhat.mswipecardsale.layouteditor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    TextView text1;

    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.toast);
        btn2=findViewById(R.id.count);
        text1=findViewById(R.id.text_count);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Clicked Toast",Toast.LENGTH_LONG).show();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                if(text1!=null){
                    text1.setText(Integer.toString(count));
                }
            }
        });
    }
}
