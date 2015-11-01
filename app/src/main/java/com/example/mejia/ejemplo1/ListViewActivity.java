package com.example.mejia.ejemplo1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import adapters.Tareaadapter;
import models.Tarea;
import java.util.ArrayList;
import java.util.List;



public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

            Tareaadapter adapter = new Tareaadapter(this, R.layout.custom_layout_item, FakeGetTareas());

            ListView list = (ListView)findViewById(R.id.listView);
            list.setAdapter(adapter);

        }

        private List<Tarea> FakeGetTareas() {
            List<Tarea> tareas = new ArrayList<>();
            tareas.add(new Tarea("Proyectos 1", "19:30 - 22:40"));
            tareas.add(new Tarea("Proyectos 2", "19:30 - 22:40"));
            tareas.add(new Tarea("Proyectos 3", "19:30 - 22:40"));
            tareas.add(new Tarea("Proyectos 4", "19:30 - 22:40"));

            return tareas;
        }




}
