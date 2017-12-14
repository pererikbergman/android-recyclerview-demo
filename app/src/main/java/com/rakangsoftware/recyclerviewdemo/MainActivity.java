package com.rakangsoftware.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.list);

        // Create and set the layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        // Set the adaptor
        CountryAdapter adapter = new CountryAdapter();
        recyclerView.setAdapter(adapter);

        // Load data into the adapter.
        CountryRepository countryRepository = new CountryRepository();
        adapter.setCountryList(countryRepository.getAll());

        adapter.setOnCountryClickListener(new OnCountryClickListener() {
            @Override
            public void onCountryClicked(final Country country) {
                Log.d(TAG, "Country: " + country.getCountryName() + " clicked!");
            }
        });
    }
}
