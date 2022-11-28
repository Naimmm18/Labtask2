package com.example.labtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Introduction extends AppCompatActivity {

    ImageView worldcuplogo, worldcupname, img;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        worldcuplogo = findViewById(R.id.WorldCupLogo);
        worldcupname = findViewById(R.id.WorldCupName);
        img = findViewById(R.id.Img);
        lottieAnimationView = findViewById(R.id.Lottie);

        img.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        worldcuplogo.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        worldcupname.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
    }
    }
