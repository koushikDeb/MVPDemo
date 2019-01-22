package com.iodroid.koushik.smartkids90scontentsforkids.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iodroid.koushik.smartkids90scontentsforkids.Presenter.RecyclerviewMovieListPresenter;
import com.iodroid.koushik.smartkids90scontentsforkids.R;
import com.iodroid.koushik.smartkids90scontentsforkids.RecyclerViewHolder.MoviesViewHolder;
import com.iodroid.koushik.smartkids90scontentsforkids.interfaces.RecyclerviewClickListner;


public class HorizontalAdapter extends RecyclerView.Adapter<MoviesViewHolder> {


    RecyclerviewMovieListPresenter recylermoviepresenter;
    RecyclerviewClickListner onclick;

    public HorizontalAdapter(RecyclerviewMovieListPresenter recylermoviepresenter, RecyclerviewClickListner onclick) {
        this.recylermoviepresenter = recylermoviepresenter;
        this.onclick = onclick;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_horizontal, viewGroup, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        recylermoviepresenter.onbindview(holder, position,onclick);

    }

    @Override
    public int getItemCount() {
        return recylermoviepresenter.getVideomodelsList().size();
    }


}