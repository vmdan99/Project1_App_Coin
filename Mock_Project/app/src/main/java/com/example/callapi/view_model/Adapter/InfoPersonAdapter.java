package com.example.callapi.view_model.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.callapi.Model.data.infoPerson;
import com.example.callapi.R;

import java.util.ArrayList;

public class InfoPersonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<infoPerson> values = new ArrayList<>();

    public InfoPersonAdapter(ArrayList<infoPerson> values) {
        this.values = values;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new InfoPersonViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        InfoPersonViewHolder mainViewHolder = (InfoPersonViewHolder)holder;
        mainViewHolder.imageView1.setImageResource(values.get(position).getImage());
        mainViewHolder.imageView2.setImageResource(values.get(position).getImage2());
        mainViewHolder.textView.setText(values.get(position).getText());
    }
    @Override
    public int getItemCount() {
        return values.size();
    }
}
