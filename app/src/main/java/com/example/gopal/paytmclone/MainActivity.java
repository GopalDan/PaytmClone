package com.example.gopal.paytmclone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gopal.paytmclone.adapter.CustomArrayAdapter;
import com.example.gopal.paytmclone.fragment.BankFragment;
import com.example.gopal.paytmclone.fragment.FavouriteStoresFragment;
import com.example.gopal.paytmclone.fragment.HomeFragment;
import com.example.gopal.paytmclone.fragment.InboxFragment;
import com.example.gopal.paytmclone.fragment.LoyaltyCardsFragment;
import com.example.gopal.paytmclone.fragment.MallFragment;
import com.example.gopal.paytmclone.fragment.MyOrdersFragment;
import com.example.gopal.paytmclone.fragment.MyPassbookFragment;
import com.example.gopal.paytmclone.fragment.PaytmFirstFragment;
import com.example.gopal.paytmclone.fragment.ScanFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new HomeFragment();
        loadFragment(fragment);

        ArrayList<NavEvent> list = Utility.getNavigationViewItems();

        mDrawerLayout = findViewById(R.id.drawer_layout);
        ListView listVew = findViewById(R.id.listView);
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, list);
        listVew.setAdapter(adapter);
        listVew.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Fragment fragment1;
                switch (position) {
                    case 0:
                        fragment1 = new PaytmFirstFragment();
                        loadFragment(fragment1);
                        break;
                    case 1:
                        fragment1 = new MyOrdersFragment();
                        loadFragment(fragment1);
                        break;
                    case 2:
                        fragment1 = new MyPassbookFragment();
                        loadFragment(fragment1);
                        break;
                    case 3:
                        fragment1 = new FavouriteStoresFragment();
                        loadFragment(fragment1);
                        break;
                    default:
                        fragment1 = new LoyaltyCardsFragment();
                        loadFragment(fragment1);

                }
                // close drawer when item is tapped
                mDrawerLayout.closeDrawers();

            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadFragment(Fragment frag){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, frag)
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottom_home_navigation:
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    break;
                case R.id.bottom_mall_navigation:
                    fragment = new MallFragment();
                    loadFragment(fragment);
                    break;
                case R.id.bottom_scan_navigation:
                    fragment = new ScanFragment();
                    loadFragment(fragment);
                    break;
                case R.id.bottom_bank_navigation:
                    fragment = new BankFragment();
                    loadFragment(fragment);
                    break;
                case R.id.bottom_inbox_navigation:
                    fragment = new InboxFragment();
                    loadFragment(fragment);
                    break;
            }
            return false;
        }
    };
}
