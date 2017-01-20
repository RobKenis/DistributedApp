package db;

import domain.Message;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rob on 20/01/2017.
 */
@Named
@RequestScoped
@Default
public class MessageDbJPA implements IMessageDB {

    //Deze code is lelijk, sorry he
    private static final String PERSISTENCE_UNIT_NAME = "messages";
    private EntityManagerFactory factory;
    private EntityManager em;

    public MessageDbJPA(){
     //   factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
      //  em = factory.createEntityManager();
    }

    public ArrayList<Message> getAllMessages() {
        try {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            em = factory.createEntityManager();
            List<Message> allMessages = em.createQuery("SELECT m FROM Message m").getResultList();
            return new ArrayList<Message>(allMessages);
        } catch (Exception e){
            ArrayList<Message>errors = new ArrayList<Message>();
            errors.add(new Message("Error", e.getMessage()));
            return  errors;
        }
    }

    public void addMessage(Message m) {
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
        em.close();
    }

    public ArrayList<Message> getMessagesFromUser(String username) {
        return null;
    }

    public String getName() {
        return "MessageDbJPA";
    }
}
