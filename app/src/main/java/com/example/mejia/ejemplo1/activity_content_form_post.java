package com.example.mejia.ejemplo1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import database.DataBaseSqlLite;

public class activity_content_form_post extends AppCompatActivity {

    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_form_post);

        Button  btn =  (Button) findViewById(R.id.btnGuardar);
        btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //guardar en base de datos
              DataBaseSqlLite helper = new DataBaseSqlLite(getApplicationContext(),"android",null,1);

              SQLiteDatabase database=helper.getWritableDatabase();

              ContentValues values= new ContentValues();
              values.put("user",((EditText)findViewById(R.id.txtusuario)).getText().toString());
              values.put("title",((EditText)findViewById(R.id.txtTitle)).getText().toString());
              values.put("content",((EditText)findViewById(R.id.txtContent)).getText().toString());

              database.insert("posts", null, values);
              Toast.makeText(getApplicationContext(), "Guardo Correctamente", Toast.LENGTH_SHORT).show();

              database.close();
          }
      });
    }



}
