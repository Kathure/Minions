package com.kathure.minions;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;

public class MinionsIntro extends AppIntro {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            addSlide(SampleSlide.newInstance(R.layout.firstfragment));
            addSlide(SampleSlide.newInstance(R.layout.secondfragment));
            addSlide(SampleSlide.newInstance(R.layout.thirdfragment));
            addSlide(SampleSlide.newInstance(R.layout.fourthfragment));

            // Override bar/separator color.
            setBarColor(Color.parseColor("#3F51B5"));
            setSeparatorColor(Color.parseColor("#2196F3"));

            // Hide Skip/Done button.
            showSkipButton(false);
            setProgressButtonEnabled(false);

            // Turn vibration on and set intensity.
            // NOTE: you will probably need to ask VIBRATE permisssion in Manifest.
            setVibrate(true);
            setVibrateIntensity(30);
        }


        @Override
        public void onSkipPressed(Fragment currentFragment) {
            super.onSkipPressed(currentFragment);
            // Do something when users tap on Skip button.
        }

        @Override
        public void onDonePressed(Fragment currentFragment) {
            super.onDonePressed(currentFragment);
            // Do something when users tap on Done button.
        }

        @Override
        public void onSlideChanged() {
            // Do something when the slide changes.
        }

        @Override
        public void onNextPressed() {
            // Do something when users tap on Next button.
        }

    }
