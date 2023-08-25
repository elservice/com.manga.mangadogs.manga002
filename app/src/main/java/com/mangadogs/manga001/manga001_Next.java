package com.mangadogs.manga001;

import static com.mangadogs.manga001.manga001_SplashActivity.dialogbox;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga001_Next extends AppCompatActivity {
    ImageView start;

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga001_activity_next);

        dialogbox(this);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("thirdcharacter", null);
        String savedData1 = sharedPreferences.getString("forthcharacter", null);
        if (savedData != null && savedData.equals("1") && savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer, new manga001_WebViewFragment());
            fragmentTransaction.commit();
        }
        if (savedData1 != null && savedData1.equals("1") && savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer1, new manga001_WebViewFragment2());
            fragmentTransaction.commit();
        }


        this.start = (ImageView) findViewById(R.id.start);


        this.start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga001_Next.this.startActivity(new Intent(manga001_Next.this, manga001_MainActivity.class));

            }
        });
    }


    public void onBackPressed() {
        super.onBackPressed();
    }


}