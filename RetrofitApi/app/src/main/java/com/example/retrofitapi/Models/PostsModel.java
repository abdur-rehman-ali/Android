package com.example.retrofitapi.Models;

public class PostsModel {
    private String title;
    private String body;

    public PostsModel() {
    }

    public PostsModel(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

