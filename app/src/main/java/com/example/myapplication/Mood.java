package com.example.myapplication;

import java.util.Date;

public abstract class Mood {

    private Date date;

    //current date (default)
    public Mood() {
        this.date = new Date();

    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMoodString();

}
