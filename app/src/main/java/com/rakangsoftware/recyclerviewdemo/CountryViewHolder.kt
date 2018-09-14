package com.rakangsoftware.recyclerviewdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by pererikbergman on 2017-12-14.
 */

class CountryViewHolder(itemView: View, onCountryClickListener: OnCountryClickListener) : RecyclerView.ViewHolder(itemView) {

    private lateinit var mCountry: Country

    private val mCountryName: TextView = itemView.findViewById(R.id.country_name)
    private val mCountryCode: TextView = itemView.findViewById(R.id.country_code)

    init {
        itemView.setOnClickListener { onCountryClickListener.onCountryClicked(mCountry) }
    }

    fun bind(country: Country) {
        mCountry = country

        mCountryName.text = country.countryName
        mCountryCode.text = country.countryCode
    }

    companion object {

        fun newInstance(parent: ViewGroup, onCountryClickListener: OnCountryClickListener): CountryViewHolder {
            return CountryViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(
                                    R.layout.country_list_item,
                                    parent,
                                    false
                            ),
                    onCountryClickListener
            )
        }
    }
}
