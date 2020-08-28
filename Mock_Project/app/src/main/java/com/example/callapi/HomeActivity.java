package com.example.callapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.callapi.view_model.FragmentBuy;
import com.example.callapi.view_model.FragmentHome;
import com.example.callapi.view_model.FragmentPersonal;
import com.example.callapi.view_model.FragmentTransactionMain;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;
    public  static BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trang_chu);
        fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.frame_layout_home, new FragmentHome(), null);
        fragmentTransaction.commit();
         bottomNavigationView = findViewById(R.id.bottomNavigation);
         bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

    public BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new FragmentHome();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home, selectedFragment, null).commit();
                            break;

                        case R.id.nav_load_coin:
                            selectedFragment = new FragmentBuy();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home, selectedFragment, null).commit();
                            break;

                        case R.id.nav_buy:
                            Intent intent = new Intent(HomeActivity.this, ActivityCoin.class);
                            startActivity(intent);
                            break;

                        case R.id.nav_transaction:
                            selectedFragment = new FragmentTransactionMain();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home, selectedFragment, null).commit();
                            break;

                        case R.id.nav_person:
                            selectedFragment = new FragmentPersonal();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home, selectedFragment, null).commit();
                            break;
                    }
                    return true;
                }
            };
}
