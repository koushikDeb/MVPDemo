package com.iodroid.koushik.smartkids90scontentsforkids.Model;

/**
 * Created by amaresh on 04-01-2019.
 */

public class VideoModel {

    String videourl;
    String getVideoid;
    boolean like_unlike;
    String description;
    String category;
    String title;
    String imageurl;
    String overallrating;

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public VideoModel(String videourl, String getVideoid, boolean like_unlike, String description, String category, String title, String imageurl, String overallrating, int views) {
        this.videourl = videourl;
        this.getVideoid = getVideoid;
        this.like_unlike = like_unlike;
        this.description = description;
        this.category = category;
        this.title = title;
        this.imageurl = imageurl;
        this.overallrating = overallrating;
        this.views = views;
    }




    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getGetVideoid() {
        return getVideoid;
    }

    public void setGetVideoid(String getVideoid) {
        this.getVideoid = getVideoid;
    }

    public boolean isLike_unlike() {
        return like_unlike;
    }

    public void setLike_unlike(boolean like_unlike) {
        this.like_unlike = like_unlike;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverallrating() {
        return overallrating;
    }

    public void setOverallrating(String overallrating) {
        this.overallrating = overallrating;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    int views;

}
