package com.example.tabswithfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.example.tabswithfragments.Adapters.FragmentsAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tab);
        tab.addTab(tab.newTab().setText("Monday"));
        tab.addTab(tab.newTab().setText("Monday"));
        tab.addTab(tab.newTab().setText("Monday"));

        viewPager=findViewById(R.id.viewPager);

        viewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(viewPager);



    }
}