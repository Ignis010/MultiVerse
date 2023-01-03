package com.example.multverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Mult extends AppCompatActivity {

    ImageView poster;
    TextView name, type, studio, col_series, hron, zhanr, description;

    private void init(){
        type = findViewById(R.id.textView4);
        studio = findViewById(R.id.textView6);
        col_series = findViewById(R.id.textView8);
        hron = findViewById(R.id.textView10);
        zhanr = findViewById(R.id.textView12);
        description = findViewById(R.id.textView16);
        name = findViewById(R.id.textView);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult);
        init();

        poster = findViewById(R.id.imageView);

        Bundle arguments = getIntent().getExtras();
        int posterIn = (Integer)arguments.get("image");

        String nameData = arguments.getString("name");
        String typeData = arguments.getString("type");
        String studioData = arguments.getString("studio");
        String col_seriesData = arguments.getString("series");
        String hronData = arguments.getString("hron");
        String zhanrData = arguments.getString("zhanr");
        String descriptionData = arguments.getString("description");

        poster.setImageResource(posterIn);
        type.setText(typeData);
        studio.setText(studioData);
        col_series.setText(col_seriesData);
        hron.setText(hronData);
        zhanr.setText(zhanrData);
        description.setText(descriptionData);
        name.setText(nameData);


    }
}