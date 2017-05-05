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

public class Bao24h extends AppCompatActivity {
    ListView lv2;
    ArrayList<String> arrayList;
    ArrayAdapter adapter;
    Intent layoutChung;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        lv2=(ListView)findViewById(R.id.lv_layout2);
        arrayList=new ArrayList<>();
        arrayList.add("1. Tin tức trong ngày");
        arrayList.add("2. Thế giới");
        arrayList.add("3. Bóng Đá");
        arrayList.add("4. Euro 2016");
        arrayList.add("5. An ninh-Hình Sự");
        arrayList.add("6. Thời Trang");
        arrayList.add("7. Thời Trang Hi-tech");
        arrayList.add("8. Tài chính – Bất động sản");
        arrayList.add("9. Ẩm thực");
        arrayList.add("10.Làm đẹp");
        arrayList.add("11.Phim");
        arrayList.add("12.Giáo dục - Du học");
        arrayList.add("13.Bạn trẻ - Cuộc sống");
        arrayList.add("14.Ca nhạc - MTV");
        arrayList.add("15.Thể thao");
        arrayList.add("16.Phi thường - kỳ quặc");
        arrayList.add("17.Công nghệ thông tin");
        arrayList.add("18.Ô tô - Xe máy");
        arrayList.add("19.Thị trường - Tiêu dùng");
        arrayList.add("20.Sức khỏe đời sống");
        arrayList.add("21.Cười 24h");
        arrayList.add("22.Đời sống Showbiz");
        arrayList.add("23.Giải trí");
        adapter=new ArrayAdapter(Bao24h.this,android.R.layout.simple_list_item_1,arrayList);
        lv2.setAdapter(adapter);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/tintuctrongngay.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 1:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/tintucquocte.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 2:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/bongda.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 3:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/euro2016.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 4:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/anninhhinhsu.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 5:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/thoitrang.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 6:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/thoitranghitech.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 7:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/taichinhbatdongsan.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 8:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/amthuc.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 9:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/lamdep.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 10:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/phim.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 11:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/giaoducduhoc.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 12:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/bantrecuocsong.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 13:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/canhacmtv.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 14:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/thethao.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 15:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/phithuongkyquac.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 16:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/congnghethongtin.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 17:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/otoxemay.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 18:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/thitruongtieudung.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 19:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/suckhoedoisong.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 20:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/cuoi24h.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 21:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/doisongshowbiz.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                    case 22:
                        layoutChung = new Intent(Bao24h.this, ListView_Layout_Chung.class);
                        data = "http://www.24h.com.vn/upload/rss/giaitri.rss";
                        layoutChung.putExtra("database", data);
                        startActivity(layoutChung);
                        break;
                }
            }
        });


    }
}
