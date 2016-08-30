package com.nextech.property9;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BrowseByLocation extends Fragment {
	
	public BrowseByLocation(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(com.nextech.property9.R.layout.fragment_browse_by_location, container, false);
         
        return rootView;
    }
}
