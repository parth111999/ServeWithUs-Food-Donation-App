package com.scoreleaderz.ServeWithUs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EmailActivity extends AppCompatActivity {

    private Button send, btnc;
    private EditText sub, msg;
    private TextView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        add = (TextView) findViewById(R.id.add);
        sub = (EditText) findViewById(R.id.subject);
        msg = (EditText) findViewById(R.id.msg);
        send = (Button) findViewById(R.id.btn);

        btnc = (Button) findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String recipient = add.getText().toString().trim();
                String subject = sub.getText().toString().trim();
                String message = msg.getText().toString().trim();

                sendEmail(recipient, subject, message);

            }
        });

    }

    private void sendEmail(String recipent, String subject, String message) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto :"));
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{recipent});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        try {
            startActivity(Intent.createChooser(intent, "Choose an Email Client"));

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void backflotingbtn(View view) {
        Intent intent = new Intent(EmailActivity.this, FeedbackActivity.class);
        startActivity(intent);
        finish();

    }
}