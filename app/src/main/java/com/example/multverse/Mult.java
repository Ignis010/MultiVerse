package com.example.multverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Mult extends AppCompatActivity {

    ImageView poster;
    TextView type, studio, col_series, hron, zhanr;

    private void init(){
        type = findViewById(R.id.textView4);
        type = findViewById(R.id.textView4);
        type = findViewById(R.id.textView4);
        type = findViewById(R.id.textView4);
        type = findViewById(R.id.textView4);
        type = findViewById(R.id.textView4);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult);

        poster = findViewById(R.id.imageView);

        Bundle arguments = getIntent().getExtras();
       int posterIn = Integer.parseInt((String) arguments.get("image"));

        poster.setImageResource(posterIn);
    }
}