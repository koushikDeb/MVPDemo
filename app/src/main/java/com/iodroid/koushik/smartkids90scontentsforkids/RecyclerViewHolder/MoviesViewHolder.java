package com.iodroid.koushik.smartkids90scontentsforkids.RecyclerViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.iodroid.koushik.smartkids90scontentsforkids.R;
import com.iodroid.koushik.smartkids90scontentsforkids.interfaces.RowView;



public class MoviesViewHolder extends RecyclerView.ViewHolder implements RowView {
    private ImageView movieimageview;
    private TextView description;

    public MoviesViewHolder( View itemView) {
        super(itemView);

        this.movieimageview = (ImageView) itemView.findViewById(R.id.movieimageview);
        this.description = (TextView) itemView.findViewById(R.id.description);

    }

    @Override
    public void setimage(String url) {
       Glide.with(itemView.getContext()).load(url).into(movieimageview);
    }

    @Override
    public void setDescription(String descriptiontext) {
        description.setText(descriptiontext);
    }
}