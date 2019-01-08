package com.iodroid.koushik.smartkids90scontentsforkids.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iodroid.koushik.smartkids90scontentsforkids.Presenter.RecyclerviewMovieListPresenter;
import com.iodroid.koushik.smartkids90scontentsforkids.R;
import com.iodroid.koushik.smartkids90scontentsforkids.RecyclerViewHolder.MoviesViewHolder;



public class HorizontalAdapter extends RecyclerView.Adapter<MoviesViewHolder> {


    RecyclerviewMovieListPresenter recylermoviepresenter;
    public HorizontalAdapter(RecyclerviewMovieListPresenter recylermoviepresenter) {
        this.recylermoviepresenter=recylermoviepresenter;

    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_horizontal, viewGroup, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        recylermoviepresenter.onbindview( holder,  position);

    }

    @Override
    public int getItemCount() {
        return recylermoviepresenter.getVideomodelsList().size();
    }


}