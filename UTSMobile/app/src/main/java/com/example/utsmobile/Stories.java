package com.example.utsmobile;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Stories implements Parcelable {

    String title, story, author;
    int foto;


    public Stories (String title, String story, int foto, String author){
        this.title = title;
        this.story = story;
        this.foto = foto;
        this.author=author;
    }
    protected Stories(Parcel in) {
        title = in.readString();
        story = in.readString();
        foto = in.readInt();
        author = in.readString();
    }


    public static final Creator<Stories> CREATOR = new Creator<Stories>() {
        @Override
        public Stories createFromParcel(Parcel in) {
            return new Stories(in);
        }

        @Override
        public Stories[] newArray(int size) {
            return new Stories[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(story);
        parcel.writeInt(foto);
        parcel.writeString(author);
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setStory(String story){
        this.story=story;
    }

    public void setFoto (int foto){
        this.foto=foto;
    }

     public String getTitle (){
        return title;
     }

    public String getStory (){
        return story;
    }

    public int getFoto (){
        return foto;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
