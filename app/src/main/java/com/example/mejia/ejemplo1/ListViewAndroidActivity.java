package com.example.mejia.ejemplo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListViewAndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_android);


        final List<String> values = new ArrayList<>();

        String[] SOS = new String[]{"Android", "iPhone", "WindowsMobile", "Blackberry",
                "Web OS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu",
                "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"
        };

        Collections.addAll(values, SOS);

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, values);


        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
/*
    list.setOnItemClickListener(new Adapter View.OnItemClickListener()){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent1);

            //values.remove(position);
            //adapter.notifyDataSetChanged();

        }
    });
    }
} */

    }}