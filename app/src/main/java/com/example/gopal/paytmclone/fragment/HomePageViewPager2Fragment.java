package com.example.gopal.paytmclone.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gopal.paytmclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageViewPager2Fragment extends Fragment {


    public HomePageViewPager2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page_view_pager2, container, false);
    }

}
