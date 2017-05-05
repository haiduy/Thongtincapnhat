package com.thongtincapnhap.thongtincapnhat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.thongtincapnhap.thongtincapnhat.webView.Main_WebView;

import java.util.ArrayList;

public class Bookmark extends AppCompatActivity {
    private ListView lvbookmark;
    private DatabaseReference mData;
    private ArrayList<String> mKeys = new ArrayList<>();
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);
        mData = FirebaseDatabase.getInstance().getReference();
        lvbookmark=(ListView)findViewById(R.id.lvbookmark);
        arrayList=new ArrayList<String>();
        adapter=new ArrayAdapter(Bookmark.this,android.R.layout.simple_list_item_1,arrayList);
        lvbookmark.setAdapter(adapter);
        mData.child("bookmark").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String url1 = dataSnapshot.getValue().toString();
                String key = dataSnapshot.getKey();
                mKeys.add(key);
                arrayList.add(url1);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String newdevice1 = dataSnapshot.getValue().toString();
                String key = dataSnapshot.getKey();
                int index = mKeys.indexOf(key);
                if (index > -1){
                    arrayList.set(index,newdevice1);
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        lvbookmark.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent webView=new Intent(Bookmark.this,Main_WebView.class);
                webView.putExtra("linkdata",arrayList.get(i));
                startActivity(webView);
            }
        });
    }
}
