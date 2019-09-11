package com.prabhat.mswipecardsale.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editSend1;
    Button reply;
    TextView textName;
    public static  final String TAG=SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate()");
        setContentView(R.layout.activity_second);

        editSend1=findViewById(R.id.editText1);
        reply=findViewById(R.id.replyButton);
        textName=findViewById(R.id.textSend);
        String message= getIntent().getStringExtra("send");

        textName.setText(message);

        reply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"End Second Activity");
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                String reply= editSend1.getText().toString();
                intent.putExtra("reply",reply);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onSTop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart()");
    }
}
