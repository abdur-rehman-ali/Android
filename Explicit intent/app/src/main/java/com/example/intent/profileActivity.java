package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        textView=findViewById(R.id.textView);
        String text = getIntent().getStringExtra("name");
        textView.setText(text);
    }
}