package com.example.tatrakids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    CardView balance, education, map, saving, transactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        balance = findViewById(R.id.balance);
        education = findViewById(R.id.education);
        map = findViewById(R.id.map);
        saving = findViewById(R.id.saving);
        transactions = findViewById(R.id.transactions);

        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, BalanceActivity.class));
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.home:
                break;

            case R.id.payment:
                startActivity(new Intent(HomeActivity.this, PaymentActivity.class));
                break;

            case R.id.settings:
                startActivity(new Intent(HomeActivity.this, SettingActivity.class));
                break;
        }
        return false;
    }
}