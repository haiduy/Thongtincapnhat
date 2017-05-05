package com.thongtincapnhap.thongtincapnhat.webView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.thongtincapnhap.thongtincapnhat.Bookmark;
import com.thongtincapnhap.thongtincapnhat.R;

public class Main_WebView extends AppCompatActivity {
    WebView webView;
    Button btsendlink,btgoto;
    private DatabaseReference mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__web_view);
        webView=(WebView)findViewById(R.id.webView);
        btsendlink= (Button) findViewById(R.id.btsendlink);
        btgoto= (Button) findViewById(R.id.btgoto);
        mData = FirebaseDatabase.getInstance().getReference();
        Intent intent=getIntent();
        final String duonglink=intent.getStringExtra("linkdata");
        btsendlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mData.child("bookmark").push().setValue(duonglink);

            }
        });
        btgoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main_WebView.this, Bookmark.class);
                startActivity(intent);

            }
        });
        webView.loadUrl(duonglink);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setJavaScriptEnabled(true);

    }
}

