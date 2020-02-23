package com.mycode.everything.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class HeroesDetailActivity extends AppCompatActivity {
    ImageView ivHero;
    TextView tvName, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_detail);


        ivHero = findViewById(R.id.hero_image);
        tvName = findViewById(R.id.hero_name);
        tvDetail = findViewById(R.id.hero_detail);

        String heroName = getIntent().getStringExtra("hero_name");
        int heroImage = getIntent().getIntExtra("hero_image",0);
        String heroDetail = getIntent().getStringExtra("hero_detail");

        tvName.setText(heroName);
        tvDetail.setText(heroDetail);

        Glide.with(this)
                .asBitmap()
                .load(heroImage)
                .into(ivHero);

    }


}
