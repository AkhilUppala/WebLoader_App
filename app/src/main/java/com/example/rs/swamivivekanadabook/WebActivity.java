package com.example.rs.swamivivekanadabook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView webview;
        webview = (WebView)findViewById(R.id.Web_Html);
        //webview.setOnTouchListener(new View.OnTouchListener(){
           // public boolean onTouch(View V, MotionEvent event){
               // return (event.getAction()==MotionEvent.ACTION_MOVE);
           // }
       // });
        Intent indent =getIntent();
        int initial = indent.getIntExtra("a",0);
        switch (initial){
            case 1:
                webview.loadUrl("file:///android_asset/First_page.html");
                break;
            case 2:
                webview.loadUrl("file:///android_asset/Second_page.html");
                break;
            case 3:
                webview.loadUrl("file:///android_asset/Third_page.html");
                break;
            case 4:
                webview.loadUrl("file:///android_asset/Fourth_page.html");
                break;
            case 5:
                webview.loadUrl("file:///android_asset/Fifth_page.html");
                break;
            case 6:
                webview.loadUrl("file:///android_asset/Sixth_page.html");
                break;
        }

    }
}
