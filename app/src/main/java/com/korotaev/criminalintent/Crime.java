package com.korotaev.criminalintent;

import android.util.Log;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Дом on 26.06.2016.
 */
public class Crime {

   //String TAG = "CrimeLog##";

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();

        //Log.d(TAG, "mId = "+mId.toString());
    }

    public UUID getId() {
        //Log.d(TAG, "mTitle = " + mTitle + " return mId = "+mId.toString());
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }
}
