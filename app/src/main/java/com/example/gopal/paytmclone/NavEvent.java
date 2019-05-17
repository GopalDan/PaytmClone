package com.example.gopal.paytmclone;

public class NavEvent {
    private String upper;
    private String lower;
    private int resourceId;

    public NavEvent(String upper, String lower, int resourceId) {
        this.upper = upper;
        this.lower = lower;
        this.resourceId = resourceId;
    }

    public String getUpper() {
        return upper;
    }

    public String getLower() {
        return lower;
    }

    public int getResourceId() {
        return resourceId;
    }
}
