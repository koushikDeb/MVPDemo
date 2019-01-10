package com.iodroid.koushik.smartkids90scontentsforkids.interfaces;

import com.iodroid.koushik.smartkids90scontentsforkids.Model.VideoModel;

/**
 * Created by amaresh on 04-01-2019.
 */

public interface RowView {


    public void setimage(String url);
    public void setDescription(String description);
public void setOnclicklistner(VideoModel vm, RecyclerviewClickListner onclick);

}
