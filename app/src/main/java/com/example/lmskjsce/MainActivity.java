package com.example.lmskjsce;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;
    private static final int CAMERA_PERMISSION_CODE = 100;
    private static final int STORAGE_PERMISSION_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setUserAgentString("LMS KJSCE");
        WebSettings websettings = myWebView.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setDomStorageEnabled(true);
        websettings.setAllowFileAccess(true);
        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.loadUrl("https://lms-kjsce.somaiya.edu/");
        myWebView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}