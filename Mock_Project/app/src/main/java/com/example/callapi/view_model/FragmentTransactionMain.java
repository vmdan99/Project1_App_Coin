package com.example.callapi.view_model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.callapi.Model.data.infoAddCoin;
import com.example.callapi.R;
import com.example.callapi.view_model.Adapter.InfoCoinAdapter;

import java.util.ArrayList;

public class FragmentTransactionMain extends Fragment {
    FragmentActivity fragmentActivity = getActivity();
    RecyclerView recyclerView;
    ArrayList<infoAddCoin> addCoinArrayList = new ArrayList<>();
    InfoCoinAdapter infoCoinAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transaction,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        initView();
        return view;
    }
    public void initView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fragmentActivity, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);

        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));
        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        addCoinArrayList.add(new infoAddCoin(R.drawable.icons8_cheap_2_64, "Nạp Coin vào ví","Hình thức: Thanh toán tại văn phòng","02-07-2020","+5 Coin"));

        infoCoinAdapter = new InfoCoinAdapter(addCoinArrayList);
        recyclerView.setAdapter(infoCoinAdapter);

    }
}
