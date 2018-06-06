package com.example.demouicontrol;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewEx extends AppCompatActivity {

    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycle","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview);
        videoView = (VideoView) findViewById(R.id.videoView);
        if (mediaController == null) {
            mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
        }

        try {
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.black_hole);
            videoView.setVideoURI(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }

        videoView.setOnPreparedListener(onPreparedListener);
    }

    MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() {
        public void onPrepared(MediaPlayer mediaPlayer) {
            System.out.println("onPrepared");
            if (position == 0) {
                videoView.start();
            }
            mediaPlayer.setOnVideoSizeChangedListener(
                    new MediaPlayer.OnVideoSizeChangedListener() {
                        @Override
                        public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                            System.out.println("onVideoSizeChanged");
                            mediaController.setAnchorView(videoView);
                        }
                    });
        }
    };
}
