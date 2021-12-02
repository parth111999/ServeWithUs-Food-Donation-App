package com.scoreleaderz.ServeWithUs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class ServewithusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servewithus);

        VideoView videoView =(VideoView)findViewById(R.id.vdVw);
        //Set MediaController  to enable play, pause, forward, etc options.
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        //Location of Media File
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.servewithus);
        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);

        videoView.requestFocus();
        videoView.start();

    }

    public void backflotingbtn(View view) {
        Intent intent = new Intent(ServewithusActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}