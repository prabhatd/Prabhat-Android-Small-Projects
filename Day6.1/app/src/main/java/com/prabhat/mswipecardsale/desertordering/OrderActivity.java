package com.prabhat.mswipecardsale.desertordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        txtMsg= findViewById(R.id.txtOrder);
        String myOrder=getIntent().getStringExtra("orderMsg");
        txtMsg.setText(myOrder);
    }
}
