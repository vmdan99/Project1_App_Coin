package com.example.callapi.view_model.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.callapi.R;

public class InfoPersonViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView1,imageView2;
    TextView textView;
    public InfoPersonViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView1 = (ImageView)itemView.findViewById(R.id.imageIcon);
        imageView2 = (ImageView)itemView.findViewById(R.id.imageNext);
        textView   = (TextView)itemView.findViewById(R.id.textTerm);
    }
}
