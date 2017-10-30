package com.londonappbrewery.magiceightball;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button)findViewById(R.id.button_ask);
        final ImageView ballDisplay = (ImageView)findViewById(R.id.image_eightBall);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random generateRandomNumber = new Random();
                int number = generateRandomNumber.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}