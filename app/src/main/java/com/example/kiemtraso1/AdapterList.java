package com.example.kiemtraso1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterList extends BaseAdapter {

    private Context context;
    private List<singer> arraylist;
    private int layout;

    public AdapterList(Context context, int layout, ArrayList<singer> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view  = inflater.inflate(layout,null);
        singer thuVien = arraylist.get(i);

        TextView a1 = view.findViewById(R.id.txtnghedanh);
        TextView a2 = view.findViewById(R.id.txtname);
        TextView a3 = view.findViewById(R.id.txtsao);
        ImageView a4 = view.findViewById(R.id.imgavt);
        ImageView a5 = view.findViewById(R.id.imgsao);
        TextView a6 = view.findViewById(R.id.txtquocgia);

        a1.setText(thuVien.getNickname());
        a2.setText(thuVien.getName());
        a3.setText(thuVien.getSao());
        a4.setImageResource(thuVien.getAvatar());
        a6.setText(thuVien.getQuocgia());
        a5.setImageResource(thuVien.getHinhsao());
        return view;
    }
}
