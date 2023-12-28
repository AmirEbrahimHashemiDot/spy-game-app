package com.amir.spygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCardsMain;
    CardsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        rvCardsMain = findViewById(R.id.rvCardsMain);
        rvCardsMain.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        rvCardsMain.setAdapter(new CardsAdapter());
    }
}