package com.example.multverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Mult extends AppCompatActivity {

    ImageView poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult);

        poster = findViewById(R.id.imageView);

        Bundle arguments = getIntent().getExtras();
       int posterIn = Integer.parseInt((String) arguments.get("hello"));

        poster.setImageResource(posterIn);
    }
}