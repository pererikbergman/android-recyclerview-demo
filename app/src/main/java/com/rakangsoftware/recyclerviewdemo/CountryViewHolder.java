package com.rakangsoftware.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by pererikbergman on 2017-12-14.
 */

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private Country mCountry;

    private final TextView mCountryName;
    private final TextView mCountryCode;

    public CountryViewHolder(final View itemView, final OnCountryClickListener onCountryClickListener) {
        super(itemView);

        mCountryName = itemView.findViewById(R.id.country_name);
        mCountryCode = itemView.findViewById(R.id.country_code);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                onCountryClickListener.onCountryClicked(mCountry);
            }
        });
    }

    public void bind(Country country) {
        mCountry = country;

        mCountryName.setText(country.getCountryName());
        mCountryCode.setText(country.getCountryCode());
    }

    public static CountryViewHolder newInstance(ViewGroup parent, final OnCountryClickListener onCountryClickListener) {
        return new CountryViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(
                                R.layout.country_list_item,
                                parent,
                                false
                        ),
                onCountryClickListener
        );
    }
}
