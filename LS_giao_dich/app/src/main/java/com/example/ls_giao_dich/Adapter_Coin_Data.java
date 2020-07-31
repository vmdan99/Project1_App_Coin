package com.example.ls_giao_dich;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Adapter_Coin_Data extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Data_Coin> arrayList = new ArrayList<>();

    public Adapter_Coin_Data(ArrayList<Data_Coin> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View viewItem =layoutInflater.inflate(R.layout.ls_giao_dich,parent,false);

        return new MainViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MainViewHolder mainViewHolder = (MainViewHolder)holder;
        mainViewHolder.imageView.setImageResource(arrayList.get(position).getImage());
        mainViewHolder.text1.setText(arrayList.get(position).getText1());
        mainViewHolder.text2.setText(arrayList.get(position).getText2());
        mainViewHolder.text3.setText(arrayList.get(position).getText3());
        mainViewHolder.text4.setText(arrayList.get(position).getText4());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
class MainViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView text1,text2,text3,text4;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView =(ImageView)itemView.findViewById(R.id.imageView);
        text1 = (TextView)itemView.findViewById(R.id.textView1);
        text2 = (TextView)itemView.findViewById(R.id.textView2);
        text3 = (TextView)itemView.findViewById(R.id.textView3);
        text4 = (TextView)itemView.findViewById(R.id.textView4);
    }
}
