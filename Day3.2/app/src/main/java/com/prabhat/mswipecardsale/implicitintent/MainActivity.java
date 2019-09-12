package com.prabhat.mswipecardsale.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editWebsite,editlocation,editShare;
    Button  btnWebsite,btnLocation,btnShare,cameraButton;
    public static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editWebsite=findViewById(R.id.website);
        editlocation= findViewById(R.id.location);
        editShare=findViewById(R.id.share);

        btnWebsite= findViewById(R.id.openWebsite);
        btnLocation=findViewById(R.id.findLoaction);
        btnShare=findViewById(R.id.shareButton);
        cameraButton=findViewById(R.id.cameraButton);
        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=editWebsite.getText().toString();
                Uri webPage=Uri.parse(text);
                Intent intent = new Intent(Intent.ACTION_VIEW,webPage);

                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }else {
                    Log.e(TAG,"Can't handle Intent");
                }
            }
        });

        /*how to use Location Map in android*/

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc=editlocation.getText().toString();

                Uri addressUri=Uri.parse("geo:0,0?q="+loc);
                Intent intent= new Intent(Intent.ACTION_VIEW,addressUri);
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }else{
                    Log.e(TAG,"Can't handle Intent");
                }
            }
        });

        /* Sharing text data to ANyone*/
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=editShare.getText().toString();
                String mimeType="text/plain";
                ShareCompat.IntentBuilder
                        .from(MainActivity.this)
                        .setType(mimeType)
                        .setText(text)
                        .setChooserTitle("Share This Text to Everyone")
                        .startChooser();
            }
        });

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });
    }
}
