package com.example.mejia.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class List_detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

        TextView hello = (TextView)findViewById(R.id.TextoHello);
        hello.setText("HOLA CLASE");
        //hello.setVisibility(View.INVISIBLE);

        ImageView image =(ImageView)findViewById(R.id.image);
        image.setImageResource(R.mipmap.ic_launcher);

        Button btn = (Button)findViewById(R.id.button1);
        btn.setText("SOY UN BOTTON");

    }
 }
