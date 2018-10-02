package com.example.aunshon.javatpoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView mywebView;
    WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView=findViewById(R.id.webview);
        webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mywebView.loadUrl("https://www.javatpoint.com");

        mywebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack()){
            mywebView.goBack();
        }
        else {
            super.onBackPressed();
        }

    }
}
