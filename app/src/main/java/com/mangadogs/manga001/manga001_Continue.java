package com.mangadogs.manga001;


import static com.mangadogs.manga001.manga001_SplashActivity.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga001_Continue extends AppCompatActivity {
    ImageView btnContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga001_continue);


        dialogbox(this);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer1, new manga001_WebViewFragment());
            fragmentTransaction.add(R.id.fragmentContainer2, new manga001_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer3, new manga001_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer4, new manga001_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer5, new manga001_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer6, new manga001_WebViewFragment3());
            fragmentTransaction.add(R.id.fragmentContainer7, new manga001_WebViewFragment3());
            fragmentTransaction.add(R.id.fragmentContainer8, new manga001_WebViewFragment3());
            fragmentTransaction.add(R.id.fragmentContainer9, new manga001_WebViewFragment3());
            fragmentTransaction.add(R.id.fragmentContainer10, new manga001_WebViewFragment3());
            fragmentTransaction.commit();
        }


        btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(manga001_Continue.this, manga001_MainActivity2.class);
                startActivity(i);
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();


    }


}