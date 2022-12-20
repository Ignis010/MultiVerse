package com.example.multverse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Catalog extends AppCompatActivity {

    Button btnLater, btnLater2, btnLater3, btnLater4;

    private void init(){
        btnLater = findViewById(R.id.later);
        btnLater2 = findViewById(R.id.later2);
        btnLater3 = findViewById(R.id.later3);
        btnLater4 = findViewById(R.id.later4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        init();

        btnLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster1);
                startActivity(intent);
            }
        });

        btnLater2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster2);
                startActivity(intent);
            }
        });

        btnLater3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster3);
                startActivity(intent);
            }
        });

        btnLater4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster4);
                startActivity(intent);
            }
        });
    }
}