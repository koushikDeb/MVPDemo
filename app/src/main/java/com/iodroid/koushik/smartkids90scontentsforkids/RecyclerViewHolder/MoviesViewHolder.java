package com.iodroid.koushik.smartkids90scontentsforkids.RecyclerViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;
import com.iodroid.koushik.smartkids90scontentsforkids.R;
import com.iodroid.koushik.smartkids90scontentsforkids.interfaces.RecyclerviewClickListner;
import com.iodroid.koushik.smartkids90scontentsforkids.interfaces.RowView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class MoviesViewHolder extends RecyclerView.ViewHolder implements RowView {


    public ImageView movieimageview;

    public TextView description;


    public MoviesViewHolder(View itemView) {
        super(itemView);


        description = (TextView) itemView.findViewById(R.id.description);
        movieimageview = (ImageView) itemView.findViewById(R.id.movieimageview);
    }

    @Override
    public void setimage(String url) {
        Glide.with(itemView.getContext()).load(url).into(movieimageview);
    }

    @Override
    public void setDescription(String descriptiontext) {
        description.setText(descriptiontext);
    }


    @Override
    public void setOnclicklistner(final VideoModel vm, final RecyclerviewClickListner onclick) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclick.onclick(vm);
            }
        });
    }


}