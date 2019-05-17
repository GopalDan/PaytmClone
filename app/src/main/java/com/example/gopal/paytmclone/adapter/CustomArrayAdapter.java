package com.example.gopal.paytmclone.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gopal.paytmclone.NavEvent;
import com.example.gopal.paytmclone.R;

import java.util.ArrayList;

/**
 * Created by Gopal on 5/17/2019.
 */

public class CustomArrayAdapter extends ArrayAdapter<NavEvent> {
    ArrayList<NavEvent> mEvents;


    public CustomArrayAdapter(Context context, ArrayList<NavEvent> events) {
        super(context, 0, events);
        mEvents = events;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.nav_view_list_item, parent, false);
        }
        NavEvent singleEvent = mEvents.get(position);
        TextView name = (TextView) convertView.findViewById(R.id.upper);
        TextView address = (TextView) convertView.findViewById(R.id.lower);
        ImageView image = convertView.findViewById(R.id.image);

        name.setText(singleEvent.getUpper());
        address.setText(singleEvent.getLower());
        image.setImageResource(singleEvent.getResourceId());

        return convertView;
    }
}
