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
                intent.putExtra("name", "Время приключений");
                intent.putExtra("type", "Мультсериал");
                intent.putExtra("studio", "Cartoon Network");
                intent.putExtra("series", "10 сезонов");
                intent.putExtra("hron", "25 минут");
                intent.putExtra("zhanr", "Приключение");
                intent.putExtra
                ("description", "Мультсериал повествует нам о невероятных приключениях " +
                        "Финна парнишки и его приятеля Джейка - собаки с магическими способностями.");
                startActivity(intent);
            }
        });

        btnLater2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster2);
                intent.putExtra("name", "Вселенная стивена");
                intent.putExtra("type", "Мультсериал");
                intent.putExtra("studio", "Cartoon Network");
                intent.putExtra("series", "6 сезонов");
                intent.putExtra("hron", "24 минут");
                intent.putExtra("zhanr", "Сказка");
                intent.putExtra
                ("description", "Мультфильм повествует о Стивене – пухлом пареньке, совсем" +
                        " недавно попавшем в число группы интергалактических воителей, каждый из которых" +
                        " символизирует свой камень. Гранат, Аметист и Жемчуг заключёны в их телах и дают " +
                        "своим хозяевам магические силы.");
                startActivity(intent);
            }
        });

        btnLater3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster3);
                intent.putExtra("name", "Гравити фолз");
                intent.putExtra("type", "Мультсериал");
                intent.putExtra("studio", "Disney");
                intent.putExtra("series", "2 сезона");
                intent.putExtra("hron", "23 минут");
                intent.putExtra("zhanr", "Мистика");
                intent.putExtra
                        ("description", "История рассказывает о приключениях близнецов," +
                                "брата и сестры Диппера и Мэйбл Пайнс, чьи летние планы отправляются" +
                                " в чулан, когда родители оправляют их к дальнему родственнику в" +
                                " тихий городок Гравити Фолз.");
                startActivity(intent);
            }
        });

        btnLater4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Catalog.this, Mult.class);
                intent.putExtra("image", R.drawable.poster4);
                intent.putExtra("name", "Врата штейна");
                intent.putExtra("type", "Мультфильм");
                intent.putExtra("studio", "White Fox");
                intent.putExtra("series", "Фильм");
                intent.putExtra("hron", "120 минут");
                intent.putExtra("zhanr", "Триллер");
                intent.putExtra
                        ("description", "Акихабара – интереснейшее место, где обитают" +
                                " самые разные люди – от слегка сдвинутых по фазе до больных на всю " +
                                "голову. Именно такая компания собралась в Лаборатории проблем" +
                                " времени, что над лавкой старых телевизоров.");
                startActivity(intent);
            }
        });
    }
}