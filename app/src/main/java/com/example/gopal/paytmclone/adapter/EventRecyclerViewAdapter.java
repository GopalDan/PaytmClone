package com.example.gopal.paytmclone.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gopal.paytmclone.Event;
import com.example.gopal.paytmclone.R;

import java.util.ArrayList;

public class EventRecyclerViewAdapter extends RecyclerView.Adapter<EventRecyclerViewAdapter.EventViewHolder>{

    TextView  mEventName;
    ImageView mEventImage;
    ArrayList<Event> eventList;
    String mPage;

    public EventRecyclerViewAdapter(ArrayList<Event> events, String page){
        eventList = events;
        mPage = page;
    }
    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view;
        if(mPage.equals("Home"))
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_rv_list_item, viewGroup, false);
        else
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linear_rv_list_item, viewGroup, false);

        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        Event singleEvent = eventList.get(position);
        mEventImage.setImageResource(singleEvent.getEventImageResourceId());
        mEventName.setText(singleEvent.getEventName());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{

        public EventViewHolder(View itemView) {
            super(itemView);
            mEventName = itemView.findViewById(R.id.event_name);
            mEventImage = itemView.findViewById(R.id.event_image);
        }
    }
}
