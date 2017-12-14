package com.rakangsoftware.recyclerviewdemo;

public class Country {

    private String mCountryCode;
    private String mCountryName;

    public Country(final String countryCode, final String countryName) {
        mCountryCode = countryCode;
        mCountryName = countryName;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(final String countryCode) {
        mCountryCode = countryCode;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public void setCountryName(final String countryName) {
        mCountryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "mCountryCode='" + mCountryCode + '\'' +
                ", mCountryName='" + mCountryName + '\'' +
                '}';
    }
}
