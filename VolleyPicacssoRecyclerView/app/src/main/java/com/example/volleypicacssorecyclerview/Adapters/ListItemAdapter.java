package com.example.volleypicacssorecyclerview.Adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.volleypicacssorecyclerview.Models.ListItemModel;
import com.example.volleypicacssorecyclerview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder> {

    private ArrayList<ListItemModel> data;
    private Context mContext;

    public ListItemAdapter(ArrayList<ListItemModel> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_layout,parent,false);
        return new ListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder holder, int position) {

        ListItemModel listItemModel = data.get(position);
        holder.name.setText(listItemModel.getName());
        holder.likes.setText("Likes " + listItemModel.getLikes());
        Picasso.get().load(Uri.parse(listItemModel.getUrl())).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ListItemViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView image;
        public TextView name;
        public TextView likes;
        public ListItemViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            likes = itemView.findViewById(R.id.likes);
        }
    }
}
