package com.example.kriptonx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import pl.droidsonroids.gif.GifImageView;

public class OnboardingActivity extends AppCompatActivity {

    ImageView OnboardImg;
    GifImageView explore;
    GifImageView secrets;
    LottieAnimationView astraunaut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_onboarding);

        OnboardImg=findViewById(R.id.cyan_image);
        explore=findViewById(R.id.explore);
        secrets=findViewById(R.id.secrets);
        astraunaut=findViewById(R.id.lottie_astraunaut);

        OnboardImg.animate().translationX(-2000).setDuration(2000).setStartDelay(3500);
        astraunaut.animate().translationY(1600).setDuration(2000).setStartDelay(3000);
        explore.animate().translationX(2000).setDuration(2000).setStartDelay(2500);
        secrets.animate().translationX(-2000).setDuration(2000).setStartDelay(2500);


        Thread timer= new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4500);
                    Intent intent = new Intent(OnboardingActivity.this, LoginActivity.class);
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