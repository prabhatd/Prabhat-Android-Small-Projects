package com.prabhat.mswipecardsale.desertordering;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    TextView txtMsg;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        txtMsg= findViewById(R.id.txtOrder);
        radioGroup=findViewById(R.id.radioGroup);
        String myOrder=getIntent().getStringExtra("orderMsg");
        txtMsg.setText(myOrder);
    }

    public void onRadioButtonClicked(View view){
        boolean isChecked=((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.radioSame:
                if(isChecked)
                showToast("You clicked Same Day Button");
                break;
            case R.id.radioNext:
                if (isChecked)
                showToast("You clicked Next Day Button");
                break;
            case R.id.radioPickup:
                if(isChecked)
                showToast("You clicked PickUp Button");
                break;

                default:
                    break;
        }
    }

    public void showToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}
