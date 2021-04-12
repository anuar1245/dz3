package com.example.dz3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView ;
  MainAdapter adapter ;
  ArrayList<ItemModel> list;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   Toolbar toolbar = findViewById(R.id.toolbar);

        recyclerView = findViewById(R.id.rv);
        adapter =  new MainAdapter();

        adapter.setListener(adapterPosition -> {
            Intent intent = new Intent(MainActivity.this,MainActivitytwo.class);
            startActivity(intent);


        });

        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager =  new LinearLayoutManager(this);

        recyclerView.setLayoutManager(manager);
        list =  new ArrayList<>();
        list.add(0, new ItemModel("Ronaldo"));
        list.add(1, new ItemModel("aaaaaa"));
        list.add(2, new ItemModel("ssssss"));
        list.add(3, new ItemModel("ffffff"));
        list.add(4, new ItemModel("gggggg"));
        list.add(5, new ItemModel("dddddd"));

        adapter.addText(list);
    }
}