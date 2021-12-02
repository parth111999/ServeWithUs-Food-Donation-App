package com.scoreleaderz.ServeWithUs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MoredetailsActivity extends AppCompatActivity {

    private Button b1;
    public static String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moredetails);

        b1=(Button)findViewById(R.id.bt1);

    }

    public void btn_close(View view) {
        Intent intent = new Intent(MoredetailsActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}