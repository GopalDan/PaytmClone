package com.example.gopal.paytmclone.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.gopal.paytmclone.fragment.MallPageViewPager1Fragment;
import com.example.gopal.paytmclone.fragment.MallPageViewPager2Fragment;
import com.example.gopal.paytmclone.fragment.MallPageViewPager3Fragment;


public class MallFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;


    public MallFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MallPageViewPager1Fragment();
        } else if (position == 1) {
            return new MallPageViewPager2Fragment();
        } else {
            return new MallPageViewPager3Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}
