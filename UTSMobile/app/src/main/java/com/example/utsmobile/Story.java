package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class Story extends AppCompatActivity {

    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        getSupportActionBar().hide();

        rv = findViewById(R.id.stories);
        rv.setLayoutManager(new GridLayoutManager(this, 2));

        TitleStoryAdapter adapter = new TitleStoryAdapter(DataSource.stories);
        rv.setAdapter(adapter);
    }

    public void back(View view){
        finish();
    }
}