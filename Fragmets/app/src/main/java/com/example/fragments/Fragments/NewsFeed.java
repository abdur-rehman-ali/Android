package com.example.fragments.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragments.OpenActivity;
import com.example.fragments.R;

public class NewsFeed extends Fragment {



    public NewsFeed() {
        // Required empty public constructor
    }

    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news_feed, container, false);
        //Our fragment code will be here
        btn = view.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OpenActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}