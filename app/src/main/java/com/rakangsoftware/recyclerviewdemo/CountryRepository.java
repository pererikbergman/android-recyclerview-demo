package com.rakangsoftware.recyclerviewdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountryRepository {

    public List<Country> getAll() {
        List<Country> countries = new ArrayList<>();

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            String countryCode = locale.getCountry();
            String countryName = locale.getDisplayCountry();
            if (!countryCode.trim().isEmpty() && !countryName.trim().isEmpty()) {
                Country country = new Country(
                        countryCode,
                        countryName
                );
                countries.add(country);
            }
        }

        return countries;
    }

}
