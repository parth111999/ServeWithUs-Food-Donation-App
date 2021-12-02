package com.scoreleaderz.ServeWithUs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutusActivity extends AppCompatActivity {

    private Button b1;
    public static String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        b1=(Button)findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wiki();
            }
        });

    }
    public void wiki(){
        Intent intent=new Intent(this,WikiActivity.class);
        startActivity(intent);
    }

    public void backflotingbtn(View view) {
        Intent intent = new Intent(AboutusActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}