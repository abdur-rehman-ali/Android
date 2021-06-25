package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.quotesapp.Adapters.FragmentsAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Targeting views
        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);

        viewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        tabs.setupWithViewPager(viewPager);
    }
}