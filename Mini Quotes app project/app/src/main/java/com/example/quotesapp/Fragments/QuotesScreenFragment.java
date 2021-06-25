package com.example.quotesapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quotesapp.Adapters.QuotesScreenAdapter;
import com.example.quotesapp.Models.QuotesScreenModel;
import com.example.quotesapp.R;

import java.util.ArrayList;

public class QuotesScreenFragment extends Fragment {


    public QuotesScreenFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_quotes_screen, container, false);

        recyclerView = view.findViewById(R.id.quoteScreenRecyclerView);

        ArrayList<QuotesScreenModel> data = new ArrayList<>();
        data.add(new QuotesScreenModel(getString(R.string.quote1),getString(R.string.author1)));
        data.add(new QuotesScreenModel(getString(R.string.quote2),getString(R.string.author2)));
        data.add(new QuotesScreenModel(getString(R.string.quote3),getString(R.string.author3)));
        data.add(new QuotesScreenModel(getString(R.string.quote4),getString(R.string.author4)));
        data.add(new QuotesScreenModel(getString(R.string.quote5),getString(R.string.author5)));
        data.add(new QuotesScreenModel(getString(R.string.quote6),getString(R.string.author6)));
        data.add(new QuotesScreenModel(getString(R.string.quote7),getString(R.string.author7)));
        data.add(new QuotesScreenModel(getString(R.string.quote8),getString(R.string.author8)));
        data.add(new QuotesScreenModel(getString(R.string.quote9),getString(R.string.author9)));
        data.add(new QuotesScreenModel(getString(R.string.quote10),getString(R.string.author10)));

        QuotesScreenAdapter adapter = new QuotesScreenAdapter(data,getContext());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        return view;
    }
}