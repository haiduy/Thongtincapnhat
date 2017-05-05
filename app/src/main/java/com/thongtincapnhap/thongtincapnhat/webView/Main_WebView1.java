package com.thongtincapnhap.thongtincapnhat.webView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.thongtincapnhap.thongtincapnhat.R;

public class Main_WebView1 extends AppCompatActivity {
    Button back,reload,next;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__web_view1);
        webView=(WebView)findViewById(R.id.webView);
        Intent intent=getIntent();
        String duonglink=intent.getStringExtra("linkdata");
        webView.loadUrl(duonglink);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setJavaScriptEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_web, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.back) {
            if(webView.canGoBack()){
                webView.goBack();
            }else {
                Toast.makeText(Main_WebView1.this,"không thể quay lại",Toast.LENGTH_SHORT).show();
            }

        }
        if(id==R.id.next){
            if (webView.canGoForward()){
                webView.goForward();
            }else {
                Toast.makeText(Main_WebView1.this,"Không thể đi tiếp",Toast.LENGTH_SHORT).show();
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
