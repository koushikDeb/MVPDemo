package com.iodroid.koushik.smartkids90scontentsforkids.Presenter;

import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.iodroid.koushik.smartkids90scontentsforkids.RecyclerViewHolder.MoviesViewHolder;

import java.util.List;

/**
 * Created by amaresh on 04-01-2019.
 */

public class RecyclerviewMovieListPresenter {

    private  List<VideoModel> videomodels;

    public RecyclerviewMovieListPresenter(List<VideoModel> videomodels)
    {
        this.videomodels =videomodels;
    }


    public List<VideoModel> getVideomodelsList()
    {
        return videomodels;
    }


    public  void onbindview(MoviesViewHolder viewholder,int position)
    {
       viewholder.setimage(videomodels.get(position).getImageurl());
       viewholder.setDescription(videomodels.get(position).getDescription());
    }




}
