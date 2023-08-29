package com.mangadogs.manga002;

import static com.mangadogs.manga002.manga002_SplashActivity.dialogbox;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class manga002_Next extends AppCompatActivity {
    ImageView start;

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga002_activity_next);

        dialogbox(this);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("fifthcharacter", null);
        String savedData1 = sharedPreferences.getString("sixthcharacter", null);
        if (savedData != null && savedData.equals("1") && savedInstanceState == null) {
            manga002_UnifiedWebViewFragment fragment1 = new manga002_UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment1, "fragmentTag1").commit();
        }
        if (savedData1 != null && savedData1.equals("1") && savedInstanceState == null) {
            manga002_UnifiedWebViewFragment fragment2 = new manga002_UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer1, fragment2, "fragmentTag2").commit();
        }


        this.start = (ImageView) findViewById(R.id.start);


        this.start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga002_Next.this.startActivity(new Intent(manga002_Next.this, manga002_MainActivity.class));

            }
        });
    }


    public void onBackPressed() {
        super.onBackPressed();
    }


}