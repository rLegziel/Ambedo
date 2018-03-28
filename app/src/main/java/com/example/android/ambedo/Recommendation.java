package com.example.android.ambedo;

import android.media.Image;

/**
 * Created by roix on 3/23/18.
 */

public class Recommendation {

    private String mBandName;

    private String mSongs;

    private int mPicture;

    public Recommendation(String bandName, String songs, int picture) {
        mBandName = bandName;
        mSongs = songs;
        mPicture = picture;
    }

    //** get band name */
    public String getBandName() {
        return mBandName;
    }

    //** get song list */
    public String getSongs() {
        return mSongs;
    }

    public int getPicture() {
        return mPicture;
    }

}
