package com.prabhat.mswipecardsale.buttoncolorhandler;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DialogImplementActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_implement);
        btn1=findViewById(R.id.dialogButton);
        btn2=findViewById(R.id.datePicker);
    }

    public void alert(View v){
        AlertDialog.Builder builder= new AlertDialog.Builder(DialogImplementActivity.this);

        builder.setTitle("Alert");
        builder.setMessage("Click of to continue and Cancel to stop");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Pressed OK",
                        Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Pressed Cancel",
                        Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void datePicker(View v){
        DialogFragment dialogFragment= new DatePickerFragment();
        dialogFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void processDatePickerResult(int year, int month, int dayOfMonth) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(dayOfMonth);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string + "/" + year_string);

        Toast.makeText(this, "Date: " + dateMessage,
                Toast.LENGTH_SHORT).show();
    }

    public void datePicker2(View v){
        DialogFragment dialogFragment=new TimePickerFragment();
        dialogFragment.show(getSupportFragmentManager(),"timePicker");
    }

    public void processTimePickerResult(int hour,int minutes){
        String hours=Integer.toString(hour);
        String minute=Integer.toString(minutes);

        String timeMessage=(hours+":"+minute);

        Toast.makeText(this,"Hour"+timeMessage,Toast.LENGTH_LONG).show();
    }
}
