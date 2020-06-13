package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(double magnitude, String place, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mPlace;
    }

    public String getUrl() {
        return mUrl;
    }
}
