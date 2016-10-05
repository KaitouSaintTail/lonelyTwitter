package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    /**
     * This constructor makes an ImportantTweet with given string parameter.
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty
     *                string then it will be replaced by ...
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
