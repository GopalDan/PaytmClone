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
public class PaymentRemindersFragment extends Fragment {


    public PaymentRemindersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment_reminders, container, false);
    }

}
