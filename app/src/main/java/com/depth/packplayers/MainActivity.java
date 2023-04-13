package com.depth.packplayers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView cardImage;
    private TextView cardName;
    private Button openButton;

    private Card[] cards = {
                new Card("1", R.mipmap.a),
                new Card("2", R.mipmap.b),
                new Card("3", R.mipmap.c),
                new Card("4", R.mipmap.c),
                new Card("5", R.mipmap.e),
                new Card("6", R.mipmap.f),
                new Card("7", R.mipmap.g),
                new Card("8", R.mipmap.h),
                new Card("9", R.mipmap.i),
                new Card("10", R.mipmap.j),
                new Card("11", R.mipmap.k),
                new Card("12", R.mipmap.l),
                new Card("13", R.mipmap.m),
                new Card("14", R.mipmap.n),
                new Card("15", R.mipmap.o),
                new Card("16", R.mipmap.q),
                new Card("17", R.mipmap.r),
                new Card("18", R.mipmap.s),
                new Card("19", R.mipmap.t),
                new Card("20", R.mipmap.aa),
                new Card("21", R.mipmap.aaa),
                new Card("22", R.mipmap.aaaa),
                new Card("23", R.mipmap.aaaaa),
                new Card("24", R.mipmap.bb),
                new Card("25", R.mipmap.bbb),
                new Card("26", R.mipmap.bbbb),
                new Card("27", R.mipmap.bbbbb),
                new Card("28", R.mipmap.cc),
                new Card("29", R.mipmap.ccc),
                new Card("30", R.mipmap.cccc),
                new Card("31", R.mipmap.ccccc),
                new Card("32", R.mipmap.dd),
                new Card("33", R.mipmap.ddd),
                new Card("34", R.mipmap.dddd),
                new Card("35", R.mipmap.ddddd),
                new Card("36", R.mipmap.ee),
                new Card("37", R.mipmap.eee),
                new Card("38", R.mipmap.eeee),
                new Card("39", R.mipmap.eeeee),
                new Card("40", R.mipmap.ff),
                new Card("41", R.mipmap.fff),
                new Card("42", R.mipmap.ffff),
                new Card("43", R.mipmap.fffff),
                new Card("44", R.mipmap.gg),
                new Card("45", R.mipmap.ggg),
                new Card("46", R.mipmap.gggg),
                new Card("47", R.mipmap.ggggg),
                new Card("48", R.mipmap.hh),
                new Card("49", R.mipmap.hhh),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardImage = findViewById(R.id.card_image);
        cardName = findViewById(R.id.card_name);
        openButton = findViewById(R.id.open_button);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPack();
            }
        });
    }

    private void openPack() {
        Random random = new Random();
        int index = random.nextInt(cards.length);

        Card card = cards[index];
        cardImage.setImageResource(card.getImageResource());
        cardName.setText(card.getName());
    }
    public void refreshActivity(View view) {
        recreate();
    }
}
