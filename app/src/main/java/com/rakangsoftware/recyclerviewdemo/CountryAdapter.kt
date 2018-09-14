package com.rakangsoftware.recyclerviewdemo

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import java.util.*

/**
 * Created by pererikbergman on 2017-12-14.
 */

class CountryAdapter : RecyclerView.Adapter<CountryViewHolder>() {

    private var mCountryList: List<Country> = ArrayList()

    private var mOnCountryClickListener: OnCountryClickListener? = null

    fun setCountryList(countryList: List<Country>) {
        mCountryList = countryList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = mCountryList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder = CountryViewHolder.newInstance(parent, mOnCountryClickListener!!)

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) = holder.bind(mCountryList[position])

    fun setOnCountryClickListener(onCountryClickListener: OnCountryClickListener) {
        mOnCountryClickListener = onCountryClickListener
    }
}
