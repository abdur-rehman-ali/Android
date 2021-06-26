package com.example.retrofitapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    //static variable so that we can call it without object
    private static Retrofit retrofit;
    private static final String BASE_URL="https://jsonplaceholder.typicode.com/";

    //Data come from server in JSON form so GsonConvertorFactory is used to convert that JSON
    // to plan java object
    public static Retrofit getRetrofit() {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
