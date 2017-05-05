package com.thongtincapnhap.thongtincapnhat.listViewChung;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.thongtincapnhap.thongtincapnhat.Adapter.CustomAdapter;
import com.thongtincapnhap.thongtincapnhat.Adapter.ThongTin;
import com.thongtincapnhap.thongtincapnhat.Adapter.XMLDomParser;
import com.thongtincapnhap.thongtincapnhat.R;
import com.thongtincapnhap.thongtincapnhat.webView.Main_WebView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListView_Layout_Chung extends AppCompatActivity {
    ListView listView;
    CustomAdapter adapter;
    ArrayList<ThongTin> mangdocbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view__layout__chung);
        listView=(ListView)findViewById(R.id.listView);
        mangdocbao=new ArrayList<ThongTin>();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent intent=getIntent();
                String dataBase=intent.getStringExtra("database");
                new ReadData().execute(dataBase);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                Intent webView=new Intent(ListView_Layout_Chung.this,Main_WebView.class);
                webView.putExtra("linkdata",mangdocbao.get(position).link);
                startActivity(webView);
            }
        });
    }
    class ReadData extends AsyncTask<String,Integer,String> {

        @Override
        protected String doInBackground(String... params) {
            return docNoiDung_Tu_URL(params[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            XMLDomParser parser=new XMLDomParser();
            Document document=parser.getDocument(s);
            NodeList nodeList=document.getElementsByTagName("item");
            NodeList nodeListdescription=document.getElementsByTagName("description");
            String hinhanh="";
            String title="";
            String link="";
            for (int i=0;i<nodeList.getLength();i++){
                String cdata=nodeListdescription.item(i+1).getTextContent();
                Pattern p = Pattern.compile("<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>");
                Matcher matcher=p.matcher(cdata);
                if(matcher.find()){
                    hinhanh=matcher.group(1);
                }
                Element element= (Element) nodeList.item(i);
                title=parser.getValue(element,"title");
                link=parser.getValue(element,"link");
                mangdocbao.add(new ThongTin(title,link,hinhanh));
                adapter=new CustomAdapter(ListView_Layout_Chung.this,android.R.layout.simple_list_item_1,mangdocbao);
                listView.setAdapter(adapter);



            }
            super.onPostExecute(s);

        }
    }
    private static String docNoiDung_Tu_URL(String theUrl)
    {
        StringBuilder content = new StringBuilder();

        try
        {
            // create a url object
            URL url = new URL(theUrl);

            // create a urlconnection object
            URLConnection urlConnection = url.openConnection();

            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return content.toString();
    }

}
