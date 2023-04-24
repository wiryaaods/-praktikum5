package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }
    public void story(View view){
        Intent story = new Intent(this, Story.class);
        startActivity(story);
    }

    public void facts(View view){
        Intent facts = new Intent(this, About.class);
        startActivity(facts);
    }
}