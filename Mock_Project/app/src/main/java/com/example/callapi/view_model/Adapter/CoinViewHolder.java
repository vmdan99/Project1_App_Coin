package com.example.callapi.view_model.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.callapi.R;

public class CoinViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView text1,text2,text3,text4;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView =(ImageView)itemView.findViewById(R.id.imageView);
        text1 = (TextView)itemView.findViewById(R.id.textView1);
        text2 = (TextView)itemView.findViewById(R.id.textView2);
        text3 = (TextView)itemView.findViewById(R.id.textView3);
        text4 = (TextView)itemView.findViewById(R.id.textView4);
    }
}
