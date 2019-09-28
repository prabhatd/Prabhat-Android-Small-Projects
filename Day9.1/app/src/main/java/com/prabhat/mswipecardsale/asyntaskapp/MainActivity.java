package com.prabhat.mswipecardsale.asyntaskapp;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    private final String TEXT_STATUS="currentText";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.asysnTask);

        if(savedInstanceState!=null){
            mTextView.setText(savedInstanceState.getString(TEXT_STATUS));
        }

    }

    public void startTask(View v){
    mTextView.setText("Napping...");

    new SimpleAsyncTask(mTextView).execute();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(TEXT_STATUS,mTextView.getText().toString());
    }
}
