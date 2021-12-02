package com.scoreleaderz.ServeWithUs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    private EditText mtxt;
    private TextView ptxt;
    private String number;
    private Button sendbtn, btnn5;
    private static final int REQUEST_SMS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        ptxt = (TextView) findViewById(R.id.sphone);
        mtxt = (EditText) findViewById(R.id.smsg);
        sendbtn = (Button) findViewById(R.id.btns);
    }

    public void sendSms(View v) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            MyMessage();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, REQUEST_SMS);
        }
    }

    public void MyMessage() {

        String Mno = ptxt.getText().toString().trim();
        String Msg = mtxt.getText().toString().trim();

        if (Mno == null || Mno.equals("") || Msg == null || Msg.equals("")) {
            Toast.makeText(this, "Field can't be empty", Toast.LENGTH_SHORT).show();
        } else {
            if (TextUtils.isDigitsOnly(Mno)) {
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(Mno, null, Msg, null, null);
                Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SmsActivity.this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Enter Integers Only", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_SMS: {
                if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    MyMessage();
                } else {
                    Toast.makeText(this, "You required a permission to make a Action", Toast.LENGTH_SHORT).show();
                }

            }
        }
    }

    public void backflotingbtn(View view) {
        Intent intent = new Intent(SmsActivity.this, FeedbackActivity.class);
        startActivity(intent);
        finish();
    }
}