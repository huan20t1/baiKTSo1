package com.example.kiemtraso1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListVire extends AppCompatActivity {

    ListView listView;
    ArrayList<singer> arrayList;
    AdapterList adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vire);
        getSupportActionBar().hide();

        listView = findViewById(R.id.list);

        arrayList = new ArrayList<singer>();
        ListView listView =(ListView)findViewById(R.id.list);
        arrayList.add(new singer("Sơn Tùng","MTP","Việt Nam","5",R.drawable.sontugn,R.drawable.sao));
        arrayList.add(new singer("Jack","5 củ","Việt Nam","1",R.drawable.jack,R.drawable.sao));
        arrayList.add(new singer("Mono","Yêu","Việt Nam","3",R.drawable.mono,R.drawable.sao));
        arrayList.add(new singer("Hồ Việt Trung","Trung","Việt Nam","2",R.drawable.hovie,R.drawable.sao));
        adapter = new AdapterList(ListVire.this, R.layout.item, arrayList);
        listView.setAdapter(adapter);

    }
}