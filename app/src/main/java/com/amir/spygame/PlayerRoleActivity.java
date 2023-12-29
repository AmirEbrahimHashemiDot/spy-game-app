package com.amir.spygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class PlayerRoleActivity extends AppCompatActivity {

    ImageView imgPlayerPic;
    TextView tvPlayerName, tvPlayerRole;
    Button btnIGotIt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_role);

        imgPlayerPic = findViewById(R.id.imgPlayerPic);
        tvPlayerName = findViewById(R.id.tvPlayerName);
        tvPlayerRole = findViewById(R.id.tvPlayerRole);
        btnIGotIt = findViewById(R.id.btnIGotIt);



        String player_role = getIntent().getStringExtra("role");
        if (Objects.equals(player_role, "true")) {
            tvPlayerRole.setText("Spy");
        } else if (Objects.equals(player_role, "false")){
            tvPlayerRole.setText("Citizen");
        }


        Toast.makeText(this, player_role, Toast.LENGTH_SHORT).show();
    }
}