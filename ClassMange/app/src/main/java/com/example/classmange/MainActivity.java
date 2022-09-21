package com.example.classmange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView indexAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indexAdmin=(WebView) findViewById(R.id.indexAdmin);
//        indexAdmin.load
        indexAdmin.loadUrl("http://192.168.43.143:8080/JUMManger/loginforphone.html");
       // indexAdmin.loadUrl("http://www.baidu.com");


        indexAdmin.setWebViewClient(new WebViewClient());
        WebSettings settings = indexAdmin.getSettings();
        settings.setUseWideViewPort(true);//设定支持viewport
        settings.setLoadWithOverviewMode(true);   //自适应屏幕
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(true);//设定支持缩放
        //setDomStorageEnabled解决了webview白屏问题  设置支持DomStorage
        settings.setDomStorageEnabled(true);
//        支持java script
        settings.setJavaScriptEnabled(true);
//        设置是否支持插件
//        settings.setPluginState();
        settings.setPluginState(WebSettings.PluginState.ON);
//        支持js打开新窗口
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==event.KEYCODE_BACK){
            if(indexAdmin.canGoBack()){
                indexAdmin.goBack();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}