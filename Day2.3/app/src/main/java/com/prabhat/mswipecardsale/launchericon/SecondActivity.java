package com.prabhat.mswipecardsale.launchericon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editSend1;
    Button reply;
    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editSend1=findViewById(R.id.editText1);
        reply=findViewById(R.id.replyButton);
        textName=findViewById(R.id.textSend);
        String message= getIntent().getStringExtra("send");

        textName.setText(message);

        reply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                String reply= editSend1.getText().toString();
                intent.putExtra("reply",reply);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
