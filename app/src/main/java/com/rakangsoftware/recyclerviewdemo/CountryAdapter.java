package com.rakangsoftware.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pererikbergman on 2017-12-14.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private List<Country> mCountryList = new ArrayList<>();

    private OnCountryClickListener mOnCountryClickListener;

    public void setCountryList(final List<Country> countryList) {
        mCountryList = countryList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mCountryList.size();
    }

    @Override
    public CountryViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        return CountryViewHolder.newInstance(parent, mOnCountryClickListener);
    }

    @Override
    public void onBindViewHolder(final CountryViewHolder holder, final int position) {
        holder.bind(mCountryList.get(position));
    }


    public void setOnCountryClickListener(final OnCountryClickListener onCountryClickListener) {
        mOnCountryClickListener = onCountryClickListener;
    }
}
