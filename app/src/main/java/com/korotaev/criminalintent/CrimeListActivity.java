package com.korotaev.criminalintent;

/**
 * Created by Дом on 26.06.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeListFragment();
    }

}
