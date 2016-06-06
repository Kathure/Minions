package com.kathure.minions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final VideoView myvideoView = (VideoView) findViewById(R.id.videoView);

        myvideoView.setVideoPath("https://static.videezy.com/system/resources/previews/000/000/160/original/RoadTrip.mp4");

        //play pause stop

        MediaController mediaController = new MediaController (this);
        mediaController.setAnchorView(myvideoView);
        myvideoView.setMediaController(mediaController);


        myvideoView.start();

    }

}
