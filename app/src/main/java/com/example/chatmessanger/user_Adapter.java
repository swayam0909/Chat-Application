package com.example.chatmessanger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class user_Adapter extends RecyclerView.Adapter<user_Adapter.viewholder> {
    Context context;

    ArrayList<Users> usersArrayList;
    public user_Adapter( Context context, ArrayList<Users> usersArrayList) {
        this.context = context;
        this.usersArrayList = usersArrayList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item,parent,false);
        return  new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Users users = usersArrayList.get(position);
        holder.username.setText(users.userName);
        holder.staus.setText(users.status);
        Picasso.get().load(users.profilepic).into(holder.profileimg);
    }

    @Override
    public int getItemCount() {
        return usersArrayList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        CircleImageView profileimg;
        TextView username;
        TextView staus;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            profileimg = itemView.findViewById(R.id.profile_image);
            username = itemView.findViewById(R.id.username);
            staus = itemView.findViewById(R.id.status);
        }
    }
}
