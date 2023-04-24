package com.example.utsmobile;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TitleStoryAdapter extends RecyclerView.Adapter<TitleStoryAdapter.ViewHolder> {

    private ArrayList<Stories> stories;
    public TitleStoryAdapter(ArrayList<Stories> stories){
        this.stories=stories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Stories str = stories.get(position);
        holder.setData(str);

    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView iv;
        public TextView tv_title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            iv = itemView.findViewById(R.id.iv_pict);
        }
        public void setData(Stories stories){
            Stories str = new Stories(stories.getTitle(), stories.getStory(), stories.getFoto(), stories.getAuthor());
            tv_title.setText(stories.getTitle());
            iv.setImageResource(stories.getFoto());
            itemView.setOnClickListener(view -> {
                Intent sent = new Intent(itemView.getContext(), DetailStory.class);
                sent.putExtra("story", str);
                itemView.getContext().startActivity(sent);
            });
        }
    }
}
