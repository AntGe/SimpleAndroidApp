package co.centroida.myapplication;

import com.google.gson.annotations.SerializedName;

/*
* Created by Antonio on 6/15/2017
* Copyright (c) 2017 Centroida. All rights reserved.
*/
public class Book {
    @SerializedName("Id")
    private int id;
    @SerializedName("Name")
    private String name;
    @SerializedName("PictureURL")
    private String pictureURL;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPictureURL() {
        return pictureURL;
    }
}

