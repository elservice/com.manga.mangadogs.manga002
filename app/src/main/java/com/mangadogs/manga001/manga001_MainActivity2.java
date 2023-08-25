package com.mangadogs.manga001;


import static com.mangadogs.manga001.manga001_SplashActivity.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga001_MainActivity2 extends AppCompatActivity {

    Button btn1;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga001_main2);



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




        btn1 = findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(manga001_MainActivity2.this, manga001_Continue_Next.class);
                startActivity(i);
            }
        });
    }




    

    public void onBackPressed() {
        super.onBackPressed();
    


    }

}

