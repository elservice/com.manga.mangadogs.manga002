package com.mangadogs.manga001;

import static com.mangadogs.manga001.manga001_SplashActivity.dialogbox;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class manga001_DetailsActivity extends AppCompatActivity {

    TextView detail_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga001_details);


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


        detail_txt = findViewById(R.id.detail_txt);
        Bundle gt = getIntent().getExtras();
        String str = gt.getString("abc");
        detail_txt.setText(str);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}