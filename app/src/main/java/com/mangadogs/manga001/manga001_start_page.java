package com.mangadogs.manga001;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga001_start_page extends AppCompatActivity {
    ImageView start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga001_start_page);

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

                manga001_start_page.this.startActivity(new Intent(manga001_start_page.this, manga001_Next.class));

            }
        });
    }

    public void onBackPressed() {

        manga001_start_page.this.startActivity(new Intent(manga001_start_page.this, manga001_Exit.class));

    }

}