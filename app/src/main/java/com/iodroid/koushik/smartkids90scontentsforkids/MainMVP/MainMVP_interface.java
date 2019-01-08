package com.iodroid.koushik.smartkids90scontentsforkids.MainMVP;

import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.List;

/**
 * Created by amaresh on 05-01-2019.
 */

public interface MainMVP_interface {

    interface view{
       public void populaterecycerViewmovie( List<VideoModel> rplist);
        public void populaterecycerViewshort(List<VideoModel> rplist);
        public void populaterecycerViewknowledge( List<VideoModel> rplist);
    }

    interface presenter
    {
       public void createMovieslist(MultiSnapRecyclerView myrecyler);
       public void createshortcartoonslist(MultiSnapRecyclerView myrecyler);
       public void craeteknowledgelist(MultiSnapRecyclerView myrecyler);
    }

}
