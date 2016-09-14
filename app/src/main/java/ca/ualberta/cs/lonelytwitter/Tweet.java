package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cjiang2 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    ArrayList<Mood> moodList = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    // abstract body
    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            // Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void addMood(Mood mood){
        moodList.add(mood);
    }

    public  void removeMood(Mood mood){
        moodList.remove(mood);
    }
}