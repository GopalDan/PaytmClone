package com.example.gopal.paytmclone.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gopal.paytmclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScanFragment extends Fragment {

    Toolbar toolbar;

    public ScanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_scan, container, false);
        toolbar = rootView.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.whiteColor));


        // add menu icon & work as up buttonas up button
        ActionBar actionbar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);  // shows at app bar
        actionbar.setHomeAsUpIndicator(R.drawable.menu_black);// set as up button
        actionbar.setTitle("Scan");
        return rootView;
    }

}
