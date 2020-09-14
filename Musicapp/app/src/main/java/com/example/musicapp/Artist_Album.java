package com.example.musicapp;

public class Artist_Album {

    private String mArtist;
    private String mSong;

    public Artist_Album(String Artist, String Song) {
        mArtist = Artist;
        mSong = Song;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getSong() {
        return mSong;
    }
}
