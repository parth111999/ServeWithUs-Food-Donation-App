package com.scoreleaderz.ServeWithUs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FeedbackActivity extends AppCompatActivity {

    private static final String TAG = "FeedbackActivity" ;
    private Button bm,be;
    private ImageButton im,ie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        bm=(Button)findViewById(R.id.btnmsg);
        be=(Button)findViewById(R.id.btnemail);

        im=(ImageButton)findViewById(R.id.imageButton);
        ie=(ImageButton)findViewById(R.id.imageButton2);

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FeedbackActivity.this,SmsActivity.class);
                startActivity(intent);
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FeedbackActivity.this,EmailActivity.class);
                startActivity(intent);
            }
        });


        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FeedbackActivity.this,SmsActivity.class);
                startActivity(intent);
            }
        });

        ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FeedbackActivity.this,EmailActivity.class);
                startActivity(intent);
            }
        });
    }


    public void backflotingbtn(View view) {
        Intent intent = new Intent(FeedbackActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}