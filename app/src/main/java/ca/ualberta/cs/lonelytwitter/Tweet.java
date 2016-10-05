package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    /**
     * This constructor makes an Tweet with given string parameter.
     *
     * @param message this parameter is the given string for the tweet.
     * @parm date this parameter is initialized with current date
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * This constructor makes an Tweet with given string and date parameter.
     *
     * @param message this parameter is the given string for the tweet.
     * @param date this parameter is the given date for the tweet.
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * This method indicates if tweet is important.
     * @return the boolean
     */

    public abstract Boolean isImportant();


    /**
     * This method sets message with given string.
     *
     * @param message this parameter is the given string for the tweet.
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * This method sets date with given date.
     *
     * @param date this parameter is the given date for the tweet.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }
}
