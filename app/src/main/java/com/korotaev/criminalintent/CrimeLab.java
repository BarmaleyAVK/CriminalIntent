package com.korotaev.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Дом on 26.06.2016.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        //mAppContext = appContext;
        mCrimes = new ArrayList<>();

        for (int i = 0;i<50;i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {

        Crime crime0 = null;

        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                crime0 = crime;
                break;
            }
        }
        return crime0;
    }
}
