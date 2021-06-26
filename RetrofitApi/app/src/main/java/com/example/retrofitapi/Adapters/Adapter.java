package com.example.retrofitapi.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitapi.ModelClass;
import com.example.retrofitapi.Models.PostsModel;
import com.example.retrofitapi.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> postsModels;
    private Context mContext;

    public Adapter(List<ModelClass> postsModels, Context mContext) {
        this.postsModels = postsModels;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_items_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass postsModel = postsModels.get(position);
        holder.title.setText(postsModel.getTitle());
        holder.body.setText(postsModel.getBody());

    }

    @Override
    public int getItemCount() {
        return postsModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView title;
        TextView body;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);

        }
    }
}
