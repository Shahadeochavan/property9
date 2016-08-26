package com.nextech.property9;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ViewFlipper;
public class HomeProperty9Fragment extends Fragment {
	
	public HomeProperty9Fragment(){}
    ViewFlipper viewFlipper;
    Animation Fade_in,Fade_out;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_home_property9,
                container, false);
        viewFlipper = (ViewFlipper) v.findViewById(R.id.bckgrndViewFlipper1);
        viewFlipper.setInAnimation( Fade_in );
        viewFlipper.setOutAnimation( Fade_out );
        viewFlipper.setAutoStart( true );
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
        return v;
    }


}
