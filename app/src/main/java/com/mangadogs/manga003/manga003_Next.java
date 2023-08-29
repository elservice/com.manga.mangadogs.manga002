package com.mangadogs.manga003;

import static com.mangadogs.manga003.manga003_SplashActivity.dialogbox;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class manga003_Next extends AppCompatActivity {
    ImageView start;

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga003_activity_next);

        dialogbox(this);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("fifthcharacter", null);
        String savedData1 = sharedPreferences.getString("sixthcharacter", null);
        if (savedData != null && savedData.equals("1") && savedInstanceState == null) {
            manga003_UnifiedWebViewFragment fragment1 = new manga003_UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment1, "fragmentTag1").commit();
        }
        if (savedData1 != null && savedData1.equals("1") && savedInstanceState == null) {
            manga003_UnifiedWebViewFragment fragment2 = new manga003_UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer1, fragment2, "fragmentTag2").commit();
        }


        this.start = (ImageView) findViewById(R.id.start);


        this.start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga003_Next.this.startActivity(new Intent(manga003_Next.this, manga003_MainActivity.class));

            }
        });
    }


    public void onBackPressed() {
        super.onBackPressed();
    }


}