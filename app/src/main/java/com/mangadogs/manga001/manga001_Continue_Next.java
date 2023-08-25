package com.mangadogs.manga001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class manga001_Continue_Next extends AppCompatActivity {
    CardView i1, i2, i3, i4, i5, i6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga001_continue_next);


        i1 = findViewById(R.id.q1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.text1);
                Bundle basket = new Bundle();
                basket.putString("abc", s);
                Intent a = new Intent(manga001_Continue_Next.this, manga001_DetailsActivity.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        i2 = findViewById(R.id.q2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.text2);
                Bundle basket = new Bundle();
                basket.putString("abc", s);
                Intent a = new Intent(manga001_Continue_Next.this, manga001_DetailsActivity.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

        i3 = findViewById(R.id.q3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.text3);
                Bundle basket = new Bundle();
                basket.putString("abc", s);
                Intent a = new Intent(manga001_Continue_Next.this, manga001_DetailsActivity.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        i4 = findViewById(R.id.q4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.text4);
                Bundle basket = new Bundle();
                basket.putString("abc", s);
                Intent a = new Intent(manga001_Continue_Next.this, manga001_DetailsActivity.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        i5 = findViewById(R.id.q5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.text5);
                Bundle basket = new Bundle();
                basket.putString("abc", s);
                Intent a = new Intent(manga001_Continue_Next.this, manga001_DetailsActivity.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        i6 = findViewById(R.id.q6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.text6);
                Bundle basket = new Bundle();
                basket.putString("abc", s);
                Intent a = new Intent(manga001_Continue_Next.this, manga001_DetailsActivity.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
    }


}