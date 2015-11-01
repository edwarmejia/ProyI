package com.example.mejia.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivityPost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_post);

        String user = getIntent().getExtras().getString("CurrentPostUser");

        String titulo = getIntent().getExtras().getString("CurrentPosttitulo");

        TextView txtuser = (TextView)findViewById(R.id.txtRecibeUser);
        txtuser.setText(user);

        TextView txttitulo = (TextView)findViewById(R.id.txtRecibeTitulo);
        txttitulo.setText(titulo);

    }


}
