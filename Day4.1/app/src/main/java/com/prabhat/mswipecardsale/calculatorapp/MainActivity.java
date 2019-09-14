package com.prabhat.mswipecardsale.calculatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {

    EditText editFirst,editSecond;
    Button addi,sub,mul,devid;
    TextView result;
    public static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirst=findViewById(R.id.firstNumber);
        editSecond=findViewById(R.id.secondNumber);

        addi=findViewById(R.id.addi);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        devid=findViewById(R.id.devide);

        result=findViewById(R.id.txtResul);



        addi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String firstNumber=editFirst.getText().toString();
                final String secondNumber=editSecond.getText().toString();
                Log.e(TAG,"firstNumber"+firstNumber);
                Log.e(TAG,"SecondNumber"+secondNumber);
                Integer addition=Integer.parseInt(firstNumber) +Integer.parseInt(secondNumber);
                Log.e(TAG,"Addition"+addition);
                result.setVisibility(View.VISIBLE);
                result.setText(Integer.toString(addition));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String firstNumber=editFirst.getText().toString();
                final String secondNumber=editSecond.getText().toString();
                Log.e(TAG,"firstNumber"+firstNumber);
                Log.e(TAG,"SecondNumber"+secondNumber);
                Integer Subtraction=Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                Log.e(TAG,"Addition"+Subtraction);
                result.setVisibility(View.VISIBLE);
                result.setText(Integer.toString(Subtraction));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String firstNumber=editFirst.getText().toString();
                final String secondNumber=editSecond.getText().toString();
                Log.e(TAG,"firstNumber"+firstNumber);
                Log.e(TAG,"SecondNumber"+secondNumber);
                Integer multiply=Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                Log.e(TAG,"Addition"+multiply);
                result.setVisibility(View.VISIBLE);
                result.setText(Integer.toString(multiply));
            }
        });

        devid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String firstNumber=editFirst.getText().toString();
                final String secondNumber=editSecond.getText().toString();
                Log.e(TAG,"firstNumber"+firstNumber);
                Log.e(TAG,"SecondNumber"+secondNumber);
                Double divide=Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                Log.e(TAG,"Addition"+divide);
                result.setVisibility(View.VISIBLE);
                result.setText(Double.toString(divide));
            }
        });
    }
}
