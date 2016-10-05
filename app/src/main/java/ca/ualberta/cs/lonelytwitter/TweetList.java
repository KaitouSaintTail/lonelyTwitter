package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjiang2 on 9/27/16.
 */
public class TweetList {
    /**
     * The Tweets.
     */
    List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * This method add tweet to tweetList.
     *
     * @param tweet List of Tweet
     */
    public void add(Tweet tweet) {

        if (hasTweet(tweet)){
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);

    }

    /**
     * This method returns boolean if tweetList has given tweet inside.
     *
     * @param tweet this parameter is the given tweet
     * @return the boolean true if given tweet is inside, false otherwise
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * This method gets tweet given index for tweetList.
     *
     * @param i this parameter is the given index for tweet to get
     * @return the tweet to get
     */
    public Tweet getTweet(int i){
        return tweets.get(i);
    }

    /**
     * This method remove given tweet from tweetList.
     *
     * @param a the a which is the given tweet to remove
     */
    public void removeTweet(Tweet a){
        tweets.remove(a);
    }

    /**
     * This method gets count int for tweetList.
     *
     * @return the int which is count for tweetList
     */
    public int getCount(){
        return tweets.size();
    }
}
