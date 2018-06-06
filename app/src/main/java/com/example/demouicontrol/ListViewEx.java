package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewEx extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] array = {"Meal", "Vag", "Both_OK"};
    ListView listView;
    boolean[] checkeds = {false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listView1);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,array);
        listView.setAdapter(adapter);
//        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(this,((TextView)view).getText().toString(),Toast.LENGTH_SHORT).show();

//        CheckedTextView ctv = (CheckedTextView)view;
//        if(ctv.isChecked())
//            Toast.makeText(this,((TextView)view).getText().toString(),Toast.LENGTH_SHORT).show();


        CheckedTextView ctv = (CheckedTextView) view;
        if (ctv.isChecked())
            checkeds[position] = true;
        else
            checkeds[position] = false;

        String choice = "";
        for (int i = 0; i < array.length; i++) {
            if (checkeds[i])
                choice += array[i] + " ";
        }

        Toast.makeText(this, choice, Toast.LENGTH_SHORT).show();
    }
}