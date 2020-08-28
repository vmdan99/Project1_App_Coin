package com.example.callapi.view_model.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.callapi.Model.data.infoAddCoin;
import com.example.callapi.R;

import java.util.ArrayList;

public class InfoCoinAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<infoAddCoin> infoAddCoins = new ArrayList<>();

    public InfoCoinAdapter(ArrayList<infoAddCoin> infoAddCoins) {
        this.infoAddCoins = infoAddCoins;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View viewItem =layoutInflater.inflate(R.layout.ls_giao_dich,parent,false);
        return new CoinViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CoinViewHolder coinViewHolder = (CoinViewHolder)holder;
        coinViewHolder.imageView.setImageResource(infoAddCoins.get(position).getImage());
        coinViewHolder.text1.setText(infoAddCoins.get(position).getText1());
        coinViewHolder.text2.setText(infoAddCoins.get(position).getText2());
        coinViewHolder.text3.setText(infoAddCoins.get(position).getText3());
        coinViewHolder.text4.setText(infoAddCoins.get(position).getText4());


    }

    @Override
    public int getItemCount() {
        return infoAddCoins.size();
    }
}
