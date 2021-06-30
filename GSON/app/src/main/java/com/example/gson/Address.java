package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("city")
    private String mCity;

    @SerializedName("country")
    private String mCountry;

    public Address(String mCity, String mCountry) {
        this.mCity = mCity;
        this.mCountry = mCountry;
    }
}
