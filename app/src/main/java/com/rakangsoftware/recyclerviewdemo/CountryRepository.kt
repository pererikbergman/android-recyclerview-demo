package com.rakangsoftware.recyclerviewdemo

import java.util.ArrayList
import java.util.Locale

class CountryRepository {

    val all: List<Country>
        get() {
            val countries = ArrayList<Country>()
            val locales = Locale.getAvailableLocales()
            for (locale in locales) {
                val countryCode = locale.country
                val countryName = locale.displayCountry
                if (!countryCode.trim { it <= ' ' }.isEmpty() && !countryName.trim { it <= ' ' }.isEmpty()) {
                    val country = Country(
                            countryCode,
                            countryName
                    )
                    countries.add(country)
                }
            }

            return countries
        }

}
