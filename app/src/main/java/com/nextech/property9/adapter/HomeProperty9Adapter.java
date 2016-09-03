package com.nextech.property9.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nextech.property9.R;

public class HomeProperty9Adapter extends RecyclerView.Adapter<HomeProperty9Adapter.ViewHolder> {

    private Context context;
    private String[] mDataset;

    public HomeProperty9Adapter(Context context){
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public HomeProperty9Adapter(Context context, String[] myDataset) {

        this.context = context;
        mDataset = myDataset;

    }

    @Override
    public HomeProperty9Adapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                              int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_home_property9, parent, false);

        TextView textView = new TextView(context);

        ViewHolder vh = new ViewHolder(textView);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}



