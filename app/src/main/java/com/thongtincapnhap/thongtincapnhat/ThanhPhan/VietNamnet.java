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

public class VietNamnet extends AppCompatActivity {
    ListView lv4;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    Intent layoutChung;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_dan_tri);
        lv4=(ListView)findViewById(R.id.lv_baodantri);
        arrayList=new ArrayList<>();
        arrayList.add("1. Trang chủ");
        arrayList.add("2. Pháp luật");
        arrayList.add("3. Công nghệ");
        arrayList.add("4. Kinh doanh");
        arrayList.add("5. Giáo dục");
        arrayList.add("6. Thời sự");
        arrayList.add("7. Giải trí");
        arrayList.add("8. Sức khỏe");
        arrayList.add("9. Thể thao");
        arrayList.add("10.Đời sống");
        arrayList.add("11.Thế giới");
        arrayList.add("12.Bất động sản");
        arrayList.add("13.Bạn đọc");
        arrayList.add("14.Tin mới nóng");
        arrayList.add("15.Tin nổi bật");
        arrayList.add("16.Tuần Việt Nam");
        arrayList.add("17.Góc nhìn thẳng");

        adapter=new ArrayAdapter<String>(VietNamnet.this,android.R.layout.simple_list_item_1,arrayList);
        lv4.setAdapter(adapter);
        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/home.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;

                    case 1:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/phap-luat.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 2:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/cong-nghe.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 3:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/kinh-doanh.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 4:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/giao-duc.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 5:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/thoi-su.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 6:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/giai-tri.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 7:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/suc-khoe.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 8:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/the-thao.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 9:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/doi-song.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 10:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/the-gioi.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 11:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/bat-dong-san.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 12:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/ban-doc.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 13:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/tin-moi-nong.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 14:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/tin-noi-bat.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 15:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/tuanvietnam.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 16:
                        layoutChung = new Intent(VietNamnet.this, ListView_Layout_Chung.class);
                        data = "http://vietnamnet.vn/rss/goc-nhin-thang.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;



                }
            }
        });




    }
}
