package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewEx2 extends AppCompatActivity {

    ListView listView;
    String[] text1 = {"text1","text2","text3","text4","text5"};
    String[] timeAgo = {"1hr ago","2hr ago","3hr ago","4hr ago","5hr ago"};
    int[] imgResIds = {R.drawable.backup,R.drawable.calculator,R.drawable.contacts,R.drawable.photos,R.drawable.note};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_ex2);
        listView = findViewById(R.id.listView2);

        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map;
        for(int i=0;i<text1.length;i++){
            map = new HashMap<>();
            map.put("imgResIds", imgResIds[i]);
            map.put("text1", text1[i]);
            map.put("timeAgo", timeAgo[i]);

            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,list,R.layout.custom_itemview,
                new String[]{"imgResIds","text1","timeAgo"},
                new int[]{R.id.imageView01,R.id.textView01,R.id.textView02});

        listView.setAdapter(adapter);
    }
}
