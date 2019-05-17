package com.example.gopal.paytmclone;

public class Event {
    private String mEventName;
    private int mEventImageResourceId;

    public Event(String mEventName, int mEventImageResourceId) {
        this.mEventName = mEventName;
        this.mEventImageResourceId = mEventImageResourceId;
    }

    public String getEventName() {
        return mEventName;
    }

    public int getEventImageResourceId() {
        return mEventImageResourceId;
    }
}
