package com.example.lmskjsce;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setUserAgentString("LMS KJSCE");
        WebSettings websettings = myWebView.getSettings();
        websettings.setJavaScriptEnabled(true);
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