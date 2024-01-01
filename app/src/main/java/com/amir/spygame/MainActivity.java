package com.amir.spygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCardsMain;
    CardsAdapter adapter;
    ArrayList<String> cardsListFromUser;

    public boolean isSpy;
    public int firstRandItem, secondRandItem, thirdRandomItem, fourthRandomItem, fifthRandomItem, sixthRandomItem;
    public int currentRandObject;

    public CommonStrings common;
    public int numberOfList;
    int rvSpanCount;

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

        numberOfList = getIntent().getIntExtra("count", 3);

        if (numberOfList >= 1 && numberOfList <= 8) {
            rvSpanCount = 2;
        } else if (numberOfList >= 9 && numberOfList <= 16) {
            rvSpanCount = 3;
        } else if (numberOfList >= 17) {
            rvSpanCount = 4;
        }

        rvCardsMain.setLayoutManager(new GridLayoutManager(MainActivity.this, rvSpanCount));


        for (int i = 1; i <= numberOfList; i++) {
            cardsListFromUser.add("Player " + i);
        }

//        cardsListFromUser.add("Player 1");
//        cardsListFromUser.add("Player 2");
//        cardsListFromUser.add("Player 3");
//        cardsListFromUser.add("Player 4");
//        cardsListFromUser.add("Player 5");
//        cardsListFromUser.add("Player 6");
//        cardsListFromUser.add("Player 7");
//        cardsListFromUser.add("Player 8");

        checkNumberOfSpyByPlayers(cardsListFromUser);

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

    private void checkNumberOfSpyByPlayers(ArrayList<String> list) {


        if (numberOfList >= 1 && numberOfList <= 4) {
            generateRandomSpyByNumber(list, 0);
        } else if (numberOfList >= 5 && numberOfList <= 8) {
            generateRandomSpyByNumber(list, 1);
        } else if (numberOfList >= 9 && numberOfList <= 12) {
            generateRandomSpyByNumber(list, 2);
        } else if (numberOfList >= 13 && numberOfList <= 16) {
            generateRandomSpyByNumber(list, 3);
        } else if (numberOfList >= 17 && numberOfList <= 20) {
            generateRandomSpyByNumber(list, 4);
        } else if (numberOfList >= 21 && numberOfList <= 24) {
            generateRandomSpyByNumber(list, 5);
        }
    }

    private void generateRandomSpyByNumber(ArrayList<String> list, int stair) {

        Random random = new Random();

        switch (stair) {
            case 0: //4
                firstRandItem = random.nextInt(list.size());
                cardsListFromUser.set(firstRandItem, "Spy 1");
                break;

            case 1: //8
                firstRandItem = random.nextInt(list.size());
                secondRandItem = random.nextInt(list.size());

                cardsListFromUser.set(firstRandItem, "Spy 1");
                cardsListFromUser.set(secondRandItem, "Spy 2");


                if (firstRandItem == secondRandItem) {
                    //secondRandItem = random.nextInt(list.size());
                    Toast.makeText(this, "similarity in rand", Toast.LENGTH_SHORT).show();
                    checkNumberOfSpyByPlayers(cardsListFromUser);
                }
                break;

            case 2: //12
                firstRandItem = random.nextInt(list.size());
                secondRandItem = random.nextInt(list.size());
                thirdRandomItem = random.nextInt(list.size());

                cardsListFromUser.set(firstRandItem, "Spy 1");
                cardsListFromUser.set(secondRandItem, "Spy 2");
                cardsListFromUser.set(thirdRandomItem, "Spy 3");

                if (firstRandItem == secondRandItem || firstRandItem == thirdRandomItem || secondRandItem == thirdRandomItem) {
                    //secondRandItem = random.nextInt(list.size());
                    Toast.makeText(this, "similarity in rand", Toast.LENGTH_SHORT).show();
                    checkNumberOfSpyByPlayers(cardsListFromUser);
                }
                break;

            case 3: //16
                firstRandItem = random.nextInt(list.size());
                secondRandItem = random.nextInt(list.size());
                thirdRandomItem = random.nextInt(list.size());
                fourthRandomItem = random.nextInt(list.size());

                cardsListFromUser.set(firstRandItem, "Spy 1");
                cardsListFromUser.set(secondRandItem, "Spy 2");
                cardsListFromUser.set(thirdRandomItem, "Spy 3");
                cardsListFromUser.set(fourthRandomItem, "Spy 4");

                if (firstRandItem == secondRandItem || firstRandItem == thirdRandomItem || secondRandItem == thirdRandomItem ||
                        fourthRandomItem == firstRandItem || fourthRandomItem == secondRandItem || fourthRandomItem == thirdRandomItem) {
                    //secondRandItem = random.nextInt(list.size());
                    Toast.makeText(this, "similarity in rand", Toast.LENGTH_SHORT).show();
                    checkNumberOfSpyByPlayers(cardsListFromUser);
                }
                break;

            case 4: //20
                firstRandItem = random.nextInt(list.size());
                secondRandItem = random.nextInt(list.size());
                thirdRandomItem = random.nextInt(list.size());
                fourthRandomItem = random.nextInt(list.size());
                fifthRandomItem = random.nextInt(list.size());

                cardsListFromUser.set(firstRandItem, "Spy 1");
                cardsListFromUser.set(secondRandItem, "Spy 2");
                cardsListFromUser.set(thirdRandomItem, "Spy 3");
                cardsListFromUser.set(fourthRandomItem, "Spy 4");
                cardsListFromUser.set(fifthRandomItem, "Spy 5");

                if (firstRandItem == secondRandItem || firstRandItem == thirdRandomItem || secondRandItem == thirdRandomItem ||
                        fourthRandomItem == firstRandItem || fourthRandomItem == secondRandItem || fourthRandomItem == thirdRandomItem ||
                        fifthRandomItem == firstRandItem || fifthRandomItem == secondRandItem || fifthRandomItem == thirdRandomItem || fifthRandomItem == fourthRandomItem) {
                    //secondRandItem = random.nextInt(list.size());
                    Toast.makeText(this, "similarity in rand", Toast.LENGTH_SHORT).show();
                    checkNumberOfSpyByPlayers(cardsListFromUser);
                }
                break;

            case 5: //24
                firstRandItem = random.nextInt(list.size());
                secondRandItem = random.nextInt(list.size());
                thirdRandomItem = random.nextInt(list.size());
                fourthRandomItem = random.nextInt(list.size());
                fifthRandomItem = random.nextInt(list.size());
                sixthRandomItem = random.nextInt(list.size());

                cardsListFromUser.set(firstRandItem, "Spy 1");
                cardsListFromUser.set(secondRandItem, "Spy 2");
                cardsListFromUser.set(thirdRandomItem, "Spy 3");
                cardsListFromUser.set(fourthRandomItem, "Spy 4");
                cardsListFromUser.set(fifthRandomItem, "Spy 5");
                cardsListFromUser.set(sixthRandomItem, "Spy 6");

                if (firstRandItem == secondRandItem || firstRandItem == thirdRandomItem || secondRandItem == thirdRandomItem ||
                        fourthRandomItem == firstRandItem || fourthRandomItem == secondRandItem || fourthRandomItem == thirdRandomItem ||
                        fifthRandomItem == firstRandItem || fifthRandomItem == secondRandItem || fifthRandomItem == thirdRandomItem || fifthRandomItem == fourthRandomItem ||
                        sixthRandomItem == firstRandItem || sixthRandomItem == secondRandItem || sixthRandomItem == thirdRandomItem || sixthRandomItem == fourthRandomItem ||
                        sixthRandomItem == fifthRandomItem) {
                    //secondRandItem = random.nextInt(list.size());
                    Toast.makeText(this, "similarity in rand", Toast.LENGTH_SHORT).show();
                    checkNumberOfSpyByPlayers(cardsListFromUser);
                }
                break;

            default:
                Log.i("E_TAG", "generateSpyByNumber: ");
                break;
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