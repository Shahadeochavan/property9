package com.nextech.property9;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ViewFlipper;

public class HomeProperty9Fragment extends Fragment {
	
	public HomeProperty9Fragment(){}
    ViewFlipper viewFlipper;
    Animation Fade_in,Fade_out;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_home_property9,
                container, false);
        viewFlipper = (ViewFlipper) v.findViewById(R.id.bckgrndViewFlipper1);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mRecyclerView.setAdapter(mAdapter);
        viewFlipper.setInAnimation( Fade_in );
        viewFlipper.setOutAnimation( Fade_out );
        viewFlipper.setAutoStart( true );
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
        viewFlipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                return false;
            }
        });
        viewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();

            }
        });
        viewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showPrevious();
            }
        });
        return v;
    }



}
