package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_SCREEN_TIME=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread()
        {
            public void run()
            {
                try {
                    //Sleep
                    sleep(SPLASH_SCREEN_TIME);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    //start new activity
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);

                    //By pressing back button we don't want to go to activity from where we came
                    finish();
                }

            }
        };
        thread.start();
    }
}