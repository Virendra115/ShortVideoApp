package com.virendra.shortvideoapp;

public class VideoModel {

    String url;
    String title;
    String description;

    public VideoModel(String url, String title, String description) {
        this.url = url;
        this.title = title;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
