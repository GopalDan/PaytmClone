package com.example.gopal.paytmclone.adapter;

/**
 * Created by Gopal on 5/18/2019.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.gopal.paytmclone.fragment.HomePageViewPager1Fragment;
import com.example.gopal.paytmclone.fragment.HomePageViewPager2Fragment;
import com.example.gopal.paytmclone.fragment.HomePageViewPager3Fragment;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class HomeFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;


    public HomeFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomePageViewPager1Fragment();
        } else if (position == 1) {
            return new HomePageViewPager2Fragment();
        } else {
            return new HomePageViewPager3Fragment();
        }
    }

    @Override
    public int getCount () {return 3;}

}
