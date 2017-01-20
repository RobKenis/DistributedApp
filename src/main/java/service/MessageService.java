package service;

import db.IMessageDB;
import db.MessageDbStub;

import javax.inject.Inject;

/**
 * Created by Rob on 20/01/2017.
 */

public class MessageService {

    @Inject
    private IMessageDB messageDB;

    public IMessageDB getMessageDB() {
        return messageDB;
    }

    public void setMessageDB(IMessageDB messageDB) {
        this.messageDB = messageDB;
    }
}
