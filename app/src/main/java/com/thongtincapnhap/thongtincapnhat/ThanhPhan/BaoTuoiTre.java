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

public class BaoTuoiTre extends AppCompatActivity {
    ListView lv3;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    Intent layoutChung;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_tuoi_tre);
        lv3=(ListView)findViewById(R.id.lv_baotuoitre);
        arrayList=new ArrayList<>();
        arrayList.add("1. Trang chủ");
        arrayList.add("2. Thế giới");
        arrayList.add("3. Kinh tế");
        arrayList.add("4. Giáo dục");
        arrayList.add("5. Văn hóa-Giải trí");
        arrayList.add("6. Nhịp sống số");
        arrayList.add("7. Du lịch");
        arrayList.add("8. Chính trị-Xã hội");
        arrayList.add("9. Pháp luật");
        arrayList.add("10.Sống khỏe");
        arrayList.add("11.Thể thao");
        arrayList.add("12.Nhịp sống trẻ");
        arrayList.add("13.Bạn đọc");
        adapter=new ArrayAdapter<String>(BaoTuoiTre.this,android.R.layout.simple_list_item_1,arrayList);
        lv3.setAdapter(adapter);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-tin-moi-nhat.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 1:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-the-gioi.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 2:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-kinh-te.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 3:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-giao-duc.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 4:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-van-hoa-giai-tri.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 5:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-nhip-song-so.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 6:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-du-lich.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 7:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-chinh-tri-xa-hoi.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 8:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-phap-luat.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 9:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-song-khoe.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 10:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-the-thao.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 11:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-nhip-song-tre.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 12:
                        layoutChung = new Intent(BaoTuoiTre.this, ListView_Layout_Chung.class);
                        data = "http://tuoitre.vn/rss/tt-ban-doc.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                }
            }
        });
    }
}
