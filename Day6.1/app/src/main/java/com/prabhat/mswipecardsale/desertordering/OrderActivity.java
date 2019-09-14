package com.prabhat.mswipecardsale.desertordering;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
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

        Spinner spinner = findViewById(R.id.label_spinner);
        if(spinner!=null){
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.labels_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if(spinner!=null){
            spinner.setAdapter(adapter);
        }
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String spinnerlable=parent.getItemAtPosition(position).toString();
            showToast(spinnerlable);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
