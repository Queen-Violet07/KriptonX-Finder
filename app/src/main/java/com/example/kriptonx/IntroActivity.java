package com.example.kriptonx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

import pl.droidsonroids.gif.GifImageView;

public class IntroActivity extends AppCompatActivity {

    ImageView splashImg;
    LottieAnimationView planet;
    LottieAnimationView rocket;
    GifImageView logo;
   // Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);


        logo = findViewById(R.id.logo);
        splashImg = findViewById(R.id.cyan_image);
        planet = findViewById(R.id.lottie_planet);
        rocket = findViewById(R.id.lottie_rocket);

        splashImg.animate().translationY(-2600).setDuration(2000).setStartDelay(3800);
        logo.animate().translationY(2000).setDuration(2000).setStartDelay(3500);
        planet.animate().translationX(-1400).setDuration(2000).setStartDelay(3000);
        rocket.animate().translationX(1400).setDuration(2000).setStartDelay(3000);

        Thread timer= new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5100);
                    Intent intent = new Intent(IntroActivity.this, OnboardingActivity.class);
                    startActivity(intent);
                    finish();
                    super.run();;
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        timer.start();

    }

}