package com.nextech.property9;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BroseByLocation extends Fragment {
	
	public BroseByLocation(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(com.nextech.property9.R.layout.fragment_brose_by_location, container, false);
         
        return rootView;
    }
}
