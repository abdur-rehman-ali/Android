package com.example.memesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Button sharebtn;
    private Button nextbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Targeting views
        image = findViewById(R.id.imageView);
        sharebtn = findViewById(R.id.sharebtn);
        nextbtn = findViewById(R.id.nextbtn);


        //Adding click events
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareMeme();
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextMeme();
            }
        });
    }

    private void nextMeme() {
        Toast.makeText(this, "Next btn clciked", Toast.LENGTH_SHORT).show();
    }

    private void shareMeme() {
        Toast.makeText(this, "Share btn clicked", Toast.LENGTH_SHORT).show();
    }
}