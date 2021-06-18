package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.ProfileAdapter;
import com.example.recyclerview.Model.Profile;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //targeting views
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Profile> users = new ArrayList<Profile>();
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));
        users.add(new Profile("Joiya",R.drawable.image));

        ProfileAdapter adapter = new ProfileAdapter(getApplicationContext(),users);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);
//
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        GridLayoutManager layoutManager = new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);

//        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(layoutManager);


    }
}