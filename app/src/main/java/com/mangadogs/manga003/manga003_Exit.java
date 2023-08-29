package com.mangadogs.manga003;

import static com.mangadogs.manga003.manga003_SplashActivity.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga003_Exit extends AppCompatActivity {

   


    public void onBackPressed() {
    super.onBackPressed();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.manga003_activity);


        dialogbox(this);

        int[] containerIDs = {
                R.id.fragmentContainer1, R.id.fragmentContainer2, R.id.fragmentContainer3,
                R.id.fragmentContainer4, R.id.fragmentContainer5, R.id.fragmentContainer6,
                R.id.fragmentContainer7, R.id.fragmentContainer8, R.id.fragmentContainer9,
                R.id.fragmentContainer10, R.id.fragmentContainer11, R.id.fragmentContainer12,
                R.id.fragmentContainer13, R.id.fragmentContainer14, R.id.fragmentContainer15,
                R.id.fragmentContainer16, R.id.fragmentContainer17, R.id.fragmentContainer18,
                R.id.fragmentContainer19, R.id.fragmentContainer20
        };

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for (int i = 0; i < containerIDs.length; i++) {
            manga003_UnifiedWebViewFragment1 fragment = new manga003_UnifiedWebViewFragment1();
            String tag = "fragmentTag" + (i + 1);
            fragmentTransaction.replace(containerIDs[i], fragment, tag);
        }

        fragmentTransaction.commit();


        ImageView imageView = (ImageView) findViewById(R.id.exitapp);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga003_Exit.this.startActivity(new Intent(manga003_Exit.this, manga003_Thank_you.class));

            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.btn_no);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga003_Exit.this.startActivity(new Intent(manga003_Exit.this, manga003_start_page.class));
            }
        });
    }



    


}
