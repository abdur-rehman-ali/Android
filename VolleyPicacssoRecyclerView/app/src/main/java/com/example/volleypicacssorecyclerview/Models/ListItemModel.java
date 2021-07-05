package com.example.volleypicacssorecyclerview.Models;

public class ListItemModel {
    private String url;
    private String name;
    private int likes;

    public ListItemModel(String url, String name, int likes) {
        this.url = url;
        this.name = name;
        this.likes = likes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
