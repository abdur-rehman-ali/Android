package com.example.fragments;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.fragments.Fragments.NewsFeed;

public class MainActivity extends AppCompatActivity {

    Button newsFeedBtn,profilebtn;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsFeedBtn = findViewById(R.id.newsFeedbtn);
        profilebtn = findViewById(R.id.profileBtn);

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profile profile = new Profile();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear, profile);
                transaction.commit();
            }
        });
        newsFeedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsFeed newsFeed = new NewsFeed();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear, newsFeed);
                transaction.commit();
            }
        });
    }
}