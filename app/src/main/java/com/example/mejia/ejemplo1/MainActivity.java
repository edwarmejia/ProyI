package com.example.mejia.ejemplo1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void createoncalculator(View view ){
        Intent secondIntent = new Intent(this, ListPostActivity.class);
        startActivity(secondIntent);
    }
    public void openSecondActivityTwo(View view)
    {
        Intent secondIntent = new Intent(this, activity_content_form_post.class);
        startActivity(secondIntent);
    }

    public void sendEmail(View view)
    {
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SENDTO, Uri.fromParts("mailto", "", null));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "ludk17@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "test Message");
        startActivity(emailIntent);
    }
}
