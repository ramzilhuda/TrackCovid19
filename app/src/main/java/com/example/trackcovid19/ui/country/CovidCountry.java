package com.example.trackcovid19.ui.country;

public class CovidCountry {
    String mCovidCoutnry, mCases;

    public CovidCountry(String mCovidCoutnry, String mCases) {
        this.mCovidCoutnry = mCovidCoutnry;
        this.mCases = mCases;
    }

    public String getmCovidCoutnry() {
        return mCovidCoutnry;
    }

    public String getmCases() {
        return mCases;
    }
}

