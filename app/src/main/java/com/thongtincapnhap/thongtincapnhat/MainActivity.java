package com.thongtincapnhap.thongtincapnhat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.thongtincapnhap.thongtincapnhat.ThanhPhan.Bao24h;
import com.thongtincapnhap.thongtincapnhat.ThanhPhan.BaoTuoiTre;
import com.thongtincapnhap.thongtincapnhat.ThanhPhan.VietNamnet;
import com.thongtincapnhap.thongtincapnhat.ThanhPhan.Vnexpress;
import com.thongtincapnhap.thongtincapnhat.webView.Main_WebView1;

public class MainActivity extends AppCompatActivity {
    ImageView vnxpress,bao24h,tuoitre,vietnamnet,youtube,google;
    ImageView docsach,mp3,truyentranh;
    Button btbookmark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btbookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Bookmark.class);
                startActivity(intent);
            }
        });
        vnxpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Vnexpress.class);
                startActivity(intent);

            }
        });
        bao24h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Bao24h.class);
                startActivity(intent);

            }
        });
        tuoitre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BaoTuoiTre.class);
                startActivity(intent);

            }
        });
        vietnamnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, VietNamnet.class);
                startActivity(intent);

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main_WebView1.class);
                String data1="http://www.youtube.com";
                intent.putExtra("linkdata",data1);
                startActivity(intent);

            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main_WebView1.class);
                String data="https://www.google.com.vn";
                intent.putExtra("linkdata",data);
                startActivity(intent);

            }
        });
        docsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main_WebView1.class);
                String data="http://sachtot.vn";
                intent.putExtra("linkdata",data);
                startActivity(intent);
            }
        });
        mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main_WebView1.class);
                String data="http://mp3.zing.vn";
                intent.putExtra("linkdata",data);
                startActivity(intent);
            }
        });
        truyentranh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main_WebView1.class);
                String data="http://thichtruyentranh.com";
                intent.putExtra("linkdata",data);
                startActivity(intent);
            }
        });

    }
    public void init(){
        btbookmark=(Button)findViewById(R.id.btbookmark);
        vietnamnet=(ImageView)findViewById(R.id.imgVietnamnet);
        vnxpress=(ImageView)findViewById(R.id.imgVnpress);
        bao24h=(ImageView)findViewById(R.id.img24hcom);
        tuoitre=(ImageView)findViewById(R.id.imgTuoitre);
        youtube=(ImageView)findViewById(R.id.imgYoutube);
        google=(ImageView)findViewById(R.id.imgGoogle);
        docsach=(ImageView)findViewById(R.id.imgDocsach);
        mp3=(ImageView)findViewById(R.id.imgMp3);
        truyentranh=(ImageView)findViewById(R.id.imgtruyentranh);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int index = item.getItemId();
        switch (index){
            case R.id.item1:
                Intent intent=new Intent(MainActivity.this, Vnexpress.class);
                startActivity(intent);
                break;
            case R.id.item2:
                Intent intent1=new Intent(MainActivity.this, Bao24h.class);
                startActivity(intent1);
                break;
            case R.id.item3:
                Intent intent2=new Intent(MainActivity.this, BaoTuoiTre.class);
                startActivity(intent2);
                break;
            case R.id.item4:
                Intent intent3=new Intent(MainActivity.this, VietNamnet.class);
                startActivity(intent3);
                break;
            case R.id.item5:
                Intent intent5=new Intent(MainActivity.this, Main_WebView1.class);
                String data1="http://sachtot.vn";
                intent5.putExtra("linkdata",data1);
                startActivity(intent5);
                break;
            case R.id.item9:
                Intent intent6=new Intent(MainActivity.this, Main_WebView1.class);
                String data2="http://mp3.zing.vn";
                intent6.putExtra("linkdata",data2);
                startActivity(intent6);
                break;
            case R.id.item7:
                Intent intent7=new Intent(MainActivity.this, Main_WebView1.class);
                String data7="http://sstruyen.com";
                intent7.putExtra("linkdata",data7);
                startActivity(intent7);
                break;
            case R.id.item8:
                Intent intent4=new Intent(MainActivity.this, Main_WebView1.class);
                String data="https://www.google.com.vn";
                intent4.putExtra("linkdata",data);
                startActivity(intent4);
                break;
            case R.id.item10:
                Intent intent9=new Intent(MainActivity.this, Main_WebView1.class);
                String data9="http://www.youtube.com";
                intent9.putExtra("linkdata",data9);
                startActivity(intent9);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
