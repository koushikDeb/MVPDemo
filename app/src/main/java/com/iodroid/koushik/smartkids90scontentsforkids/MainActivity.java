package com.iodroid.koushik.smartkids90scontentsforkids;
import android.support.v7.widget.LinearLayoutManager;

import com.iodroid.koushik.smartkids90scontentsforkids.Adapters.HorizontalAdapter;
import com.iodroid.koushik.smartkids90scontentsforkids.Base.BaseActivity;
import com.iodroid.koushik.smartkids90scontentsforkids.MainMVP.MainMVP_interface;
import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.iodroid.koushik.smartkids90scontentsforkids.Presenter.MainPresenter;
import com.iodroid.koushik.smartkids90scontentsforkids.Presenter.RecyclerviewMovieListPresenter;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity implements MainMVP_interface.view {



    MainPresenter mainp;
    MultiSnapRecyclerView firstRecyclerView,shortRecyclerView,knowledgeRecyclerView;
    @Override
    protected void onActivityCreated() {

        mainp = new MainPresenter(this);
         firstRecyclerView = (MultiSnapRecyclerView)findViewById(R.id.recyclermovies);
         shortRecyclerView = (MultiSnapRecyclerView)findViewById(R.id.recyclershortcartoons);
         knowledgeRecyclerView = (MultiSnapRecyclerView)findViewById(R.id.recyclerknowledge);
        mainp.createMovieslist( firstRecyclerView);
        mainp.createshortcartoonslist(shortRecyclerView);
        mainp.craeteknowledgelist(knowledgeRecyclerView);



    }







    @Override
    protected int addActivityLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected String getToolbartitle() {
        return "Home";
    }




    public void populaterecycerView(MultiSnapRecyclerView firstRecyclerView1, List<VideoModel> rplist) {

        RecyclerviewMovieListPresenter rp = new RecyclerviewMovieListPresenter(rplist);
        HorizontalAdapter firstAdapter = new HorizontalAdapter(rp);
        LinearLayoutManager firstManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        firstRecyclerView1.setLayoutManager(firstManager);
        firstRecyclerView1.setAdapter(firstAdapter);

    }

    @Override
    public void populaterecycerViewmovie(List<VideoModel> rplist) {
        populaterecycerView(firstRecyclerView,rplist);
    }

    @Override
    public void populaterecycerViewshort(List<VideoModel> rplist) {
        populaterecycerView(shortRecyclerView,rplist);
    }

    @Override
    public void populaterecycerViewknowledge(List<VideoModel> rplist) {
        populaterecycerView(knowledgeRecyclerView,rplist);
    }
}




