package com.rakangsoftware.recyclerviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create and set the layout manager
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        // Set the adaptor
        val adapter = CountryAdapter()

        list.layoutManager = layoutManager
        list.adapter = adapter

        // Load data into the adapter.
        val countryRepository = CountryRepository()
        adapter.setCountryList(countryRepository.all)

        adapter.setOnCountryClickListener(object : OnCountryClickListener {
            override fun onCountryClicked(country: Country) {
                Log.d(TAG, "Country: ${country.countryName} clicked!")
            }
        })
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}
