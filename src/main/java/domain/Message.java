package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Rob on 20/01/2017.
 */
@Entity
public class Message {

    @GeneratedValue
    @Id
    private long id;
    private String msgUser, message;
    private Date timestamp;

    public Message(){

    }

    public Message(String msgUser, String message){
        this.setMsgUser(msgUser);
        this.setMessage(message);
        this.setTimestamp(new Date());
    }

    public String getMsgUser() {
        return msgUser;
    }

    public void setMsgUser(String user) {
        this.msgUser = user;
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
