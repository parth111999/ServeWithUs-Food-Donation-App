package com.scoreleaderz.ServeWithUs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class GalleryActivity extends AppCompatActivity {

    ProgressDialog progressBar;
    private int progressBarStatus = 0;
    private Handler progressBarHandler = new Handler();
    private long fileSize = 0;
    private ProgressDialog progressDialog;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        onClickListener();

        b1=(Button)findViewById(R.id.btnss);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GalleryActivity.this,SlideShowActivity.class);
                startActivity(intent);
            }
        });

    }
    public void onClickListener(){

        progressBar = new ProgressDialog(this);
        progressBar.setCancelable(true);
        progressBar.setMessage("File downloading ...");
        progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressBar.setProgress(0);
        progressBar.setMax(100);
        progressBar.show();

        progressBarStatus = 0;
        fileSize = 0;

        new Thread(new Runnable() {
            public void run() {
                while (progressBarStatus < 100) {

                    progressBarStatus = doOperation();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    progressBarHandler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressBarStatus);
                        }
                    });
                }

                if (progressBarStatus >= 100) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    progressBar.dismiss();
                }
            }
        }).start();

    }

    public int doOperation() {

        while (fileSize <= 10000)
        {
            fileSize++;
            if (fileSize == 1000) {
                return 10;
            }
            else if (fileSize == 2000) {
                return 20;
            }
            else if (fileSize == 3000) {
                return 30;
            }
            else if (fileSize == 4000) {
                return 40;
            }

        }
        return 100;
    }
    public void backflotingbtn(View view) {
        Intent intent = new Intent(GalleryActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}