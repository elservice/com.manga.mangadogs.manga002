package com.mangadogs.manga002;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class manga002_UnifiedWebViewFragment extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.manga002_fragment_webview, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String customUrl = sharedPreferences.getString("data1", "");
        String customUrl1 = sharedPreferences.getString("data4", "");

        String urlToLoad = ""; // Initialize with a default value
        if ("fragmentTag1".equals(getTag()) && customUrl != null && !customUrl.isEmpty()) {
            urlToLoad = customUrl;
        } else if ("fragmentTag2".equals(getTag()) && customUrl1 != null && !customUrl1.isEmpty()) {
            urlToLoad = customUrl1;
        } else {
            // Handle the default case. Decide what you want to do if neither tag matches or URLs are null.
            // Maybe show an error or load a default URL.
        }

        webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        if (!urlToLoad.isEmpty()) {
            webView.loadUrl(urlToLoad);
        }

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            simulateClick(671, 531);
            simulateClick(571, 431);
            simulateClick(500, 400);
            simulateClick(400, 400);
            simulateClick(646, 535);
            simulateClick(300, 300);
            simulateClick(700, 630);
            // Optional: Log to confirm click events are simulated
            // Log.d("UnifiedWebViewFragment", "Click events simulated");
        }, 8000);

        return view;
    }

    private void simulateClick(int x, int y) {
        long downTime = System.currentTimeMillis();
        long eventTime = System.currentTimeMillis();

        MotionEvent downEvent = MotionEvent.obtain(
                downTime,
                eventTime,
                MotionEvent.ACTION_DOWN,
                x,
                y,
                0
        );

        webView.dispatchTouchEvent(downEvent);

        // Delay for a short duration (adjust as needed)
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MotionEvent upEvent = MotionEvent.obtain(
                downTime,
                eventTime + 500,
                MotionEvent.ACTION_UP,
                x,
                y,
                0
        );

        webView.dispatchTouchEvent(upEvent);

        downEvent.recycle();
        upEvent.recycle();
    }
}
