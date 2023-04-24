package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailStory extends AppCompatActivity {

    ImageView pict;
    TextView title, author, story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_story);
        getSupportActionBar().hide();

        pict = findViewById(R.id.pict);
        title = findViewById(R.id.title);
        author = findViewById(R.id.author);
        story = findViewById(R.id.story);

        Stories stories = getIntent().getParcelableExtra("story");

        title.setText(stories.getTitle());
        pict.setImageResource(stories.getFoto());
        author.setText("By:" + " "+ stories.getAuthor());
        story.setText(stories.getStory());

        TextView btnShare = findViewById(R.id.share);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareText();
            }
        });
    }

    public void shareText(){
        Stories stories = getIntent().getParcelableExtra("story");

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, stories.getTitle());
        shareIntent.putExtra(Intent.EXTRA_TEXT, stories.getStory());
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

    public void back(View view){
        finish();
    }
}