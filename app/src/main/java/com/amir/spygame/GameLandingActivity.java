package com.amir.spygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class GameLandingActivity extends AppCompatActivity {

    Spinner playerNumberSpinner;
    LottieAnimationView animFrameLanding;
    ConstraintLayout animLayout;
    int numberOfPlayers;
    Button btnStartGame;
    boolean isSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_landing);

        animFrameLanding = findViewById(R.id.animFrameLanding);
        animFrameLanding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GameLandingActivity.this, "HI", Toast.LENGTH_SHORT).show();
                animFrameLanding.playAnimation();
            }
        });

        btnStartGame = findViewById(R.id.btnStartGame);
        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (isSelected) {
                    Intent intent = new Intent(GameLandingActivity.this, MainActivity.class);
                    intent.putExtra("count", numberOfPlayers);
                    startActivity(intent);
                    finish();
                } else if (!isSelected) {
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.mainLayout), "Select Number Of Players", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }*/

                Intent intent = new Intent(GameLandingActivity.this, MainActivity.class);
                //intent.putExtra("count", numberOfPlayers);
                startActivity(intent);
                finish();
            }
        });

        playerNumberSpinner = findViewById(R.id.spinner);
        playerNumberSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                //Toast.makeText(GameLandingActivity.this, "item " + item, Toast.LENGTH_SHORT).show();

                numberOfPlayers = Integer.parseInt(item);
                new GameParameters(numberOfPlayers);
                //GameParameters parameters = new GameParameters();
                //parameters.setPlayerNumber(numberOfPlayers);
                isSelected = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                isSelected = false;
                new GameParameters(numberOfPlayers);
                //GameParameters parameters = new GameParameters();
                //parameters.setPlayerNumber(3);
            }
        });

        ArrayList<String> playerNumberList = new ArrayList<>();
        playerNumberList.add("3");
        playerNumberList.add("4");
        playerNumberList.add("5");
        playerNumberList.add("6");
        playerNumberList.add("7");
        playerNumberList.add("8");
        playerNumberList.add("9");
        playerNumberList.add("10");
        playerNumberList.add("11");
        playerNumberList.add("12");
        playerNumberList.add("13");
        playerNumberList.add("14");
        playerNumberList.add("15");
        playerNumberList.add("16");
        playerNumberList.add("17");
        playerNumberList.add("18");
        playerNumberList.add("19");
        playerNumberList.add("20");
        playerNumberList.add("21");
        playerNumberList.add("22");
        playerNumberList.add("23");
        playerNumberList.add("24");
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, playerNumberList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_style, playerNumberList);

        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        playerNumberSpinner.setAdapter(adapter);
    }
}