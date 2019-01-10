
package com.iodroid.koushik.smartkids90scontentsforkids.Activity;

import android.arch.lifecycle.LifecycleObserver;
import android.support.annotation.NonNull;

import com.iodroid.koushik.smartkids90scontentsforkids.Base.BaseActivity;
import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.iodroid.koushik.smartkids90scontentsforkids.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;
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

    @Override
    protected void onActivityCreated() {

        unbinder = ButterKnife.bind(this);
        vm = (VideoModel) getIntent().getSerializableExtra("videomodel");

        youtube_player_view = findViewById(R.id.youtube_player_view);

        getLifecycle().addObserver(youtube_player_view);

        youtube_player_view.initialize(new YouTubePlayerInitListener() {
            @Override
            public void onInitSuccess(@NonNull final YouTubePlayer initializedYouTubePlayer) {
                initializedYouTubePlayer.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady() {
                        String videoId = vm.getVideourl();
                        initializedYouTubePlayer.loadVideo(videoId, 0);
                    }
                });
            }
        }, true);

    }



    @Override
    protected void onbackpresscalled() {
        if (youtube_player_view.isFullScreen()) {
            youtube_player_view.exitFullScreen();

        }
        else {
            youtube_player_view.release();
            super.onBackPressed();
        }
    }

    @Override
    protected int addActivityLayout() {
        return R.layout.videoview;
    }

    @Override
    protected String getToolbartitle() {
        return vm.getCategory();
    }
}
