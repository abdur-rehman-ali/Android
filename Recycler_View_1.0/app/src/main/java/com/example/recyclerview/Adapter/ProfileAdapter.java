package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Profile;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileItemViewHolder> {

    private ArrayList<Profile> usersList;
    private Context mContext;

    public ProfileAdapter(Context mContext,ArrayList<Profile> usersList) {
        this.usersList = usersList;
        this.mContext = mContext;
    }


    //This function is used to inflate our layout file
    @NonNull
    @Override
    public ProfileItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
//        View view = layoutInflater.inflate(R.layout.users_list_item_layout,parent,false);
//        ProfileItemViewHolder viewHolder = new ProfileItemViewHolder(view);
//        return viewHolder;

        // Same as done by above lines of code
        View view = LayoutInflater.from(mContext).inflate(R.layout.users_list_item_layout, parent, false);
        return new ProfileItemViewHolder(view);
    }

    //Used to get data from our model object and show in list
    @Override
    public void onBindViewHolder(@NonNull ProfileItemViewHolder holder, int position) {

     Profile profile=  usersList.get(position);
     holder.username.setText(profile.getName());
     holder.profileImage.setImageResource(profile.getImageResource());

    switch (position)
    {
        case 0:
            holder.profileImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "First image clicked", Toast.LENGTH_SHORT).show();
                }
            });

            holder.username.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "First text clicked", Toast.LENGTH_SHORT).show();
                }
            });
            break;
        case 1:
            holder.profileImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "Second image clicked", Toast.LENGTH_SHORT).show();
                }
            });

            holder.username.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "Second text clicked", Toast.LENGTH_SHORT).show();
                }
            });
            break;
        default:
            break;

    }

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    //This class is used to target items in our layout file
    public class ProfileItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView profileImage;
        public TextView username;

        public ProfileItemViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profileImage);
            username = itemView.findViewById(R.id.username);

        }
    }
}
