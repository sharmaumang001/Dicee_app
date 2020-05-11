package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll_button;
        roll_button= findViewById(R.id.rollButton);

        final ImageView left_dice , right_dice;
        left_dice = findViewById(R.id.dice_left);
        right_dice =findViewById(R.id.dice_right);
        final int[] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt (6);
                left_dice.setImageResource(diceArray[number]);
                int number_2 = randomNumberGenerator.nextInt(6);
                right_dice.setImageResource(diceArray[number_2]);

            }

        });
    }
}
