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

import com.example.callapi.Model.data.infoPerson;
import com.example.callapi.R;
import com.example.callapi.view_model.Adapter.InfoPersonAdapter;

import java.util.ArrayList;

public class FragmentPersonal extends Fragment {
    ArrayList<infoPerson> values1 = new ArrayList<>();
    ArrayList<infoPerson> values2 = new ArrayList<>();
    InfoPersonAdapter valuesAdapter1,valuesAdapter2;
    RecyclerView recyclerView,recyclerView1;
    View view;
    FragmentActivity fragmentActivity = getActivity();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          view = inflater.inflate(R.layout.fragment_personal,container,false);
          recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
          initView();
          recyclerView1 = (RecyclerView)view.findViewById(R.id.recyclerView1);
          initView2();
        return view;
    }

    public void initView() {
         //recyclerView =(RecyclerView)view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(fragmentActivity, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        values1.add(new infoPerson(R.drawable.my_qr_code, "Mã QR của tôi", R.drawable.next_page_foreground));
        values1.add(new infoPerson(R.drawable.credit_card, "Quản lý nạp tiền", R.drawable.next_page_foreground));
        values1.add(new infoPerson(R.drawable.transaction_list, "Quản lý thông tin tài khoản", R.drawable.next_page_foreground));
        values1.add(new infoPerson(R.drawable.notification, "Cài đặt thông báo", R.drawable.next_page_foreground));
        values1.add(new infoPerson(R.drawable.sounds, "Cài đặt âm thanh", R.drawable.next_page_foreground));

        valuesAdapter1 = new InfoPersonAdapter(values1);
        recyclerView.setAdapter(valuesAdapter1);
    }
    public  void initView2(){
        //recyclerView =(RecyclerView)view.findViewById(R.id.recyclerView1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(fragmentActivity,LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(layoutManager);
        values2.add(new infoPerson(R.drawable.real_hoi_cham,"Trợ giúp",R.drawable.next_page_foreground));
        values2.add(new infoPerson(R.drawable.chinh_sach_dv,"Chính sách dịch vụ",R.drawable.next_page_foreground));

        valuesAdapter2 = new InfoPersonAdapter(values2);
        recyclerView.setAdapter(valuesAdapter2);


    }
}
