package com.example.gopal.paytmclone.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gopal.paytmclone.Event;
import com.example.gopal.paytmclone.R;
import com.example.gopal.paytmclone.Utility;
import com.example.gopal.paytmclone.adapter.EventRecyclerViewAdapter;
import com.example.gopal.paytmclone.adapter.MallFragmentPagerAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private EventRecyclerViewAdapter mAdapter;
    private Toolbar toolbar;


    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_mall, container, false);

        //Set the toolbar as app bar
        toolbar = rootView.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.whiteColor));

        // menu icon as up button
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.menu_black);
        actionbar.setTitle("");

        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.mall_page_viewpager);
        MallFragmentPagerAdapter adapter = new MallFragmentPagerAdapter(getContext(), getActivity().getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        ArrayList<Event> eventList1 = Utility.getFirstReyclerViewItem();
        ArrayList<Event> eventList2 = Utility.getGridRecyclerViewItem();

        mRecyclerView = rootView.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new EventRecyclerViewAdapter(eventList1,"Mall");
        mRecyclerView.setAdapter(mAdapter);

        RecyclerView  mRecyclerView1 = rootView.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView1.setLayoutManager(layoutManager1);
        mRecyclerView1.setHasFixedSize(true);
       EventRecyclerViewAdapter adapter2 = new EventRecyclerViewAdapter(eventList2,"Mall");
        mRecyclerView1.setAdapter(adapter2);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.mall_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:
                Toast.makeText(getContext(), "You clicked searc ", Toast.LENGTH_SHORT).show();break;
            case R.id.action_shopping:
                Toast.makeText(getContext(), "You clicked shopping ", Toast.LENGTH_SHORT).show();break;
            case R.id.action_account:
                Toast.makeText(getContext(), "You clicked account ", Toast.LENGTH_SHORT).show();break;
        }
        return super.onOptionsItemSelected(item);
    }
}
