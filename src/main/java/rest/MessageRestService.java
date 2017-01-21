package rest;

import domain.Message;
import domain.MessageInput;
import service.MessageService;
import service.TimerService;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

/**
 * Created by Rob on 20/01/2017.
 */
@Path("/messages")
@Named
@RequestScoped
public class MessageRestService {

    @Inject
    private MessageService messageService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Message> allMessages(){
        return messageService.getMessageDB().getAllMessages();
    }

    @GET
    @Path("/{user}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Message>getAllFromUser(@PathParam("user")String user){
        return messageService.getMessageDB().getMessagesFromUser(user);
    }

    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(MessageInput input){
        Message message = new Message(input.getUser(), input.getMessage());
        messageService.getMessageDB().addMessage(message);
        return message;
    }

    @GET
    @Path("/db")
    public String getDbType(){
        return messageService.getMessageDB().getName();
    }


}
