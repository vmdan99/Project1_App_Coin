package com.example.ls_giao_dich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data_Coin> arrayList = new ArrayList<>();
    Adapter_Coin_Data adapter_coin_data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        arrayList.add(new Data_Coin(R.drawable.yellow_dollar_coin, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        adapter_coin_data = new Adapter_Coin_Data(arrayList);
        recyclerView.setAdapter(adapter_coin_data);

    }
}