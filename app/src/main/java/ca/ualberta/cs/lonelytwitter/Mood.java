package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cjiang2 on 9/13/16.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public abstract String returnMood();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
