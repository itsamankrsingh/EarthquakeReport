package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mPlace;
    private String mDate;

    public Earthquake(String magnitude,String place,String date){
        mMagnitude=magnitude;
        mPlace=place;
        mDate=date;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }
}
