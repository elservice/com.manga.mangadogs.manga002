package com.mangadogs.manga002;

import static com.mangadogs.manga002.manga002_SplashActivity.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class manga002_MainActivity extends AppCompatActivity {
    Button btnStart, btnShare, btnRate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga002_main);


        dialogbox(this);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("seventhcharacter", null);
        String savedData1 = sharedPreferences.getString("eighthcharacter", null);
        if (savedData != null && savedData.equals("1") && savedInstanceState == null) {
            manga002_UnifiedWebViewFragment fragment1 = new manga002_UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment1, "fragmentTag1").commit();
        }
        if (savedData1 != null && savedData1.equals("1") && savedInstanceState == null) {
            manga002_UnifiedWebViewFragment fragment2 = new manga002_UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer1, fragment2, "fragmentTag2").commit();
        }


        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(manga002_MainActivity.this, manga002_Continue.class);
                startActivity(i);
            }
        });

        btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String shareMessage = getString(R.string.app_name);
                    shareMessage = shareMessage + "\nhttps://play.google.com/store/apps/details?id=" + getPackageName();
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                }

            }
        });

        btnRate = findViewById(R.id.btnRate);
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
                Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(myAppLinkToMarket);
                } catch (ActivityNotFoundException e) {
                }
            }
        });


    }

    public void onBackPressed() {
        super.onBackPressed();


    }


}