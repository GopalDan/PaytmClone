package com.example.gopal.paytmclone;

import java.util.ArrayList;

/**
 * Created by Gopal on 5/18/2019.
 */

public  class Utility {
    private Utility(){};

    public static ArrayList<NavEvent> getNavigationViewItems(){
        ArrayList<NavEvent> list = new ArrayList<>();
        list.add(new NavEvent("Paytm First","Say hello to the Good life!",R.drawable.ic_home));
        list.add(new NavEvent("My Orders","Shopping,Movie,Tickets",R.drawable.ic_bank));
        list.add(new NavEvent("My Passbook","Wallets, Paytm, Balance",R.drawable.ic_mall));
        list.add(new NavEvent("Payment Reminders","Set Reminders",R.drawable.ic_inbox));
        list.add(new NavEvent("My Favourite Stores","Pay using Paytm",R.drawable.ic_mall));

        return list;
    }
    public static ArrayList<Event> getGridRecyclerViewItem(){
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(new Event ("Movie Tickets", R.drawable.ic_home));
        eventList.add(new Event ("Mobile Prepaid", R.drawable.ic_inbox));
        eventList.add(new Event ("Electricity", R.drawable.ic_bank));
        eventList.add(new Event ("Google Play", R.drawable.ic_mall));
        eventList.add(new Event ("Train Tickets", R.drawable.ic_scan));
        eventList.add(new Event ("Train", R.drawable.ic_bank));
        eventList.add(new Event ("Add Money", R.drawable.ic_scan));
        eventList.add(new Event ("Gold", R.drawable.ic_inbox));
        eventList.add(new Event ("Mobiles", R.drawable.ic_mall));
        eventList.add(new Event ("Shopping", R.drawable.ic_home));
        eventList.add(new Event ("Mobile Prepaid", R.drawable.ic_mall));
        eventList.add(new Event ("DTH", R.drawable.ic_scan));
        return eventList;
    }
    public static ArrayList<Event> getFirstReyclerViewItem(){
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(new Event ("Mobiles", R.drawable.ic_home));
        eventList.add(new Event ("Men's Fashion", R.drawable.ic_scan));
        eventList.add(new Event ("Electronics", R.drawable.ic_bank));
        eventList.add(new Event ("Women's Fashion", R.drawable.ic_mall));
        eventList.add(new Event ("Laptops", R.drawable.ic_inbox));
        eventList.add(new Event ("Grocery", R.drawable.ic_scan));
        eventList.add(new Event ("Books", R.drawable.ic_home));
        eventList.add(new Event ("Hot Deals", R.drawable.ic_mall));
        eventList.add(new Event ("Special Offers", R.drawable.ic_inbox));
        eventList.add(new Event ("Automobile", R.drawable.ic_bank));
        return eventList;
    }



}
