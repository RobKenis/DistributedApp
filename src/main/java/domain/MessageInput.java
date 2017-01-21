package domain;

/**
 * Created by Rob on 20/01/2017.
 */
public class MessageInput {

    public String msgUser, Message;

    public String getUser() {
        return msgUser;
    }

    public void setUser(String user) {
        this.msgUser = user;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
