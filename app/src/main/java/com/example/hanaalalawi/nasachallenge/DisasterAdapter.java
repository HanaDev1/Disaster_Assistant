package com.example.hanaalalawi.nasachallenge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class DisasterAdapter extends RecyclerView.Adapter<DisasterAdapter.MyViewHolder> {

    private Context mContext;
    private List<Disaster> disList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView img;
        public CardView cardView;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            img = (ImageView) view.findViewById(R.id.dis_img);
            cardView = (CardView) view.findViewById(R.id.card_view);

        }
    }

    public DisasterAdapter(Context mContext, List<Disaster> List) {
        this.mContext = mContext;
        this.disList = List;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.disaster_cards, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        Disaster disaster = disList.get(position);
        holder.name.setText(disaster.getName());
        Glide.with(mContext).load(disaster.getImg()).into(holder.img);

        final String name = disaster.getName();
        final String dicreption = disaster.getDescription();
        final int img = disaster.getImg();

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DisasterDetails.class);
                Bundle bundle = new Bundle();
                bundle.putString("dis_name", name);
                //bundle.putString("dis_dis", dicreption);
                bundle.putString("dis_img", String.valueOf(img));
                intent.putExtras(bundle);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);//clear all activities before the signin
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return disList.size();
    }
}
