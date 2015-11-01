package com.example.mejia.ejemplo1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import adapters.PostAdapter;
import database.DataBaseSqlLite;
import models.Post;

public class ListPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_post);
        setlistcontent();
    }

    private  void setlistcontent() {
        PostAdapter adapter = new PostAdapter(this, R.layout.simple_item_item_post, GetsPost());
        ListView list = (ListView) findViewById(R.id.listView2);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivityPost.class);
                String user = ((TextView)view.findViewById(R.id.usertxt)).getText().toString();
                String titulo = ((TextView)view.findViewById(R.id.titletxt)).getText().toString();

                intent.putExtra("CurrentPostUser", user);
                intent.putExtra("CurrentPosttitulo", titulo);
                startActivity(intent);
            }
        });

    }
    private List<Post> GetsPost(){

        List<Post> posts = new ArrayList<>();
        DataBaseSqlLite helper = new DataBaseSqlLite(this,"android1",null,1);
        SQLiteDatabase db=helper.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT * from posts;", null);


       while(c.moveToNext())
       {
           Post post = new Post();
           post.id=c.getInt(0);
           post.user=c.getString(1);
           post.title= c.getString(2);
           posts.add(post);

        }
        return  posts;
    }

}
