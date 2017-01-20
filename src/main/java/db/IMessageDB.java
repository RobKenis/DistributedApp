package db;

import domain.Message;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Rob on 20/01/2017.
 */
public interface IMessageDB {

    public ArrayList<Message> getAllMessages();
    public void addMessage(Message m);
    public ArrayList<Message>getMessagesFromUser(String username);
}
