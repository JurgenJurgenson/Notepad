package com.example.jurgen.notepad;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note implements Serializable{
    private long mDateTime;
    private String mTitle, mContent;
    public Note (long dateInMillis, String title, String content){
        mDateTime=dateInMillis;
        mTitle=title;
        mContent=content;
    }
    public void setDateTime(long dateTime) {
        mDateTime = dateTime;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public long getDateTime() {
        return mDateTime;
    }
    public String getTitle() {
        return mTitle;
    }

    public String getContent() {
        return mContent;
    }


    public String getDateTimeFormatted(Context context){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss",context.getResources().getConfiguration().locale);
        formatter.setTimeZone(TimeZone.getDefault());
        return formatter.format(new Date(mDateTime));
    }
}
