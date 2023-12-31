package com.amir.spygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCardsMain;
    CardsAdapter adapter;
    ArrayList<String> cardsListFromUser;

    public boolean isSpy;
    public int firstRandItem, secondRandItem;
    public int currentRandObject;

    public CommonStrings common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardsListFromUser = new ArrayList<>();

        randomObjectOperation();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        rvCardsMain = findViewById(R.id.rvCardsMain);
        rvCardsMain.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        cardsListFromUser.add("Player 1");
        cardsListFromUser.add("Player 2");
        cardsListFromUser.add("Player 3");
        cardsListFromUser.add("Player 4");
        cardsListFromUser.add("Player 5");
        cardsListFromUser.add("Player 6");
        cardsListFromUser.add("Player 7");
        cardsListFromUser.add("Player 8");

        randomSpyOperation(cardsListFromUser);

        adapter = new CardsAdapter(cardsListFromUser, new CardsAdapter.OnItemViewClick() {
            @Override
            public void itemViewClick(int position) {

                if (position == firstRandItem || position == secondRandItem) {
                    //Toast.makeText(MainActivity.this, "spy", Toast.LENGTH_SHORT).show();
                    isSpy = true;
                } else {
                    //Toast.makeText(MainActivity.this, "citizen", Toast.LENGTH_SHORT).show();
                    isSpy = false;
                }

                Intent intent = new Intent(MainActivity.this, PlayerRoleActivity.class);
                intent.putExtra("role", String.valueOf(isSpy));
                startActivity(intent);
            }
        });
        rvCardsMain.setAdapter(adapter);
    }

    private void randomSpyOperation(ArrayList<String> list) {

        Random random = new Random();
        firstRandItem = random.nextInt(list.size());
        secondRandItem = random.nextInt(list.size());

        cardsListFromUser.set(firstRandItem, "Spy 1");
        cardsListFromUser.set(secondRandItem, "Spy 2");


        if (firstRandItem == secondRandItem) {
            //secondRandItem = random.nextInt(list.size());
            Toast.makeText(this, "تشابه", Toast.LENGTH_SHORT).show();
            randomSpyOperation(cardsListFromUser);
        }
    }

    public void randomObjectOperation() {

        common = new CommonStrings();
        ArrayList<String> list = common.getObjectList();

        Random random = new Random();
        currentRandObject = random.nextInt(list.size());

        String t = list.get(currentRandObject);
        Toast.makeText(this, "object: " + t + " / " + currentRandObject, Toast.LENGTH_SHORT).show();


    }
}