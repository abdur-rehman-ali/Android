package com.example.quotesapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesapp.Models.QuotesScreenModel;
import com.example.quotesapp.R;

import java.util.ArrayList;

public class QuotesScreenAdapter extends RecyclerView.Adapter<QuotesScreenAdapter.QuotesScreenViewHolder> {

    private ArrayList<QuotesScreenModel> dataList;
    private Context mContext;

    public QuotesScreenAdapter(ArrayList<QuotesScreenModel> dataList, Context mContext) {
        this.dataList = dataList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public QuotesScreenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.quotes_screen_layout,parent,false);
        return new QuotesScreenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesScreenViewHolder holder, int position) {

        QuotesScreenModel data = dataList.get(position);
        holder.quote.setText(data.getQuote());
        holder.author.setText(data.getAuthor());
        holder.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,data.getQuote());
                intent.setType("text/plain");
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class QuotesScreenViewHolder extends RecyclerView.ViewHolder
    {
        public TextView quote;
        public TextView author;
        public Button shareBtn;

        public QuotesScreenViewHolder(@NonNull View itemView) {
            super(itemView);
            quote = itemView.findViewById(R.id.quote);
            author = itemView.findViewById(R.id.writer);
            shareBtn = itemView.findViewById(R.id.shareBtn);


        }
    }
}
