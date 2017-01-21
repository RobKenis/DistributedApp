package db;

import domain.Message;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;
import java.util.ArrayList;

/**
 * Created by Rob on 20/01/2017.
 */
@Named
@RequestScoped
@Alternative
public class MessageDbStub implements IMessageDB{

    private ArrayList<Message>messages = new ArrayList<Message>();

    public MessageDbStub(){
        System.out.println("MessageDbStub created.");
       this.messages = new ArrayList<Message>();
        this.messages.add(new Message("Rob", "Eerste message"));
        this.messages.add(new Message("Theump", "Tweede message."));

    }

    public ArrayList<Message> getAllMessages() {
        return this.messages;
    }

    public void addMessage(Message m) {
        this.messages.add(m);
    }

    public ArrayList<Message> getMessagesFromUser(String username) {
        ArrayList<Message>out = new ArrayList<Message>();
        for (Message m : this.getAllMessages()){
            if (m.getMsgUser().equals(username)){
                out.add(m);
            }
        }
        return out;
    }

    public String getName() {
        return "MessageDbStub";
    }
}
