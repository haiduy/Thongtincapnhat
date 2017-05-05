package com.thongtincapnhap.thongtincapnhat.ThanhPhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.thongtincapnhap.thongtincapnhat.R;
import com.thongtincapnhap.thongtincapnhat.listViewChung.ListView_Layout_Chung;

import java.util.ArrayList;

public class Vnexpress extends AppCompatActivity {
    ListView lv1;
    ArrayList<String> arrayList;
    ArrayAdapter adapter;
    Intent layoutChung;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);
        lv1=(ListView)findViewById(R.id.lv_layout1);
        arrayList=new ArrayList<>();
        arrayList.add("1. Thời sự");
        arrayList.add("2. Thế Giới");
        arrayList.add("3. Kinh Doanh");
        arrayList.add("4. Thể Thao");
        arrayList.add("5. Giải Trí");
        arrayList.add("6. Khoa Học");
        arrayList.add("7. Sức Khỏe");
        arrayList.add("8. Gia Đình");
        arrayList.add("9. Giáo Dục");
        arrayList.add("10.Pháp Luật");
        arrayList.add("11.Du Lịch");
        arrayList.add("12.Cười");
        arrayList.add("13.Startup");
        arrayList.add("14.Số Hóa");
        arrayList.add("15.Xe");
        arrayList.add("16.Cộng Đồng");
        arrayList.add("17.Tâm Sự");

        adapter=new ArrayAdapter(Vnexpress.this,android.R.layout.simple_list_item_1,arrayList);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/thoi-su.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 1:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                         data="http://vnexpress.net/rss/the-gioi.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 2:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/kinh-doanh.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 3:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/the-thao.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 4:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/giai-tri.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 5:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/khoa-hoc.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 6:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/suc-khoe.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 7:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/gia-dinh.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 8:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/giao-duc.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 9:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/phap-luat.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 10:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/du-lich.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 11:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/cuoi.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 12:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/startup.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 13:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/so-hoa.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 14:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/oto-xe-may.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 15:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/cong-dong.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;
                    case 16:
                        layoutChung=new Intent(Vnexpress.this,ListView_Layout_Chung.class);
                        data="http://vnexpress.net/rss/tam-su.rss";
                        layoutChung.putExtra("database",data);
                        startActivity(layoutChung);
                        break;


                }
            }
        });


    }
}
