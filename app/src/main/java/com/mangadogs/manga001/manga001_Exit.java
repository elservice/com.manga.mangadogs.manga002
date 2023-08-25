package com.mangadogs.manga001;

import static com.mangadogs.manga001.manga001_SplashActivity.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga001_Exit extends AppCompatActivity {

   


    public void onBackPressed() {
    super.onBackPressed();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.manga001_activity);


        dialogbox(this);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer1, new manga001_WebViewFragment1());
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


        ImageView imageView = (ImageView) findViewById(R.id.exitapp);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga001_Exit.this.startActivity(new Intent(manga001_Exit.this, manga001_Thank_you.class));

            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.btn_no);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                manga001_Exit.this.startActivity(new Intent(manga001_Exit.this, manga001_start_page.class));
            }
        });
    }



    


}