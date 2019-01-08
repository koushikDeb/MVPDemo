package com.iodroid.koushik.smartkids90scontentsforkids.MainMVP;

import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.List;

/**
 * Created by amaresh on 05-01-2019.
 */

public interface MainMVP_interface {

    interface view{
       public void populaterecycerView(MultiSnapRecyclerView firstRecyclerView, List<VideoModel> rplist);
    }

    interface presenter
    {
       public void createMovieslist(MultiSnapRecyclerView myrecyler);
       public void createshortcartoonslist(MultiSnapRecyclerView myrecyler);
       public void craeteknowledgelist(MultiSnapRecyclerView myrecyler);
    }

}
