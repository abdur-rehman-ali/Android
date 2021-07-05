package com.example.volley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class volleySingelton {

    // Idea behind volley singelton class is that
    // we wanted to create only one object of it with the only one request
    // queue and use that request queue in  whole application

    // If your application makes constant use of the network,
    // it's probably most efficient to set up a single instance of RequestQueue
    // that will last the lifetime of your app

    //A key concept is that the RequestQueue must be instantiated with the Application context,
    // not an Activity context.
    // This ensures that the RequestQueue will last for the lifetime of your app,
    // instead of being recreated every time the activity is recreated

    private static volleySingelton mInstance;
    private RequestQueue mRequestQueue;

    //Making constructor private so that we cannot access it outside the class
    private volleySingelton(Context context)
    {
        //As we want that mRequestQueue to exist in lifetime of application
        //so we used getApplicationContext()
        mRequestQueue= Volley.newRequestQueue(context.getApplicationContext());
    }

    //As we cannot call constructor outside the class so we use getInstance() method
    // synchronized is used so that only one thread at a time can access it
    public static synchronized volleySingelton getInstance(Context context)
    {
        if(mInstance==null)
        {
            mInstance=new volleySingelton(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue()
    {
        return mRequestQueue;
    }
}
