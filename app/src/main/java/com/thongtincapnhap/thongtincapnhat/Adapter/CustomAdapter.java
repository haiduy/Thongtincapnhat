package com.thongtincapnhap.thongtincapnhat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.thongtincapnhap.thongtincapnhat.R;

import java.util.List;

/**
 * Created by Administrator on 05/04/2017.
 */

public class CustomAdapter extends ArrayAdapter<ThongTin> {

    public CustomAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, List<ThongTin> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.donglayoutitem, null);
        }

        ThongTin p = getItem(position);

        if (p != null) {
            // Anh xa + Gan gia tri
            //TextView tt1 = (TextView) v.findViewById(R.id.id);
            TextView txttitle=(TextView)v.findViewById(R.id.textView1);
            txttitle.setText(p.title);
            ImageView imgView=(ImageView)v.findViewById(R.id.imageView);
            Picasso.with(getContext()).load(p.image).into(imgView);


        }

        return v;
    }

}
