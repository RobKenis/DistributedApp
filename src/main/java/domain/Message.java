package domain;

import java.util.Date;

/**
 * Created by Rob on 20/01/2017.
 */
public class Message {

    private String user, message;
    private Date timestamp;

    public Message(String user, String message){
        this.setUser(user);
        this.setMessage(message);
        this.setTimestamp(new Date());
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
