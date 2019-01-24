
package com.iodroid.koushik.smartkids90scontentsforkids.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.iodroid.koushik.smartkids90scontentsforkids.Base.BaseActivity;
import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.iodroid.koushik.smartkids90scontentsforkids.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerInitListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by amaresh on 10-01-2019.
 */

public class VideoviewActivity extends BaseActivity {

    @BindView(R.id.youtube_player_view)
    YouTubePlayerView youtube_player_view;
    VideoModel vm;
    Unbinder unbinder;
    YouTubePlayer youtube_player;
    YouTubePlayerInitListener mylistner;

    @Override
    protected void onActivityCreated() {

        unbinder = ButterKnife.bind(this);
        vm = (VideoModel) getIntent().getSerializableExtra("videomodel");

        youtube_player_view = findViewById(R.id.youtube_player_view);


        mylistner = new YouTubePlayerInitListener() {
            @Override
            public void onInitSuccess(@NonNull final YouTubePlayer initializedYouTubePlayer) {
                youtube_player = initializedYouTubePlayer;
                youtube_player.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady() {
                        String videoId = vm.getVideourl();
                        youtube_player.loadVideo(videoId, 0);
                    }
                });
            }
        };
        getLifecycle().addObserver(youtube_player_view);

        youtube_player_view.addFullScreenListener(new YouTubePlayerFullScreenListener() {
            @Override
            public void onYouTubePlayerEnterFullScreen() {

                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

            }

            @Override
            public void onYouTubePlayerExitFullScreen() {

                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        });

        youtube_player_view.initialize(mylistner, true);

    }


    @Override
    public void onResume() {
        super.onResume();
        if (getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            toggletoolbar();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        youtube_player.pause(); // to stop the player when the activity/fragment is not visibile
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // youtube_player_view.release();
    }

    @Override
    protected int addActivityLayout() {
        return R.layout.videoview;
    }

    @Override
    protected String getToolbartitle() {
        return vm.getCategory();
    }

    @Override
    protected void onbackpresscalled() {
        if (getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            youtube_player_view.exitFullScreen();
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            toggletoolbar();

        } else {
            Intent i = new Intent(this, MainActivity.class);
            youtube_player.pause();
            youtube_player_view.release();
            startactivitycustomexit(i);
        }
    }


}